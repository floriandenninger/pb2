package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vze extends Drawable {
    public vsy a;
    public float b;
    public float c;
    private final Paint d;

    public vze(Context context) {
        Resources resources = context.getResources();
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(resources.getColor(R.color.video_trim_view_excluded_area_overlay));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.a == null) {
            return;
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, this.b, bounds.bottom, this.d);
        canvas.drawRect(this.c, bounds.top, bounds.right, bounds.bottom, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
