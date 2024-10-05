package defpackage;

import android.animation.ArgbEvaluator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xko {
    private static final ArgbEvaluator a = new ArgbEvaluator();

    public static int a(float f, int i, int i2) {
        return b(f, 0.0f) ? i : b(f, 1.0f) ? i2 : ((Integer) a.evaluate(f, Integer.valueOf(i), Integer.valueOf(i2))).intValue();
    }

    private static boolean b(float f, float f2) {
        return Math.abs(f - f2) < 0.01f;
    }
}
