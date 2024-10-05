package defpackage;

import android.os.Parcelable;
import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgo extends xfx {
    private SurveyAd a;

    public xgo() {
        super(null);
    }

    @Override // defpackage.afrd
    protected final int a() {
        return 1;
    }

    @Override // defpackage.xfx
    protected final String c() {
        return "surveyAd";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.xfx, defpackage.afrd
    public final void d(JSONObject jSONObject) {
        super.d(jSONObject);
        SurveyAd surveyAd = this.a;
        Parcelable.Creator creator = SurveyAd.CREATOR;
        m(jSONObject, "surveyAdRenderer", Base64.encodeToString(surveyAd.b.toByteArray(), 2));
        jSONObject.put("adPodSkipIndex", this.a.q);
    }

    public xgo(SurveyAd surveyAd) {
        super(surveyAd);
        this.a = surveyAd;
    }

    @Override // defpackage.afrd
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        try {
            return new SurveyAd(h(jSONObject, "originalVideoId"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0), h(jSONObject, "contentPlayerAdParams"), h(jSONObject, "adBreakId"), jSONObject.getBoolean("isForOffline"), PlayerConfigModel.b, h(jSONObject, "adCpn"), (avbm) ((aone) avbm.a.createBuilder().mergeFrom(Base64.decode(h(jSONObject, "surveyAdRenderer"), 2), aomw.b())).build(), jSONObject.getInt("adPodSkipIndex"));
        } catch (aoob unused) {
            throw new JSONException("Invalid protobuf");
        }
    }
}
