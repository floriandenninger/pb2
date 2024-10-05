package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rya extends rxy {
    private final Rect b = new Rect();
    private final sat c = new sat();

    private static final Paint.Align m(int i, float f) {
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? (f == 90.0f || f == -90.0f) ? Paint.Align.CENTER : Paint.Align.LEFT : f == 0.0f ? Paint.Align.CENTER : f > 0.0f ? Paint.Align.RIGHT : Paint.Align.LEFT : (f == 90.0f || f == -90.0f) ? Paint.Align.CENTER : Paint.Align.RIGHT : f == 0.0f ? Paint.Align.CENTER : f > 0.0f ? Paint.Align.LEFT : Paint.Align.RIGHT;
        }
        throw null;
    }

    private static final int n(int i, float f) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return f == 0.0f ? 1 : 2;
        }
        if (i2 == 1) {
            if (f == 90.0f) {
                return 1;
            }
            return f == -90.0f ? 3 : 2;
        }
        if (i2 == 2) {
            return f == 0.0f ? 3 : 2;
        }
        if (f == 90.0f) {
            return 3;
        }
        return f == -90.0f ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.rxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void g(android.graphics.Canvas r14, defpackage.rxx r15, android.graphics.Rect r16, android.graphics.Rect r17, int r18, android.text.TextPaint r19) {
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
            android.graphics.Paint$Align r8 = m(r4, r10)
            int r9 = n(r4, r10)
            rxr r6 = r0.a
            int r7 = r6.b
            if (r7 <= 0) goto L22
            int r6 = r6.c
            goto L23
        L22:
            r6 = 0
        L23:
            int r7 = r4 + (-1)
            if (r4 == 0) goto L8d
            if (r7 == 0) goto L65
            r4 = 1
            if (r7 == r4) goto L53
            r4 = 2
            if (r7 == r4) goto L41
            int r4 = r2.left
            int r4 = r4 + r6
            float r4 = (float) r4
            android.graphics.Rect r6 = r0.b
            int r7 = r2.left
            int r11 = r3.top
            int r2 = r2.right
            int r3 = r3.bottom
            r6.set(r7, r11, r2, r3)
            goto L79
        L41:
            int r4 = r2.bottom
            int r4 = r4 - r6
            float r4 = (float) r4
            android.graphics.Rect r6 = r0.b
            int r7 = r3.left
            int r11 = r2.top
            int r3 = r3.right
            int r2 = r2.bottom
            r6.set(r7, r11, r3, r2)
            goto L76
        L53:
            int r4 = r2.right
            int r4 = r4 - r6
            float r4 = (float) r4
            android.graphics.Rect r6 = r0.b
            int r7 = r2.left
            int r11 = r3.top
            int r2 = r2.right
            int r3 = r3.bottom
            r6.set(r7, r11, r2, r3)
            goto L79
        L65:
            int r4 = r2.top
            int r4 = r4 + r6
            float r4 = (float) r4
            android.graphics.Rect r6 = r0.b
            int r7 = r3.left
            int r11 = r2.top
            int r3 = r3.right
            int r2 = r2.bottom
            r6.set(r7, r11, r3, r2)
        L76:
            r12 = r5
            r5 = r4
            r4 = r12
        L79:
            java.lang.CharSequence r2 = r1.b
            if (r2 == 0) goto L8c
            sat r1 = r0.c
            android.graphics.Rect r6 = r0.b
            rxr r3 = r0.a
            boolean r3 = r3.f
            r11 = 1
            r3 = r14
            r7 = r19
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L8c:
            return
        L8d:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rya.g(android.graphics.Canvas, rxx, android.graphics.Rect, android.graphics.Rect, int, android.text.TextPaint):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    @Override // defpackage.rxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void h(android.graphics.Canvas r17, defpackage.rxx r18, android.graphics.Rect r19, android.graphics.Rect r20, int r21, android.graphics.Paint r22) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rya.h(android.graphics.Canvas, rxx, android.graphics.Rect, android.graphics.Rect, int, android.graphics.Paint):void");
    }

    @Override // defpackage.rxy
    protected final void j(rxx rxxVar, rze rzeVar, int i, TextPaint textPaint) {
        float a = rzeVar.a(rxxVar.a);
        CharSequence charSequence = rxxVar.b;
        if (charSequence != null) {
            sar l = l(rxxVar.h, i, charSequence, textPaint);
            if (i == 1 || i == 3) {
                float f = a + l.b;
                rxxVar.d = new ryv(Float.valueOf(f), Float.valueOf(f + l.a));
                rxxVar.c = new rwl(l.h, l.g + this.a.c);
                return;
            } else {
                float f2 = a + l.e;
                rxxVar.d = new ryv(Float.valueOf(f2), Float.valueOf(f2 + l.d));
                rxxVar.c = new rwl(l.h + this.a.c, l.g);
                return;
            }
        }
        rxxVar.c = new rwl(0, 0);
        Float valueOf = Float.valueOf(a);
        rxxVar.d = new ryv(valueOf, valueOf);
    }

    protected final sar l(float f, int i, CharSequence charSequence, TextPaint textPaint) {
        return this.c.b(sau.a(charSequence), textPaint, m(i, f), n(i, f), f);
    }
}
