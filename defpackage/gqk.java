package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gqk implements afwx {
    final /* synthetic */ aawb a;
    final /* synthetic */ gql b;

    public gqk(gql gqlVar, aawb aawbVar) {
        this.b = gqlVar;
        this.a = aawbVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.d("Error creating post", cnqVar);
        this.b.b.e(cnqVar);
        aawb aawbVar = this.a;
        if (aawbVar != null) {
            aawbVar.e(cnqVar);
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        armb armbVar = (armb) obj;
        if ((armbVar.b & 4) != 0) {
            arlj arljVar = armbVar.f;
            if (arljVar == null) {
                arljVar = arlj.a;
            }
            if ((arljVar.b & 32) != 0) {
                aahd aahdVar = this.b.a;
                apxf apxfVar = arljVar.f;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
            }
        }
        for (int i = 0; i < armbVar.e.size(); i++) {
            this.b.a.c((apxf) armbVar.e.get(i), null);
        }
        aawb aawbVar = this.a;
        if (aawbVar != null) {
            aawbVar.f(armbVar);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
