package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pbq implements Runnable {
    final /* synthetic */ ozg a;
    final /* synthetic */ pbt b;

    public pbq(pbt pbtVar, ozg ozgVar) {
        this.b = pbtVar;
        this.a = ozgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.d(this.a);
    }
}
