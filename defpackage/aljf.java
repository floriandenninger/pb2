package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aljf extends aljc {
    public final aljd a;
    public final alje b;

    public aljf(Context context, alip alipVar, aljd aljdVar, alje aljeVar) {
        super(context, alipVar);
        this.a = aljdVar;
        aljdVar.b = this;
        this.b = aljeVar;
        aljeVar.j = this;
    }

    @Override // defpackage.aljc
    public final boolean b(boolean z, boolean z2, boolean z3) {
        boolean b = super.b(z, z2, z3);
        if (!isRunning()) {
            this.b.a();
        }
        float n = alkd.n(this.d.getContentResolver());
        if (z && (z3 || (Build.VERSION.SDK_INT <= 21 && n > 0.0f))) {
            this.b.d();
        }
        return b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.a.f(canvas, c());
        this.a.e(canvas, this.h);
        int i = 0;
        while (true) {
            alje aljeVar = this.b;
            int[] iArr = aljeVar.l;
            if (i < iArr.length) {
                aljd aljdVar = this.a;
                Paint paint = this.h;
                float[] fArr = aljeVar.k;
                int i2 = i + i;
                aljdVar.d(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                i++;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.aljc, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }
}
