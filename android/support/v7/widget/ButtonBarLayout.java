package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import defpackage.jw;
import defpackage.nx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    private boolean a;
    private int b;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nx.k);
        jw.L(this, context, nx.k, attributeSet, obtainStyledAttributes, 0, 0);
        this.a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private final int a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final void b(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(true != z ? 80 : 8388613);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(true != z ? 4 : 8);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    private final boolean c() {
        return getOrientation() == 1;
    }

    @Override // android.view.View
    public final int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x004d, code lost:
    
        if (r1 != false) goto L24;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            boolean r1 = r5.a
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = r5.b
            if (r0 <= r1) goto L16
            boolean r1 = r5.c()
            if (r1 == 0) goto L16
            r5.b(r2)
        L16:
            r5.b = r0
        L18:
            boolean r1 = r5.c()
            r3 = 1
            if (r1 != 0) goto L2f
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r1 != r4) goto L2f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r1 = 1
            goto L31
        L2f:
            r0 = r6
            r1 = 0
        L31:
            super.onMeasure(r0, r7)
            boolean r0 = r5.a
            if (r0 == 0) goto L4d
            boolean r0 = r5.c()
            if (r0 != 0) goto L4d
            int r0 = r5.getMeasuredWidthAndState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r0 != r4) goto L4d
            r5.b(r3)
            goto L4f
        L4d:
            if (r1 == 0) goto L52
        L4f:
            super.onMeasure(r6, r7)
        L52:
            int r6 = r5.a(r2)
            if (r6 < 0) goto L9d
            android.view.View r7 = r5.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r5.getPaddingTop()
            int r7 = r7.getMeasuredHeight()
            int r1 = r1 + r7
            int r7 = r0.topMargin
            int r1 = r1 + r7
            int r7 = r0.bottomMargin
            int r2 = r1 + r7
            boolean r7 = r5.c()
            if (r7 == 0) goto L98
            int r6 = r6 + r3
            int r6 = r5.a(r6)
            if (r6 < 0) goto L9d
            android.view.View r6 = r5.getChildAt(r6)
            int r6 = r6.getPaddingTop()
            android.content.res.Resources r7 = r5.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            r0 = 1098907648(0x41800000, float:16.0)
            float r7 = r7 * r0
            int r7 = (int) r7
            int r6 = r6 + r7
            goto L9c
        L98:
            int r6 = r5.getPaddingBottom()
        L9c:
            int r2 = r2 + r6
        L9d:
            int r6 = defpackage.jw.f(r5)
            if (r6 == r2) goto La6
            r5.setMinimumHeight(r2)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ButtonBarLayout.onMeasure(int, int):void");
    }
}
