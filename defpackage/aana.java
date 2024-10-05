package defpackage;

import com.google.android.libraries.youtube.innertube.model.ads.VastInfoCard;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aana extends afrd {
    private VastInfoCard.InfoCardTrackingEvent a;

    public aana() {
    }

    public aana(VastInfoCard.InfoCardTrackingEvent infoCardTrackingEvent) {
        this.a = infoCardTrackingEvent;
    }

    @Override // defpackage.afrd
    public final int a() {
        return 1;
    }

    @Override // defpackage.afrd
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new VastInfoCard.InfoCardTrackingEvent(jSONObject.getInt("type"), e(jSONObject, "baseUri"));
        }
        throw new JSONException("Unsupported version");
    }

    @Override // defpackage.afrd
    protected final void d(JSONObject jSONObject) {
        jSONObject.put("type", this.a.a());
        jSONObject.put("baseUri", this.a.b());
    }
}
