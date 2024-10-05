package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qld {
    public static final Object a;
    qlb c;
    Runnable d;
    private final long e;
    long b = -1;
    private final Handler f = new amcc(Looper.getMainLooper(), (byte[]) null);

    static {
        new qkw("RequestTracker");
        a = new Object();
    }

    public qld(long j) {
        this.e = j;
    }

    private final void g(int i, Object obj) {
        Object obj2 = a;
        synchronized (obj2) {
            qlb qlbVar = this.c;
            if (qlbVar != null) {
                qlbVar.a(this.b, i, obj);
            }
            this.b = -1L;
            this.c = null;
            synchronized (obj2) {
                Runnable runnable = this.d;
                if (runnable != null) {
                    this.f.removeCallbacks(runnable);
                    this.d = null;
                }
            }
        }
    }

    public final void a(long j, qlb qlbVar) {
        qlb qlbVar2;
        long j2;
        Object obj = a;
        synchronized (obj) {
            qlbVar2 = this.c;
            j2 = this.b;
            this.b = j;
            this.c = qlbVar;
        }
        if (qlbVar2 != null) {
            qlbVar2.b(j2);
        }
        synchronized (obj) {
            Runnable runnable = this.d;
            if (runnable != null) {
                this.f.removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable() { // from class: qlc
                @Override // java.lang.Runnable
                public final void run() {
                    qld qldVar = qld.this;
                    synchronized (qld.a) {
                        if (qldVar.b == -1) {
                            return;
                        }
                        qldVar.d(15);
                    }
                }
            };
            this.d = runnable2;
            this.f.postDelayed(runnable2, this.e);
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (a) {
            z = this.b != -1;
        }
        return z;
    }

    public final boolean c(long j) {
        boolean z;
        synchronized (a) {
            long j2 = this.b;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    public final void d(int i) {
        synchronized (a) {
            if (this.b != -1) {
                String.format(Locale.ROOT, "clearing request %d", Long.valueOf(this.b));
                g(i, null);
            }
        }
    }

    public final void e(long j, int i) {
        f(j, i, null);
    }

    public final void f(long j, int i, Object obj) {
        synchronized (a) {
            long j2 = this.b;
            if (j2 == -1 || j2 != j) {
                return;
            }
            String.format(Locale.ROOT, "request %d completed", Long.valueOf(j));
            g(i, obj);
        }
    }
}
