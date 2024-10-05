package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class spc extends Drawable {
    private final Rect a;
    private final int b;
    private final int c;
    private Drawable d;

    private spc(Rect rect, int i, int i2) {
        this.a = rect;
        this.b = i;
        this.c = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static spc a(int i, int i2, int i3, int i4, int i5, int i6) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        int max3 = Math.max(i3, 0);
        int max4 = Math.max(i4, 0);
        int max5 = Math.max(i5, 0);
        int max6 = Math.max(i6, 0);
        Rect rect = new Rect(0, 0, max, max2);
        Rect rect2 = new Rect(0, 0, max + max3 + max5, max2 + max4 + max6);
        spc spcVar = new spc(rect, max3, max4);
        spcVar.setBounds(rect2);
        return spcVar;
    }

    public final void b(Drawable drawable) {
        this.d = drawable;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.d;
        if (drawable != null) {
            canvas.save();
            canvas.translate(this.b, this.c);
            drawable.setBounds(this.a);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
