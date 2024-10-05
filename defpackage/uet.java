package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uet extends Drawable {
    private static final int[][] a = {new int[]{-279548, 155, 50}, new int[]{-1490379, 205, 105}, new int[]{-12417548, 310, 100}, new int[]{-13326253, 50, 105}};
    private final Paint b;
    private final RectF c = new RectF();
    private final ufa d;

    public uet(ufa ufaVar) {
        this.d = ufaVar;
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int[][] iArr = a;
        for (int i = 0; i < 4; i++) {
            this.b.setColor(iArr[i][0]);
            canvas.drawArc(this.c, r3[1], r3[2], false, this.b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        amkq.F(rect.width() == rect.height(), "Width and height for G1RingDrawable bounds must be equal.");
        int width = rect.width();
        ufb ufbVar = this.d.a;
        int round = Math.round(ufbVar.a(width, ufbVar.c(ufbVar.a), ufbVar.c(ufbVar.b)));
        float f = (round + 1) / 2;
        float f2 = width - f;
        this.c.set(new RectF(f, f, f2, f2));
        this.b.setStrokeWidth(round);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
}
