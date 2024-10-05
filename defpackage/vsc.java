package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vsc extends Property {
    public vsc(Class cls) {
        super(cls, "textPaintAlpha");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((vsd) obj).b());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((vsd) obj).f(((Integer) obj2).intValue());
    }
}
