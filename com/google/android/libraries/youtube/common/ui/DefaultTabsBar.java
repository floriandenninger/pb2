package com.google.android.libraries.youtube.common.ui;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import defpackage.byg;
import defpackage.jw;
import defpackage.whu;
import defpackage.yjk;
import defpackage.yzq;
import defpackage.zau;
import defpackage.zbm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DefaultTabsBar extends yzq implements byg {
    public int a;
    protected zau b;
    private LayoutInflater c;
    private int d;
    private int e;
    private int f;
    private int g;
    private float m;
    private Rect n;
    private Paint o;
    private int p;
    private int q;
    private ColorStateList r;

    public DefaultTabsBar(Context context) {
        super(context);
        d(context, null);
    }

    private final void d(Context context, AttributeSet attributeSet) {
        this.c = LayoutInflater.from(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zbm.g);
        this.p = obtainStyledAttributes.getDimensionPixelSize(4, yjk.K(displayMetrics, 48));
        o(obtainStyledAttributes.getColorStateList(1));
        this.q = obtainStyledAttributes.getDimensionPixelSize(3, yjk.K(displayMetrics, 2));
        int color = obtainStyledAttributes.getColor(2, resources.getColor(R.color.white));
        this.d = obtainStyledAttributes.getResourceId(5, com.google.android.youtube.R.layout.tabs_bar_text_tab);
        this.e = obtainStyledAttributes.getResourceId(6, com.google.android.youtube.R.id.text);
        this.f = obtainStyledAttributes.getResourceId(0, com.google.android.youtube.R.layout.tabs_bar_image_tab);
        obtainStyledAttributes.recycle();
        this.n = new Rect();
        Paint paint = new Paint();
        this.o = paint;
        paint.setStyle(Paint.Style.FILL);
        this.o.setColor(color);
        setFillViewport(true);
    }

    @Override // defpackage.byg
    public final void a(int i) {
    }

    @Override // defpackage.byg
    public final void b(int i, float f, int i2) {
        q(i, f, true);
    }

    @Override // defpackage.byg
    public final void c(int i) {
        m(i, false);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == this.h && j() != 0) {
            View k = k(this.g);
            int left = k.getLeft();
            int right = k.getRight();
            int i = jw.e(this) == 1 ? this.g - 1 : this.g + 1;
            if (this.m > 0.0f && i >= 0 && i < j()) {
                View k2 = k(i);
                left += Math.round((k2.getLeft() - left) * this.m);
                right += Math.round((k2.getRight() - right) * this.m);
            }
            canvas.drawRect(left, this.n.top, right, this.n.bottom, this.o);
        }
        return drawChild;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(View view, ColorStateList colorStateList) {
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(colorStateList);
        }
    }

    public final View g(int i, boolean z, CharSequence charSequence) {
        ImageView imageView = (ImageView) this.c.inflate(this.f, (ViewGroup) this.h, false);
        imageView.setImageResource(i);
        ColorStateList colorStateList = this.r;
        if (colorStateList != null) {
            f(imageView, colorStateList);
        }
        imageView.setContentDescription(charSequence);
        s(imageView);
        whu.O(imageView, z, this.a, this.b);
        return imageView;
    }

    public final View h(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        View inflate = this.c.inflate(this.d, (ViewGroup) this.h, false);
        TextView textView = (TextView) inflate.findViewById(this.e);
        ColorStateList colorStateList = this.r;
        if (colorStateList != null) {
            f(textView, colorStateList);
        }
        textView.setText(charSequence);
        inflate.setContentDescription(charSequence2);
        whu.O(inflate, z, this.a, this.b);
        s(inflate);
        return inflate;
    }

    @Override // defpackage.yzq
    protected final void i(int i, boolean z) {
        View k;
        if (i < 0 || i >= j() || (k = k(i)) == null) {
            return;
        }
        k.setActivated(z);
        k.setSelected(z);
        whu.O(k, false, this.a, this.b);
    }

    @Override // defpackage.yzq
    public final void lf() {
        super.lf();
        this.g = 0;
        this.m = 0.0f;
    }

    public final void o(ColorStateList colorStateList) {
        colorStateList.getClass();
        this.r = colorStateList;
        for (int i = 0; i < j(); i++) {
            View k = k(i);
            View findViewById = k.findViewById(this.e);
            if (findViewById == null) {
                findViewById = k.findViewById(com.google.android.youtube.R.id.image);
            }
            f(findViewById, this.r);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i4 - i2;
        this.n.set(0, i5 - this.q, i3 - i, i5);
    }

    public final void p(int i) {
        this.o.setColor(i);
        invalidate(this.n);
    }

    public final void q(int i, float f, boolean z) {
        View k;
        this.g = i;
        this.m = f;
        invalidate(this.n);
        if (!z || (k = k(i)) == null) {
            return;
        }
        scrollTo((k.getLeft() + ((int) (k.getWidth() * f))) - (i != 0 ? this.p : (int) (this.p * f)), 0);
    }

    public final void r(CharSequence charSequence, CharSequence charSequence2) {
        h(charSequence, charSequence2, false);
    }

    protected final void s(View view) {
        n(view, true);
        if (j() == 1) {
            m(0, false);
            q(this.i, 0.0f, false);
        }
    }

    public DefaultTabsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }

    public DefaultTabsBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d(context, attributeSet);
    }
}
