package com.google.cardboard.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PackageUtils {
    private static final String GOOGLE_PACKAGE_PREFIX = "com.google.";

    private PackageUtils() {
    }

    public static boolean isGooglePackage(String str) {
        return str != null && str.startsWith(GOOGLE_PACKAGE_PREFIX);
    }

    public static boolean isSystemPackage(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            int i = applicationInfo != null ? applicationInfo.flags : 0;
            return ((i & 1) == 0 && (i & 128) == 0) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
