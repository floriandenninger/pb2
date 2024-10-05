package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gze extends View {
    public Paint a;
    public float b;
    public float c;
    public final Rect d;
    public int e;
    public boolean f;
    private String g;

    public gze(Context context) {
        super(context);
        this.g = "Example Text";
        this.d = new Rect();
        this.f = false;
    }

    private final void b() {
        Paint paint = this.a;
        String str = this.g;
        paint.getTextBounds(str, 0, str.length(), this.d);
    }

    public final void a(String str) {
        this.g = str;
        b();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawText(this.g, this.c, this.d.height(), this.a);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        b();
        int size = View.MeasureSpec.getSize(i2);
        int height = this.d.height();
        if (height > size) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }
}
