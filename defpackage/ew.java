package defpackage;

import android.graphics.Color;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ew {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ew(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ew b(int i) {
        fl flVar = fl.a;
        float a = ex.a(Color.red(i));
        float a2 = ex.a(Color.green(i));
        float a3 = ex.a(Color.blue(i));
        float[][] fArr = ex.d;
        float[] fArr2 = fArr[0];
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        float[] fArr3 = fArr[1];
        float f4 = fArr3[0];
        float f5 = fArr3[1];
        float f6 = fArr3[2];
        float[] fArr4 = fArr[2];
        float[] fArr5 = {(f * a) + (f2 * a2) + (f3 * a3), (f4 * a) + (f5 * a2) + (f6 * a3), (a * fArr4[0]) + (a2 * fArr4[1]) + (a3 * fArr4[2])};
        float[][] fArr6 = ex.a;
        float f7 = fArr5[0];
        float[] fArr7 = fArr6[0];
        float f8 = fArr7[0];
        float f9 = fArr5[1];
        float f10 = fArr7[1];
        float f11 = fArr5[2];
        float f12 = (f8 * f7) + (f10 * f9) + (fArr7[2] * f11);
        float[] fArr8 = fArr6[1];
        float f13 = (fArr8[0] * f7) + (fArr8[1] * f9);
        float f14 = fArr8[2];
        float[] fArr9 = fArr6[2];
        float f15 = fArr9[0];
        float f16 = fArr9[1];
        float f17 = fArr9[2];
        float[] fArr10 = flVar.g;
        float f18 = fArr10[0] * f12;
        float f19 = fArr10[1] * (f13 + (f14 * f11));
        float f20 = fArr10[2] * ((f7 * f15) + (f9 * f16) + (f11 * f17));
        double abs = flVar.h * Math.abs(f18);
        Double.isNaN(abs);
        float pow = (float) Math.pow(abs / 100.0d, 0.42d);
        double abs2 = flVar.h * Math.abs(f19);
        Double.isNaN(abs2);
        float pow2 = (float) Math.pow(abs2 / 100.0d, 0.42d);
        double abs3 = flVar.h * Math.abs(f20);
        Double.isNaN(abs3);
        float pow3 = (float) Math.pow(abs3 / 100.0d, 0.42d);
        float signum = ((Math.signum(f18) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f19) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f20) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        double d2 = signum;
        Double.isNaN(d2);
        double d3 = signum2;
        Double.isNaN(d3);
        Double.isNaN(d);
        float f21 = ((float) (((d2 * 11.0d) + (d3 * (-12.0d))) + d)) / 11.0f;
        double d4 = signum + signum2;
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d4);
        float f22 = ((float) (d4 - (d + d))) / 9.0f;
        float f23 = signum2 * 20.0f;
        float f24 = (((signum * 20.0f) + f23) + (21.0f * signum3)) / 20.0f;
        float f25 = (((signum * 40.0f) + f23) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f26 = atan2;
        float f27 = (3.1415927f * f26) / 180.0f;
        float f28 = flVar.c;
        float f29 = flVar.b;
        float f30 = flVar.e;
        float pow4 = ((float) Math.pow((f25 * f28) / f29, flVar.j * 0.69f)) * 100.0f;
        float f31 = flVar.e;
        Math.sqrt(pow4 / 100.0f);
        float f32 = flVar.b;
        float f33 = flVar.i;
        Double.isNaN(((double) f26) < 20.14d ? 360.0f + f26 : f26);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, flVar.f), 0.73d)) * ((float) Math.pow(((((((float) (Math.cos(((r1 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * flVar.d) * ((float) Math.sqrt((f21 * f21) + (f22 * f22)))) / (f24 + 0.305f), 0.9d));
        double d5 = pow4;
        Double.isNaN(d5);
        float sqrt = pow5 * ((float) Math.sqrt(d5 / 100.0d));
        float f34 = flVar.i;
        float f35 = flVar.e;
        Math.sqrt((pow5 * 0.69f) / (flVar.b + 4.0f));
        float log = ((float) Math.log((f34 * sqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d6 = f27;
        return new ew(f26, sqrt, pow4, (1.7f * pow4) / ((0.007f * pow4) + 1.0f), log * ((float) Math.cos(d6)), log * ((float) Math.sin(d6)));
    }

    public static ew c(float f, float f2, float f3) {
        fl flVar = fl.a;
        float f4 = flVar.e;
        double d = f;
        Double.isNaN(d);
        double d2 = d / 100.0d;
        Math.sqrt(d2);
        float f5 = flVar.b;
        float f6 = flVar.i;
        double sqrt = Math.sqrt(d2);
        float f7 = flVar.e;
        Math.sqrt(((f2 / ((float) sqrt)) * 0.69f) / (flVar.b + 4.0f));
        double d3 = f6 * f2;
        Double.isNaN(d3);
        float log = ((float) Math.log((d3 * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (3.1415927f * f3) / 180.0f;
        return new ew(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), log * ((float) Math.cos(d4)), log * ((float) Math.sin(d4)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(fl flVar) {
        float f = this.b;
        float f2 = 0.0f;
        if (f != 0.0d) {
            double d = this.c;
            if (d != 0.0d) {
                Double.isNaN(d);
                f2 = f / ((float) Math.sqrt(d / 100.0d));
            }
        }
        double d2 = f2;
        double pow = Math.pow(1.64d - Math.pow(0.29d, flVar.f), 0.73d);
        Double.isNaN(d2);
        float pow2 = (float) Math.pow(d2 / pow, 1.1111111111111112d);
        double d3 = (this.a * 3.1415927f) / 180.0f;
        Double.isNaN(d3);
        double cos = Math.cos(2.0d + d3);
        float f3 = flVar.b;
        float f4 = this.c;
        float f5 = flVar.e;
        float f6 = flVar.j;
        double d4 = f4;
        Double.isNaN(d4);
        double d5 = f6;
        Double.isNaN(d5);
        double pow3 = Math.pow(d4 / 100.0d, 1.4492753673265821d / d5);
        float f7 = flVar.d;
        float f8 = (f3 * ((float) pow3)) / flVar.c;
        float sin = (float) Math.sin(d3);
        float cos2 = (float) Math.cos(d3);
        float f9 = (((0.305f + f8) * 23.0f) * pow2) / ((((((((float) (cos + 3.8d)) * 0.25f) * 3846.1538f) * f7) * 23.0f) + ((11.0f * pow2) * cos2)) + ((pow2 * 108.0f) * sin));
        float f10 = cos2 * f9;
        float f11 = f9 * sin;
        float f12 = f8 * 460.0f;
        float f13 = (((451.0f * f10) + f12) + (288.0f * f11)) / 1403.0f;
        float f14 = ((f12 - (891.0f * f10)) - (261.0f * f11)) / 1403.0f;
        float f15 = ((f12 - (f10 * 220.0f)) - (f11 * 6300.0f)) / 1403.0f;
        float abs = Math.abs(f13);
        float abs2 = Math.abs(f13);
        Double.isNaN(abs);
        Double.isNaN(abs2);
        float signum = Math.signum(f13) * (100.0f / flVar.h) * ((float) Math.pow((float) Math.max(0.0d, (r10 * 27.13d) / (400.0d - r3)), 2.380952380952381d));
        float abs3 = Math.abs(f14);
        float abs4 = Math.abs(f14);
        Double.isNaN(abs3);
        Double.isNaN(abs4);
        float signum2 = Math.signum(f14) * (100.0f / flVar.h) * ((float) Math.pow((float) Math.max(0.0d, (r10 * 27.13d) / (400.0d - r3)), 2.380952380952381d));
        float abs5 = Math.abs(f15);
        float abs6 = Math.abs(f15);
        double d6 = abs5;
        Double.isNaN(d6);
        double d7 = abs6;
        Double.isNaN(d7);
        double max = Math.max(0.0d, (d6 * 27.13d) / (400.0d - d7));
        float signum3 = Math.signum(f15);
        float f16 = flVar.h;
        double pow4 = Math.pow((float) max, 2.380952380952381d);
        float[] fArr = flVar.g;
        float f17 = signum / fArr[0];
        float f18 = signum2 / fArr[1];
        float f19 = ((signum3 * (100.0f / f16)) * ((float) pow4)) / fArr[2];
        float[][] fArr2 = ex.b;
        float[] fArr3 = fArr2[0];
        float f20 = fArr3[0];
        float f21 = fArr3[1];
        float f22 = fArr3[2];
        float[] fArr4 = fArr2[1];
        float f23 = fArr4[0];
        float f24 = fArr4[1];
        float f25 = fArr4[2];
        float[] fArr5 = fArr2[2];
        return fm.c((f20 * f17) + (f21 * f18) + (f22 * f19), (f23 * f17) + (f24 * f18) + (f25 * f19), (f17 * fArr5[0]) + (f18 * fArr5[1]) + (f19 * fArr5[2]));
    }
}
