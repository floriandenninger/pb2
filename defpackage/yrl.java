package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class yrl implements ayrv {
    public final /* synthetic */ yrn a;
    private final /* synthetic */ int b;

    public /* synthetic */ yrl(yrn yrnVar, int i) {
        this.b = i;
        this.a = yrnVar;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            yrn yrnVar = this.a;
            if (((Boolean) obj).booleanValue()) {
                return aypn.e(yrnVar.a().A(suj.t).n(), yrnVar.g.a(), nxd.q).G().n();
            }
            return aypn.e(yrnVar.e, yrnVar.g.a(), nxd.p).G().n();
        }
        if (i == 1) {
            yrn yrnVar2 = this.a;
            if (((Boolean) obj).booleanValue()) {
                return yrnVar2.a().A(suj.r).n();
            }
            return yrnVar2.b.G().y().n();
        }
        yrn yrnVar3 = this.a;
        if (((Boolean) obj).booleanValue()) {
            return yrnVar3.a().A(suj.s).n();
        }
        return yrnVar3.c.G().y().n();
    }
}
