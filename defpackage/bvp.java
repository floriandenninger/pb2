package defpackage;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bvp extends Property {
    public bvp(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        bwr.b(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
    }
}
