package defpackage;

import android.os.Parcelable;
import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xep extends xfx {
    private ForecastingAd a;

    public xep() {
        super(null);
    }

    @Override // defpackage.afrd
    protected final int a() {
        return 1;
    }

    @Override // defpackage.xfx
    protected final String c() {
        return "forecastingAd";
    }

    @Override // defpackage.xfx, defpackage.afrd
    protected final void d(JSONObject jSONObject) {
        super.d(jSONObject);
        ForecastingAd forecastingAd = this.a;
        Parcelable.Creator creator = ForecastingAd.CREATOR;
        m(jSONObject, "forecastingAdRenderer", Base64.encodeToString(forecastingAd.b.toByteArray(), 2));
    }

    public xep(ForecastingAd forecastingAd) {
        super(forecastingAd);
        this.a = forecastingAd;
    }

    @Override // defpackage.afrd
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        try {
            return new ForecastingAd(h(jSONObject, "originalVideoId"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0), h(jSONObject, "contentPlayerAdParams"), h(jSONObject, "adBreakId"), jSONObject.getBoolean("isForOffline"), PlayerConfigModel.b, h(jSONObject, "adCpn"), jSONObject.getLong("expirationTimeMillis"), (aqxo) ((aone) aqxo.a.createBuilder().mergeFrom(Base64.decode(h(jSONObject, "forecastingAdRenderer"), 2), aomw.b())).build());
        } catch (aoob unused) {
            throw new JSONException("Invalid protobuf");
        }
    }
}
