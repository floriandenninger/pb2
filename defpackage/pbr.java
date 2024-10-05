package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pbr implements Runnable {
    final /* synthetic */ ozh a;
    final /* synthetic */ pbt b;

    public pbr(pbt pbtVar, ozh ozhVar) {
        this.b = pbtVar;
        this.a = ozhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.e(this.a);
    }
}
