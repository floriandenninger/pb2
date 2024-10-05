package defpackage;

import com.google.android.libraries.youtube.ads.model.AdIntro;
import com.google.android.libraries.youtube.ads.model.AdVideoEnd;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xeu extends afrd {
    private InstreamAdImpl a;

    public xeu() {
    }

    public xeu(InstreamAdImpl instreamAdImpl) {
        this.a = instreamAdImpl;
    }

    @Override // defpackage.afrd
    public final int a() {
        return 3;
    }

    @Override // defpackage.afrd
    protected final void d(JSONObject jSONObject) {
        PlayerAd playerAd = this.a.b;
        if (playerAd instanceof LocalVideoAd) {
            o(jSONObject, "videoAd", playerAd);
            return;
        }
        if (playerAd instanceof ForecastingAd) {
            o(jSONObject, "forecastingAd", playerAd);
            return;
        }
        if (playerAd instanceof SurveyAd) {
            o(jSONObject, "surveyAd", playerAd);
        } else if (playerAd instanceof AdVideoEnd) {
            o(jSONObject, "adVideoEnd", playerAd);
        } else if (playerAd instanceof AdIntro) {
            o(jSONObject, "adIntro", playerAd);
        }
    }

    @Override // defpackage.afrd
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        PlayerAd playerAd;
        if (i != 3) {
            throw new JSONException("Unsupported version");
        }
        if (LocalVideoAd.a.g(jSONObject, "videoAd") != null) {
            playerAd = (PlayerAd) LocalVideoAd.a.g(jSONObject, "videoAd");
        } else if (ForecastingAd.a.g(jSONObject, "forecastingAd") != null) {
            playerAd = (PlayerAd) ForecastingAd.a.g(jSONObject, "forecastingAd");
        } else if (SurveyAd.a.g(jSONObject, "surveyAd") != null) {
            playerAd = (PlayerAd) SurveyAd.a.g(jSONObject, "surveyAd");
        } else if (AdVideoEnd.a.g(jSONObject, "adVideoEnd") != null) {
            playerAd = (PlayerAd) AdVideoEnd.a.g(jSONObject, "adVideoEnd");
        } else {
            playerAd = AdIntro.a.g(jSONObject, "adIntro") != null ? (PlayerAd) AdIntro.a.g(jSONObject, "adIntro") : null;
        }
        return new InstreamAdImpl(playerAd);
    }
}
