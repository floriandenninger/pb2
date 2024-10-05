package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gyu extends View {
    public Paint a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final RectF f;

    public gyu(Context context) {
        super(context);
        this.f = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f.set(0.0f, getHeight() - this.e, this.b / 2.0f, getHeight());
        canvas.drawRect(this.f, this.a);
        float width = getWidth() / 10.0f;
        for (int i = 1; i < 5; i++) {
            float f = i * width;
            this.f.set(f - (this.b / 2.0f), getHeight() - this.c, f + (this.b / 2.0f), getHeight());
            canvas.drawRect(this.f, this.a);
        }
        float width2 = (getWidth() - this.b) / 2.0f;
        this.f.set(width2, getHeight() - this.d, this.b + width2, getHeight());
        canvas.drawRect(this.f, this.a);
        for (int i2 = 6; i2 < 10; i2++) {
            float f2 = i2 * width;
            this.f.set(f2 - (this.b / 2.0f), getHeight() - this.c, f2 + (this.b / 2.0f), getHeight());
            canvas.drawRect(this.f, this.a);
        }
        this.f.set(getWidth() - (this.b / 2.0f), getHeight() - this.e, getWidth(), getHeight());
        canvas.drawRect(this.f, this.a);
    }
}
