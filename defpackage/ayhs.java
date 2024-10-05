package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayhs implements Runnable {
    final /* synthetic */ ayoc a;
    final /* synthetic */ ayhw b;

    public ayhs(ayhw ayhwVar, ayoc ayocVar) {
        this.b = ayhwVar;
        this.a = ayocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.d(this.a);
    }
}
