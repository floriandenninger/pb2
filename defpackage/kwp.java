package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kwp implements afwx {
    final /* synthetic */ kwq a;

    public kwp(kwq kwqVar) {
        this.a = kwqVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.d("Error creating playlist", cnqVar);
        this.a.ah.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arzg arzgVar = (arzg) obj;
        this.a.ai.f(new glf());
        if (arzgVar.c.size() != 0) {
            this.a.ae.b(arzgVar.c);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
