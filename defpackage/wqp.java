package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.ads.InstreamAd;
import com.google.protos.youtube.api.innertube.AdEngagementPanelsRendererOuterClass;
import java.util.List;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_BELOW_PLAYER_IMMERSIVE, d = {xdw.class, xcw.class, xds.class})
/* loaded from: classes4.dex */
public final class wqp extends wqz {
    public final wyn a;
    public final xgh b;

    public wqp(wrd wrdVar, wyn wynVar, xgh xghVar) {
        super(wrdVar);
        this.a = wynVar;
        this.b = xghVar;
    }

    @Override // defpackage.wqz
    public final void a() {
        this.d.c(new amml() { // from class: wqo
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                wqp wqpVar = wqp.this;
                xgh xghVar = (xgh) obj;
                InstreamAd instreamAd = (InstreamAd) xghVar.d(xds.class);
                List list = (List) xghVar.d(xcw.class);
                aplf aplfVar = (aplf) xghVar.d(xda.class);
                String str = (String) xghVar.d(xdw.class);
                aowz aowzVar = null;
                if (aplfVar != null) {
                    wyn wynVar = wqpVar.a;
                    xgh xghVar2 = wqpVar.b;
                    aoxb aoxbVar = aplfVar.b;
                    if (aoxbVar == null) {
                        aoxbVar = aoxb.a;
                    }
                    String str2 = aoxbVar.b;
                    aoxb aoxbVar2 = aplfVar.b;
                    if (aoxbVar2 == null) {
                        aoxbVar2 = aoxb.a;
                    }
                    apac b = apac.b(aoxbVar2.c);
                    if (b == null) {
                        b = apac.LAYOUT_TYPE_UNSPECIFIED;
                    }
                    apac apacVar = b;
                    aoxb aoxbVar3 = aplfVar.b;
                    if (aoxbVar3 == null) {
                        aoxbVar3 = aoxb.a;
                    }
                    aowz aowzVar2 = aoxbVar3.d;
                    if (aowzVar2 == null) {
                        aowzVar2 = aowz.a;
                    }
                    ammv j = ammv.j(aowzVar2);
                    aulq aulqVar = aplfVar.c;
                    if (aulqVar == null) {
                        aulqVar = aulq.a;
                    }
                    return wynVar.a(xghVar2, str2, apacVar, j, str, instreamAd, ((aowp) aulqVar.pX(AdEngagementPanelsRendererOuterClass.adEngagementPanelsRenderer)).b);
                }
                if (list == null || list.isEmpty()) {
                    return null;
                }
                wyn wynVar2 = wqpVar.a;
                xgh xghVar3 = wqpVar.b;
                if (instreamAd instanceof InstreamAdImpl) {
                    PlayerAd playerAd = ((InstreamAdImpl) instreamAd).b;
                    if (playerAd instanceof LocalVideoAd) {
                        aowzVar = ((LocalVideoAd) playerAd).o();
                    }
                }
                return wynVar2.a(xghVar3, wynVar2.c.a(apac.LAYOUT_TYPE_IMMERSIVE, xghVar3.a), apac.LAYOUT_TYPE_IMMERSIVE, ammv.i(aowzVar), str, instreamAd, list);
            }
        });
    }
}
