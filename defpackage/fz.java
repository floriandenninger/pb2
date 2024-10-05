package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fz extends ga {
    public fz(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // defpackage.ga
    public final void a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        b();
        outline.setRoundRect(this.c, this.b);
    }
}
