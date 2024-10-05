package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class glp implements afwx {
    final /* synthetic */ glq a;
    private final /* synthetic */ int b;

    public glp(glq glqVar, int i) {
        this.b = i;
        this.a = glqVar;
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        if (this.b == 0) {
            zga.d("Error flagging", cnqVar);
            this.a.c.e(cnqVar);
        } else {
            zga.d("Error creating playlist", cnqVar);
            this.a.c.e(cnqVar);
        }
    }

    @Override // defpackage.cnl
    public final /* synthetic */ void kZ(Object obj) {
        if (this.b == 0) {
            arqh arqhVar = (arqh) obj;
            if (arqhVar.g.size() != 0) {
                this.a.e.d(arqhVar.g, null);
                return;
            }
            return;
        }
        arzg arzgVar = (arzg) obj;
        this.a.d.f(new glf());
        if (arzgVar.c.size() != 0) {
            this.a.e.d(arzgVar.c, null);
        }
    }
}
