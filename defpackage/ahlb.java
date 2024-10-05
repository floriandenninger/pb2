package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahlb {
    public static final float[] a = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f, 0.3127f, 0.329f};
    public static final float[] b = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f, 0.3127f, 0.329f};
    public static final float[] c = {0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f, 0.3127f, 0.329f};
    public final axfg d;
    public final axfg e;

    public ahlb(float[] fArr) {
        axfg axfgVar = new axfg(null);
        this.e = axfgVar;
        float f = fArr[0];
        float f2 = fArr[2];
        float f3 = fArr[4];
        float f4 = fArr[1];
        float f5 = fArr[3];
        float f6 = fArr[5];
        axfg axfgVar2 = new axfg(f, f2, f3, f4, f5, f6, (1.0f - f) - f4, (1.0f - f2) - f5, (1.0f - f3) - f6);
        float f7 = fArr[6];
        float f8 = fArr[7];
        ahlo ahloVar = new ahlo(f7 / f8, ((1.0f - f7) - f8) / f8);
        axfg axfgVar3 = new axfg(null);
        ahlo ahloVar2 = new ahlo();
        axfgVar2.f(axfgVar3);
        float[] fArr2 = axfgVar3.a;
        float f9 = fArr2[0];
        float f10 = ahloVar.a;
        float f11 = fArr2[1];
        float f12 = ahloVar.b;
        float f13 = fArr2[2];
        float f14 = ahloVar.c;
        float f15 = (f9 * f10) + (f11 * f12) + (f13 * f14);
        float f16 = (fArr2[3] * f10) + (fArr2[4] * f12) + (fArr2[5] * f14);
        float f17 = (fArr2[6] * f10) + (fArr2[7] * f12) + (fArr2[8] * f14);
        ahloVar2.a = f15;
        ahloVar2.b = f16;
        ahloVar2.c = f17;
        axfg axfgVar4 = new axfg(f15, 0.0f, 0.0f, 0.0f, f16, 0.0f, 0.0f, 0.0f, f17);
        this.d = axfgVar4;
        axfg.e(axfgVar2, axfgVar4, axfgVar4);
        axfgVar4.f(axfgVar);
    }
}
