package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ywp implements ywr {
    public final azqw a;
    public final aypn b;
    private final ambx c;
    private final aooy d;

    public ywp(ambx ambxVar, aooy aooyVar) {
        this.d = aooyVar;
        this.c = ambxVar;
        azqw av = azqv.ap().av();
        this.a = av;
        aypn g = wbs.J(ambxVar.c()).G(suj.u).g();
        aysw.b(aooyVar, "item is null");
        ayzo ayzoVar = new ayzo(g, aysu.b(aooyVar));
        ayrv ayrvVar = aynu.j;
        this.b = ayzoVar.j(av).n();
    }

    @Override // defpackage.ywr
    public final anhy a() {
        return anfq.i(this.c.c(), ufj.h, angq.a);
    }

    @Override // defpackage.ywr
    public final anhy b(amml ammlVar) {
        return anfq.h(anfq.i(anfq.i(anht.q(this.c.c()), new ywo(ammlVar, 0), angq.a), new anfz() { // from class: ywn
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                return ywp.this.a();
            }
        }, angq.a), new amml() { // from class: ywm
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                ywp.this.a.c((aooy) obj);
                return null;
            }
        }, angq.a);
    }

    @Override // defpackage.ywr
    public final aooy c() {
        try {
            return ((agcm) ynm.d(this.c.c(), yml.d)).d();
        } catch (Exception e) {
            zga.d("Failed to read from the store. Falling back to store fallbacks", e);
            return this.d;
        }
    }

    @Override // defpackage.ywr
    public final aypn d() {
        return this.b;
    }
}
