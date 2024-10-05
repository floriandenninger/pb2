package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class saa extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public Paint c;
    public float d;
    public int e;
    public int f;
    public int g;
    private final Point h;
    private final Point i;
    private final Point j;
    private final Path k;
    private final Path l;
    private final RectF m;
    private int n;

    public saa(Context context) {
        super(context);
        this.g = 5;
        this.n = 5;
        this.h = new Point();
        this.i = new Point();
        this.j = new Point();
        this.k = new Path();
        this.l = new Path();
        this.m = new RectF();
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(4.0f);
        Paint paint2 = new Paint();
        this.a = paint2;
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(3.0f);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.set(paint);
        this.c.setStyle(Paint.Style.STROKE);
        this.c.clearShadowLayer();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        view.setLayerType(getLayerType(), null);
        super.addView(view);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int width = canvas.getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = canvas.getHeight() - getPaddingBottom();
        this.b.setStyle(Paint.Style.FILL);
        float f = paddingLeft;
        float f2 = paddingTop;
        this.m.set(f, f2, width, height);
        RectF rectF = this.m;
        float f3 = this.d;
        canvas.drawRoundRect(rectF, f3, f3, this.b);
        RectF rectF2 = this.m;
        float f4 = this.d;
        canvas.drawRoundRect(rectF2, f4, f4, this.a);
        int i = this.g;
        if (i != 5) {
            if (i == 1 || i == 2) {
                f = Math.min(width - this.e, Math.max(f, (((width + paddingLeft) / 2) - (this.e / 2)) + 0.0f));
            }
            int i2 = this.g;
            if (i2 == 3 || i2 == 4) {
                f2 = Math.min(height - this.e, Math.max(f2, (((height + paddingTop) / 2) - (this.e / 2)) + 0.0f));
            }
            int i3 = this.g;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                this.h.set(Math.round(f), paddingTop);
            } else if (i4 == 2) {
                this.h.set(paddingLeft, Math.round(f2));
            } else if (i4 == 3) {
                this.h.set(width, Math.round(f2));
            } else {
                this.h.set(Math.round(f), height);
            }
            int i5 = this.n;
            int i6 = this.g;
            if (i5 != i6) {
                this.n = i6;
                int i7 = i6 - 1;
                if (i6 == 0) {
                    throw null;
                }
                if (i7 == 0) {
                    this.i.set(this.e / 2, -this.f);
                    this.j.set(this.e, 0);
                } else if (i7 == 2) {
                    this.i.set(-this.f, this.e / 2);
                    this.j.set(0, this.e);
                } else if (i7 == 3) {
                    this.i.set(this.f, this.e / 2);
                    this.j.set(0, this.e);
                } else {
                    this.i.set(this.e / 2, this.f);
                    this.j.set(this.e, 0);
                }
                this.k.rewind();
                this.k.setFillType(Path.FillType.EVEN_ODD);
                this.k.lineTo(this.i.x, this.i.y);
                this.k.lineTo(this.j.x, this.j.y);
                this.k.lineTo(0.0f, 0.0f);
                this.k.close();
                this.l.rewind();
                this.l.lineTo(this.i.x, this.i.y);
                this.l.lineTo(this.j.x, this.j.y);
            }
            canvas.save();
            canvas.translate(this.h.x, this.h.y);
            canvas.drawPath(this.k, this.b);
            canvas.drawLine(0.0f, 0.0f, this.j.x, this.j.y, this.c);
            canvas.drawPath(this.l, this.a);
            canvas.restore();
        }
    }
}
