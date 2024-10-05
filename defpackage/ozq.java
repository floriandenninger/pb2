package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ozq implements Runnable {
    final /* synthetic */ ozv a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ ozs d;

    public ozq(ozs ozsVar, ozv ozvVar, int i, long j) {
        this.d = ozsVar;
        this.a = ozvVar;
        this.b = i;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ozs ozsVar = this.d;
        ozsVar.c.a(ozsVar.b, this.a, this.b, this.c / 1000);
    }
}
