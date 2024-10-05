package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alhc extends Property {
    public alhc(Class cls) {
        super(cls, "paddingEnd");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(jw.h((View) obj));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        jw.Y(view, jw.i(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
    }
}
