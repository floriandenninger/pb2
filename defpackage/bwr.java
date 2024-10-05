package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bwr {
    static final Property a;
    public static final lo b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            b = new bww();
        } else {
            b = Build.VERSION.SDK_INT >= 23 ? new bwv() : Build.VERSION.SDK_INT >= 22 ? new bwu() : new bwt();
        }
        a = new bwp(Float.class);
        new bwq(Rect.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float a(View view) {
        return b.lH(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, int i, int i2, int i3, int i4) {
        b.pb(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, float f) {
        b.f(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view, int i) {
        b.ow(view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bxb e(View view) {
        return new bxb(view);
    }
}
