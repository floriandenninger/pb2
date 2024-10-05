package defpackage;

import com.google.android.libraries.youtube.innertube.model.ads.VastInfoCard;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aamx extends afrd {
    private VastInfoCard a;

    public aamx() {
    }

    public aamx(VastInfoCard vastInfoCard) {
        this.a = vastInfoCard;
    }

    @Override // defpackage.afrd
    public final int a() {
        return 1;
    }

    @Override // defpackage.afrd
    protected final /* bridge */ /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i != 1) {
            throw new JSONException("Unsupported version");
        }
        return new VastInfoCard(jSONObject.getInt("type"), VastInfoCard.InfoCardAction.a.i(jSONObject.getJSONArray("actions")), VastInfoCard.InfoCardTrackingEvent.a.i(jSONObject.getJSONArray("events")), (VastInfoCard.InfoCardApp) VastInfoCard.InfoCardApp.a.g(jSONObject, "app"));
    }

    @Override // defpackage.afrd
    protected final void d(JSONObject jSONObject) {
        jSONObject.put("type", this.a.b);
        n(jSONObject, "actions", this.a.c);
        n(jSONObject, "events", this.a.d);
        o(jSONObject, "app", this.a.e);
    }
}
