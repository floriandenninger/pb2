package defpackage;

import android.util.Property;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aljm extends Property {
    public aljm(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = aljn.a;
        return Float.valueOf(((aljn) obj).g);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        aljn aljnVar = (aljn) obj;
        float floatValue = ((Float) obj2).floatValue();
        aljnVar.g = floatValue;
        int i = (int) (floatValue * 1800.0f);
        for (int i2 = 0; i2 < 4; i2++) {
            aljnVar.k[i2] = Math.max(0.0f, Math.min(1.0f, aljnVar.c[i2].getInterpolation(aljn.f(i, aljn.b[i2], aljn.a[i2]))));
        }
        if (aljnVar.f) {
            Arrays.fill(aljnVar.l, akwg.q(aljnVar.d.c[aljnVar.e], aljnVar.j.i));
            aljnVar.f = false;
        }
        aljnVar.j.invalidateSelf();
    }
}
