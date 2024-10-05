package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axfp {
    private static final Class a;
    private final Object b;

    static {
        Class<?> cls = null;
        if (axfq.a()) {
            try {
                cls = Class.forName("android.view.DisplayCutout");
            } catch (Exception unused) {
                Log.e("AndroidPCompat", "Failed to obtain DisplayCutout API.");
            }
        }
        a = cls;
    }

    private axfp(Object obj) {
        this.b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static axfp e(Object obj) {
        if (obj == null || a == null) {
            return null;
        }
        return new axfp(obj);
    }

    private final int f(String str) {
        try {
            return ((Integer) a.getDeclaredMethod(str, new Class[0]).invoke(this.b, new Object[0])).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final int a() {
        return f("getSafeInsetBottom");
    }

    public final int b() {
        return f("getSafeInsetLeft");
    }

    public final int c() {
        return f("getSafeInsetRight");
    }

    public final int d() {
        return f("getSafeInsetTop");
    }
}
