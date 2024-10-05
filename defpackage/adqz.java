package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqz {
    public final adgf a;
    public final JSONObject b;

    public adqz() {
    }

    public adqz(adgf adgfVar, JSONObject jSONObject) {
        this.a = adgfVar;
        this.b = jSONObject;
    }

    public static adqz b(JSONArray jSONArray) {
        JSONObject jSONObject;
        String string = jSONArray.getString(0);
        adgf a = adgf.a(string);
        if (a == null) {
            throw new JSONException(String.format("Invalid method name (%s) on message: %s", string, jSONArray));
        }
        JSONObject optJSONObject = jSONArray.optJSONObject(1);
        adqy adqyVar = new adqy();
        adqyVar.a = a;
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        adqyVar.b = optJSONObject;
        adgf adgfVar = adqyVar.a;
        if (adgfVar == null || (jSONObject = adqyVar.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (adqyVar.a == null) {
                sb.append(" method");
            }
            if (adqyVar.b == null) {
                sb.append(" data");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adqz(adgfVar, jSONObject);
    }

    public final int a() {
        return this.b.optInt("senderMsn", -1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adqz) {
            adqz adqzVar = (adqz) obj;
            if (this.a.equals(adqzVar.a) && this.b.equals(adqzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(valueOf2).length());
        sb.append("MdxMessage{method=");
        sb.append(valueOf);
        sb.append(", data=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
