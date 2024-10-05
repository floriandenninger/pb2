package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aljb extends Property {
    public aljb(Class cls) {
        super(cls, "growFraction");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((aljc) obj).c());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((aljc) obj).e(((Float) obj2).floatValue());
    }
}
