package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class btq implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ btr b;

    public btq(btr btrVar, Runnable runnable) {
        this.b = btrVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } finally {
            this.b.a();
        }
    }
}
