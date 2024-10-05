package defpackage;

import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class wqj {
    public static final wqi a = new wqi();
    public final shf b;
    public final aarr c;
    public final azrw d;
    private final ajoy e;

    public wqj(shf shfVar, ajoy ajoyVar, aarr aarrVar, azrw azrwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = shfVar;
        this.e = ajoyVar;
        this.c = aarrVar;
        this.d = azrwVar;
    }

    public final InstreamAdImpl a(InstreamAdBreak instreamAdBreak, aulq aulqVar, PlayerConfigModel playerConfigModel, String str) {
        instreamAdBreak.getClass();
        if (instreamAdBreak.b() == xfn.PRE_ROLL) {
            yjk.e();
        }
        aapf aapfVar = (aapf) this.d.get();
        aarr aarrVar = this.c;
        long c = this.b.c();
        PlayerAd playerAd = null;
        if (aulqVar == null) {
            zga.b("Received null renderer, this should never happen.");
        } else if (aulqVar.pY(avvz.a)) {
            playerAd = new LocalVideoAd(instreamAdBreak, playerConfigModel, str, (avvy) aulqVar.pX(avvz.a), aapfVar, aarrVar, c);
        } else if (aulqVar.pY(aqxp.a)) {
            playerAd = new ForecastingAd(instreamAdBreak, playerConfigModel, str, c, (aqxo) aulqVar.pX(aqxp.a));
        } else if (aulqVar.pY(avbp.a)) {
            playerAd = new SurveyAd(instreamAdBreak, playerConfigModel, str, (avbm) aulqVar.pX(avbp.a), 0);
        } else {
            zga.b("Received unsupported ad type, this should never happen.");
        }
        return new InstreamAdImpl(playerAd);
    }

    public final String b() {
        return this.e.x();
    }
}
