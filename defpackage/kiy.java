package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kiy implements Runnable {
    final /* synthetic */ kiz a;

    public kiy(kiz kizVar) {
        this.a = kizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.w();
        kiz kizVar = this.a;
        kizVar.d.removeCallbacks(kizVar.e);
        this.a.v(true);
        this.a.i.c(kii.a());
    }
}
