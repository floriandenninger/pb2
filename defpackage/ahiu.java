package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahiu implements Runnable {
    final /* synthetic */ float[] a;
    final /* synthetic */ long b;
    final /* synthetic */ ahiw c;

    public ahiu(ahiw ahiwVar, float[] fArr, long j) {
        this.c = ahiwVar;
        this.a = fArr;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float sqrt;
        float[] fArr;
        ahiw ahiwVar = this.c;
        float[] fArr2 = this.a;
        long j = this.b;
        char c = 1;
        amkq.E(true);
        int i = 3;
        float[] fArr3 = new float[3];
        char c2 = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            fArr3[i2] = -fArr2[(i2 * 4) + 2];
        }
        ahjq ahjqVar = new ahjq(fArr3, j);
        if (ahiwVar.e != null) {
            long j2 = ahiwVar.f + 200;
            while (true) {
                long j3 = ahjqVar.b;
                if (j2 > j3) {
                    break;
                }
                ahjq ahjqVar2 = ahiwVar.e;
                amkq.E(j2 <= j3 && j2 >= ahjqVar2.b);
                amkq.E(ahjqVar.b >= ahjqVar2.b);
                long j4 = ahjqVar.b;
                long j5 = ahjqVar2.b;
                long j6 = j4 - j5;
                if (j6 != 0) {
                    float f = ((float) (j2 - j5)) / ((float) j6);
                    if (f >= 0.0f) {
                        if (f <= 1.0f) {
                            float[] fArr4 = ahjqVar2.a;
                            float[] fArr5 = ahjqVar.a;
                            float[] fArr6 = new float[i];
                            float b = ahjq.b(fArr4);
                            float b2 = ahjq.b(fArr5);
                            float a = ahjq.a(fArr4, fArr5) / (b * b2);
                            float acos = (float) Math.acos((a <= 1.0f || a > 1.000001f) ? a : 1.0f);
                            if (acos < 1.0E-6f) {
                                for (int i3 = 0; i3 < i; i3++) {
                                    float f2 = fArr5[i3];
                                    float f3 = fArr4[i3];
                                    fArr6[i3] = ((f2 - f3) * f) + f3;
                                }
                                fArr = fArr6;
                            } else {
                                float[] fArr7 = fArr5;
                                if (acos > 3.1415916535897956d) {
                                    float[] fArr8 = new float[i];
                                    float f4 = (b + b2) / 2.0f;
                                    if (Math.abs(fArr4[c2]) <= 1.0E-6f) {
                                        float f5 = fArr4[2];
                                        float f6 = fArr4[c];
                                        double d = f4;
                                        double sqrt2 = Math.sqrt((f5 * f5) + f6 + f6);
                                        Double.isNaN(d);
                                        float f7 = (float) (d / sqrt2);
                                        fArr8[c2] = 0.0f;
                                        fArr8[1] = (-fArr4[2]) * f7;
                                        fArr8[2] = fArr4[1] * f7;
                                    } else {
                                        float f8 = fArr4[c2];
                                        float f9 = fArr4[1];
                                        double d2 = f4;
                                        double sqrt3 = Math.sqrt((f8 * f8) + f9 + f9);
                                        Double.isNaN(d2);
                                        float f10 = (float) (d2 / sqrt3);
                                        c2 = 0;
                                        fArr8[0] = (-fArr4[1]) * f10;
                                        fArr8[1] = fArr4[0] * f10;
                                        fArr8[2] = 0.0f;
                                        f = f;
                                    }
                                    if (f <= 0.5d) {
                                        f += f;
                                        fArr7 = fArr8;
                                        b2 = b;
                                    } else {
                                        f = (f + f) - 1.0f;
                                        fArr4 = fArr8;
                                    }
                                    acos = 1.5707964f;
                                    sqrt = 1.0f;
                                } else {
                                    sqrt = (float) Math.sqrt(1.0f - (r15 * r15));
                                }
                                double d3 = sqrt;
                                fArr = fArr6;
                                double d4 = f;
                                Double.isNaN(d4);
                                double d5 = 1.0d - d4;
                                double d6 = acos;
                                Double.isNaN(d6);
                                double sin = Math.sin(d5 * d6);
                                Double.isNaN(d3);
                                float f11 = ((float) (sin / d3)) / b;
                                double sin2 = Math.sin(acos * f);
                                Double.isNaN(d3);
                                float f12 = ((float) (sin2 / d3)) / b2;
                                float f13 = ((1.0f - f) * b) + (f * b2);
                                for (int i4 = 0; i4 < 3; i4++) {
                                    fArr[i4] = ((fArr4[i4] * f11) + (fArr7[i4] * f12)) * f13;
                                }
                            }
                            ahjqVar2 = new ahjq(fArr, j2);
                            byte[] c3 = ahjqVar2.c();
                            long j7 = ahjqVar2.b;
                            ahiwVar.f = j7;
                            ahiwVar.b(c3, j7);
                            j2 += 200;
                            c = 1;
                            i = 3;
                        }
                    }
                    byte[] c32 = ahjqVar2.c();
                    long j72 = ahjqVar2.b;
                    ahiwVar.f = j72;
                    ahiwVar.b(c32, j72);
                    j2 += 200;
                    c = 1;
                    i = 3;
                }
                ahjqVar2 = ahjqVar;
                byte[] c322 = ahjqVar2.c();
                long j722 = ahjqVar2.b;
                ahiwVar.f = j722;
                ahiwVar.b(c322, j722);
                j2 += 200;
                c = 1;
                i = 3;
            }
        } else {
            byte[] c4 = ahjqVar.c();
            long j8 = ahjqVar.b;
            ahiwVar.f = j8;
            ahiwVar.b(c4, j8);
        }
        ahiwVar.e = ahjqVar;
    }
}
