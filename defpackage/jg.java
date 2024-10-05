package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(View view) {
        return view.getImportantForAccessibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(View view) {
        return view.getMinimumHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(View view) {
        return view.getMinimumWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view) {
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k(View view) {
        return view.getFitsSystemWindows();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean l(View view) {
        return view.hasOverlappingRendering();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean m(View view) {
        return view.hasTransientState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean n(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static Interpolator o(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    public static int p(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long q(pth pthVar, int i, int i2) {
        pthVar.G(i);
        if (pthVar.a() < 5) {
            return -9223372036854775807L;
        }
        int d = pthVar.d();
        if ((8388608 & d) != 0 || ((d >> 8) & 8191) != i2 || (d & 32) == 0 || pthVar.i() < 7 || pthVar.a() < 7 || (pthVar.i() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        pthVar.B(bArr, 0, 6);
        byte b = bArr[0];
        long j = bArr[3] & 255;
        return ((bArr[1] & 255) << 17) | ((b & 255) << 25) | ((bArr[2] & 255) << 9) | (j + j) | ((bArr[4] & 255) >> 7);
    }
}
