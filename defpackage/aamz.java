package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.ads.VastInfoCard;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aamz extends afrd {
    private VastInfoCard.InfoCardApp a;

    public aamz() {
    }

    public aamz(VastInfoCard.InfoCardApp infoCardApp) {
        this.a = infoCardApp;
    }

    @Override // defpackage.afrd
    public final int a() {
        return 1;
    }

    @Override // defpackage.afrd
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new VastInfoCard.InfoCardApp(jSONObject.getString("name"), jSONObject.optString("packageName", null), e(jSONObject, "icon"), jSONObject.getString("price"), jSONObject.getBoolean("hasRating"), (float) jSONObject.getDouble("rating"), e(jSONObject, "ratingImage"), jSONObject.getInt("reviews"));
        }
        throw new JSONException("Unsupported version");
    }

    @Override // defpackage.afrd
    protected final void d(JSONObject jSONObject) {
        jSONObject.put("name", this.a.b);
        jSONObject.put("packageName", this.a.i);
        jSONObject.put("icon", this.a.c);
        jSONObject.put("price", this.a.d);
        jSONObject.put("hasRating", this.a.e);
        jSONObject.put("rating", this.a.f);
        Uri uri = this.a.h;
        jSONObject.put("ratingImage", uri == null ? JSONObject.NULL : uri.toString());
        jSONObject.put("reviews", this.a.g);
    }
}
