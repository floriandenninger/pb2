package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akou extends rya {
    private final Rect b = new Rect();
    private final sat c = new sat();

    @Override // defpackage.rya, defpackage.rxy
    protected final void g(Canvas canvas, rxx rxxVar, Rect rect, Rect rect2, int i, TextPaint textPaint) {
        Paint.Align align;
        float f = rxxVar.g;
        float round = Math.round(rxxVar.e);
        if (f == 90.0f || f == -90.0f) {
            align = Paint.Align.CENTER;
        } else {
            align = Paint.Align.LEFT;
        }
        Paint.Align align2 = align;
        int i2 = f == 90.0f ? 3 : f == -90.0f ? 1 : 2;
        rxr rxrVar = this.a;
        float f2 = rect.left + (rxrVar.b > 0 ? rxrVar.c : 0);
        this.b.set(rect.left, rect2.top, rect.right, rect2.bottom);
        CharSequence charSequence = rxxVar.b;
        if (charSequence != null) {
            sat satVar = this.c;
            Rect rect3 = this.b;
            boolean z = this.a.f;
            satVar.a(charSequence, canvas, f2, round, rect3, textPaint, align2, i2, f, true);
        }
    }

    @Override // defpackage.rya, defpackage.rxy
    protected final void h(Canvas canvas, rxx rxxVar, Rect rect, Rect rect2, int i, Paint paint) {
        float round = Math.round(rxxVar.e);
        if (this.a.b > 0) {
            canvas.drawLine(rect.left + r11, round, rect.left, round, paint);
        }
        canvas.drawLine(rect.right - this.a.b, round, rect2.right, round, paint);
    }
}
