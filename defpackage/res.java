package defpackage;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class res {
    private static volatile Handler b;
    public volatile long a;
    private final rhh c;
    private final Runnable d;

    public res(rhh rhhVar) {
        qip.an(rhhVar);
        this.c = rhhVar;
        this.d = new rer(this, rhhVar);
    }

    private final Handler e() {
        Handler handler;
        if (b != null) {
            return b;
        }
        synchronized (res.class) {
            if (b == null) {
                b = new amcc(((rgt) this.c).a.getMainLooper(), (byte[]) null);
            }
            handler = b;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a = 0L;
        e().removeCallbacks(this.d);
    }

    public abstract void b();

    public final void c(long j) {
        a();
        if (j >= 0) {
            qtl qtlVar = ((rgt) this.c).y;
            this.a = System.currentTimeMillis();
            if (e().postDelayed(this.d, j)) {
                return;
            }
            this.c.aF().c.b("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean d() {
        return this.a != 0;
    }
}
