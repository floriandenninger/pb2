package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gyt extends View {
    public Paint a;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;
    public boolean g;

    public gyt(Context context) {
        super(context);
        this.e = -1.0f;
        this.g = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        float f = this.e;
        if (f < 0.0f || f > 1.0f) {
            return;
        }
        if (this.g) {
            int width2 = getWidth();
            width = ((int) ((width2 - (r1 + r1)) * this.e)) + this.f;
        } else {
            width = (int) (getWidth() * this.e);
        }
        int i = this.b / 2;
        int i2 = this.c;
        int height = getHeight();
        int i3 = this.c;
        float f2 = this.d;
        canvas.drawRoundRect(width - i, i2, width + i, height - i3, f2, f2, this.a);
    }
}
