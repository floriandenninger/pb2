package defpackage;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adqx {
    private static final String a;

    static {
        String valueOf = String.valueOf(adqx.class.getCanonicalName());
        a = zga.a(valueOf.length() != 0 ? "MDX.".concat(valueOf) : new String("MDX."));
    }

    private adqx() {
    }

    public static JSONArray a(adgf adgfVar, adgj adgjVar) {
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(0, adgfVar);
        } catch (JSONException e) {
            String str = a;
            String valueOf = String.valueOf(adgfVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Error converting ");
            sb.append(valueOf);
            sb.append(" to JSON ");
            zga.o(str, sb.toString(), e);
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = adgjVar.iterator();
        while (it.hasNext()) {
            adgi next = ((adgh) it).next();
            try {
                jSONObject.put(next.a, next.b);
            } catch (JSONException e2) {
                String str2 = a;
                String valueOf2 = String.valueOf(adgjVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                sb2.append("Error converting ");
                sb2.append(valueOf2);
                sb2.append(" to JSON ");
                zga.o(str2, sb2.toString(), e2);
                return jSONArray;
            }
        }
        try {
            jSONArray.put(1, jSONObject);
            return jSONArray;
        } catch (JSONException e3) {
            String str3 = a;
            String valueOf3 = String.valueOf(jSONObject);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 29);
            sb3.append("Error adding params ");
            sb3.append(valueOf3);
            sb3.append(" to JSON ");
            zga.o(str3, sb3.toString(), e3);
            return jSONArray;
        }
    }

    public static JSONObject b(adgj adgjVar) {
        JSONObject jSONObject = new JSONObject();
        Iterator it = adgjVar.iterator();
        while (it.hasNext()) {
            adgi next = ((adgh) it).next();
            try {
                jSONObject.put(next.a, next.b);
            } catch (JSONException e) {
                String str = a;
                String valueOf = String.valueOf(adgjVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("Error converting ");
                sb.append(valueOf);
                sb.append(" to JSON ");
                zga.o(str, sb.toString(), e);
            }
        }
        return jSONObject;
    }
}
