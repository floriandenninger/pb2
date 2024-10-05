package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahku {
    public static final float[] a = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] b = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};
    public static final float[] c = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    public final ahkx d;
    public final ahkx e;
    public final int f;
    public final int g;

    public ahku(float[] fArr, float[] fArr2, int i) {
        fArr.getClass();
        fArr2.getClass();
        int length = fArr.length;
        amkq.E(length % 3 == 0);
        int length2 = fArr2.length;
        amkq.E(1 == ((length2 & 1) ^ 1));
        int i2 = length / 3;
        amkq.E(i2 == (length2 >> 1));
        this.f = i2;
        this.g = i;
        this.d = new ahkx(fArr, 3);
        this.e = new ahkx(fArr2, 2);
    }

    public static ahku a(float f, float f2, float[] fArr) {
        int max;
        int i;
        if (f > f2) {
            i = (int) Math.max(1.0f, (10.0f / f) * f2);
            max = 10;
        } else {
            max = (int) Math.max(1.0f, (10.0f / f2) * f);
            i = 10;
        }
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        float f5 = -f3;
        float f6 = -f4;
        return new ahku(d(new float[]{f5, f6, 0.0f, f5, f4, 0.0f, f3, f6, 0.0f, f3, f4, 0.0f}, 3, max, i), d(fArr, 2, max, i), 5);
    }

    public static ahku c(float f) {
        float[] fArr = new float[66];
        for (int i = 1; i < 21; i++) {
            float f2 = i / 20.0f;
            int i2 = i * 3;
            int i3 = i2 + 1;
            double d = f;
            double d2 = (f2 + f2) * 3.1415927f;
            double sin = Math.sin(d2);
            Double.isNaN(d);
            fArr[i2] = (float) (sin * d);
            double cos = Math.cos(d2);
            Double.isNaN(d);
            fArr[i3] = (float) (d * cos);
            fArr[i3 + 1] = 0.0f;
        }
        System.arraycopy(fArr, 3, fArr, 63, 3);
        return new ahku(fArr, new float[44], 6);
    }

    private static float[] d(float[] fArr, int i, int i2, int i3) {
        float[] fArr2 = new float[(i3 + i3) * (i2 + 1) * i];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            for (int i6 = 0; i6 <= i2; i6++) {
                for (int i7 = 0; i7 < 2; i7++) {
                    float f = i6 / i2;
                    float f2 = (i5 + i7) / i3;
                    if (i5 % 2 == 1) {
                        f = 1.0f - f;
                    }
                    for (int i8 = 0; i8 < i; i8++) {
                        float f3 = 1.0f - f;
                        float f4 = 1.0f - f2;
                        fArr2[i4] = (fArr[i8] * f3 * f4) + (fArr[i + i8] * f3 * f2) + (fArr[i + i + i8] * f * f4) + (fArr[(i * 3) + i8] * f * f2);
                        i4++;
                    }
                }
            }
        }
        return fArr2;
    }

    public final void b() {
        this.d.b();
        this.e.b();
    }
}
