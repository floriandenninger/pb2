package defpackage;

import android.net.Uri;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class afrd {
    /* JADX INFO: Access modifiers changed from: protected */
    public static Uri e(JSONObject jSONObject, String str) {
        try {
            if (jSONObject.isNull(str)) {
                return null;
            }
            return wbs.ai(jSONObject.getString(str));
        } catch (MalformedURLException e) {
            zga.d("Malformed URL", e);
            throw new JSONException("Malformed URL Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String h(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static final JSONArray k(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            afre afreVar = (afre) it.next();
            jSONArray.put(afreVar == null ? JSONObject.NULL : afreVar.h().l());
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void m(JSONObject jSONObject, String str, Object obj) {
        jSONObject.put(str, obj == null ? JSONObject.NULL : obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void n(JSONObject jSONObject, String str, List list) {
        if (list == null) {
            jSONObject.put(str, JSONObject.NULL);
        } else {
            jSONObject.put(str, k(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void o(JSONObject jSONObject, String str, afre afreVar) {
        jSONObject.put(str, afreVar == null ? JSONObject.NULL : afreVar.h().l());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final List p(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.isNull(i)) {
                arrayList.add(null);
            } else {
                try {
                    arrayList.add(wbs.ai(jSONArray.getString(i)));
                } catch (MalformedURLException e) {
                    zga.d("Malformed URL", e);
                    throw new JSONException("Malformed URL Exception");
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void q(JSONObject jSONObject, String str, List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri == null) {
                jSONArray.put(JSONObject.NULL);
            } else {
                jSONArray.put(uri.toString());
            }
        }
        jSONObject.put(str, jSONArray);
    }

    protected abstract int a();

    protected abstract Object b(JSONObject jSONObject, int i);

    protected abstract void d(JSONObject jSONObject);

    public final Object f(JSONObject jSONObject) {
        return b(jSONObject, Integer.valueOf(jSONObject.getInt("__version__")).intValue());
    }

    public final Object g(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return f(jSONObject.getJSONObject(str));
    }

    public final List i(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.isNull(i) ? null : f(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    public final List j(JSONObject jSONObject, String str) {
        return i(jSONObject.getJSONArray(str));
    }

    public final JSONObject l() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__version__", a());
            d(jSONObject);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
