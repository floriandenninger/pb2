package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ryd extends rxy {
    private final Rect b = new Rect();
    private final sat c = new sat();

    protected static final int m(int i, float f) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return f == 0.0f ? 3 : 2;
        }
        if (i2 == 1) {
            if (f == 90.0f) {
                return 3;
            }
            return f == -90.0f ? 1 : 2;
        }
        if (i2 == 2) {
            return f == 0.0f ? 1 : 2;
        }
        if (f == 90.0f) {
            return 1;
        }
        return f == -90.0f ? 3 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.rxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void g(android.graphics.Canvas r14, defpackage.rxx r15, android.graphics.Rect r16, android.graphics.Rect r17, int r18, android.text.TextPaint r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            float r10 = r1.g
            float r5 = r1.e
            int r5 = java.lang.Math.round(r5)
            float r5 = (float) r5
            android.graphics.Paint$Align r8 = r13.l(r4, r10, r15)
            int r9 = m(r4, r10)
            int r6 = r4 + (-1)
            if (r4 == 0) goto L93
            if (r6 == 0) goto L67
            r4 = 1
            if (r6 == r4) goto L51
            r4 = 2
            if (r6 == r4) goto L3b
            int r4 = r2.right
            rxr r6 = r0.a
            int r6 = r6.c
            int r4 = r4 - r6
            float r4 = (float) r4
            android.graphics.Rect r6 = r0.b
            int r7 = r2.left
            int r11 = r3.top
            int r2 = r2.right
            int r3 = r3.bottom
            r6.set(r7, r11, r2, r3)
            goto L7f
        L3b:
            int r4 = r2.top
            rxr r6 = r0.a
            int r6 = r6.c
            int r4 = r4 + r6
            float r4 = (float) r4
            android.graphics.Rect r6 = r0.b
            int r7 = r3.left
            int r11 = r2.top
            int r3 = r3.right
            int r2 = r2.bottom
            r6.set(r7, r11, r3, r2)
            goto L7c
        L51:
            int r4 = r2.left
            rxr r6 = r0.a
            int r6 = r6.c
            int r4 = r4 + r6
            float r4 = (float) r4
            android.graphics.Rect r6 = r0.b
            int r7 = r2.left
            int r11 = r3.top
            int r2 = r2.right
            int r3 = r3.bottom
            r6.set(r7, r11, r2, r3)
            goto L7f
        L67:
            int r4 = r2.bottom
            rxr r6 = r0.a
            int r6 = r6.c
            int r4 = r4 - r6
            float r4 = (float) r4
            android.graphics.Rect r6 = r0.b
            int r7 = r3.left
            int r11 = r2.top
            int r3 = r3.right
            int r2 = r2.bottom
            r6.set(r7, r11, r3, r2)
        L7c:
            r12 = r5
            r5 = r4
            r4 = r12
        L7f:
            java.lang.CharSequence r2 = r1.b
            if (r2 == 0) goto L92
            sat r1 = r0.c
            android.graphics.Rect r6 = r0.b
            rxr r3 = r0.a
            boolean r3 = r3.f
            r11 = 1
            r3 = r14
            r7 = r19
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L92:
            return
        L93:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryd.g(android.graphics.Canvas, rxx, android.graphics.Rect, android.graphics.Rect, int, android.text.TextPaint):void");
    }

    @Override // defpackage.rxy
    protected void h(Canvas canvas, rxx rxxVar, Rect rect, Rect rect2, int i, Paint paint) {
        float round = Math.round(rxxVar.e);
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            canvas.drawLine(round, rect.bottom - this.a.b, round, rect.bottom, paint);
            return;
        }
        if (i2 == 1) {
            canvas.drawLine(rect.left + this.a.b, round, rect.left, round, paint);
        } else if (i2 == 2) {
            canvas.drawLine(round, rect.top + this.a.b, round, rect.top, paint);
        } else {
            canvas.drawLine(rect.right - this.a.b, round, rect.right, round, paint);
        }
    }

    @Override // defpackage.rxy
    protected final void j(rxx rxxVar, rze rzeVar, int i, TextPaint textPaint) {
        float a = rzeVar.a(rxxVar.a);
        if (rxxVar.b != null) {
            sar b = this.c.b(sau.a(rxxVar.b), textPaint, l(i, rxxVar.h, rxxVar), m(i, rxxVar.h), rxxVar.h);
            if (i == 1 || i == 3) {
                float f = a + b.b;
                rxxVar.d = new ryv(Float.valueOf(f), Float.valueOf(f + b.a));
                rxxVar.c = new rwl(b.h, b.g + this.a.c);
                return;
            } else {
                float f2 = a + b.e;
                rxxVar.d = new ryv(Float.valueOf(f2), Float.valueOf(f2 + b.d));
                rxxVar.c = new rwl(b.h + this.a.c, b.g);
                return;
            }
        }
        rxxVar.c = new rwl(0, 0);
        Float valueOf = Float.valueOf(a);
        rxxVar.d = new ryv(valueOf, valueOf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Paint.Align l(int i, float f, rxx rxxVar) {
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? (f == 90.0f || f == -90.0f) ? Paint.Align.CENTER : Paint.Align.RIGHT : f == 0.0f ? Paint.Align.CENTER : f > 0.0f ? Paint.Align.LEFT : Paint.Align.RIGHT : (f == 90.0f || f == -90.0f) ? Paint.Align.CENTER : Paint.Align.LEFT : f == 0.0f ? Paint.Align.CENTER : f > 0.0f ? Paint.Align.RIGHT : Paint.Align.LEFT;
        }
        throw null;
    }
}
