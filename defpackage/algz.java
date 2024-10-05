package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class algz extends Property {
    public algz(Class cls) {
        super(cls, "width");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getLayoutParams().width);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        view.getLayoutParams().width = ((Float) obj2).intValue();
        view.requestLayout();
    }
}
