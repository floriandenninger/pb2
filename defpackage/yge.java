package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yge extends zav {
    public boolean a;
    private final Paint b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public yge(Drawable drawable, int i, int i2) {
        super(drawable == null ? new ColorDrawable(0) : drawable);
        Paint paint = new Paint();
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i2);
        paint.setColor(i);
        this.a = true;
        this.c = 80;
    }

    @Override // defpackage.zav, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.a) {
            canvas.drawLine(this.d, this.e, this.f, this.g, this.b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        double floor;
        double floor2;
        super.onBoundsChange(rect);
        float strokeWidth = this.b.getStrokeWidth();
        if (!Gravity.isVertical(this.c)) {
            if (this.c == 3) {
                floor = Math.floor(rect.left + (strokeWidth / 2.0f));
            } else {
                floor = Math.floor(rect.right - (strokeWidth / 2.0f));
            }
            int i = (int) floor;
            this.d = i;
            this.e = rect.top;
            this.f = i;
            this.g = rect.bottom;
            return;
        }
        if (this.c == 80) {
            floor2 = Math.floor(rect.bottom - (strokeWidth / 2.0f));
        } else {
            floor2 = Math.floor(rect.top + (strokeWidth / 2.0f));
        }
        int i2 = (int) floor2;
        this.d = rect.left;
        this.e = i2;
        this.f = rect.right;
        this.g = i2;
    }

    @Override // defpackage.zav, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.b.setAlpha(i);
    }
}
