package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zbv extends LayerDrawable {
    public final Drawable a;
    public final int b;

    public zbv(Drawable drawable, Drawable drawable2, int i) {
        super(new Drawable[]{drawable, drawable2});
        drawable.getClass();
        this.a = drawable;
        this.b = i;
    }
}
