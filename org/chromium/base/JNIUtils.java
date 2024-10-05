package org.chromium.base;

import android.content.Context;
import android.text.TextUtils;
import defpackage.ayeq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class JNIUtils {
    private static Boolean a;

    public static ClassLoader getSplitClassLoader(String str) {
        Context context = ayeq.a;
        if (TextUtils.isEmpty(str) || !BundleUtils.c(context, str)) {
            return JNIUtils.class.getClassLoader();
        }
        return BundleUtils.a(context, str).getClassLoader();
    }

    public static boolean isSelectiveJniRegistrationEnabled() {
        if (a == null) {
            a = false;
        }
        return a.booleanValue();
    }
}
