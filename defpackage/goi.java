package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class goi {
    public Runnable a;
    private final Handler b;
    private final Runnable c;

    public goi(Handler handler) {
        handler.getClass();
        this.b = handler;
        this.c = new goh(this);
    }

    public final synchronized void a() {
        this.b.removeCallbacks(this.c);
        this.a = null;
    }

    public final synchronized void b() {
        this.b.removeCallbacks(this.c);
        this.c.run();
    }

    public final synchronized void c(Runnable runnable, long j) {
        runnable.getClass();
        this.b.removeCallbacks(this.c);
        this.a = runnable;
        this.b.postDelayed(this.c, j);
    }
}
