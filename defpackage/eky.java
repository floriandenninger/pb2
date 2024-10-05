package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_REELS_PLAYER_OVERLAY, b = apae.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER, c = {xdl.class, xea.class})
/* loaded from: classes3.dex */
public final class eky extends ekv {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eky(ekk ekkVar, wsw wswVar, xgh xghVar, xev xevVar, aqrf aqrfVar, final xgb xgbVar) {
        super(ekkVar, wswVar, xghVar, xevVar, aqrfVar, new eku() { // from class: ekx
            @Override // defpackage.eku
            public final ViewGroup a() {
                return xgb.this.d;
            }
        }, new ekt() { // from class: ekw
            @Override // defpackage.ekt
            public final ajok a() {
                return new ajok();
            }
        });
        xgbVar.getClass();
    }
}
