package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyt {
    public final wni a;
    public final wym b;
    public final aaea c;

    public wyt(wni wniVar, wym wymVar, aaea aaeaVar) {
        this.a = wniVar;
        this.b = wymVar;
        this.c = aaeaVar;
    }

    public static final xgh c(String str, String str2, PlayerResponseModel playerResponseModel, xfn xfnVar, boolean z) {
        return xgh.b(str, apae.SLOT_TYPE_PLAYER_BYTES, 4, xcp.b(new xdb(xfnVar), new xdf(str2), new xdg(playerResponseModel), new xdt(z)));
    }

    public static final List d(String str, aixh aixhVar, PlayerResponseModel playerResponseModel, xfn xfnVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xdf(str));
        arrayList.add(new xej(aixhVar));
        arrayList.add(new xdg(playerResponseModel));
        arrayList.add(new xdb(xfnVar));
        return arrayList;
    }

    public static final long e(InstreamAdBreak instreamAdBreak) {
        if (instreamAdBreak != null && instreamAdBreak.b() == xfn.MID_ROLL) {
            return instreamAdBreak.a();
        }
        return 9223372036854775806L;
    }

    private final xgx f(String str, String str2, InstreamAdBreak instreamAdBreak, xgu xguVar) {
        xfn xfnVar = xfn.PRE_ROLL;
        int ordinal = instreamAdBreak.b().ordinal();
        if (ordinal == 0) {
            return xgn.a(this.b.c(apah.TRIGGER_TYPE_SLOT_ID_SCHEDULED), str);
        }
        if (ordinal == 1) {
            return xfl.a(this.b.c(apah.TRIGGER_TYPE_MEDIA_TIME_RANGE), str2, xguVar, false, false, false, false);
        }
        if (ordinal == 2) {
            return xen.a(this.b.c(apah.TRIGGER_TYPE_CONTENT_VIDEO_ID_ENDED), str2, false);
        }
        throw new IllegalStateException();
    }

    public final xgh a(aqxo aqxoVar, String str, aixh aixhVar, PlayerResponseModel playerResponseModel, InstreamAdBreak instreamAdBreak, xgu xguVar, ForecastingAd forecastingAd) {
        String b = this.b.b(apae.SLOT_TYPE_FORECASTING);
        if (wbs.q(this.c)) {
            apae apaeVar = apae.SLOT_TYPE_FORECASTING;
            amru r = amru.r(f(b, str, instreamAdBreak, xguVar));
            amru r2 = amru.r(xgk.a(this.b.c(apah.TRIGGER_TYPE_SLOT_ID_ENTERED), b));
            amru s = amru.s(xfs.a(this.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str), xgl.a(this.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b));
            xcp b2 = forecastingAd != null ? xcp.b(new xdn(forecastingAd), new xdf(str), new xdr(instreamAdBreak), new xej(aixhVar)) : xcp.b(new xdo(aqxoVar), new xdr(instreamAdBreak), new xdf(str), new xdg(playerResponseModel), new xej(aixhVar));
            aoyn aoynVar = instreamAdBreak.c.b.h;
            if (aoynVar == null) {
                aoynVar = aoyn.a;
            }
            return new xgh(b, ammw.a(apaeVar, 1), 1, r, r2, s, b2, Optional.of(aoynVar));
        }
        return xgh.j(b, apae.SLOT_TYPE_FORECASTING, amru.r(f(b, str, instreamAdBreak, xguVar)), amru.r(xgk.a(this.b.c(apah.TRIGGER_TYPE_SLOT_ID_ENTERED), b)), amru.s(xfs.a(this.b.c(apah.TRIGGER_TYPE_ON_NEW_PLAYBACK_AFTER_CONTENT_VIDEO_ID), str), xgl.a(this.b.c(apah.TRIGGER_TYPE_SLOT_ID_EXITED), b)), forecastingAd != null ? xcp.b(new xdn(forecastingAd), new xdf(str), new xdr(instreamAdBreak), new xej(aixhVar)) : xcp.b(new xdo(aqxoVar), new xdr(instreamAdBreak), new xdf(str), new xdg(playerResponseModel), new xej(aixhVar)));
    }

    public final xgh b() {
        return xgh.b(this.b.b(apae.SLOT_TYPE_IN_PLAYER), apae.SLOT_TYPE_IN_PLAYER, 3, xcp.b(new xcy[0]));
    }
}
