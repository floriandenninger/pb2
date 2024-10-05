package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qnm {
    static boolean a = false;
    public static final /* synthetic */ int c = 0;
    private static boolean d = false;
    static final AtomicBoolean b = new AtomicBoolean();
    private static final AtomicBoolean e = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnm.b(android.content.Context, int):int");
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static void d(Context context, int i) {
        int h = qmz.d.h(context, i);
        if (h != 0) {
            Intent i2 = qmz.d.i(context, h, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(h);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (i2 == null) {
                throw new qnk(h);
            }
            throw new qnl(h, "Google Play Services not available", i2);
        }
    }

    public static boolean e(Context context) {
        try {
            if (!a) {
                PackageInfo d2 = qtu.b(context).d("com.google.android.gms", 64);
                qnn.b(context);
                if (d2 == null || qnn.g(d2, false) || !qnn.g(d2, true)) {
                    d = false;
                } else {
                    d = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
        } finally {
            a = true;
        }
        return d || !"user".equals(Build.TYPE);
    }

    @Deprecated
    public static boolean f(Context context, int i) {
        if (i == 1) {
            return i(context);
        }
        return false;
    }

    @Deprecated
    public static boolean g(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    public static boolean h(Context context, int i, String str) {
        return oba.Y(context, i, str);
    }

    public static boolean i(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    @Deprecated
    public static String j() {
        return ConnectionResult.a(13);
    }
}
