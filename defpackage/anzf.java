package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anzf {
    public static final long a = TimeUnit.DAYS.toMillis(7);
    public final String b;
    public final String c;
    public final long d;

    private anzf(String str, String str2, long j) {
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static anzf a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new anzf(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(valueOf);
                Log.w("FirebaseMessaging", sb.toString());
                return null;
            }
        }
        return new anzf(str, null, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
    }
}
