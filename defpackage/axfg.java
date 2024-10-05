package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axfg {
    public final float[] a;

    public axfg() {
        this.a = new float[]{0.0f, 0.0f, 0.0f, 1.0f};
    }

    public axfg(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = r0;
        float[] fArr = {f, f2, f3, f4, f5, f6, f7, f8, f9};
    }

    public axfg(byte[] bArr) {
        this.a = new float[9];
    }

    public static void e(axfg axfgVar, axfg axfgVar2, axfg axfgVar3) {
        float[] fArr = axfgVar.a;
        float f = fArr[0];
        float[] fArr2 = axfgVar2.a;
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[3];
        float f5 = fArr[2];
        float f6 = fArr2[6];
        float f7 = fArr2[1];
        float f8 = fArr2[4];
        float f9 = fArr2[7];
        float f10 = fArr2[2];
        float f11 = fArr2[5];
        float f12 = fArr2[8];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        axfgVar3.d((f * f2) + (f3 * f4) + (f5 * f6), (f * f7) + (f3 * f8) + (f5 * f9), (f * f10) + (f3 * f11) + (f5 * f12), (f13 * f2) + (f14 * f4) + (f15 * f6), (f13 * f7) + (f14 * f8) + (f15 * f9), (f13 * f10) + (f14 * f11) + (f15 * f12), (f2 * f16) + (f4 * f17) + (f6 * f18), (f7 * f16) + (f8 * f17) + (f9 * f18), (f16 * f10) + (f17 * f11) + (f18 * f12));
    }

    public final synchronized void a(float[] fArr) {
        System.arraycopy(this.a, 0, fArr, 0, 4);
    }

    public final synchronized void b(float[] fArr) {
        boolean z = false;
        double d = fArr[0];
        Double.isNaN(d);
        double d2 = d + 1.0d;
        double d3 = fArr[5];
        double d4 = fArr[10];
        Double.isNaN(d3);
        Double.isNaN(d4);
        float sqrt = ((float) Math.sqrt(Math.max(0.0d, d2 + d3 + d4))) * 0.5f;
        Double.isNaN(d3);
        Double.isNaN(d4);
        float sqrt2 = ((float) Math.sqrt(Math.max(0.0d, (d2 - d3) - d4))) * 0.5f;
        Double.isNaN(d);
        double d5 = 1.0d - d;
        Double.isNaN(d3);
        Double.isNaN(d4);
        float sqrt3 = ((float) Math.sqrt(Math.max(0.0d, (d5 + d3) - d4))) * 0.5f;
        Double.isNaN(d3);
        Double.isNaN(d4);
        float sqrt4 = ((float) Math.sqrt(Math.max(0.0d, (d5 - d3) + d4))) * 0.5f;
        float[] fArr2 = this.a;
        if ((fArr[6] - fArr[9] < 0.0f) != (sqrt2 < 0.0f)) {
            sqrt2 = -sqrt2;
        }
        fArr2[0] = sqrt2;
        if ((fArr[8] - fArr[2] < 0.0f) != (sqrt3 < 0.0f)) {
            sqrt3 = -sqrt3;
        }
        fArr2[1] = sqrt3;
        boolean z2 = fArr[1] - fArr[4] < 0.0f;
        if (sqrt4 < 0.0f) {
            z = true;
        }
        if (z2 != z) {
            sqrt4 = -sqrt4;
        }
        fArr2[2] = sqrt4;
        fArr2[3] = sqrt;
    }

    public final float c(int i, int i2) {
        return this.a[(i * 3) + i2];
    }

    public final void d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float[] fArr = this.a;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public final void f(axfg axfgVar) {
        float c = ((c(0, 0) * ((c(1, 1) * c(2, 2)) - (c(2, 1) * c(1, 2)))) - (c(0, 1) * ((c(1, 0) * c(2, 2)) - (c(1, 2) * c(2, 0))))) + (c(0, 2) * ((c(1, 0) * c(2, 1)) - (c(1, 1) * c(2, 0))));
        if (c == 0.0d) {
            return;
        }
        float f = 1.0f / c;
        float[] fArr = this.a;
        float f2 = fArr[4];
        float f3 = fArr[8];
        float f4 = fArr[7];
        float f5 = fArr[5];
        float f6 = fArr[1];
        float f7 = fArr[2];
        float f8 = fArr[3];
        float f9 = fArr[6];
        float f10 = fArr[0];
        axfgVar.d(((f2 * f3) - (f4 * f5)) * f, (-((f6 * f3) - (f7 * f4))) * f, ((f6 * f5) - (f7 * f2)) * f, (-((f8 * f3) - (f5 * f9))) * f, ((f3 * f10) - (f7 * f9)) * f, (-((f5 * f10) - (f7 * f8))) * f, ((f8 * f4) - (f9 * f2)) * f, (-((f4 * f10) - (f9 * f6))) * f, ((f10 * f2) - (f8 * f6)) * f);
    }
}
