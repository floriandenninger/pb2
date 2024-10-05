package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ews implements afwx {
    final /* synthetic */ akmf a;
    final /* synthetic */ ewt b;

    public ews(ewt ewtVar, akmf akmfVar) {
        this.b = ewtVar;
        this.a = akmfVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.b.a.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        atdc atdcVar;
        armr armrVar = (armr) obj;
        atdf atdfVar = armrVar.c;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) != 0) {
            atdf atdfVar2 = armrVar.c;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdcVar = atdfVar2.c;
            if (atdcVar == null) {
                atdcVar = atdc.a;
            }
        } else {
            atdcVar = null;
        }
        if (atdcVar != null) {
            akjv akjvVar = (akjv) this.a;
            akjvVar.ah.g(atdcVar, akjvVar.ak);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
