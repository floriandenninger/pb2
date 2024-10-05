package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.preference.PreferenceManager;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zgx {
    public static final zgx a = new zgx();
    public volatile Boolean b;
    public volatile Boolean c;
    public volatile zic d;
    private volatile Boolean e;
    private volatile Boolean f;
    private volatile String g;
    private volatile Integer h;

    private zgx() {
    }

    public static int a(Context context) {
        context.getClass();
        zgx zgxVar = a;
        if (zgxVar.h == null) {
            try {
                zgxVar.h = Integer.valueOf(b(context, 0).versionCode);
            } catch (PackageManager.NameNotFoundException e) {
                zga.n("could not retrieve application version code", e);
                a.h = 0;
            }
        }
        return a.h.intValue();
    }

    public static PackageInfo b(Context context, int i) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), i);
    }

    public static String c(Context context) {
        context.getClass();
        zgx zgxVar = a;
        String str = zgxVar.g;
        if (str == null) {
            synchronized (zgxVar) {
                str = zgxVar.g;
                if (str == null) {
                    try {
                        str = g(context, "pref_override_build_version_name");
                        if (TextUtils.isEmpty(str)) {
                            PackageInfo b = b(context, 0);
                            str = b.versionName != null ? b.versionName : "Unset";
                        }
                        String g = g(context, "pref_override_build_type");
                        if (!TextUtils.isEmpty(g)) {
                            if (str.lastIndexOf("-") > 0) {
                                str = str.substring(0, str.lastIndexOf(45) - 1);
                            }
                            if (!"RELEASE".equals(g)) {
                                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(g).length());
                                sb.append(str);
                                sb.append("-");
                                sb.append(g);
                                str = sb.toString();
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = "Unknown";
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        zga.n("could not retrieve application version name", e);
                        str = "Unknown";
                    }
                    a.g = str;
                }
            }
        }
        return str;
    }

    public static boolean e(Context context) {
        context.getClass();
        zgx zgxVar = a;
        if (zgxVar.e == null) {
            zgxVar.e = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"));
        }
        return zgxVar.e.booleanValue();
    }

    public static boolean f(Context context) {
        context.getClass();
        zgx zgxVar = a;
        if (zgxVar.f == null) {
            zgxVar.f = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return zgxVar.f.booleanValue();
    }

    private static String g(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences != null) {
            return defaultSharedPreferences.getString(str, "");
        }
        return null;
    }
}
