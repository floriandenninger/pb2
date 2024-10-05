package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axfz implements axgc {
    private final Runnable a;
    private final Runnable b;
    private final Handler c;

    public axfz(Runnable runnable, Runnable runnable2, Handler handler) {
        this.a = runnable;
        this.b = runnable2;
        this.c = handler;
    }

    @Override // defpackage.axgc
    public final void a() {
        this.c.removeCallbacks(this.a);
        Runnable runnable = this.b;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.axgc
    public final void b() {
        Runnable runnable = this.b;
        if (runnable != null) {
            this.c.post(runnable);
        }
    }

    @Override // defpackage.axgc
    public final void c() {
        this.c.post(this.a);
    }
}
