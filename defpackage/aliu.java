package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aliu extends Property {
    public aliu(Class cls) {
        super(cls, "completeEndFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int[] iArr = aliv.a;
        return Float.valueOf(((aliv) obj).h);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        int[] iArr = aliv.a;
        ((aliv) obj).h = floatValue;
    }
}
