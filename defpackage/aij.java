package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aij {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(Context context, int i) {
        return context.getColor(i);
    }

    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Deprecated
    public static boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Deprecated
    public static boolean d() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Deprecated
    public static boolean e() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean f() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        String str = Build.VERSION.CODENAME;
        return !"REL".equals(str) && str.compareTo("S") >= 0;
    }
}
