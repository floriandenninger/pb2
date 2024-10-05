package defpackage;

import j$.util.Optional;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eld implements wwr {
    public final azrw a;
    private final azrw b;

    public eld(azrw azrwVar, azrw azrwVar2) {
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    @Override // defpackage.wwr
    public final void a(final xgh xghVar, final xev xevVar) {
        if (xghVar.c() == apae.SLOT_TYPE_PLAYER_BYTES_SEQUENCE_ITEM && xevVar.b == apac.LAYOUT_TYPE_MEDIA) {
            ((ajoy) this.b.get()).w(14, xeo.a, new wwc() { // from class: elc
                @Override // defpackage.wwc
                public final List a() {
                    aowc aowcVar;
                    aqrf aqrfVar;
                    eld eldVar = eld.this;
                    xgh xghVar2 = xghVar;
                    xev xevVar2 = xevVar;
                    if (!xghVar2.e(xea.class) || !xevVar2.f(xdy.class)) {
                        return Arrays.asList(new xgh[0]);
                    }
                    for (aryk arykVar : ((aryr) xevVar2.e(xdy.class)).m) {
                        if (arykVar.b == 84813246) {
                            aowcVar = (aowc) arykVar.c;
                        } else {
                            aowcVar = aowc.a;
                        }
                        for (aowd aowdVar : aowcVar.c) {
                            avvx avvxVar = aowdVar.h;
                            if (avvxVar == null) {
                                avvxVar = avvx.a;
                            }
                            avvw avvwVar = avvxVar.b;
                            if (avvwVar == null) {
                                avvwVar = avvw.a;
                            }
                            if (avvwVar.b == 153515154) {
                                avvx avvxVar2 = aowdVar.h;
                                if (avvxVar2 == null) {
                                    avvxVar2 = avvx.a;
                                }
                                xgh[] xghVarArr = new xgh[1];
                                wyt wytVar = (wyt) eldVar.a.get();
                                xgb xgbVar = (xgb) xghVar2.d(xea.class);
                                avvw avvwVar2 = avvxVar2.b;
                                if (avvwVar2 == null) {
                                    avvwVar2 = avvw.a;
                                }
                                if (avvwVar2.b == 153515154) {
                                    aqrfVar = (aqrf) avvwVar2.c;
                                } else {
                                    aqrfVar = aqrf.a;
                                }
                                aowz aowzVar = avvxVar2.d;
                                if (aowzVar == null) {
                                    aowzVar = aowz.a;
                                }
                                int i = avvxVar2.c;
                                String b = wytVar.b.b(apae.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER);
                                xghVarArr[0] = new xgh(b, ammw.a(apae.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER, Integer.valueOf(i)), 1, amru.r(new xge(wytVar.b.c(apah.TRIGGER_TYPE_SEQUENCE_ITEM_IN_PLAYER_SPACE_AVAILABLE), apah.TRIGGER_TYPE_SEQUENCE_ITEM_IN_PLAYER_SPACE_AVAILABLE, xgbVar)), amru.r(xgn.a(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_SCHEDULED), b)), amru.r(new xgc(wytVar.b.c(apah.TRIGGER_TYPE_REEL_ITEM_SEQUENCE_ABANDONED), apah.TRIGGER_TYPE_REEL_ITEM_SEQUENCE_ABANDONED)), xcp.b(new xea(xgbVar), new xdl(aqrfVar), new xcu(aowzVar)), Optional.empty());
                                return Arrays.asList(xghVarArr);
                            }
                        }
                    }
                    whu.l(null, "No ElementRenderer found in reels PlayerResponse");
                    return Arrays.asList(new xgh[0]);
                }
            });
        }
    }
}
