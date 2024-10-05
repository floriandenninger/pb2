package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alvw {
    static {
        Uri.parse("https://play.google.com/store/apps/details");
    }

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", e);
        }
    }

    public static String b(int i) {
        int i2 = i >= 11000 ? 10000 : 1000;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i / i2);
        sb.append(".");
        sb.append((i % i2) / 100);
        sb.append(".");
        sb.append(i % 100);
        return sb.toString();
    }

    public static boolean c(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.software.leanback");
    }

    public static boolean d(PackageManager packageManager) {
        return packageManager.hasSystemFeature("com.google.android.tv");
    }
}
