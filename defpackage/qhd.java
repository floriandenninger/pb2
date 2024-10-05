package defpackage;

import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qhd {
    public static long a;
    public String b;
    public String c;
    public long d = a;
    public int e = 1;
    public String f;
    public int g;
    public String h;
    public int i;

    static {
        new qkw("ApplicationAnalyticsSession");
        a = System.currentTimeMillis();
    }

    private qhd() {
    }

    public static qhd a() {
        qhd qhdVar = new qhd();
        a++;
        return qhdVar;
    }

    public static qhd b(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return null;
        }
        qhd qhdVar = new qhd();
        if (!sharedPreferences.contains("application_id")) {
            return null;
        }
        qhdVar.b = sharedPreferences.getString("application_id", "");
        if (!sharedPreferences.contains("receiver_metrics_id")) {
            return null;
        }
        qhdVar.c = sharedPreferences.getString("receiver_metrics_id", "");
        if (!sharedPreferences.contains("analytics_session_id")) {
            return null;
        }
        qhdVar.d = sharedPreferences.getLong("analytics_session_id", 0L);
        if (!sharedPreferences.contains("event_sequence_number")) {
            return null;
        }
        qhdVar.e = sharedPreferences.getInt("event_sequence_number", 0);
        if (!sharedPreferences.contains("receiver_session_id")) {
            return null;
        }
        qhdVar.f = sharedPreferences.getString("receiver_session_id", "");
        qhdVar.g = sharedPreferences.getInt("device_capabilities", 0);
        qhdVar.h = sharedPreferences.getString("device_model_name", "");
        qhdVar.i = sharedPreferences.getInt("analytics_session_start_type", 0);
        return qhdVar;
    }
}
