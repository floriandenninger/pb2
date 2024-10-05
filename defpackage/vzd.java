package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vzd extends Drawable {
    private final Drawable b;
    private final float c;
    public final vzc a = new vzc(this);
    private final vzb d = new vzb(this);
    private final vzb e = new vzb(this);

    public vzd(Context context, int i, float f) {
        this.b = aii.a(context, i);
        this.c = f / 2.0f;
    }

    public final void a(float f, boolean z) {
        if (z) {
            this.d.b(f);
        } else {
            this.e.b(f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float centerX = bounds.centerX() - this.c;
        canvas.save();
        canvas.clipRect(bounds.left, bounds.top, centerX, bounds.bottom);
        canvas.scale(this.d.a(), 1.0f, centerX, 0.0f);
        this.b.draw(canvas);
        canvas.restore();
        float centerX2 = bounds.centerX() + this.c;
        canvas.save();
        canvas.clipRect(centerX2, bounds.top, bounds.right, bounds.bottom);
        canvas.scale(this.e.a(), 1.0f, centerX2, 0.0f);
        this.b.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.clipRect(centerX, bounds.top, centerX2, bounds.bottom);
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.b.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
