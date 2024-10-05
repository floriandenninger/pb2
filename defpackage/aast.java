package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aast implements afwx {
    final /* synthetic */ aasq a;
    final /* synthetic */ aaru b;
    final /* synthetic */ afwx c;
    final /* synthetic */ aasu d;

    public aast(aasu aasuVar, aasq aasqVar, aaru aaruVar, afwx afwxVar) {
        this.d = aasuVar;
        this.a = aasqVar;
        this.b = aaruVar;
        this.c = afwxVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.d.n(this.b);
        this.c.kY(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        aooy aooyVar = (aooy) obj;
        this.d.l(aooyVar);
        Object h = this.d.h(aooyVar);
        this.a.b(h);
        this.d.m(this.b, h);
        this.c.kZ(h);
    }

    @Override // defpackage.afwx
    public final void lK() {
        this.c.lK();
    }
}
