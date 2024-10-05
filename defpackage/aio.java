package defpackage;

import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aio {
    public boolean a;
    public Object b;
    private ain c;
    private boolean d;

    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.d = true;
            ain ainVar = this.c;
            Object obj = this.b;
            if (ainVar != null) {
                try {
                    ainVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.d = false;
                notifyAll();
            }
        }
    }

    public final void b(ain ainVar) {
        synchronized (this) {
            while (this.d) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.c == ainVar) {
                return;
            }
            this.c = ainVar;
            if (this.a && ainVar != null) {
                ainVar.a();
            }
        }
    }
}
