package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abk implements Runnable {
    final /* synthetic */ abs a;
    private final /* synthetic */ int b;

    public abk(abs absVar, int i) {
        this.b = i;
        this.a = absVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.b.q = false;
        } else if (i != 1) {
            this.a.b.r().d();
        } else {
            this.a.b.r().b();
        }
    }
}
