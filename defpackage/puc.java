package defpackage;

import com.google.android.gms.ads.internal.client.AdErrorParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class puc {
    public final int a;
    public final String b;
    public final String c;
    private final puc d;

    public puc(int i, String str, String str2) {
        this(i, str, str2, null);
    }

    public puc(int i, String str, String str2, puc pucVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = pucVar;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.a);
        jSONObject.put("Message", this.b);
        jSONObject.put("Domain", this.c);
        puc pucVar = this.d;
        if (pucVar == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", pucVar.b());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final AdErrorParcel a() {
        puc pucVar = this.d;
        return new AdErrorParcel(this.a, this.b, this.c, pucVar == null ? null : new AdErrorParcel(pucVar.a, pucVar.b, pucVar.c, null, null), null);
    }
}
