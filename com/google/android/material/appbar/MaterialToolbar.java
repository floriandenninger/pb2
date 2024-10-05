package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.alfo;
import defpackage.alig;
import defpackage.alkd;
import defpackage.alkg;
import defpackage.aloa;
import defpackage.gl;
import defpackage.jw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {
    private Integer v;
    private boolean w;
    private boolean x;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    private final void G(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        alkd.B(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.w || this.x) {
            TextView t = alkd.t(this, this.n);
            TextView t2 = alkd.t(this, this.o);
            if (t == null && t2 == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int i5 = measuredWidth / 2;
            int paddingLeft = getPaddingLeft();
            int paddingRight = measuredWidth - getPaddingRight();
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8 && childAt != t && childAt != t2) {
                    if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                        paddingLeft = childAt.getRight();
                    }
                    if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                        paddingRight = childAt.getLeft();
                    }
                }
            }
            Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
            if (this.w && t != null) {
                G(t, pair);
            }
            if (!this.x || t2 == null) {
                return;
            }
            G(t2, pair);
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void q(Drawable drawable) {
        if (drawable != null && this.v != null) {
            drawable = gl.c(drawable.mutate());
            drawable.setTint(this.v.intValue());
        }
        super.q(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        alkd.A(this, f);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(aloa.a(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        Context context2 = getContext();
        TypedArray a = alig.a(context2, attributeSet, alfo.e, i, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (a.hasValue(0)) {
            this.v = Integer.valueOf(a.getColor(0, -1));
            Drawable e = e();
            if (e != null) {
                q(e);
            }
        }
        this.w = a.getBoolean(2, false);
        this.x = a.getBoolean(1, false);
        a.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            alkg alkgVar = new alkg();
            alkgVar.l(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            alkgVar.j(context2);
            alkgVar.k(jw.a(this));
            jw.O(this, alkgVar);
        }
    }
}
