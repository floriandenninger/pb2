package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fl {
    static final fl a;
    public final float b;
    public final float c;
    public final float d;
    public final float e = 0.69f;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    static {
        float[] fArr = ex.c;
        double c = ex.c();
        Double.isNaN(c);
        float f = (float) ((c * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = ex.a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0];
        float f4 = fArr[1];
        float f5 = fArr3[1];
        float f6 = fArr[2];
        float f7 = (f3 * f2) + (f5 * f4) + (fArr3[2] * f6);
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[0] * f2) + (fArr4[1] * f4) + (fArr4[2] * f6);
        float[] fArr5 = fArr2[2];
        float f9 = (f2 * fArr5[0]) + (f4 * fArr5[1]) + (f6 * fArr5[2]);
        float exp = 1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f);
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp};
        float f10 = 1.0f / ((5.0f * f) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        double d2 = f;
        Double.isNaN(d2);
        float cbrt = (f11 * f) + (0.1f * f12 * f12 * ((float) Math.cbrt(d2 * 5.0d)));
        float c2 = ex.c() / fArr[1];
        double d3 = c2;
        double sqrt = Math.sqrt(d3);
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        double d4 = fArr6[0] * cbrt * f7;
        Double.isNaN(d4);
        double d5 = fArr6[1] * cbrt * f8;
        Double.isNaN(d5);
        double d6 = fArr6[2] * cbrt * f9;
        Double.isNaN(d6);
        float pow2 = (float) Math.pow(d6 / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(d4 / 100.0d, 0.42d), (float) Math.pow(d5 / 100.0d, 0.42d), pow2};
        float f13 = fArr7[0];
        float f14 = fArr7[1];
        float f15 = (400.0f * pow2) / (pow2 + 27.13f);
        float[] fArr8 = {(f13 * 400.0f) / (f13 + 27.13f), (f14 * 400.0f) / (f14 + 27.13f), f15};
        float f16 = fArr8[0];
        a = new fl(c2, (f16 + f16 + fArr8[1] + (f15 * 0.05f)) * pow, pow, pow, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), ((float) sqrt) + 1.48f);
    }

    private fl(float f, float f2, float f3, float f4, float[] fArr, float f5, float f6, float f7) {
        this.f = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.g = fArr;
        this.h = f5;
        this.i = f6;
        this.j = f7;
    }
}
