package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aih {
    public static File[] a(Context context) {
        return context.getExternalCacheDirs();
    }

    static File[] b(Context context, String str) {
        return context.getExternalFilesDirs(null);
    }

    public static int c(Context context, String str) {
        gm.q(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static int d(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? aij.a(context, i) : context.getResources().getColor(i);
    }

    public static Context e(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return aik.a(context);
        }
        return null;
    }

    public static ColorStateList f(Context context, int i) {
        return fk.b(context.getResources(), i, context.getTheme());
    }

    public static File g(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return aik.b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static Executor h(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? aim.a(context) : new abq(new Handler(context.getMainLooper()), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void i(Activity activity, String[] strArr, int i) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof aho) {
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof ahn) {
            new Handler(Looper.getMainLooper()).post(new ahl(strArr, activity, i));
        }
    }

    public static boolean j(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static File[] k(Context context) {
        return b(context, null);
    }
}
