package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qmf implements ServiceConnection {
    qmg c;
    final /* synthetic */ qml f;
    int a = 0;
    final Messenger b = new Messenger(new amcc(Looper.getMainLooper(), new Handler.Callback() { // from class: qmb
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            qmf qmfVar = qmf.this;
            int i = message.arg1;
            synchronized (qmfVar) {
                qmi qmiVar = (qmi) qmfVar.e.get(i);
                if (qmiVar == null) {
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("Received response for unknown request: ");
                    sb.append(i);
                    Log.w("MessengerIpcClient", sb.toString());
                    return true;
                }
                qmfVar.e.remove(i);
                qmfVar.d();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    qmiVar.c(new qmj("Not supported by GmsCore"));
                    return true;
                }
                qmiVar.a(data);
                return true;
            }
        }
    }));
    final Queue d = new ArrayDeque();
    final SparseArray e = new SparseArray();

    public qmf(qml qmlVar) {
        this.f = qmlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f.b.execute(new qmc(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.a == 1) {
            g("Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(int i) {
        qmi qmiVar = (qmi) this.e.get(i);
        if (qmiVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.e.remove(i);
            qmiVar.c(new qmj("Timed out waiting for response"));
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            this.a = 3;
            qtj.a().b(this.f.a, this);
        }
    }

    final synchronized void f(String str, Throwable th) {
        int i = this.a;
        if (i == 0) {
            throw new IllegalStateException();
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            this.a = 4;
            return;
        }
        this.a = 4;
        qtj.a().b(this.f.a, this);
        qmj qmjVar = new qmj(str, th);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((qmi) it.next()).c(qmjVar);
        }
        this.d.clear();
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ((qmi) this.e.valueAt(i2)).c(qmjVar);
        }
        this.e.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(String str) {
        f(str, null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f.b.execute(new Runnable() { // from class: qmd
            @Override // java.lang.Runnable
            public final void run() {
                qmf qmfVar = qmf.this;
                IBinder iBinder2 = iBinder;
                synchronized (qmfVar) {
                    try {
                        if (iBinder2 == null) {
                            qmfVar.g("Null service connection");
                            return;
                        }
                        try {
                            qmfVar.c = new qmg(iBinder2);
                            qmfVar.a = 2;
                            qmfVar.a();
                        } catch (RemoteException e) {
                            qmfVar.g(e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f.b.execute(new qmc(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean e(qmi qmiVar) {
        int i = this.a;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                this.d.add(qmiVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(qmiVar);
            a();
            return true;
        }
        this.d.add(qmiVar);
        qip.av(this.a == 0);
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (qtj.a().c(this.f.a, intent, this, 1)) {
                this.f.b.schedule(new qmc(this, i2), 30L, TimeUnit.SECONDS);
            } else {
                g("Unable to bind to service");
            }
        } catch (SecurityException e) {
            f("Unable to bind to service", e);
        }
        return true;
    }
}
