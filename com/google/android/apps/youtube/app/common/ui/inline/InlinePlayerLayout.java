package com.google.android.apps.youtube.app.common.ui.inline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import com.google.android.youtube.R;
import defpackage.amkq;
import defpackage.fav;
import defpackage.fgp;
import defpackage.fha;
import defpackage.fhg;
import defpackage.flr;
import defpackage.ggh;
import defpackage.jw;
import defpackage.zby;
import defpackage.zcd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InlinePlayerLayout extends ViewGroup implements fgp, flr {
    public EdgeEffect a;
    public EdgeEffect b;
    public final zcd c;
    public final fha d;
    public InlinePlayerOverlayLayout e;
    int f;
    int g;
    private final float h;
    private View i;
    private boolean j;

    InlinePlayerLayout(Context context, float f, zcd zcdVar) {
        super(context);
        this.h = f;
        this.c = zcdVar;
        this.d = new fha();
        h();
    }

    private final void g() {
        setVisibility(8);
    }

    private final void h() {
        this.c.c = new ggh(this);
    }

    private static final void i(View view, int i, int i2, float f, float f2) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationX(i);
        view.setTranslationY(i2);
        view.setScaleX(f);
        view.setScaleY(f2);
    }

    @Override // defpackage.flr
    public final void a(View view) {
        InlinePlayerOverlayLayout inlinePlayerOverlayLayout = this.e;
        if (inlinePlayerOverlayLayout == null) {
            addView(view);
        } else {
            inlinePlayerOverlayLayout.addView(view);
        }
    }

    @Override // defpackage.flr
    public final void b(View view, View view2) {
        amkq.N(!f());
        view.getClass();
        this.i = view;
        addView(view, 0);
        InlinePlayerOverlayLayout inlinePlayerOverlayLayout = this.e;
        if (inlinePlayerOverlayLayout == null) {
            addView(view2, 1);
        } else {
            inlinePlayerOverlayLayout.addView(view2);
        }
    }

    @Override // defpackage.flr
    public final void c(View view, View view2) {
        if (view != this.i) {
            return;
        }
        amkq.N(f());
        InlinePlayerOverlayLayout inlinePlayerOverlayLayout = this.e;
        if (inlinePlayerOverlayLayout == null) {
            removeView(view2);
        } else {
            inlinePlayerOverlayLayout.removeView(view2);
        }
        removeView(this.i);
        this.i = null;
        g();
    }

    @Override // defpackage.flr
    public final void d(View view) {
        InlinePlayerOverlayLayout inlinePlayerOverlayLayout = this.e;
        if (inlinePlayerOverlayLayout == null) {
            removeView(view);
        } else {
            inlinePlayerOverlayLayout.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.save();
        canvas.clipRect(this.c.d.b);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        float f;
        if (f()) {
            zby zbyVar = this.c.d;
            if (zbyVar.e()) {
                Rect rect = zbyVar.a;
                int i = rect.left;
                int i2 = rect.top;
                if (this.j || (rect.width() == this.f && rect.height() == this.g)) {
                    f = 1.0f;
                } else {
                    float width = this.f == 0 ? 1.0f : rect.width() / this.f;
                    r4 = this.g != 0 ? rect.height() / this.g : 1.0f;
                    this.f = rect.width();
                    this.g = rect.height();
                    if (!jw.ak(this)) {
                        requestLayout();
                    }
                    f = r4;
                    r4 = width;
                }
                if (getVisibility() == 8) {
                    setVisibility(0);
                }
                this.d.a(this.f, this.g, false);
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    View view = this.i;
                    if (childAt == view) {
                        view.setPivotX(0.0f);
                        this.i.setPivotY(0.0f);
                        this.i.setTranslationX(i);
                        this.i.setTranslationY(i2);
                    } else {
                        i(childAt, i, i2, r4, f);
                    }
                }
                return;
            }
            g();
        }
    }

    public final boolean f() {
        return this.i != null;
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        boolean z = this.j;
        boolean b = fhgVar.b();
        this.j = b;
        if (z != b && b) {
            requestLayout();
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        EdgeEffect edgeEffect = this.a;
        boolean z = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && this.a.draw(canvas)) {
            z = true;
        }
        EdgeEffect edgeEffect2 = this.b;
        if (edgeEffect2 != null && !edgeEffect2.isFinished()) {
            int save = canvas.save();
            canvas.rotate(180.0f);
            canvas.translate(-getWidth(), -getHeight());
            z |= this.b.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EdgeEffect edgeEffect = this.a;
        if (edgeEffect != null) {
            edgeEffect.setSize(i3 - i, i4 - i2);
        }
        EdgeEffect edgeEffect2 = this.b;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize(i3 - i, i4 - i2);
        }
        e();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (z || childAt.getVisibility() != 8) {
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int round;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.j) {
            round = View.MeasureSpec.getSize(i2);
        } else {
            round = Math.round(size / this.h);
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int i4 = this.f;
            if (i4 <= 0 || this.g <= 0 || this.j) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(round, 1073741824));
            } else {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(this.g, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        e();
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        i(view, 0, 0, 1.0f, 1.0f);
    }

    @Override // android.view.View, defpackage.flr
    public final void setAlpha(float f) {
    }

    public InlinePlayerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = context.getResources().getFraction(R.fraction.aspect_ratio_16_9_exact, 1, 1);
        this.c = new zcd(this);
        this.d = new fha();
        h();
    }
}
