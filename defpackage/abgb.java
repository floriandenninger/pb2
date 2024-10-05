package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abgb implements afwx {
    final /* synthetic */ avsh a;
    final /* synthetic */ abgc b;
    final /* synthetic */ ayue c;

    public abgb(abgc abgcVar, avsh avshVar, ayue ayueVar) {
        this.b = abgcVar;
        this.a = avshVar;
        this.c = ayueVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        aahd aahdVar = this.b.b;
        apxf apxfVar = this.a.f;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.a(apxfVar);
        this.c.c(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        this.c.a();
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
