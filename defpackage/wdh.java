package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wdh implements afwx {
    final /* synthetic */ String a;
    final /* synthetic */ ykl b;

    public wdh(String str, ykl yklVar) {
        this.a = str;
        this.b = yklVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        for (aata aataVar : ((aati) obj).c()) {
            if (aataVar.l() && aataVar.i().equals(this.a)) {
                this.b.b(this.a, aataVar);
                return;
            }
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
