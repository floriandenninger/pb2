package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qsi {
    public static final Object a = new Object();
    public static HandlerThread b;
    private static qsi h;
    public final HashMap c;
    public final Context d;
    public final Handler e;
    public final qtj f;
    public final long g;
    private final long i;

    public qsi() {
    }

    public static qsi a(Context context) {
        synchronized (a) {
            if (h == null) {
                h = new qsi(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return h;
    }

    public final boolean b(qsh qshVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        qip.az(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            qsj qsjVar = (qsj) this.c.get(qshVar);
            if (qsjVar == null) {
                qsjVar = new qsj(this, qshVar);
                qsjVar.c(serviceConnection, serviceConnection);
                qsjVar.d(str);
                this.c.put(qshVar, qsjVar);
            } else {
                this.e.removeMessages(0, qshVar);
                if (qsjVar.a(serviceConnection)) {
                    String valueOf = String.valueOf(qshVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
                qsjVar.c(serviceConnection, serviceConnection);
                int i = qsjVar.b;
                if (i == 1) {
                    serviceConnection.onServiceConnected(qsjVar.f, qsjVar.d);
                } else if (i == 2) {
                    qsjVar.d(str);
                }
            }
            z = qsjVar.c;
        }
        return z;
    }

    public final void c(ComponentName componentName, ServiceConnection serviceConnection) {
        d(new qsh(componentName), serviceConnection);
    }

    protected final void d(qsh qshVar, ServiceConnection serviceConnection) {
        qip.az(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.c) {
            qsj qsjVar = (qsj) this.c.get(qshVar);
            if (qsjVar == null) {
                String valueOf = String.valueOf(qshVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
            if (qsjVar.a(serviceConnection)) {
                qsjVar.a.remove(serviceConnection);
                if (qsjVar.b()) {
                    this.e.sendMessageDelayed(this.e.obtainMessage(0, qshVar), this.i);
                }
            } else {
                String valueOf2 = String.valueOf(qshVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final void e(String str, ServiceConnection serviceConnection, boolean z) {
        d(new qsh(str, z), serviceConnection);
    }

    public qsi(Context context, Looper looper) {
        this.c = new HashMap();
        this.d = context.getApplicationContext();
        this.e = new amcc(looper, new qsk(this));
        this.f = qtj.a();
        this.i = 5000L;
        this.g = 300000L;
    }
}
