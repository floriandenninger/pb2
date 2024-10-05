package defpackage;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_BELOW_PLAYER, d = {xdx.class})
/* loaded from: classes4.dex */
public final class wql extends wqz {
    public final wyn a;
    private final xgh b;

    public wql(wrd wrdVar, wyn wynVar, xgh xghVar) {
        super(wrdVar);
        this.a = wynVar;
        this.b = xghVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        final atyh atyhVar = (atyh) this.b.d(xdx.class);
        this.d.c(new amml() { // from class: wqk
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                wql wqlVar = wql.this;
                atyh atyhVar2 = atyhVar;
                xgh xghVar = (xgh) obj;
                wyn wynVar = wqlVar.a;
                String a = wynVar.c.a(apac.LAYOUT_TYPE_COMPANION, xghVar.a);
                return xev.h(a, apac.LAYOUT_TYPE_COMPANION, amru.r(xfp.e(wynVar.c.c(apah.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED), a)), ammv.j(wynVar.d.c(xghVar, a, apac.LAYOUT_TYPE_COMPANION, 1, null)), xcp.b(new xdx(atyhVar2)));
            }
        });
    }
}
