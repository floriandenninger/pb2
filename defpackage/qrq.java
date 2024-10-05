package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qrq extends amcc {
    final /* synthetic */ qrx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrq(qrx qrxVar, Looper looper) {
        super(looper, (byte[]) null);
        this.a = qrxVar;
    }

    private static final void a(Message message) {
        qrr qrrVar = (qrr) message.obj;
        qrrVar.b();
        qrrVar.f();
    }

    private static final boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        if (this.a.F.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what != 1 && message.what != 7 && message.what != 4 && message.what != 5) || this.a.x()) {
            if (message.what == 4) {
                this.a.C = new ConnectionResult(message.arg2);
                qrx qrxVar = this.a;
                if (!qrxVar.D && !TextUtils.isEmpty(qrxVar.c()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(qrxVar.c());
                        qrx qrxVar2 = this.a;
                        if (!qrxVar2.D) {
                            qrxVar2.k(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                ConnectionResult connectionResult = this.a.C;
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(8);
                }
                this.a.v.a(connectionResult);
                this.a.q();
                return;
            }
            if (message.what == 5) {
                ConnectionResult connectionResult2 = this.a.C;
                if (connectionResult2 == null) {
                    connectionResult2 = new ConnectionResult(8);
                }
                this.a.v.a(connectionResult2);
                this.a.q();
                return;
            }
            if (message.what == 3) {
                this.a.v.a(new ConnectionResult(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null));
                this.a.q();
                return;
            }
            if (message.what == 6) {
                this.a.k(5, null);
                qro qroVar = this.a.y;
                if (qroVar != null) {
                    qroVar.a(message.arg2);
                }
                int i = message.arg2;
                System.currentTimeMillis();
                this.a.J(5, 1, null);
                return;
            }
            if (message.what != 2 || this.a.w()) {
                if (b(message)) {
                    qrr qrrVar = (qrr) message.obj;
                    synchronized (qrrVar) {
                        obj = qrrVar.d;
                        if (qrrVar.e) {
                            String valueOf = String.valueOf(qrrVar);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                            sb.append("Callback proxy ");
                            sb.append(valueOf);
                            sb.append(" being reused. This is not safe.");
                            Log.w("GmsClient", sb.toString());
                        }
                    }
                    if (obj != null) {
                        try {
                            qrrVar.d();
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                    synchronized (qrrVar) {
                        qrrVar.e = true;
                    }
                    qrrVar.f();
                    return;
                }
                int i2 = message.what;
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i2);
                Log.wtf("GmsClient", sb2.toString(), new Exception());
                return;
            }
            a(message);
            return;
        }
        a(message);
    }
}
