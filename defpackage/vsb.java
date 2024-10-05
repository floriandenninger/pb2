package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vsb extends Property {
    public vsb(Class cls) {
        super(cls, "backgroundPaintAlpha");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((vsd) obj).a());
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((vsd) obj).c(((Integer) obj2).intValue());
    }
}
