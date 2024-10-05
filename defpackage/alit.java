package defpackage;

import android.util.Property;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alit extends Property {
    public alit(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = aliv.a;
        return Float.valueOf(((aliv) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        aliv alivVar = (aliv) obj;
        float floatValue = ((Float) obj2).floatValue();
        alivVar.g = floatValue;
        int i = (int) (5400.0f * floatValue);
        float[] fArr = alivVar.k;
        float f = floatValue * 1520.0f;
        fArr[0] = (-20.0f) + f;
        fArr[1] = f;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = aliv.a[i2];
            float[] fArr2 = alivVar.k;
            fArr2[1] = fArr2[1] + (alivVar.d.getInterpolation(aliv.f(i, i3, 667)) * 250.0f);
            int i4 = aliv.b[i2];
            float[] fArr3 = alivVar.k;
            fArr3[0] = fArr3[0] + (alivVar.d.getInterpolation(aliv.f(i, i4, 667)) * 250.0f);
        }
        float[] fArr4 = alivVar.k;
        float f2 = fArr4[0];
        fArr4[0] = (f2 + ((fArr4[1] - f2) * alivVar.h)) / 360.0f;
        fArr4[1] = fArr4[1] / 360.0f;
        int i5 = 0;
        while (true) {
            if (i5 >= 4) {
                break;
            }
            float f3 = aliv.f(i, aliv.c[i5], 333);
            if (f3 >= 0.0f && f3 <= 1.0f) {
                int i6 = alivVar.f;
                int[] iArr = alivVar.e.c;
                int length = iArr.length;
                int i7 = (i5 + i6) % length;
                int i8 = (i7 + 1) % length;
                int q = akwg.q(iArr[i7], alivVar.j.i);
                int q2 = akwg.q(alivVar.e.c[i8], alivVar.j.i);
                float interpolation = alivVar.d.getInterpolation(f3);
                int[] iArr2 = alivVar.l;
                Integer valueOf = Integer.valueOf(q);
                Integer valueOf2 = Integer.valueOf(q2);
                int intValue = valueOf.intValue();
                float f4 = ((intValue >> 24) & PrivateKeyType.INVALID) / 255.0f;
                int intValue2 = valueOf2.intValue();
                float pow = (float) Math.pow(((intValue >> 16) & PrivateKeyType.INVALID) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((intValue >> 8) & PrivateKeyType.INVALID) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((intValue & PrivateKeyType.INVALID) / 255.0f, 2.2d);
                double pow4 = Math.pow(((intValue2 >> 16) & PrivateKeyType.INVALID) / 255.0f, 2.2d);
                double pow5 = Math.pow(((intValue2 >> 8) & PrivateKeyType.INVALID) / 255.0f, 2.2d);
                double pow6 = Math.pow((intValue2 & PrivateKeyType.INVALID) / 255.0f, 2.2d);
                iArr2[0] = Integer.valueOf((Math.round((f4 + (((((intValue2 >> 24) & PrivateKeyType.INVALID) / 255.0f) - f4) * interpolation)) * 255.0f) << 24) | (Math.round(((float) Math.pow(pow + ((((float) pow4) - pow) * interpolation), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow(pow2 + ((((float) pow5) - pow2) * interpolation), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow3 + (interpolation * (((float) pow6) - pow3)), 0.45454545454545453d)) * 255.0f)).intValue();
                break;
            }
            i5++;
        }
        alivVar.j.invalidateSelf();
    }
}
