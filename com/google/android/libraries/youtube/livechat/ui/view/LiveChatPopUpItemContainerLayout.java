package com.google.android.libraries.youtube.livechat.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import defpackage.abpj;
import defpackage.abpq;
import defpackage.zay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class LiveChatPopUpItemContainerLayout extends FrameLayout {
    public final OverScroller a;
    public int b;
    public boolean c;
    public abpj d;
    private final int e;
    private final zay f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private ValueAnimator k;
    private final Runnable l;

    public LiveChatPopUpItemContainerLayout(Context context) {
        this(context, null);
    }

    private final boolean b(float f) {
        return getChildCount() > 0 && f >= ((float) (-getScrollY())) && f <= ((float) (getChildAt(0).getHeight() - getScrollY()));
    }

    public final void a(int i) {
        this.i = i;
        setScrollY(i);
    }

    @Override // android.view.ViewGroup
    protected final void measureChild(View view, int i, int i2) {
        view.measure(i, 0);
    }

    @Override // android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r0 != 3) goto L26;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto Le
            boolean r0 = r4.j
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return r2
        Le:
            float r0 = r5.getY()
            boolean r0 = r4.b(r0)
            r3 = 0
            if (r0 != 0) goto L25
            int r5 = r4.getScrollY()
            int r0 = r4.i
            if (r5 >= r0) goto L24
            r4.setScrollY(r0)
        L24:
            return r3
        L25:
            int r0 = r5.getActionMasked()
            if (r0 == 0) goto L56
            if (r0 == r2) goto L4e
            if (r0 == r1) goto L33
            r1 = 3
            if (r0 == r1) goto L4e
            goto L67
        L33:
            zay r0 = r4.f
            r0.d(r5)
            float r5 = r5.getY()
            int r5 = (int) r5
            int r0 = r4.g
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r4.e
            if (r0 <= r1) goto L67
            r4.j = r2
            r4.g = r5
            goto L67
        L4e:
            zay r0 = r4.f
            r0.d(r5)
            r4.j = r3
            goto L67
        L56:
            zay r0 = r4.f
            r0.g(r5)
            zay r0 = r4.f
            r0.d(r5)
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.g = r5
        L67:
            boolean r5 = r4.j
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.livechat.ui.view.LiveChatPopUpItemContainerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, 0, ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.livechat.ui.view.LiveChatPopUpItemContainerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public LiveChatPopUpItemContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveChatPopUpItemContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new abpq(this);
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f = new zay(context);
        this.a = new OverScroller(context);
    }
}
