package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.ConditionVariable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class yne {
    public boolean c;
    public Binder d;
    private final Class e;
    public final ConditionVariable a = new ConditionVariable();
    public final Object b = new Object();
    private final ServiceConnection f = new ynd(this);

    public yne(Class cls) {
        this.e = cls;
    }

    public final Binder a(Context context) {
        Binder binder;
        yjk.e();
        c(context);
        yjk.e();
        this.a.block();
        synchronized (this.b) {
            binder = this.d;
        }
        return binder;
    }

    public final Binder b() {
        Binder binder;
        synchronized (this.b) {
            binder = this.d;
        }
        return binder;
    }

    public final void c(Context context) {
        synchronized (this.b) {
            String valueOf = String.valueOf(this.e.getSimpleName());
            if (valueOf.length() != 0) {
                "connect ".concat(valueOf);
            }
            if (!this.c) {
                this.c = true;
                Intent intent = new Intent(context, (Class<?>) this.e);
                if (!context.bindService(intent, this.f, 1)) {
                    String valueOf2 = String.valueOf(intent);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                    sb.append("Could not bind to ");
                    sb.append(valueOf2);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
    }

    public final void d(Context context) {
        synchronized (this.b) {
            String valueOf = String.valueOf(this.e.getSimpleName());
            if (valueOf.length() != 0) {
                "disconnect ".concat(valueOf);
            }
            if (this.c) {
                this.c = false;
                Binder binder = this.d;
                if (binder != null) {
                    f(binder);
                }
                context.unbindService(this.f);
                this.a.close();
                this.d = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e(Binder binder);

    protected abstract void f(Binder binder);
}
