package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class allj extends FrameLayout {
    private static final View.OnTouchListener e = new gpm(7);
    public int a;
    public final float b;
    public allg c;
    public allg d;
    private final float f;
    private ColorStateList g;
    private PorterDuff.Mode h;

    /* JADX INFO: Access modifiers changed from: protected */
    public allj(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        allg allgVar = this.d;
        if (allgVar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = allgVar.a.f.getRootWindowInsets()) != null) {
            allgVar.a.l = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            allgVar.a.j();
        }
        jw.K(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        allg allgVar = this.d;
        if (allgVar != null) {
            allk allkVar = allgVar.a;
            allr a = allr.a();
            allg allgVar2 = allkVar.o;
            synchronized (a.a) {
                z = true;
                if (!a.g(allgVar2) && !a.h(allgVar2)) {
                    z = false;
                }
            }
            if (z) {
                allk.b.post(new allf(allgVar, null));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        allg allgVar = this.c;
        if (allgVar != null) {
            allk allkVar = allgVar.a;
            allkVar.f.c = null;
            allkVar.i();
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.g != null) {
            drawable = gl.c(drawable.mutate());
            drawable.setTintList(this.g);
            drawable.setTintMode(this.h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        if (getBackground() != null) {
            Drawable c = gl.c(getBackground().mutate());
            c.setTintList(colorStateList);
            c.setTintMode(this.h);
            if (c != getBackground()) {
                super.setBackgroundDrawable(c);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        if (getBackground() != null) {
            Drawable c = gl.c(getBackground().mutate());
            c.setTintMode(mode);
            if (c != getBackground()) {
                super.setBackgroundDrawable(c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public allj(Context context, AttributeSet attributeSet) {
        super(aloa.a(context, attributeSet, 0, 0), attributeSet);
        Drawable c;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, allm.a);
        if (obtainStyledAttributes.hasValue(6)) {
            jw.S(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.a = obtainStyledAttributes.getInt(2, 0);
        float f = obtainStyledAttributes.getFloat(3, 1.0f);
        this.f = f;
        setBackgroundTintList(alkd.e(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(alkd.s(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.b = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(e);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(akwg.s(alkd.j(this, R.attr.colorSurface), alkd.j(this, R.attr.colorOnSurface), f));
            if (this.g != null) {
                c = gl.c(gradientDrawable);
                c.setTintList(this.g);
            } else {
                c = gl.c(gradientDrawable);
            }
            jw.O(this, c);
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : e);
        super.setOnClickListener(onClickListener);
    }
}
