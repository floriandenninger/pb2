package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adjz {
    public final adkb a;
    public int b;
    List c;

    public adjz(adkb adkbVar) {
        this(adkbVar, null);
    }

    public final long a() {
        if (this.c.isEmpty()) {
            return 0L;
        }
        return ((Long) this.c.get(r0.size() - 1)).longValue();
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jSONArray.put(((Long) it.next()).longValue());
        }
        try {
            jSONObject.put("occurs", this.b);
            jSONObject.put("timestamps", jSONArray);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public adjz(adkb adkbVar, String str) {
        this.a = adkbVar;
        this.b = 0;
        this.c = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("timestamps");
            this.b = jSONObject.getInt("occurs");
            for (int i = 0; i < jSONArray.length(); i++) {
                this.c.add(Long.valueOf(jSONArray.getLong(i)));
            }
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
