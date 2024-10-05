package defpackage;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bwq extends Property {
    public bwq(Class cls) {
        super(cls, "clipBounds");
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return jw.m((View) obj);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        jw.R((View) obj, (Rect) obj2);
    }
}
