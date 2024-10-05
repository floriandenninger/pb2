package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alhb extends Property {
    public alhb(Class cls) {
        super(cls, "paddingStart");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(jw.i((View) obj));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        jw.Y(view, ((Float) obj2).intValue(), view.getPaddingTop(), jw.h(view), view.getPaddingBottom());
    }
}
