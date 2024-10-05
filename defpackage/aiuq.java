package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiuq extends View {
    public StaticLayout a;
    public StaticLayout b;
    public final Layout.Alignment c;
    private final TextPaint d;
    private final TextPaint e;
    private final TextPaint f;
    private final Path g;
    private final Editable h;
    private int i;
    private int j;
    private float k;

    public aiuq(Context context) {
        super(context);
        setLayerType(1, null);
        setId(R.id.subtitle_window_identifier);
        TextPaint textPaint = new TextPaint();
        this.d = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        TextPaint textPaint2 = new TextPaint();
        this.e = textPaint2;
        textPaint2.setAntiAlias(true);
        textPaint2.setColor(0);
        textPaint2.setStyle(Paint.Style.STROKE);
        TextPaint textPaint3 = new TextPaint();
        this.f = textPaint3;
        textPaint3.setAntiAlias(true);
        this.g = new Path();
        this.h = Editable.Factory.getInstance().newEditable("");
        this.c = Layout.Alignment.ALIGN_CENTER;
        this.k = textPaint.getTextSize() * 0.0625f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int h(java.lang.CharSequence r6, int r7) {
        /*
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = r5.getPaddingLeft()
            int r2 = r5.getPaddingRight()
            int r1 = r1 + r2
            int r2 = r5.i
            if (r2 == 0) goto L41
            r3 = 1
            if (r2 == r3) goto L3a
            r4 = 2
            if (r2 == r4) goto L41
            r4 = 3
            if (r2 == r4) goto L41
            r4 = 4
            if (r2 == r4) goto L41
            r4 = 5
            if (r2 != r4) goto L25
            goto L41
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r7[r0] = r1
            java.lang.String r0 = "Edge type %d is not supported."
            java.lang.String r7 = java.lang.String.format(r0, r7)
            r6.<init>(r7)
            throw r6
        L3a:
            android.text.TextPaint r2 = r5.e
            float r6 = android.text.Layout.getDesiredWidth(r6, r2)
            goto L47
        L41:
            android.text.TextPaint r2 = r5.d
            float r6 = android.text.Layout.getDesiredWidth(r6, r2)
        L47:
            int r6 = (int) r6
            int r6 = r6 + r1
            if (r0 != 0) goto L4c
            return r6
        L4c:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L55
            int r6 = java.lang.Math.min(r6, r7)
            return r6
        L55:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiuq.h(java.lang.CharSequence, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int j() {
        /*
            r6 = this;
            int r0 = r6.getPaddingRight()
            int r1 = r6.getPaddingLeft()
            int r0 = r0 + r1
            int r1 = r6.i
            r2 = 0
            if (r1 == 0) goto L35
            r3 = 1
            if (r1 == r3) goto L32
            r4 = 2
            if (r1 == r4) goto L35
            r4 = 3
            if (r1 == r4) goto L35
            r4 = 4
            if (r1 == r4) goto L35
            r4 = 5
            if (r1 != r4) goto L1e
            goto L35
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r2] = r1
            java.lang.String r1 = "Edge type %d is not supported."
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.<init>(r1)
            throw r0
        L32:
            android.text.StaticLayout r1 = r6.b
            goto L37
        L35:
            android.text.StaticLayout r1 = r6.a
        L37:
            if (r1 != 0) goto L3a
            return r0
        L3a:
            int r3 = r1.getLineCount()
            r4 = 0
        L3f:
            if (r2 >= r3) goto L4d
            float r5 = r1.getLineMax(r2)
            int r5 = (int) r5
            int r4 = java.lang.Math.max(r5, r4)
            int r2 = r2 + 1
            goto L3f
        L4d:
            int r4 = r4 + r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiuq.j():int");
    }

    private final StaticLayout k(int i) {
        StaticLayout staticLayout = this.b;
        int h = h(this.h, i);
        if (staticLayout != null && h == staticLayout.getWidth()) {
            return staticLayout;
        }
        SpannableString spannableString = new SpannableString(this.h);
        for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableString.getSpans(0, spannableString.length(), ForegroundColorSpan.class)) {
            spannableString.removeSpan(foregroundColorSpan);
        }
        return new StaticLayout(spannableString, this.e, h, this.c, 1.0f, 0.0f, true);
    }

    private final StaticLayout l(int i) {
        StaticLayout staticLayout = this.a;
        int h = h(this.h, i);
        return (staticLayout == null || h != staticLayout.getWidth()) ? new StaticLayout(this.h, this.d, h, this.c, 1.0f, 0.0f, true) : staticLayout;
    }

    public final void a() {
        this.h.clear();
        setContentDescription(null);
        this.a = null;
        this.b = null;
        setVisibility(8);
    }

    public final void b(int i) {
        this.e.setColor(i);
        invalidate();
    }

    public final void d(CharSequence charSequence) {
        this.h.clear();
        this.h.append(charSequence);
        setContentDescription(charSequence);
        this.a = null;
        this.b = null;
        requestLayout();
        invalidate();
    }

    public final void e(int i) {
        this.d.setColor(i);
        invalidate();
    }

    public final void f(float f) {
        float applyDimension = TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
        this.d.setTextSize(applyDimension);
        this.k = 0.0625f * applyDimension;
        this.e.setTextSize(applyDimension);
        this.e.setStrokeWidth(this.k);
        c(this.i);
        this.b = null;
        this.a = null;
        requestLayout();
        invalidate();
    }

    public final void g(Typeface typeface) {
        this.d.setTypeface(typeface);
        this.e.setTypeface(typeface);
        this.f.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        StaticLayout staticLayout = this.b;
        StaticLayout staticLayout2 = this.a;
        if (TextUtils.isEmpty(this.h) || staticLayout == null || staticLayout2 == null) {
            return;
        }
        if (Color.alpha(this.j) != 0) {
            canvas.drawPath(this.g, this.f);
        }
        if (this.i == 1) {
            staticLayout.draw(canvas);
        }
        staticLayout2.draw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.h);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824);
        this.a = l(makeMeasureSpec);
        this.b = k(makeMeasureSpec);
        StaticLayout staticLayout = this.a;
        if (staticLayout == null) {
            return;
        }
        int lineCount = staticLayout.getLineCount();
        RectF rectF = new RectF();
        this.g.reset();
        for (int i5 = 0; i5 < lineCount; i5++) {
            int lineBottom = staticLayout.getLineBottom(i5);
            rectF.set(staticLayout.getLineLeft(i5) - getPaddingLeft(), staticLayout.getLineTop(i5), staticLayout.getLineRight(i5) + getPaddingRight(), lineBottom);
            this.g.addRect(rectF, Path.Direction.CCW);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.a = l(i);
        this.b = k(i);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, j());
        } else if (mode != 1073741824) {
            size = j();
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, i());
        } else if (mode2 != 1073741824) {
            size2 = i();
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.j = i;
        this.f.setColor(i);
        invalidate();
    }

    private final int i() {
        int i = this.i;
        if (i != 0) {
            if (i == 1) {
                StaticLayout staticLayout = this.b;
                staticLayout.getClass();
                return staticLayout.getHeight();
            }
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                throw new IllegalStateException(String.format("Edge type %d is not supported.", Integer.valueOf(i)));
            }
        }
        StaticLayout staticLayout2 = this.a;
        staticLayout2.getClass();
        return staticLayout2.getHeight();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r0 != 5) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r7) {
        /*
            r6 = this;
            int r0 = r6.i
            r1 = 5
            r2 = 4
            r3 = 2
            r4 = 3
            if (r0 == r3) goto L16
            if (r0 == r4) goto Lf
            if (r0 == r2) goto Lf
            if (r0 == r1) goto L16
            goto L1b
        Lf:
            android.text.TextPaint r0 = r6.d
            r5 = 0
            r0.setMaskFilter(r5)
            goto L1b
        L16:
            android.text.TextPaint r0 = r6.d
            r0.clearShadowLayer()
        L1b:
            if (r7 == 0) goto L7c
            r0 = 1
            if (r7 == r0) goto L7c
            if (r7 == r3) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            r3 = 1091567616(0x41100000, float:9.0)
            r5 = 0
            if (r7 == r4) goto L5f
            if (r7 == r2) goto L4f
            if (r7 == r1) goto L2f
            r7 = 0
            goto L7c
        L2f:
            android.content.res.Resources r0 = r6.getResources()
            android.text.TextPaint r1 = r6.d
            r2 = 2131169406(0x7f07107e, float:1.7953141E38)
            int r2 = r0.getDimensionPixelSize(r2)
            float r2 = (float) r2
            r3 = 2131169407(0x7f07107f, float:1.7953143E38)
            int r0 = r0.getDimensionPixelSize(r3)
            float r0 = (float) r0
            android.text.TextPaint r3 = r6.e
            int r3 = r3.getColor()
            r1.setShadowLayer(r2, r5, r0, r3)
            goto L7c
        L4f:
            android.text.TextPaint r1 = r6.d
            android.graphics.EmbossMaskFilter r2 = new android.graphics.EmbossMaskFilter
            float[] r4 = new float[r4]
            r4 = {x0082: FILL_ARRAY_DATA , data: [-1082130432, -1082130432, 1065353216} // fill-array
            r2.<init>(r4, r5, r3, r0)
            r1.setMaskFilter(r2)
            goto L7c
        L5f:
            android.text.TextPaint r1 = r6.d
            android.graphics.EmbossMaskFilter r2 = new android.graphics.EmbossMaskFilter
            float[] r4 = new float[r4]
            r4 = {x008c: FILL_ARRAY_DATA , data: [1065353216, 1065353216, 1065353216} // fill-array
            r2.<init>(r4, r5, r3, r0)
            r1.setMaskFilter(r2)
            goto L7c
        L6f:
            android.text.TextPaint r0 = r6.d
            float r1 = r6.k
            android.text.TextPaint r2 = r6.e
            int r2 = r2.getColor()
            r0.setShadowLayer(r1, r1, r1, r2)
        L7c:
            r6.i = r7
            r6.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiuq.c(int):void");
    }
}
