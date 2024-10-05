package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class knp implements Runnable {
    final /* synthetic */ knq a;

    public knp(knq knqVar) {
        this.a = knqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        knq knqVar = this.a;
        knqVar.a.removeCallbacks(knqVar.c);
        this.a.b(true);
    }
}
