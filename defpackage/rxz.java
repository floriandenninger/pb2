package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxz extends ryd {
    @Override // defpackage.ryd, defpackage.rxy
    protected final void h(Canvas canvas, rxx rxxVar, Rect rect, Rect rect2, int i, Paint paint) {
        float round = Math.round(rxxVar.e);
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            canvas.drawLine(round, rect.bottom - this.a.b, round, rect2.bottom, paint);
            return;
        }
        if (i2 == 1) {
            canvas.drawLine(rect.left + this.a.b, round, rect2.left, round, paint);
        } else if (i2 == 2) {
            canvas.drawLine(round, rect.top + this.a.b, round, rect2.top, paint);
        } else {
            canvas.drawLine(rect.right - this.a.b, round, rect2.right, round, paint);
        }
    }
}
