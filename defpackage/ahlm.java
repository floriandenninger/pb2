package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahlm extends ahln {
    private final float[] a;
    private final float[] b;
    private final float[] c;

    public ahlm(float[] fArr, float[] fArr2) {
        int length;
        if (fArr == null || fArr2 == null || (length = fArr.length) != fArr2.length || length < 2) {
            throw new IllegalArgumentException("There must be at least two control points and the arrays must be of equal length.");
        }
        int i = length - 1;
        float[] fArr3 = new float[i];
        float[] fArr4 = new float[length];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            float f = fArr[i3] - fArr[i2];
            if (f > 0.0f) {
                fArr3[i2] = (fArr2[i3] - fArr2[i2]) / f;
                i2 = i3;
            } else {
                throw new IllegalArgumentException("The control points must all have strictly increasing X values.");
            }
        }
        fArr4[0] = fArr3[0];
        for (int i4 = 1; i4 < i; i4++) {
            fArr4[i4] = (fArr3[i4 - 1] + fArr3[i4]) * 0.5f;
        }
        fArr4[i] = fArr3[length - 2];
        for (int i5 = 0; i5 < i; i5++) {
            float f2 = fArr3[i5];
            if (f2 == 0.0f) {
                fArr4[i5] = 0.0f;
                fArr4[i5 + 1] = 0.0f;
            } else {
                float f3 = fArr4[i5] / f2;
                int i6 = i5 + 1;
                float f4 = fArr4[i6] / f2;
                if (f3 >= 0.0f && f4 >= 0.0f) {
                    float hypot = (float) Math.hypot(f3, f4);
                    if (hypot > 3.0f) {
                        float f5 = 3.0f / hypot;
                        fArr4[i5] = fArr4[i5] * f5;
                        fArr4[i6] = fArr4[i6] * f5;
                    }
                } else {
                    throw new IllegalArgumentException("The control points must have monotonic Y values.");
                }
            }
        }
        this.a = fArr;
        this.b = fArr2;
        this.c = fArr4;
    }

    @Override // defpackage.ahln
    public final float a(float f) {
        int length = this.a.length;
        if (Float.isNaN(f)) {
            return f;
        }
        float[] fArr = this.a;
        int i = 0;
        if (f <= fArr[0]) {
            return this.b[0];
        }
        int i2 = length - 1;
        if (f >= fArr[i2]) {
            return this.b[i2];
        }
        while (true) {
            float[] fArr2 = this.a;
            int i3 = i + 1;
            float f2 = fArr2[i3];
            if (f < f2) {
                float f3 = fArr2[i];
                float f4 = f2 - f3;
                float f5 = (f - f3) / f4;
                float[] fArr3 = this.b;
                float f6 = fArr3[i];
                float f7 = f5 + f5;
                float[] fArr4 = this.c;
                float f8 = 1.0f - f5;
                return (((f6 * (1.0f + f7)) + (fArr4[i] * f4 * f5)) * f8 * f8) + (((fArr3[i3] * (3.0f - f7)) + (f4 * fArr4[i3] * ((-1.0f) + f5))) * f5 * f5);
            }
            if (f == f2) {
                return this.b[i3];
            }
            i = i3;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.a.length;
        sb.append("MonotoneCubicSpline{[");
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(this.a[i]);
            sb.append(", ");
            sb.append(this.b[i]);
            sb.append(": ");
            sb.append(this.c[i]);
            sb.append(")");
        }
        sb.append("]}");
        return sb.toString();
    }
}
