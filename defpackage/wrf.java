package defpackage;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_IN_PLAYER, d = {xdi.class, xdk.class})
/* loaded from: classes4.dex */
public final class wrf extends wqz {
    public final wyn a;

    public wrf(wrd wrdVar, wyn wynVar) {
        super(wrdVar);
        this.a = wynVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        this.d.c(new amml() { // from class: wre
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                wrf wrfVar = wrf.this;
                xgh xghVar = (xgh) obj;
                String str = (String) xghVar.d(xdk.class);
                aulq aulqVar = (aulq) xghVar.d(xdi.class);
                wyn wynVar = wrfVar.a;
                String a = wynVar.c.a(apac.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, xghVar.a);
                return xev.d(a, apac.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, 1, amru.r(xfb.e(wynVar.c.c(apah.TRIGGER_TYPE_LAYOUT_ID_EXITED), str)), amru.q(), amru.q(), amlr.a, ammv.j(wynVar.d.c(xghVar, a, apac.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, 1, null)), xcp.b(new xdi(aulqVar)));
            }
        });
    }
}
