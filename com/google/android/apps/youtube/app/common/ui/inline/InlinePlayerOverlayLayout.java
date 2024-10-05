package com.google.android.apps.youtube.app.common.ui.inline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.youtube.R;
import defpackage.fav;
import defpackage.fgp;
import defpackage.fha;
import defpackage.fhg;
import defpackage.gfs;
import defpackage.jw;
import defpackage.zby;
import defpackage.zcd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InlinePlayerOverlayLayout extends gfs implements fgp {
    public zcd a;
    int b;
    int c;
    public ViewGroup d;
    private float e;
    private fha f;
    private boolean g;

    public InlinePlayerOverlayLayout(Context context) {
        super(context);
        c(context);
    }

    private static final void h(View view, int i, int i2, float f, float f2) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(i);
        view.setTranslationY(i2);
        view.setScaleX(f);
        view.setScaleY(f2);
    }

    private static final void i(View view) {
        ViewGroup viewGroup;
        int childCount;
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) parent).getChildCount()) <= 1 || view == viewGroup.getChildAt(childCount - 1)) {
            return;
        }
        parent.bringChildToFront(view);
    }

    final void c(Context context) {
        this.e = context.getResources().getFraction(R.fraction.aspect_ratio_16_9_exact, 1, 1);
        this.f = new fha();
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.save();
        canvas.clipRect(this.a.d.b);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void f() {
        float f;
        if (g()) {
            zby zbyVar = this.a.d;
            if (!zbyVar.e()) {
                setVisibility(8);
                return;
            }
            Rect rect = zbyVar.a;
            int i = rect.left;
            int i2 = rect.top;
            if (this.g || (rect.width() == this.b && rect.height() == this.c)) {
                f = 1.0f;
            } else {
                float width = this.b == 0 ? 1.0f : rect.width() / this.b;
                r5 = this.c != 0 ? rect.height() / this.c : 1.0f;
                this.b = rect.width();
                this.c = rect.height();
                if (!jw.ak(this)) {
                    requestLayout();
                }
                f = r5;
                r5 = width;
            }
            if (getVisibility() == 8) {
                setVisibility(0);
            }
            i(this.d);
            i(this);
            this.f.a(this.b, this.c, false);
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                h(getChildAt(i3), i, i2, r5, f);
            }
        }
    }

    public final boolean g() {
        return getChildCount() > 0;
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        boolean z = this.g;
        boolean b = fhgVar.b();
        this.g = b;
        if (z != b && b) {
            requestLayout();
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        f();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (z || childAt.getVisibility() != 8) {
                if (childAt == this.d) {
                    childAt.layout(0, 0, i3 - i, i4 - i2);
                } else {
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int round;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.g) {
            round = View.MeasureSpec.getSize(i2);
        } else {
            round = Math.round(size / this.e);
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int i4 = this.b;
            if (i4 <= 0 || this.c <= 0 || this.g) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(round, 1073741824));
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        f();
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        h(view, 0, 0, 1.0f, 1.0f);
    }

    InlinePlayerOverlayLayout(Context context, float f, zcd zcdVar) {
        super(context);
        this.e = f;
        this.a = zcdVar;
        this.f = new fha();
    }

    public InlinePlayerOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }

    public InlinePlayerOverlayLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context);
    }
}
