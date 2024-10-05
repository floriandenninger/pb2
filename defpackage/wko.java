package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wko implements afwx {
    final /* synthetic */ wkp a;

    public wko(wkp wkpVar) {
        this.a = wkpVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.f("PhoneVerificationResolver", "Getting phone verification form failed.", cnqVar);
        this.a.i();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aulq aulqVar;
        atvc atvcVar;
        aulq aulqVar2;
        arxe arxeVar = (arxe) obj;
        if (!arxeVar.e) {
            if (arxeVar.b == 3) {
                aulqVar = (aulq) arxeVar.c;
            } else {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(atve.a)) {
                if (arxeVar.b == 3) {
                    aulqVar2 = (aulq) arxeVar.c;
                } else {
                    aulqVar2 = aulq.a;
                }
                atvcVar = (atvc) aulqVar2.pX(atve.a);
            } else {
                atvcVar = null;
            }
            if (atvcVar != null) {
                wlu g = wcy.g(atvcVar, false);
                dn k = this.a.a.k();
                k.q(this.a.b, g, "verification_fragment_tag");
                k.i = 4099;
                k.a();
                this.a.a.aa();
                return;
            }
            return;
        }
        this.a.u();
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
