package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rzo extends View {
    private static final Typeface e;
    private static final Paint.Align f;
    private static final int j;
    public sau a;
    public float b;
    public float c;
    public float d;
    private final TextPaint g;
    private final int h;
    private final Rect i;
    private final sat k;

    static {
        Color.parseColor("#9E9E9E");
        e = Typeface.create("sans-serif-thin", 0);
        f = Paint.Align.CENTER;
        j = 2;
    }

    public rzo(Context context, int i) {
        super(context);
        this.k = new sat();
        this.a = new sau("");
        TextPaint textPaint = new TextPaint();
        this.g = textPaint;
        this.i = new Rect();
        this.b = -1.0f;
        this.c = -1.0f;
        this.d = -1.0f;
        setLayoutParams(new rwk(-1, -1, (byte) 2, 99));
        this.h = (int) rwq.b(context, 72.0f);
        textPaint.setTypeface(e);
        textPaint.setColor(i);
        textPaint.setAntiAlias(true);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        TextPaint textPaint = this.g;
        float f2 = this.d;
        if (f2 == -1.0f) {
            float f3 = this.b;
            if (f3 == -1.0f) {
                f3 = getWidth();
            }
            float f4 = this.c;
            if (f4 == -1.0f) {
                f4 = getHeight();
            }
            this.g.setTextSize(this.h);
            sar b = this.k.b(this.a, this.g, f, j, 0.0f);
            float f5 = b.h;
            float min = f5 > f3 ? Math.min(1.0f, f3 / f5) : 1.0f;
            float f6 = b.g;
            if (f6 > f4) {
                min = Math.min(min, f4 / f6);
            }
            f2 = (int) (this.h * min);
            this.d = f2;
        }
        textPaint.setTextSize(f2);
        int width = getWidth();
        int height = getHeight();
        this.i.set(0, 0, getWidth(), getHeight());
        this.k.a(this.a, canvas, width / 2, height / 2, this.i, this.g, f, j, 0.0f, false);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.d = -1.0f;
    }
}
