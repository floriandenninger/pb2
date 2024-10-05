package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.ThrottledAd;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@wyr(b = apae.SLOT_TYPE_PLAYER_BYTES, d = {xdr.class, xdg.class, xdf.class, xej.class})
/* loaded from: classes4.dex */
public final class wsb extends wqz {
    public final wnx a;
    public final ahfd b;
    public final wyq c;
    public final wyn e;
    public final wwg f;
    public final shf g;
    public final long h;
    public final yfl i;
    private final Executor j;
    private final Executor k;
    private final aaea l;

    public wsb(wrd wrdVar, Executor executor, Executor executor2, aaea aaeaVar, wnx wnxVar, ahfd ahfdVar, wyq wyqVar, wyn wynVar, wni wniVar, yfl yflVar, wwg wwgVar, shf shfVar, byte[] bArr, byte[] bArr2) {
        super(wrdVar);
        this.j = executor;
        this.k = executor2;
        this.l = aaeaVar;
        this.a = wnxVar;
        this.b = ahfdVar;
        this.c = wyqVar;
        this.e = wynVar;
        this.i = yflVar;
        this.f = wwgVar;
        this.g = shfVar;
        this.h = wniVar.f;
    }

    @Override // defpackage.wqz
    public final void a() {
        final long b = wbs.w(this.l) ? ((aixh) this.d.b.d(xej.class)).b() : -1L;
        this.d.b(new amml() { // from class: wsa
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                PlayerResponseModel playerResponseModel;
                InstreamAdBreak instreamAdBreak;
                List b2;
                wsb wsbVar = wsb.this;
                long j = b;
                xgh xghVar = (xgh) obj;
                InstreamAdBreak instreamAdBreak2 = (InstreamAdBreak) xghVar.d(xdr.class);
                PlayerResponseModel playerResponseModel2 = (PlayerResponseModel) xghVar.d(xdg.class);
                String str = (String) xghVar.d(xdf.class);
                if (playerResponseModel2.B()) {
                    throw new IllegalStateException("Received fulfillment request for offline playback");
                }
                zht zhtVar = new zht(wsbVar.g, wsbVar.h);
                List c = instreamAdBreak2.c();
                if (c.isEmpty()) {
                    wnx wnxVar = wsbVar.a;
                    byte[] bArr = instreamAdBreak2.i;
                    String a = instreamAdBreak2.c.a() == null ? "" : instreamAdBreak2.c.a();
                    long a2 = instreamAdBreak2.a();
                    int i = instreamAdBreak2.d;
                    wsbVar.b.g();
                    playerResponseModel = playerResponseModel2;
                    instreamAdBreak = instreamAdBreak2;
                    AdBreakResponseModel a3 = wnxVar.a(str, bArr, a, "", -1L, a2, i, j, zhtVar);
                    if (a3 == null) {
                        b2 = amru.q();
                    } else if (a3.b()) {
                        b2 = Arrays.asList(ThrottledAd.a);
                    } else {
                        c = a3.a();
                    }
                    return wsbVar.e.k(xghVar.a, instreamAdBreak, b2);
                }
                playerResponseModel = playerResponseModel2;
                instreamAdBreak = instreamAdBreak2;
                b2 = wsbVar.c.b(instreamAdBreak, c, playerResponseModel);
                return wsbVar.e.k(xghVar.a, instreamAdBreak, b2);
            }
        }, this.j, this.k, new wrc() { // from class: wrz
            @Override // defpackage.wrc
            public final xev a(xgh xghVar, xev xevVar) {
                xgu xguVar;
                wsb wsbVar = wsb.this;
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xghVar.d(xdg.class);
                String str = (String) xghVar.d(xdf.class);
                aixh aixhVar = (aixh) xghVar.d(xej.class);
                if (xevVar != null) {
                    if (xevVar.b == apac.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES) {
                        return xevVar;
                    }
                    int i = 0;
                    if (xevVar.g(apac.LAYOUT_TYPE_FORECASTING, xdn.class, xdr.class)) {
                        wsbVar.i.b(xghVar, str, aixhVar, playerResponseModel, (InstreamAdBreak) xevVar.e(xdr.class), (ForecastingAd) xevVar.e(xdn.class));
                    } else if (xevVar.g(apac.LAYOUT_TYPE_UNSPECIFIED, xed.class)) {
                        wwg wwgVar = wsbVar.f;
                        amru amruVar = xghVar.d;
                        int i2 = ((amvj) amruVar).c;
                        while (true) {
                            if (i >= i2) {
                                xguVar = null;
                                break;
                            }
                            xgx xgxVar = (xgx) amruVar.get(i);
                            i++;
                            if (xgxVar instanceof xfl) {
                                xguVar = ((xfl) xgxVar).d;
                                break;
                            }
                        }
                        if (xguVar != null && xghVar.c() == apae.SLOT_TYPE_PLAYER_BYTES) {
                            List list = wwgVar.d;
                            wyt wytVar = (wyt) wwgVar.c.get();
                            String str2 = (String) xghVar.d(xdf.class);
                            xcp xcpVar = xghVar.g;
                            String b2 = wytVar.b.b(apae.SLOT_TYPE_PLAYER_BYTES);
                            apae apaeVar = apae.SLOT_TYPE_PLAYER_BYTES;
                            amru r = amru.r(xfl.a(wytVar.b.c(apah.TRIGGER_TYPE_MEDIA_TIME_RANGE), str2, xguVar, false, true, false, false));
                            String c = wytVar.b.c(apah.TRIGGER_TYPE_MEDIA_TIME_RANGE);
                            long j = xguVar.a;
                            list.add(new wwf(xgh.j(b2, apaeVar, r, amru.s(xfl.a(c, str2, new xgu(j - wytVar.a.g, j), false, false, false, false), xgk.a(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_ENTERED), b2)), amru.t(xft.a(wytVar.b.c(apah.TRIGGER_TYPE_ON_SLOT_CANCELLATION_REQUESTED), b2), xgl.a(wytVar.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b2), xfs.e(wytVar.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str2)), xcpVar), xguVar, xeo.a(wwgVar.a, wwgVar.b)));
                            return null;
                        }
                    }
                }
                return null;
            }
        });
    }
}
