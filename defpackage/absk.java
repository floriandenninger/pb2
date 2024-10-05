package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class absk implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ absm b;

    public absk(absm absmVar, int i) {
        this.b = absmVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.a);
    }
}
