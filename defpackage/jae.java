package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jae implements afwx {
    final /* synthetic */ azmi a;
    private final /* synthetic */ int b;

    public jae(azmi azmiVar, int i) {
        this.b = i;
        this.a = azmiVar;
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        if (this.b == 0) {
            this.a.a(cnqVar);
        } else {
            if (this.a.e()) {
                return;
            }
            this.a.a(cnqVar);
        }
    }

    @Override // defpackage.cnl
    public final /* synthetic */ void kZ(Object obj) {
        if (this.b == 0) {
            this.a.c((aaxi) obj);
        } else {
            arsd arsdVar = (arsd) obj;
            if (this.a.e()) {
                return;
            }
            this.a.c(arsdVar);
        }
    }
}
