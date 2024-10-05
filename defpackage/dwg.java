package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dwg {
    public static final Object a;
    public static dwc b;

    static {
        new HashMap();
        a = new Object();
        b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a() {
        return System.currentTimeMillis();
    }

    public static long b(Context context) {
        return context.getSharedPreferences("google_conversion", 0).getLong("last_retry_time", 0L);
    }

    static String c(long j) {
        return String.format(Locale.US, "%d.%03d", Long.valueOf(j / 1000), Long.valueOf(j % 1000));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102 A[Catch: dwi | dwj | IOException | IllegalStateException -> 0x01f9, dwi | dwj | IOException | IllegalStateException -> 0x01f9, dwi | dwj | IOException | IllegalStateException -> 0x01f9, dwi | dwj | IOException | IllegalStateException -> 0x01f9, TRY_ENTER, TRY_LEAVE, TryCatch #14 {dwi | dwj | IOException | IllegalStateException -> 0x01f9, blocks: (B:3:0x000e, B:10:0x001a, B:10:0x001a, B:10:0x001a, B:10:0x001a, B:12:0x001f, B:12:0x001f, B:12:0x001f, B:24:0x00e0, B:24:0x00e0, B:24:0x00e0, B:26:0x00f6, B:26:0x00f6, B:26:0x00f6, B:27:0x00fb, B:27:0x00fb, B:27:0x00fb, B:28:0x00fc, B:28:0x00fc, B:28:0x00fc, B:29:0x0101, B:29:0x0101, B:29:0x0101, B:30:0x00d2, B:30:0x00d2, B:30:0x00d2, B:31:0x00d7, B:31:0x00d7, B:31:0x00d7, B:32:0x00dc, B:32:0x00dc, B:32:0x00dc, B:33:0x0102, B:33:0x0102, B:33:0x0102, B:33:0x0102, B:159:0x003c, B:159:0x003c, B:159:0x003c, B:160:0x0050, B:160:0x0050, B:160:0x0050, B:163:0x0054, B:163:0x0054, B:163:0x0054, B:168:0x0061, B:168:0x0061, B:168:0x0061, B:170:0x0065, B:170:0x0065, B:170:0x0065, B:171:0x0069, B:171:0x0069, B:171:0x0069, B:174:0x0080, B:174:0x0080, B:174:0x0080, B:176:0x0074, B:176:0x0074, B:176:0x0074, B:179:0x0084, B:179:0x0084, B:179:0x0084, B:181:0x0088, B:181:0x0088, B:181:0x0088, B:184:0x00a0, B:184:0x00a0, B:184:0x00a0, B:185:0x00a4, B:185:0x00a4, B:185:0x00a4, B:191:0x00ad, B:191:0x00ad, B:191:0x00ad, B:196:0x00bd, B:196:0x00bd, B:196:0x00bd, B:207:0x004a, B:207:0x004a, B:207:0x004a), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(android.content.Context r16, defpackage.dwf r17) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwg.d(android.content.Context, dwf):java.lang.String");
    }

    public static void e(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putBoolean(str2, true);
        edit.commit();
    }

    public static void f(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("google_conversion", 0).edit();
        edit.putLong("last_retry_time", System.currentTimeMillis());
        edit.commit();
    }

    public static boolean g(Context context, String str, String str2, boolean z) {
        if (z || !context.getSharedPreferences(str, 0).getBoolean(str2, false)) {
            return true;
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            "Already sent ping for conversion ".concat(valueOf);
        }
        return false;
    }

    public static boolean h(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private static String i(dwh dwhVar) {
        if (dwhVar == null) {
            return null;
        }
        return true != dwhVar.b ? "0" : "1";
    }
}
