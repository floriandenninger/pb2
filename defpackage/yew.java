package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yew implements afwx {
    final /* synthetic */ aomf a;
    final /* synthetic */ arpp b;
    final /* synthetic */ yex c;

    public yew(yex yexVar, aomf aomfVar, arpp arppVar) {
        this.c = yexVar;
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
            awga c = yeyVar.c();
            a.copyOnWrite();
            ((arpp) a.instance).eA(c);
            arppVar = (arpp) a.build();
        }
        this.c.b.dismiss();
        this.c.a.e(cnqVar);
        d(arppVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arxc arxcVar = (arxc) obj;
        this.c.b.dismiss();
        this.c.e.m();
        d(this.b);
        if (arxcVar.c.isEmpty()) {
            return;
        }
        this.c.d.d(arxcVar.c, null);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
