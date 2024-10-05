package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qhg {
    public static final String a;
    private static qhg h;
    public final qgz b;
    public final SharedPreferences c;
    public final String d;
    public final Set e;
    public final Set f;
    public long g;
    private final Runnable i;
    private final Handler j;

    static {
        new qkw("FeatureUsageAnalytics");
        a = "20.1.0";
    }

    private qhg(SharedPreferences sharedPreferences, qgz qgzVar, String str) {
        this.c = sharedPreferences;
        this.b = qgzVar;
        this.d = str;
        HashSet hashSet = new HashSet();
        this.e = hashSet;
        HashSet hashSet2 = new HashSet();
        this.f = hashSet2;
        this.j = new amcc(Looper.getMainLooper(), (byte[]) null);
        this.i = new Runnable() { // from class: qhf
            @Override // java.lang.Runnable
            public final void run() {
                qhg qhgVar = qhg.this;
                if (qhgVar.e.isEmpty()) {
                    return;
                }
                long j = true != qhgVar.f.equals(qhgVar.e) ? 86400000L : 172800000L;
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = qhgVar.g;
                if (j2 == 0 || currentTimeMillis - j2 >= j) {
                    aone createBuilder = andi.a.createBuilder();
                    String str2 = qhg.a;
                    createBuilder.copyOnWrite();
                    andi andiVar = (andi) createBuilder.instance;
                    str2.getClass();
                    andiVar.b |= 2;
                    andiVar.d = str2;
                    String str3 = qhgVar.d;
                    createBuilder.copyOnWrite();
                    andi andiVar2 = (andi) createBuilder.instance;
                    str3.getClass();
                    andiVar2.b |= 1;
                    andiVar2.c = str3;
                    andi andiVar3 = (andi) createBuilder.build();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(qhgVar.e);
                    aone createBuilder2 = andh.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    andh andhVar = (andh) createBuilder2.instance;
                    aonu aonuVar = andhVar.d;
                    if (!aonuVar.c()) {
                        andhVar.d = aonm.mutableCopy(aonuVar);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        andhVar.d.g(((andg) it.next()).X);
                    }
                    createBuilder2.copyOnWrite();
                    andh andhVar2 = (andh) createBuilder2.instance;
                    andiVar3.getClass();
                    andhVar2.c = andiVar3;
                    andhVar2.b |= 1;
                    andh andhVar3 = (andh) createBuilder2.build();
                    andk b = andl.b();
                    b.copyOnWrite();
                    ((andl) b.instance).o(andhVar3);
                    qhgVar.b.a((andl) b.build(), 243);
                    SharedPreferences.Editor edit = qhgVar.c.edit();
                    if (!qhgVar.f.equals(qhgVar.e)) {
                        qhgVar.f.clear();
                        qhgVar.f.addAll(qhgVar.e);
                        Iterator it2 = qhgVar.f.iterator();
                        while (it2.hasNext()) {
                            String a2 = qhgVar.a((andg) it2.next());
                            String c = qhgVar.c(a2);
                            String b2 = qhg.b("feature_usage_timestamp_reported_feature_", a2);
                            if (!TextUtils.equals(c, b2)) {
                                long j3 = qhgVar.c.getLong(c, 0L);
                                edit.remove(c);
                                if (j3 != 0) {
                                    edit.putLong(b2, j3);
                                }
                            }
                        }
                    }
                    qhgVar.g = currentTimeMillis;
                    edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
                }
            }
        };
        String string = sharedPreferences.getString("feature_usage_sdk_version", null);
        String string2 = sharedPreferences.getString("feature_usage_package_name", null);
        hashSet.clear();
        hashSet2.clear();
        this.g = 0L;
        if (!a.equals(string) || !str.equals(string2)) {
            HashSet hashSet3 = new HashSet();
            for (String str2 : sharedPreferences.getAll().keySet()) {
                if (str2.startsWith("feature_usage_timestamp_")) {
                    hashSet3.add(str2);
                }
            }
            hashSet3.add("feature_usage_last_report_time");
            g(hashSet3);
            this.c.edit().putString("feature_usage_sdk_version", a).putString("feature_usage_package_name", this.d).apply();
            return;
        }
        this.g = sharedPreferences.getLong("feature_usage_last_report_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet4 = new HashSet();
        for (String str3 : sharedPreferences.getAll().keySet()) {
            if (str3.startsWith("feature_usage_timestamp_")) {
                long j = this.c.getLong(str3, 0L);
                if (j == 0 || currentTimeMillis - j <= 1209600000) {
                    if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                        andg f = f(str3.substring(41));
                        this.f.add(f);
                        this.e.add(f);
                    } else if (str3.startsWith("feature_usage_timestamp_detected_feature_")) {
                        this.e.add(f(str3.substring(41)));
                    }
                } else {
                    hashSet4.add(str3);
                }
            }
        }
        g(hashSet4);
        qip.an(this.i);
        h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str, String str2) {
        return String.format("%s%s", str, str2);
    }

    public static void d(andg andgVar) {
        qhg qhgVar = h;
        if (qhgVar == null) {
            return;
        }
        qhgVar.c.edit().putLong(qhgVar.c(qhgVar.a(andgVar)), System.currentTimeMillis()).apply();
        qhgVar.e.add(andgVar);
        qhgVar.h();
    }

    public static synchronized void e(SharedPreferences sharedPreferences, qgz qgzVar, String str) {
        synchronized (qhg.class) {
            if (h == null) {
                h = new qhg(sharedPreferences, qgzVar, str);
            }
        }
    }

    private static andg f(String str) {
        try {
            return andg.a(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return andg.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        }
    }

    private final void g(Set set) {
        if (set.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.c.edit();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }

    private final void h() {
        this.j.post(this.i);
    }

    public final String a(andg andgVar) {
        return Integer.toString(andgVar.X);
    }

    public final String c(String str) {
        String b = b("feature_usage_timestamp_reported_feature_", str);
        return this.c.contains(b) ? b : b("feature_usage_timestamp_detected_feature_", str);
    }
}
