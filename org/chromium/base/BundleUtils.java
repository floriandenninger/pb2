package org.chromium.base;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import dalvik.system.BaseDexClassLoader;
import defpackage.aeg;
import defpackage.ayeq;
import defpackage.baec;
import defpackage.baeh;
import java.lang.reflect.Field;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class BundleUtils {
    private static final Object a = new Object();
    private static final aeg b = new aeg();

    /* JADX WARN: Code restructure failed: missing block: B:56:0x001b, code lost:
    
        r0 = org.chromium.base.BundleUtils.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x001d, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x001e, code lost:
    
        r4 = defpackage.ayeq.v(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0022, code lost:
    
        monitor-exit(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Context a(android.content.Context r4, java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.BundleUtils.a(android.content.Context, java.lang.String):android.content.Context");
    }

    public static void b(Context context, ClassLoader classLoader) {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        try {
            Field declaredField = context.getClass().getDeclaredField("mClassLoader");
            declaredField.setAccessible(true);
            declaredField.set(context, classLoader);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Error setting ClassLoader.", e);
        }
    }

    public static boolean c(Context context, String str) {
        String[] strArr;
        return Build.VERSION.SDK_INT >= 26 && (strArr = context.getApplicationInfo().splitNames) != null && Arrays.asList(strArr).contains(str);
    }

    private static String d(String str, String str2) {
        ApplicationInfo applicationInfo;
        String[] strArr;
        int binarySearch;
        if (Build.VERSION.SDK_INT < 26 || (strArr = (applicationInfo = ayeq.a.getApplicationInfo()).splitNames) == null || (binarySearch = Arrays.binarySearch(strArr, str2)) < 0) {
            return null;
        }
        try {
            return applicationInfo.splitSourceDirs[binarySearch] + "!/lib/" + ((String) applicationInfo.getClass().getField("primaryCpuAbi").get(applicationInfo)) + "/" + System.mapLibraryName(str);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getNativeLibraryPath(String str, String str2) {
        baec a2 = baec.a();
        try {
            String findLibrary = ((BaseDexClassLoader) BundleUtils.class.getClassLoader()).findLibrary(str);
            if (findLibrary == null) {
                ClassLoader classLoader = ayeq.a.getClassLoader();
                if (classLoader instanceof BaseDexClassLoader) {
                    findLibrary = ((BaseDexClassLoader) classLoader).findLibrary(str);
                } else if (classLoader instanceof baeh) {
                    throw null;
                }
                if (findLibrary != null) {
                    return findLibrary;
                }
                String d = d(str, str2);
                a2.close();
                return d;
            }
            a2.close();
            return findLibrary;
        } finally {
            try {
                a2.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean isBundleForNative() {
        return false;
    }
}
