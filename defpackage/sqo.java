package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ImageSpan;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sqo extends sqe {
    private final float a;
    private final Paint b;
    private final syd c;
    private Path d;

    public sqo(int i, float f, syd sydVar) {
        this.a = f;
        Paint paint = new Paint();
        this.b = paint;
        this.c = sydVar;
        paint.setColor(i);
        paint.setAntiAlias(true);
    }

    public static RectF g(RectF rectF, float f) {
        return new RectF(rectF.left - f, rectF.top, rectF.left, rectF.bottom);
    }

    public static RectF h(RectF rectF, float f) {
        return new RectF(rectF.right, rectF.top, rectF.right + f, rectF.bottom);
    }

    public static float[] i(float f) {
        return new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
    }

    public static float[] j(float f) {
        return new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
    }

    private final Path k(Layout layout) {
        Path path;
        RectF h;
        float[] j;
        RectF g;
        float[] i;
        Layout layout2 = layout;
        if (layout.getLineCount() == 0) {
            return null;
        }
        CharSequence text = layout.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) text;
        int i2 = -1;
        int lineEnd = layout2.getLineEnd(layout.getLineCount() - 1);
        int spanStart = spanned.getSpanStart(this);
        if (spanStart == -1 || spanStart >= lineEnd) {
            return null;
        }
        int spanEnd = spanned.getSpanEnd(this);
        if (spanEnd == -1) {
            spanEnd = lineEnd;
        }
        int lineForOffset = layout2.getLineForOffset(spanStart);
        int min = Math.min(layout.getLineCount() - 1, layout2.getLineForOffset(spanEnd));
        boolean isRtlCharAt = layout2.isRtlCharAt(spanStart);
        Path path2 = new Path();
        int i3 = lineForOffset;
        while (i3 <= min) {
            try {
                RectF rectF = new RectF(layout2.getLineLeft(i3), layout2.getLineTop(i3) + 1, layout2.getLineRight(i3), layout2.getLineBottom(i3) - (i3 == layout.getLineCount() + i2 ? 0.0f : layout.getSpacingAdd()));
                float[] fArr = {rectF.height() / 2.0f, rectF.width() / 2.0f, this.a};
                amkq.E(true);
                float f = fArr[0];
                for (int i4 = 1; i4 < 3; i4++) {
                    f = Math.min(f, fArr[i4]);
                }
                if (i3 == lineForOffset) {
                    float primaryHorizontal = layout2.getPrimaryHorizontal(spanStart);
                    if (isRtlCharAt) {
                        rectF.right = primaryHorizontal;
                    } else {
                        rectF.left = primaryHorizontal;
                    }
                    if (!isRtlCharAt) {
                        g = g(rectF, f);
                    } else {
                        g = h(rectF, f);
                    }
                    if (!isRtlCharAt) {
                        i = i(f);
                    } else {
                        i = j(f);
                    }
                    path2.addRoundRect(g, i, Path.Direction.CW);
                }
                if (i3 == min) {
                    if (spanEnd < layout2.getLineEnd(min)) {
                        int length = spanned.length();
                        if (length != 0) {
                            int i5 = length - 1;
                            if (((dud[]) spanned.getSpans(i5, i5, dud.class)).length > 0) {
                            }
                        }
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(spanEnd);
                        if (isRtlCharAt) {
                            rectF.left = primaryHorizontal2;
                        } else {
                            rectF.right = primaryHorizontal2;
                        }
                    }
                    if (!isRtlCharAt) {
                        h = h(rectF, f);
                    } else {
                        h = g(rectF, f);
                    }
                    if (!isRtlCharAt) {
                        j = j(f);
                    } else {
                        j = i(f);
                    }
                    path2.addRoundRect(h, j, Path.Direction.CW);
                }
                path2.addRect(rectF, Path.Direction.CW);
                path = path2;
            } catch (IndexOutOfBoundsException e) {
                int length2 = spanned.length();
                int lineCount = layout.getLineCount();
                int length3 = spanned.getSpans(0, spanned.length(), Object.class).length;
                int length4 = ((ImageSpan[]) spanned.getSpans(0, spanned.length(), ImageSpan.class)).length;
                path = path2;
                int length5 = ((sqe[]) spanned.getSpans(0, spanned.length(), sqe.class)).length;
                StringBuilder sb = new StringBuilder(180);
                sb.append("IOOBDiagnostics: line:");
                sb.append(i3);
                sb.append(" tl:");
                sb.append(length2);
                sb.append(" lc:");
                sb.append(lineCount);
                sb.append(" so:");
                sb.append(spanStart);
                sb.append(" eo:");
                sb.append(spanEnd);
                sb.append(" fl:");
                sb.append(lineForOffset);
                sb.append(" ll:");
                sb.append(min);
                sb.append(" rtl:");
                sb.append(isRtlCharAt);
                sb.append(" sp:");
                sb.append(length3);
                sb.append(" isp:");
                sb.append(length4);
                sb.append(" esp:");
                sb.append(length5);
                this.c.d(28, sb.toString(), e);
            }
            i3++;
            layout2 = layout;
            path2 = path;
            i2 = -1;
        }
        return path2;
    }

    @Override // defpackage.sqe
    public final void a(Canvas canvas) {
    }

    @Override // defpackage.sqe
    public final void b(Canvas canvas) {
        Path path = this.d;
        if (path != null) {
            canvas.drawPath(path, this.b);
        }
    }

    @Override // defpackage.sqe
    public final void c(Layout layout, CharSequence charSequence) {
        this.d = k(layout);
    }

    @Override // defpackage.sqe
    public final void d() {
        this.d = null;
    }
}
