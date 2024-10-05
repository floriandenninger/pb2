package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alji extends Property {
    public alji(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = aljj.f;
        return Float.valueOf(((aljj) obj).e);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        aljj aljjVar = (aljj) obj;
        float floatValue = ((Float) obj2).floatValue();
        aljjVar.e = floatValue;
        aljjVar.k[0] = 0.0f;
        float f = aljj.f((int) (floatValue * 333.0f), 0, 667);
        float[] fArr = aljjVar.k;
        float interpolation = aljjVar.a.getInterpolation(f);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = aljjVar.k;
        float interpolation2 = aljjVar.a.getInterpolation(f + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        float[] fArr3 = aljjVar.k;
        fArr3[5] = 1.0f;
        if (aljjVar.d && fArr3[3] < 1.0f) {
            int[] iArr = aljjVar.l;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = akwg.q(aljjVar.b.c[aljjVar.c], aljjVar.j.i);
            aljjVar.d = false;
        }
        aljjVar.j.invalidateSelf();
    }
}
