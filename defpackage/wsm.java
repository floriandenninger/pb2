package defpackage;

import com.google.android.libraries.youtube.innertube.model.ads.InstreamAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.protos.youtube.api.innertube.MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer;
import java.util.Iterator;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_COMPANION, b = apae.SLOT_TYPE_BELOW_PLAYER, c = {xdd.class, xds.class, xdg.class})
/* loaded from: classes4.dex */
public final class wsm implements wsx {
    private final wsw a;
    private final xgh b;
    private final xev c;
    private final woo d;
    private final aqde e;
    private final InstreamAd f;
    private final PlayerResponseModel g;

    public wsm(wsw wswVar, xgh xghVar, xev xevVar, woo wooVar) {
        this.a = wswVar;
        this.b = xghVar;
        this.c = xevVar;
        this.d = wooVar;
        this.e = (aqde) xevVar.e(xdd.class);
        this.f = (InstreamAd) xevVar.e(xds.class);
        this.g = (PlayerResponseModel) xevVar.e(xdg.class);
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
        woo wooVar = this.d;
        xev xevVar = this.c;
        String str = xevVar.a;
        InstreamAd instreamAd = this.f;
        PlayerResponseModel playerResponseModel = this.g;
        aqde aqdeVar = this.e;
        ashd ashdVar = (ashd) xevVar.i.f();
        wnc wncVar = (wnc) wooVar;
        wncVar.c();
        wncVar.c = instreamAd;
        wncVar.e = true;
        wncVar.d = true;
        if (wncVar.c != null) {
            MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer = null;
            if ((aqdeVar.b & 64) != 0) {
                athz athzVar = aqdeVar.i;
                if (athzVar == null) {
                    athzVar = athz.a;
                }
                for (aulq aulqVar : athzVar.b) {
                    MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2 = aulqVar.pY(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.companionStateRenderer) ? (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer) aulqVar.pX(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.companionStateRenderer) : null;
                    if (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2 != null && (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2.b & 1) != 0) {
                        wncVar.g.put(multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2.c, multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2);
                    }
                }
            }
            Iterator it = wncVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wnb wnbVar = (wnb) it.next();
                if (wnbVar.i(str, aqdeVar, ashdVar)) {
                    wncVar.d(wnbVar);
                    break;
                }
            }
            if (wncVar.b == null) {
                if ((aqdeVar.b & 64) != 0) {
                    athz athzVar2 = aqdeVar.i;
                    if (athzVar2 == null) {
                        athzVar2 = athz.a;
                    }
                    Iterator it2 = athzVar2.b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        aulq aulqVar2 = (aulq) it2.next();
                        if (aulqVar2.pY(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.companionStateRenderer)) {
                            multiStateCompanionAdRendererOuterClass$CompanionStateRenderer = (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer) aulqVar2.pX(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.companionStateRenderer);
                            break;
                        }
                    }
                }
                if (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer != null && (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.b & 2) != 0) {
                    aulq aulqVar3 = multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.d;
                    if (aulqVar3 == null) {
                        aulqVar3 = aulq.a;
                    }
                    Iterator it3 = wncVar.a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        wnb wnbVar2 = (wnb) it3.next();
                        if ((wnbVar2 instanceof wna) && ((wna) wnbVar2).j(str, aulqVar3)) {
                            wncVar.d(wnbVar2);
                            break;
                        }
                    }
                }
            }
            if (wncVar.b == null) {
                wncVar.d(wncVar.a(playerResponseModel, str, ashdVar));
            }
            wmz wmzVar = wncVar.b;
            if (wmzVar != null && wncVar.d) {
                wmzVar.f();
            }
        }
        this.a.a(this.b, this.c);
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        ((wnc) this.d).c();
        this.a.e(this.b, this.c, i);
    }
}
