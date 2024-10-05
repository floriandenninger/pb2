package defpackage;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_FULLSCREEN_COMPANION, b = apae.SLOT_TYPE_FULLSCREEN_ENGAGEMENT, c = {xdp.class})
/* loaded from: classes3.dex */
public final class ejs implements wsx {
    private final ejr a;
    private final wsw b;
    private final xgh c;
    private final xev d;
    private final aqzi e;

    public ejs(ejr ejrVar, wsw wswVar, xgh xghVar, xev xevVar) {
        this.a = ejrVar;
        wswVar.getClass();
        this.b = wswVar;
        this.c = xghVar;
        xevVar.getClass();
        this.d = xevVar;
        this.e = (aqzi) xevVar.e(xdp.class);
    }

    @Override // defpackage.wsx
    public final xev a() {
        throw null;
    }

    @Override // defpackage.wsx
    public final void b() {
    }

    @Override // defpackage.wsx
    public final void qt() {
    }

    @Override // defpackage.wsx
    public final void qu() {
        asht ashtVar;
        ashd ashdVar = (ashd) this.d.i.f();
        ejr ejrVar = this.a;
        aqzi aqziVar = this.e;
        if (ashdVar != null) {
            aone createBuilder = asht.a.createBuilder();
            createBuilder.copyOnWrite();
            asht ashtVar2 = (asht) createBuilder.instance;
            ashtVar2.t = ashdVar;
            ashtVar2.c |= 1024;
            ashtVar = (asht) createBuilder.build();
        } else {
            ashtVar = null;
        }
        ksg ksgVar = (ksg) ejrVar;
        ksgVar.h = aqziVar;
        ksgVar.i = ashtVar;
        ksgVar.e();
        this.b.a(this.c, this.d);
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        ksg ksgVar = (ksg) this.a;
        ksgVar.i = null;
        if (ksgVar.h != null) {
            ksgVar.h = null;
            ksgVar.e();
        }
        this.b.e(this.c, this.d, i);
    }
}
