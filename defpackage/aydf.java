package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aydf implements Runnable {
    final Runnable a;
    public boolean b;
    public boolean c;

    public aydf(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        this.c = true;
        this.a.run();
    }
}
