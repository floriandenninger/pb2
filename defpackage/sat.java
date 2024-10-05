package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sat {
    private final sar a = new sar();
    private final Matrix b = new Matrix();
    private final float[] c = new float[8];
    private final Point d = new Point();

    private final int c(int i, int i2, int i3, int i4, Rect rect) {
        int f;
        int f2;
        int f3;
        int f4;
        Point e = e(i, i2, i3, i4, rect.top);
        int i5 = Integer.MAX_VALUE;
        if (e != null) {
            if (i2 > rect.top) {
                f4 = f(i, i2, e.x, e.y);
            } else {
                f4 = f(i3, i4, e.x, e.y);
            }
            if (f4 < Integer.MAX_VALUE) {
                i5 = f4;
            }
        }
        Point e2 = e(i, i2, i3, i4, rect.bottom);
        if (e2 != null) {
            if (i2 < rect.bottom) {
                f3 = f(i, i2, e2.x, e2.y);
            } else {
                f3 = f(i3, i4, e2.x, e2.y);
            }
            if (f3 < i5) {
                i5 = f3;
            }
        }
        Point d = d(i, i2, i3, i4, rect.left);
        if (d != null && (f2 = f(i3, i4, d.x, d.y)) < i5) {
            i5 = f2;
        }
        Point d2 = d(i, i2, i3, i4, rect.right);
        return (d2 == null || (f = f(i, i2, d2.x, d2.y)) >= i5) ? i5 : f;
    }

    private final Point d(int i, int i2, int i3, int i4, int i5) {
        if (i3 == i || i5 < Math.min(i, i3) || i5 > Math.max(i, i3)) {
            return null;
        }
        this.d.x = i5;
        this.d.y = i4 - (((i3 - i5) * (i4 - i2)) / (i3 - i));
        return this.d;
    }

    private final Point e(int i, int i2, int i3, int i4, int i5) {
        if (i4 == i2 || i5 < Math.min(i2, i4) || i5 > Math.max(i2, i4)) {
            return null;
        }
        this.d.x = i3 - (((i4 - i5) * (i3 - i)) / (i4 - i2));
        this.d.y = i5;
        return this.d;
    }

    private static final int f(int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = i3 - i;
        return (int) Math.sqrt((i5 * i5) + (i6 * i6));
    }

    public final void a(CharSequence charSequence, Canvas canvas, float f, float f2, Rect rect, TextPaint textPaint, Paint.Align align, int i, float f3, boolean z) {
        float[] fArr;
        sau a = sau.a(charSequence);
        sar b = b(a, textPaint, align, i, f3);
        textPaint.setTextAlign(align);
        canvas.save();
        this.b.reset();
        this.b.preRotate(f3, f, f2);
        this.b.postTranslate(b.c, b.f);
        canvas.concat(this.b);
        char c = 0;
        float f4 = a.d + f2;
        int i2 = 0;
        while (true) {
            String[] strArr = a.a;
            if (i2 < strArr.length) {
                String str = strArr[i2];
                if (z) {
                    float[] fArr2 = this.c;
                    float f5 = a.f[i2];
                    if (align == Paint.Align.CENTER) {
                        float f6 = f5 / 2.0f;
                        float f7 = f - f6;
                        fArr2[c] = f7;
                        float f8 = f6 + f;
                        fArr2[2] = f8;
                        fArr2[4] = f8;
                        fArr2[6] = f7;
                    } else if (align == Paint.Align.RIGHT) {
                        float f9 = f - f5;
                        fArr2[c] = f9;
                        fArr2[2] = f;
                        fArr2[4] = f;
                        fArr2[6] = f9;
                    } else if (align == Paint.Align.LEFT) {
                        fArr2[c] = f;
                        float f10 = f5 + f;
                        fArr2[2] = f10;
                        fArr2[4] = f10;
                        fArr2[6] = f;
                    }
                    float f11 = f4 - a.d;
                    fArr2[1] = f11;
                    fArr2[3] = f11;
                    fArr2[5] = f4;
                    fArr2[7] = f4;
                    this.b.mapPoints(this.c);
                    int i3 = 0;
                    boolean z2 = true;
                    while (true) {
                        fArr = this.c;
                        if (i3 >= 8) {
                            break;
                        }
                        z2 &= rect.contains((int) fArr[i3], (int) fArr[i3 + 1]);
                        i3 += 2;
                    }
                    if (!z2) {
                        int c2 = c((int) fArr[c], (int) fArr[1], (int) fArr[2], (int) fArr[3], rect);
                        float[] fArr3 = this.c;
                        str = TextUtils.ellipsize(str, textPaint, Math.min(c2, c((int) fArr3[6], (int) fArr3[7], (int) fArr3[4], (int) fArr3[5], rect)), TextUtils.TruncateAt.END).toString();
                    }
                }
                canvas.drawText(str, f, f4, textPaint);
                f4 += a.d + a.e;
                i2++;
                c = 0;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:230:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.sar b(java.lang.CharSequence r18, android.text.TextPaint r19, android.graphics.Paint.Align r20, int r21, float r22) {
        /*
            Method dump skipped, instructions count: 1331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sat.b(java.lang.CharSequence, android.text.TextPaint, android.graphics.Paint$Align, int, float):sar");
    }
}
