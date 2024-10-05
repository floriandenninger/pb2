package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bvn extends Property {
    public bvn(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        bvt bvtVar = (bvt) obj;
        PointF pointF = (PointF) obj2;
        bvtVar.c = Math.round(pointF.x);
        bvtVar.d = Math.round(pointF.y);
        int i = bvtVar.f + 1;
        bvtVar.f = i;
        if (bvtVar.e == i) {
            bvtVar.a();
        }
    }
}
