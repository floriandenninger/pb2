package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yiy implements afwx {
    final /* synthetic */ yiz a;

    public yiy(yiz yizVar) {
        this.a = yizVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.a.ai.e(cnqVar);
        this.a.dismiss();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        auxf auxfVar;
        asga asgaVar = (asga) obj;
        this.a.af.a();
        if (asgaVar == null || (asgaVar.b & 2) == 0) {
            return;
        }
        yiz yizVar = this.a;
        asfq asfqVar = asgaVar.d;
        if (asfqVar == null) {
            asfqVar = asfq.a;
        }
        if (asfqVar.c == 204280949) {
            asfq asfqVar2 = asgaVar.d;
            if (asfqVar2 == null) {
                asfqVar2 = asfq.a;
            }
            if (asfqVar2.c == 204280949) {
                auxfVar = (auxf) asfqVar2.d;
            } else {
                auxfVar = auxf.a;
            }
        } else {
            auxfVar = null;
        }
        yizVar.ae = auxfVar;
        yiz yizVar2 = this.a;
        if (yizVar2.ae == null) {
            return;
        }
        yizVar2.ag.D(new acqx(asgaVar.g));
        this.a.m.putByteArray("get_offers_response", asgaVar.toByteArray());
        this.a.aH();
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
