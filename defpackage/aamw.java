package defpackage;

import com.google.android.libraries.youtube.innertube.model.ads.VastAd;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aamw extends afrd {
    private VastAd.ProgressPing a;

    public aamw() {
    }

    public aamw(VastAd.ProgressPing progressPing) {
        this.a = progressPing;
    }

    @Override // defpackage.afrd
    public final int a() {
        return 1;
    }

    @Override // defpackage.afrd
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new VastAd.ProgressPing(jSONObject.getInt("offset"), jSONObject.getBoolean("isPercentageOffset"), e(jSONObject, "pingUri"));
        }
        throw new JSONException("Unsupported version");
    }

    @Override // defpackage.afrd
    protected final void d(JSONObject jSONObject) {
        jSONObject.put("offset", this.a.b);
        jSONObject.put("isPercentageOffset", this.a.c);
        m(jSONObject, "pingUri", this.a.d);
    }
}
