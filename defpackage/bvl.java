package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bvl extends Property {
    private final Rect a;

    public bvl(Class cls) {
        super(cls, "boundsOrigin");
        this.a = new Rect();
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.a);
        return new PointF(this.a.left, this.a.top);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        drawable.copyBounds(this.a);
        this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.a);
    }
}
