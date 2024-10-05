package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alms extends alkg {
    public final RectF g;
    private final Paint h;
    private int i;

    alms() {
        this(null);
    }

    @Override // defpackage.alkg, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            this.i = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        } else {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        }
        super.draw(canvas);
        canvas.drawRect(this.g, this.h);
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.i);
    }

    public final void v(float f, float f2, float f3, float f4) {
        if (f == this.g.left && f2 == this.g.top && f3 == this.g.right && f4 == this.g.bottom) {
            return;
        }
        this.g.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public alms(alkl alklVar) {
        super(alklVar == null ? new alkl() : alklVar);
        Paint paint = new Paint(1);
        this.h = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.g = new RectF();
    }
}
