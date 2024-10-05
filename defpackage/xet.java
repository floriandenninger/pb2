package defpackage;

import android.util.Base64;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xet extends afrd {
    private InstreamAdBreak a;

    public xet() {
    }

    public xet(InstreamAdBreak instreamAdBreak) {
        this.a = instreamAdBreak;
    }

    @Override // defpackage.afrd
    public final int a() {
        return 1;
    }

    @Override // defpackage.afrd
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new InstreamAdBreak((AdBreakRendererModel) AdBreakRendererModel.a.g(jSONObject, "adBreakRenderer"), jSONObject.getInt("adBreakIndex"), jSONObject.getBoolean("isForOffline"), jSONObject.getString("orginalVideoId"), jSONObject.getString("adBreakId"), h(jSONObject, "contentPlayerAdParams"), Base64.decode(jSONObject.getString("requestTrackingParams"), 0));
        }
        throw new JSONException("Unsupported version");
    }

    @Override // defpackage.afrd
    protected final void d(JSONObject jSONObject) {
        o(jSONObject, "adBreakRenderer", this.a.c);
        jSONObject.put("adBreakIndex", this.a.d);
        jSONObject.put("isForOffline", this.a.e);
        jSONObject.put("orginalVideoId", this.a.f);
        jSONObject.put("adBreakId", this.a.g);
        m(jSONObject, "contentPlayerAdParams", this.a.h);
        jSONObject.put("requestTrackingParams", Base64.encodeToString(this.a.i, 0));
    }
}
