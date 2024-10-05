package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_PLAYER_BYTES, d = {xdg.class, xdj.class, xdf.class, xej.class, xcr.class})
/* loaded from: classes4.dex */
public final class wrw extends wqz {
    public final wnx a;
    public final ahfd b;
    public final wyn c;
    public final wyq e;
    public final wxa f;
    public final shf g;
    public final long h;
    public final yfl i;
    private final Executor j;
    private final Executor k;
    private final aaea l;

    public wrw(wrd wrdVar, Executor executor, Executor executor2, wnx wnxVar, ahfd ahfdVar, wni wniVar, wyn wynVar, wyq wyqVar, wxa wxaVar, yfl yflVar, aaea aaeaVar, shf shfVar, byte[] bArr, byte[] bArr2) {
        super(wrdVar);
        this.j = executor;
        this.k = executor2;
        this.a = wnxVar;
        this.b = ahfdVar;
        this.c = wynVar;
        this.e = wyqVar;
        this.f = wxaVar;
        this.i = yflVar;
        this.l = aaeaVar;
        this.g = shfVar;
        this.h = wniVar.f;
    }

    @Override // defpackage.wqz
    public final void a() {
        final long b = wbs.w(this.l) ? ((aixh) this.d.b.d(xej.class)).b() : -1L;
        this.d.b(new amml() { // from class: wrv
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                String str;
                aowc aowcVar;
                wrw wrwVar = wrw.this;
                long j = b;
                xgh xghVar = (xgh) obj;
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
                aeqn aeqnVar = (aeqn) xghVar.d(xdj.class);
                String str2 = (String) xghVar.d(xdf.class);
                aixh aixhVar = (aixh) xghVar.d(xej.class);
                int intValue = ((Integer) xghVar.d(xcr.class)).intValue();
                wnx wnxVar = wrwVar.a;
                byte[] G = playerResponseModel.G();
                Iterator it = playerResponseModel.z().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    aowc aowcVar2 = (aowc) it.next();
                    int bY = amkq.bY(aowcVar2.d);
                    if (bY != 0 && bY == 7) {
                        str = aowcVar2.e;
                        break;
                    }
                }
                String str3 = aeqnVar.e;
                long j2 = aeqnVar.d;
                long a = aeqnVar.a();
                wrwVar.b.g();
                AdBreakResponseModel a2 = wnxVar.a(str2, G, str, str3, j2, a, intValue, j, new zht(wrwVar.g, wrwVar.h));
                if (a2 == null || a2.b()) {
                    return null;
                }
                if (a2.a.c.size() != 0) {
                    for (arit aritVar : a2.a.c) {
                        if (aritVar.b == 84813246) {
                            aowcVar = (aowc) aritVar.c;
                            break;
                        }
                    }
                }
                aowcVar = null;
                InstreamAdBreak instreamAdBreak = new InstreamAdBreak(new AdBreakRendererModel(aowcVar), intValue, playerResponseModel.B(), playerResponseModel.y(), aeqnVar.a, playerResponseModel.v(), playerResponseModel.G());
                List<PlayerAd> b2 = wrwVar.e.b(instreamAdBreak, a2.a(), playerResponseModel);
                wyn wynVar = wrwVar.c;
                if (b2.isEmpty()) {
                    return null;
                }
                if (b2.get(0) instanceof ForecastingAd) {
                    return wynVar.b(xghVar.a, instreamAdBreak, (ForecastingAd) b2.get(0));
                }
                ArrayList arrayList = new ArrayList();
                for (PlayerAd playerAd : b2) {
                    if (playerAd instanceof MediaAd) {
                        wym wymVar = wynVar.c;
                        apac apacVar = apac.LAYOUT_TYPE_MEDIA;
                        String str4 = xghVar.a;
                        String str5 = playerAd.m;
                        arrayList.add(wymVar.a(apacVar, str4));
                    } else {
                        String valueOf = String.valueOf(playerAd);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
                        sb.append("Unexpected playerAd type for DAI layout: ");
                        sb.append(valueOf);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                String a3 = wynVar.c.a(apac.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, xghVar.a);
                List i = wynVar.i(instreamAdBreak, b2, arrayList, a3);
                if (i.isEmpty()) {
                    return null;
                }
                return xev.h(a3, apac.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, amru.r(new xfc(wynVar.c.c(apah.TRIGGER_TYPE_LIVE_STREAM_BREAK_ENDED), apah.TRIGGER_TYPE_LIVE_STREAM_BREAK_ENDED, a3)), amlr.a, xcp.b(new xdr(instreamAdBreak), new xec(i), new xej(aixhVar)));
            }
        }, this.j, this.k, new wrc() { // from class: wru
            @Override // defpackage.wrc
            public final xev a(xgh xghVar, xev xevVar) {
                wrw wrwVar = wrw.this;
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
                aeqn aeqnVar = (aeqn) xghVar.d(xdj.class);
                String str = (String) xghVar.d(xdf.class);
                aixh aixhVar = (aixh) xghVar.d(xej.class);
                if (xevVar != null) {
                    if (xevVar.b == apac.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES) {
                        wrwVar.f.k(xevVar, aeqnVar.a);
                        return xevVar;
                    }
                    if (xevVar.g(apac.LAYOUT_TYPE_FORECASTING, xdn.class, xdr.class)) {
                        wrwVar.i.b(xghVar, str, aixhVar, playerResponseModel, (InstreamAdBreak) xevVar.e(xdr.class), (ForecastingAd) xevVar.e(xdn.class));
                        return null;
                    }
                }
                return null;
            }
        });
    }
}
