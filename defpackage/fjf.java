package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fjf implements anhh {
    final /* synthetic */ String a;
    final /* synthetic */ fjh b;

    public fjf(fjh fjhVar, String str) {
        this.b = fjhVar;
        this.a = str;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.c((agli) obj);
        this.b.e.remove(this.a);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        zga.d("Unexpected failure on immediate future.", th);
    }
}
