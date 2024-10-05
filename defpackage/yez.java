package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yez implements afwx {
    final /* synthetic */ aomf a;
    final /* synthetic */ arpp b;
    final /* synthetic */ yfa c;

    public yez(yfa yfaVar, aomf aomfVar, arpp arppVar) {
        this.c = yfaVar;
        this.a = aomfVar;
        this.b = arppVar;
    }

    private final void d(arpp arppVar) {
        if (arppVar != null) {
            this.c.c.c(arppVar);
        }
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        arpp arppVar;
        if (this.a.H()) {
            arppVar = null;
        } else {
            yey yeyVar = new yey();
            yeyVar.a = this.a;
            yeyVar.b = 3;
            arpn a = arpp.a();
            awgd a2 = yeyVar.a();
            a.copyOnWrite();
            ((arpp) a.instance).eF(a2);
            arppVar = (arpp) a.build();
        }
        this.c.b.dismiss();
        this.c.a.e(cnqVar);
        d(arppVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arzx arzxVar = (arzx) obj;
        this.c.b.dismiss();
        this.c.e.m();
        d(this.b);
        if (arzxVar.c.isEmpty()) {
            return;
        }
        this.c.d.d(arzxVar.c, null);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
