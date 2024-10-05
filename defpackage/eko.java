package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER, d = {xea.class, xdl.class, xcu.class})
/* loaded from: classes3.dex */
public final class eko extends wqz {
    public final wyn a;
    private final Executor b;
    private final Executor c;

    public eko(wrd wrdVar, Executor executor, Executor executor2, wyn wynVar) {
        super(wrdVar);
        this.b = executor;
        this.c = executor2;
        this.a = wynVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        this.d.a(new amml() { // from class: ekn
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                eko ekoVar = eko.this;
                xgh xghVar = (xgh) obj;
                xgb xgbVar = (xgb) xghVar.d(xea.class);
                aqrf aqrfVar = (aqrf) xghVar.d(xdl.class);
                aowz aowzVar = (aowz) xghVar.d(xcu.class);
                wyn wynVar = ekoVar.a;
                String a = wynVar.c.a(apac.LAYOUT_TYPE_REELS_PLAYER_OVERLAY, xghVar.a);
                return xev.d(a, apac.LAYOUT_TYPE_REELS_PLAYER_OVERLAY, 1, amru.r(new xgf(wynVar.c.c(apah.TRIGGER_TYPE_SEQUENCE_ITEM_IN_PLAYER_SPACE_UNAVAILABLE), apah.TRIGGER_TYPE_SEQUENCE_ITEM_IN_PLAYER_SPACE_UNAVAILABLE, xgbVar)), amru.q(), amru.q(), ammv.j(aowzVar), ammv.j(wynVar.d.c(xghVar, a, apac.LAYOUT_TYPE_REELS_PLAYER_OVERLAY, 1, aowzVar)), xcp.b(new xea(xgbVar), new xdl(aqrfVar)));
            }
        }, this.b, this.c);
    }
}
