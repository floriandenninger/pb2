package defpackage;

import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zh implements Interpolator {
    private final /* synthetic */ int a;

    public zh(int i) {
        this.a = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = this.a;
        if (i == 0) {
            return f * f * f * f * f;
        }
        if (i == 1) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
        if (i == 2) {
            float f3 = f - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
        if (i == 3) {
            float f4 = f - 1.0f;
            return (f4 * f4 * f4 * f4 * f4) + 1.0f;
        }
        if (i != 4) {
            float f5 = f - 1.0f;
            return i != 5 ? (f5 * f5 * f5 * f5 * f5) + 1.0f : (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
        float f6 = f - 1.0f;
        return (f6 * f6 * f6 * f6 * f6) + 1.0f;
    }
}
