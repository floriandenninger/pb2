package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayhu implements Runnable {
    final /* synthetic */ aycd a;
    final /* synthetic */ ayhw b;

    public ayhu(ayhw ayhwVar, aycd aycdVar) {
        this.b = ayhwVar;
        this.a = aycdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.c(this.a);
    }
}
