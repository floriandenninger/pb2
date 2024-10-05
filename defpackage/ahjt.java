package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahjt extends ahhi implements ahkl, ahkj {
    private final ahkm a;
    private final ahgd b;
    private final ahjp c;
    private float e;

    public ahjt(Context context, ahkm ahkmVar) {
        this.a = ahkmVar;
        float f = ahkq.a;
        float[] fArr = {-ahkq.a, ahkq.a * (-0.7f), ahkq.a * (-0.4f), ahkq.a * (-0.1f), ahkq.a * 0.2f, ahkq.a * 0.4f, ahkq.a * 0.6f, ahkq.a * 0.8f, ahkq.a};
        amkq.E(true);
        amkq.E(true);
        float[] fArr2 = new float[1041];
        float f2 = f + f;
        fArr2[0] = 0.0f;
        float f3 = fArr[8];
        fArr2[1] = f3;
        fArr2[2] = f2;
        fArr2[3] = f2;
        fArr2[4] = f3;
        fArr2[5] = 0.0f;
        float f4 = -f2;
        fArr2[6] = f4;
        fArr2[7] = f3;
        fArr2[8] = 0.0f;
        fArr2[9] = 0.0f;
        fArr2[10] = f3;
        fArr2[11] = f4;
        fArr2[12] = 0.0f;
        fArr2[13] = f3;
        fArr2[14] = f4;
        fArr2[15] = 0.0f;
        float f5 = fArr[0];
        fArr2[16] = f5;
        fArr2[17] = f4;
        fArr2[18] = 0.0f;
        fArr2[19] = f5;
        fArr2[20] = f4;
        fArr2[21] = 0.0f;
        fArr2[22] = f5;
        fArr2[23] = f4;
        fArr2[24] = f2;
        fArr2[25] = f5;
        fArr2[26] = 0.0f;
        fArr2[27] = f4;
        fArr2[28] = f5;
        fArr2[29] = 0.0f;
        fArr2[30] = 0.0f;
        fArr2[31] = f5;
        fArr2[32] = f2;
        for (int i = 0; i < 21; i++) {
            float f6 = i / 20.0f;
            double d = f;
            double d2 = (f6 + f6) * 3.1415927f;
            double sin = Math.sin(d2);
            Double.isNaN(d);
            float f7 = (float) (d * sin);
            double cos = Math.cos(d2);
            Double.isNaN(d);
            float f8 = (float) (d * cos);
            int i2 = 0;
            while (i2 < 8) {
                int i3 = (((i2 * 21) + i) * 6) + 33;
                int i4 = i3 + 1;
                fArr2[i3] = f7;
                int i5 = i4 + 1;
                fArr2[i4] = fArr[i2];
                int i6 = i5 + 1;
                fArr2[i5] = f8;
                int i7 = i6 + 1;
                fArr2[i6] = f7;
                i2++;
                fArr2[i7] = fArr[i2];
                fArr2[i7 + 1] = f8;
            }
        }
        ahku ahkuVar = new ahku(fArr2, new float[694], 5);
        ahkv b = ahkv.b();
        float[] fArr3 = {0.0f, 0.0f, 0.0f, 1.0f, 0.025f, 0.025f, 0.025f, 1.0f, 0.05f, 0.05f, 0.05f, 1.0f, 0.075f, 0.075f, 0.075f, 1.0f, 0.1f, 0.1f, 0.1f, 1.0f, 0.075f, 0.075f, 0.075f, 1.0f, 0.05f, 0.05f, 0.05f, 1.0f, 0.025f, 0.025f, 0.025f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        float[] fArr4 = new float[1388];
        for (int i8 = 0; i8 < 6; i8++) {
            System.arraycopy(fArr3, 32, fArr4, i8 * 4, 4);
        }
        int i9 = 4;
        for (int i10 = 0; i10 < 5; i10++) {
            System.arraycopy(fArr3, 0, fArr4, (i10 + 6) * 4, 4);
        }
        int i11 = 0;
        while (i11 < 21) {
            System.arraycopy(fArr3, 0, fArr4, (i11 * 8) + 44, i9);
            i11++;
            i9 = 4;
        }
        int i12 = 44;
        for (int i13 = 1; i13 < 8; i13++) {
            for (int i14 = 0; i14 < 21; i14++) {
                System.arraycopy(fArr3, i13 * 4, fArr4, (i14 * 8) + i12 + 4, 4);
            }
            i12 += 168;
            for (int i15 = 0; i15 < 21; i15++) {
                System.arraycopy(fArr3, i13 * 4, fArr4, (i15 * 8) + i12, 4);
            }
        }
        for (int i16 = 0; i16 < 21; i16++) {
            System.arraycopy(fArr3, 32, fArr4, (i16 * 8) + i12 + 4, 4);
        }
        ahgd ahgdVar = new ahgd(ahkuVar, b, fArr4, ahkmVar.a.a());
        this.b = ahgdVar;
        ahjp ahjpVar = new ahjp(BitmapFactory.decodeResource(context.getResources(), R.raw.vr_video_shadow), ahku.a(1.0f, 1.0f, ahku.c), ahkmVar.c.clone(), ahkmVar.a.b());
        this.c = ahjpVar;
        ahkmVar.b(this);
        ahkmVar.f.add(this);
        b(ahkmVar.h, ahkmVar.i);
        n(ahgdVar);
        n(ahjpVar);
    }

    @Override // defpackage.ahkj
    public final void a(boolean z) {
        boolean z2 = !z;
        if (v() != z2) {
            this.l = z2;
        }
    }

    @Override // defpackage.ahkl
    public final void b(float f, float f2) {
        float f3 = f * 1.1f;
        float f4 = f3 / 14.0f;
        float f5 = (f2 / 2.0f) + (f4 / 2.0f);
        this.c.l(0.0f, this.e - f5, 0.0f);
        this.e = f5;
        this.c.rJ(f3, f4, 1.0f);
    }

    @Override // defpackage.ahhi, defpackage.ahim
    public final void i() {
        super.i();
        this.a.h(this);
        this.a.f.remove(this);
    }
}
