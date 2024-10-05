package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aicf {
    public final MotionEvent a;
    public final int b;
    public final boolean c;

    public aicf(MotionEvent motionEvent, int i, boolean z) {
        this.a = motionEvent;
        this.b = i;
        this.c = z;
    }

    public static int a(MotionEvent motionEvent, int i, boolean z) {
        return b((int) motionEvent.getX(), i, z);
    }

    public static int b(int i, int i2, boolean z) {
        float f = i2 / 2;
        float f2 = (i2 * (true != z ? 0.33333334f : 0.0f)) / 2.0f;
        float f3 = i;
        if (f3 < f - f2) {
            return 2;
        }
        return f3 > f + f2 ? 1 : 0;
    }
}
