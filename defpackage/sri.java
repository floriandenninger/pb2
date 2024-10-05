package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sri extends sqe {
    private float a;
    private final float b;
    private final Paint c = new Paint();
    private RectF d;

    public sri(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.sqe
    public final void a(Canvas canvas) {
        if (this.d.isEmpty()) {
            return;
        }
        canvas.drawRect(this.d, this.c);
    }

    @Override // defpackage.sqe
    public final void b(Canvas canvas) {
    }

    @Override // defpackage.sqe
    public final void c(Layout layout, CharSequence charSequence) {
        int length;
        this.d = new RectF();
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (layout.getLineCount() == 0 || this.a <= 0.0f || (length = spanned.length()) == 0) {
                return;
            }
            int i = length - 1;
            if (((dud[]) spanned.getSpans(i, i, dud.class)).length <= 0 && (layout.getLineCount() <= 0 || layout.getEllipsisCount(layout.getLineCount() - 1) <= 0)) {
                return;
            }
            this.a = Math.min(this.a, layout.getLineCount());
            int lineCount = layout.getLineCount() - ((int) this.a);
            float lineTop = layout.getLineTop(lineCount);
            float f = this.a;
            float f2 = (int) f;
            if (f != f2 && f > 0.0f) {
                int i2 = lineCount - 1;
                lineTop -= (layout.getLineTop(lineCount) - layout.getLineTop(i2)) - ((1.0f - (f - f2)) * (layout.getLineBottom(i2) - layout.getLineTop(i2)));
            }
            float lineLeft = layout.getLineLeft(0);
            int width = layout.getWidth();
            int lineBottom = layout.getLineBottom(layout.getLineCount() - 1);
            float f3 = this.b;
            this.d = new RectF(lineLeft, lineTop - f3, width, lineBottom - f3);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, -16777216, Shader.TileMode.CLAMP);
            Matrix matrix = new Matrix();
            matrix.setScale(1.0f, this.d.height());
            matrix.postTranslate(0.0f, this.d.top);
            linearGradient.setLocalMatrix(matrix);
            this.c.setShader(linearGradient);
            this.c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override // defpackage.sqe
    public final void d() {
        this.d = new RectF();
    }

    @Override // defpackage.sqe
    public final boolean e(int i, int i2) {
        return !this.d.isEmpty() && this.d.contains((float) i, (float) i2);
    }

    @Override // defpackage.sqe
    public final boolean f() {
        return true;
    }
}
