package defpackage;

import com.google.android.gms.ads.internal.client.AdErrorParcel;
import com.google.android.gms.ads.internal.client.AdapterResponseInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class puj {
    private final AdapterResponseInfoParcel a;
    private final puc b;

    public puj(AdapterResponseInfoParcel adapterResponseInfoParcel) {
        this.a = adapterResponseInfoParcel;
        AdErrorParcel adErrorParcel = adapterResponseInfoParcel.c;
        this.b = adErrorParcel == null ? null : adErrorParcel.a();
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.a.a);
        jSONObject.put("Latency", this.a.b);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.a.d.keySet()) {
            jSONObject2.put(str, this.a.d.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        puc pucVar = this.b;
        if (pucVar == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", pucVar.b());
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
