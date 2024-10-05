package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bvm extends Property {
    public bvm(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        bvt bvtVar = (bvt) obj;
        PointF pointF = (PointF) obj2;
        bvtVar.a = Math.round(pointF.x);
        bvtVar.b = Math.round(pointF.y);
        int i = bvtVar.e + 1;
        bvtVar.e = i;
        if (i == bvtVar.f) {
            bvtVar.a();
        }
    }
}
