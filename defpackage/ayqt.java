package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayqt implements Runnable, ayqx {
    private final Handler a;
    private final Runnable b;
    private volatile boolean c;

    public ayqt(Handler handler, Runnable runnable) {
        this.a = handler;
        this.b = runnable;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c;
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.a.removeCallbacks(this);
        this.c = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            aynu.j(th);
        }
    }
}
