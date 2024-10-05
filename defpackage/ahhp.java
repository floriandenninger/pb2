package defpackage;

import android.opengl.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahhp {
    public final ahkv a;
    public float b;
    public float c;
    private final float[] d;
    private final float[] e;
    private final float[][] f;

    public ahhp(ahkv ahkvVar, float f, float f2) {
        this.a = ahkvVar;
        a(f, f2);
        this.d = new float[16];
        this.e = new float[16];
        this.f = new float[6];
        for (int i = 0; i < 6; i++) {
            this.f[i] = new float[4];
        }
    }

    public final void a(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final ahhn b(ahjq ahjqVar) {
        if (this.b == 0.0f || this.c == 0.0f) {
            return new ahhn(this, new ahho(new float[]{0.0f, 0.0f}, 2));
        }
        Matrix.multiplyMM(this.e, 0, ahjqVar.a, 0, this.a.a, 0);
        Matrix.invertM(this.d, 0, this.e, 0);
        float[] fArr = this.f[0];
        fArr[2] = -1.0f;
        ahho ahhoVar = new ahho(fArr, 4);
        ahho ahhoVar2 = new ahho(this.f[1], 4);
        float[] fArr2 = this.d;
        if (ahhoVar.b != 4) {
            throw new RuntimeException("Cannot be multiplied by matrix unless the vector size is 4");
        }
        Matrix.multiplyMV(ahhoVar2.a, 0, fArr2, 0, ahhoVar.a, 0);
        float[] fArr3 = this.f[2];
        float[] fArr4 = this.d;
        fArr3[0] = -fArr4[12];
        fArr3[1] = -fArr4[13];
        fArr3[2] = -fArr4[14];
        ahho ahhoVar3 = new ahho(fArr3, 4);
        float a = ahhoVar2.a(ahhoVar);
        float a2 = a != 0.0f ? ahhoVar3.a(ahhoVar) / a : 0.0f;
        ahho ahhoVar4 = new ahho(this.f[3], 4);
        float[] fArr5 = ahhoVar4.a;
        for (int i = 0; i < ahhoVar2.b; i++) {
            fArr5[i] = ahhoVar2.a[i] * a2;
        }
        System.arraycopy(this.d, 12, this.f[4], 0, 3);
        ahho ahhoVar5 = new ahho(this.f[4], 4);
        ahho ahhoVar6 = new ahho(this.f[5], 4);
        for (int i2 = 0; i2 < ahhoVar4.b; i2++) {
            ahhoVar6.a[i2] = ahhoVar4.a[i2] + ahhoVar5.a[i2];
        }
        float[] fArr6 = ahhoVar6.a;
        return new ahhn(this, new ahho(new float[]{fArr6[0], fArr6[1]}, 2));
    }
}
