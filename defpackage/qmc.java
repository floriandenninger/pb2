package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class qmc implements Runnable {
    public final /* synthetic */ qmf a;
    private final /* synthetic */ int b;

    public /* synthetic */ qmc(qmf qmfVar, int i) {
        this.b = i;
        this.a = qmfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.g("Service disconnected");
                return;
            } else {
                this.a.b();
                return;
            }
        }
        final qmf qmfVar = this.a;
        while (true) {
            synchronized (qmfVar) {
                if (qmfVar.a != 2) {
                    return;
                }
                if (!qmfVar.d.isEmpty()) {
                    final qmi qmiVar = (qmi) qmfVar.d.poll();
                    qmfVar.e.put(qmiVar.a, qmiVar);
                    qmfVar.f.b.schedule(new Runnable() { // from class: qme
                        @Override // java.lang.Runnable
                        public final void run() {
                            qmf.this.c(qmiVar.a);
                        }
                    }, 30L, TimeUnit.SECONDS);
                    Context context = qmfVar.f.a;
                    Messenger messenger = qmfVar.b;
                    Message obtain = Message.obtain();
                    obtain.what = qmiVar.c;
                    obtain.arg1 = qmiVar.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", qmiVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", qmiVar.d);
                    obtain.setData(bundle);
                    try {
                        qmg qmgVar = qmfVar.c;
                        Messenger messenger2 = qmgVar.a;
                        if (messenger2 == null) {
                            CloudMessagingMessengerCompat cloudMessagingMessengerCompat = qmgVar.b;
                            if (cloudMessagingMessengerCompat != null) {
                                cloudMessagingMessengerCompat.b(obtain);
                            } else {
                                throw new IllegalStateException("Both messengers are null");
                                break;
                            }
                        } else {
                            messenger2.send(obtain);
                        }
                    } catch (RemoteException e) {
                        qmfVar.g(e.getMessage());
                    }
                } else {
                    qmfVar.d();
                    return;
                }
            }
        }
    }
}
