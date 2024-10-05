package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cdy implements Runnable {
    final cdz a;
    final Runnable b;

    public cdy(cdz cdzVar, Runnable runnable) {
        this.a = cdzVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } finally {
            this.a.a();
        }
    }
}
