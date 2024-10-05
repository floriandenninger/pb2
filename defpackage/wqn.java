package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_BELOW_PLAYER, d = {xdw.class, xdh.class, xdg.class, xde.class, xds.class})
/* loaded from: classes4.dex */
public final class wqn extends wqz {
    public final wyn a;

    public wqn(wrd wrdVar, wyn wynVar) {
        super(wrdVar);
        this.a = wynVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        this.d.c(new amml() { // from class: wqm
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                aowz aowzVar;
                wqn wqnVar = wqn.this;
                xgh xghVar = (xgh) obj;
                InstreamAdImpl instreamAdImpl = (InstreamAdImpl) xghVar.d(xds.class);
                aqde aqdeVar = (aqde) xghVar.d(xdh.class);
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
                String str = (String) xghVar.d(xdw.class);
                wyn wynVar = wqnVar.a;
                int i = aqdeVar.b;
                if ((i & 512) != 0) {
                    aple apleVar = aqdeVar.l;
                    if (apleVar == null) {
                        apleVar = aple.a;
                    }
                    return wynVar.j(xghVar, apleVar, amru.r(xfo.e(wynVar.c.c(apah.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED), str, apae.SLOT_TYPE_PLAYER_BYTES, apac.LAYOUT_TYPE_MEDIA)), amru.q(), amru.q());
                }
                if ((i & 256) != 0) {
                    aoxa aoxaVar = aqdeVar.k;
                    if (aoxaVar == null) {
                        aoxaVar = aoxa.a;
                    }
                    aowzVar = aoxaVar.b;
                    if (aowzVar == null) {
                        aowzVar = aowz.a;
                    }
                } else {
                    aowzVar = null;
                }
                aowz aowzVar2 = aowzVar;
                String a = wynVar.c.a(apac.LAYOUT_TYPE_COMPANION, xghVar.a);
                return xev.d(a, apac.LAYOUT_TYPE_COMPANION, 1, amru.r(xfo.e(wynVar.c.c(apah.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED), str, apae.SLOT_TYPE_PLAYER_BYTES, apac.LAYOUT_TYPE_MEDIA)), amru.q(), amru.q(), ammv.i(aowzVar2), ammv.j(wynVar.d.c(xghVar, a, apac.LAYOUT_TYPE_COMPANION, 1, aowzVar2)), xcp.b(new xds(instreamAdImpl), new xdg(playerResponseModel), new xdd(aqdeVar)));
            }
        });
    }
}
