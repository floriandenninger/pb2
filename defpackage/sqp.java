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
public final class sqp extends sqe {
    private final float a;
    private final float b;
    private final Paint c = new Paint();
    private final boolean d;
    private RectF e;

    public sqp(boolean z, float f, float f2) {
        this.d = z;
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.sqe
    public final void a(Canvas canvas) {
        if (this.e.isEmpty()) {
            return;
        }
        canvas.drawRect(this.e, this.c);
    }

    @Override // defpackage.sqe
    public final void b(Canvas canvas) {
    }

    @Override // defpackage.sqe
    public final void c(Layout layout, CharSequence charSequence) {
        int length;
        int lineStart;
        float primaryHorizontal;
        float f;
        LinearGradient linearGradient;
        this.e = new RectF();
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (layout.getLineCount() == 0 || (length = spanned.length()) == 0) {
                return;
            }
            int i = length - 1;
            if (((dud[]) spanned.getSpans(i, i, dud.class)).length <= 0 && (layout.getLineCount() <= 0 || layout.getEllipsisCount(layout.getLineCount() - 1) <= 0)) {
                return;
            }
            dud[] dudVarArr = (dud[]) spanned.getSpans(0, spanned.length(), dud.class);
            if (dudVarArr.length > 0) {
                lineStart = spanned.getSpanStart(dudVarArr[0]);
            } else {
                lineStart = layout.getLineStart(layout.getLineCount() - 1) + layout.getEllipsisStart(layout.getLineCount() - 1);
            }
            int lineForOffset = layout.getLineForOffset(lineStart);
            float lineTop = layout.getLineTop(lineForOffset);
            float lineBottom = layout.getLineBottom(lineForOffset);
            if (!this.d) {
                f = layout.getPrimaryHorizontal(lineStart);
                primaryHorizontal = (f - this.b) - this.a;
            } else {
                primaryHorizontal = layout.getPrimaryHorizontal(lineStart);
                f = this.b + primaryHorizontal + this.a;
            }
            this.e = new RectF(primaryHorizontal, lineTop, f, lineBottom);
            float f2 = this.a;
            float f3 = f2 / (this.b + f2);
            if (!this.d) {
                linearGradient = new LinearGradient(0.0f, 0.0f, f3, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            } else {
                linearGradient = new LinearGradient(1.0f, 0.0f, 1.0f - f3, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            }
            this.c.setShader(linearGradient);
            this.c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Matrix matrix = new Matrix();
            matrix.setScale(this.a + this.b, 1.0f);
            matrix.postTranslate(this.e.left, 0.0f);
            linearGradient.setLocalMatrix(matrix);
        }
    }

    @Override // defpackage.sqe
    public final void d() {
        this.e = new RectF();
    }

    @Override // defpackage.sqe
    public final boolean e(int i, int i2) {
        return !this.e.isEmpty() && this.e.contains((float) i, (float) i2);
    }

    @Override // defpackage.sqe
    public final boolean f() {
        return true;
    }
}
