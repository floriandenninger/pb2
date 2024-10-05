package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.youtube.R;
import defpackage.aeg;
import defpackage.ahd;
import defpackage.ahe;
import defpackage.ahh;
import defpackage.aih;
import defpackage.alet;
import defpackage.algv;
import defpackage.algw;
import defpackage.algy;
import defpackage.alhe;
import defpackage.alhf;
import defpackage.alhg;
import defpackage.alhp;
import defpackage.alhq;
import defpackage.alhr;
import defpackage.alht;
import defpackage.alhx;
import defpackage.alig;
import defpackage.alik;
import defpackage.aljx;
import defpackage.alkd;
import defpackage.alkg;
import defpackage.alkl;
import defpackage.alkw;
import defpackage.aloa;
import defpackage.gl;
import defpackage.gn;
import defpackage.jw;
import defpackage.sq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FloatingActionButton extends alik implements algv, alkw, ahd {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private final sq m;
    private final algw n;
    private alhp o;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class BaseBehavior extends ahe {
        private Rect a;
        private boolean b;

        public BaseBehavior() {
            this.b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, alht.c);
            this.b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        private static boolean v(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ahh) {
                return ((ahh) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean w(View view, FloatingActionButton floatingActionButton) {
            return this.b && ((ahh) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.d == 0;
        }

        private final boolean x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!w(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            alhx.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.e()) {
                floatingActionButton.e();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        private final boolean y(View view, FloatingActionButton floatingActionButton) {
            if (!w(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ahh) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.e();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        @Override // defpackage.ahe
        public final void a(ahh ahhVar) {
            if (ahhVar.h == 0) {
                ahhVar.h = 80;
            }
        }

        @Override // defpackage.ahe
        public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                x(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
                return false;
            }
            if (!v(view2)) {
                return false;
            }
            y(view2, floatingActionButton);
            return false;
        }

        @Override // defpackage.ahe
        public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
            int i2;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List h = coordinatorLayout.h(floatingActionButton);
            int size = h.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) h.get(i4);
                if (view2 instanceof AppBarLayout) {
                    if (x(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (v(view2) && y(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.l(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            ahh ahhVar = (ahh) floatingActionButton.getLayoutParams();
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ahhVar.rightMargin) {
                i2 = rect.right;
            } else {
                i2 = floatingActionButton.getLeft() <= ahhVar.leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ahhVar.bottomMargin) {
                i3 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ahhVar.topMargin) {
                i3 = -rect.top;
            }
            if (i3 != 0) {
                jw.E(floatingActionButton, i3);
            }
            if (i2 == 0) {
                return true;
            }
            jw.D(floatingActionButton, i2);
            return true;
        }

        @Override // defpackage.ahe
        public final /* bridge */ /* synthetic */ boolean s(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class Behavior extends BaseBehavior {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private final int h(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i == 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return h(1);
        }
        return h(0);
    }

    private static int i(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private final alhp j() {
        if (this.o == null) {
            this.o = new alhr(this, new alhe(this));
        }
        return this.o;
    }

    @Override // defpackage.ahd
    public final ahe a() {
        return new Behavior();
    }

    public final int b() {
        return h(this.i);
    }

    @Override // defpackage.alkw
    public final void c(alkl alklVar) {
        j().h(alklVar);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        alhp j = j();
        getDrawableState();
        if (Build.VERSION.SDK_INT == 21) {
            alhr alhrVar = (alhr) j;
            if (!alhrVar.x.isEnabled()) {
                alhrVar.x.setElevation(0.0f);
                alhrVar.x.setTranslationZ(0.0f);
                return;
            }
            alhrVar.x.setElevation(alhrVar.n);
            if (alhrVar.x.isPressed()) {
                alhrVar.x.setTranslationZ(alhrVar.p);
            } else if (alhrVar.x.isFocused() || alhrVar.x.isHovered()) {
                alhrVar.x.setTranslationZ(alhrVar.o);
            } else {
                alhrVar.x.setTranslationZ(0.0f);
            }
        }
    }

    final void e() {
        alhp j = j();
        if (j.x.getVisibility() == 0) {
            if (j.w == 1) {
                return;
            }
        } else if (j.w != 2) {
            return;
        }
        Animator animator = j.r;
        if (animator != null) {
            animator.cancel();
        }
        if (j.m()) {
            alet aletVar = j.t;
            AnimatorSet b = aletVar != null ? j.b(aletVar, 0.0f, 0.0f, 0.0f) : j.c(0.0f, 0.4f, 0.4f);
            b.addListener(new alhf(j));
            b.start();
            return;
        }
        j.x.g(4, false);
    }

    final void f() {
        alhp j = j();
        if (j.x.getVisibility() != 0) {
            if (j.w == 2) {
                return;
            }
        } else if (j.w != 1) {
            return;
        }
        Animator animator = j.r;
        if (animator != null) {
            animator.cancel();
        }
        alet aletVar = j.s;
        if (!j.m()) {
            j.x.g(0, false);
            j.x.setAlpha(1.0f);
            j.x.setScaleY(1.0f);
            j.x.setScaleX(1.0f);
            j.g(1.0f);
            return;
        }
        if (j.x.getVisibility() != 0) {
            j.x.setAlpha(0.0f);
            FloatingActionButton floatingActionButton = j.x;
            float f = aletVar == null ? 0.4f : 0.0f;
            floatingActionButton.setScaleY(f);
            j.x.setScaleX(f);
            j.g(f);
        }
        alet aletVar2 = j.s;
        AnimatorSet b = aletVar2 != null ? j.b(aletVar2, 1.0f, 1.0f, 1.0f) : j.c(1.0f, 1.0f, 1.0f);
        b.addListener(new alhg(j));
        b.start();
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        j();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        alhp j = j();
        alkg alkgVar = j.i;
        if (alkgVar != null) {
            alkd.C(j.x, alkgVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        alhp j = j();
        j.x.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = j.y;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int b = b();
        this.a = (b - this.k) / 2;
        j().j();
        int min = Math.min(i(b, i), i(b, i2));
        setMeasuredDimension(this.c.left + min + this.c.right, min + this.c.top + this.c.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.d);
        algw algwVar = this.n;
        Bundle bundle = (Bundle) extendableSavedState.a.get("expandableWidgetHelper");
        gn.g(bundle);
        algwVar.b = bundle.getBoolean("expanded", false);
        algwVar.c = bundle.getInt("expandedComponentIdHint", 0);
        if (algwVar.b) {
            ViewParent parent = algwVar.a.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).i(algwVar.a);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        aeg aegVar = extendableSavedState.a;
        algw algwVar = this.n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", algwVar.b);
        bundle.putInt("expandedComponentIdHint", algwVar.c);
        aegVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            if (jw.al(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                rect.left += this.c.left;
                rect.top += this.c.top;
                rect.right -= this.c.right;
                rect.bottom -= this.c.bottom;
                if (!this.l.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            alhp j = j();
            alkg alkgVar = j.i;
            if (alkgVar != null) {
                alkgVar.setTintList(colorStateList);
            }
            algy algyVar = j.k;
            if (algyVar != null) {
                algyVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            alkg alkgVar = j().i;
            if (alkgVar != null) {
                alkgVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        j().k(f);
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            j().i();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.m.c(i);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        gl.d(drawable);
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        j();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        j();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        j();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        j();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        j();
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(aloa.a(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        boolean z;
        alet aletVar;
        Drawable drawable;
        Drawable drawable2;
        this.c = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray a = alig.a(context2, attributeSet, alht.b, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.e = alkd.e(context2, a, 1);
        this.f = alkd.s(a.getInt(2, -1), null);
        this.g = alkd.e(context2, a, 12);
        this.i = a.getInt(7, -1);
        this.j = a.getDimensionPixelSize(6, 0);
        this.h = a.getDimensionPixelSize(3, 0);
        float dimension = a.getDimension(4, 0.0f);
        float dimension2 = a.getDimension(9, 0.0f);
        float dimension3 = a.getDimension(11, 0.0f);
        this.b = a.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        this.k = a.getDimensionPixelSize(10, 0);
        alet a2 = alet.a(context2, a, 15);
        alet a3 = alet.a(context2, a, 8);
        alkl a4 = alkl.c(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, alkl.a).a();
        boolean z2 = a.getBoolean(5, false);
        setEnabled(a.getBoolean(0, true));
        a.recycle();
        sq sqVar = new sq(this);
        this.m = sqVar;
        sqVar.b(attributeSet, i);
        this.n = new algw(this);
        j().h(a4);
        alhp j = j();
        ColorStateList colorStateList = this.e;
        PorterDuff.Mode mode = this.f;
        ColorStateList colorStateList2 = this.g;
        int i2 = this.h;
        alhr alhrVar = (alhr) j;
        alkl alklVar = alhrVar.h;
        gn.g(alklVar);
        alhrVar.i = new alhq(alklVar);
        alhrVar.i.setTintList(colorStateList);
        if (mode != null) {
            alhrVar.i.setTintMode(mode);
        }
        alhrVar.i.j(alhrVar.x.getContext());
        if (i2 > 0) {
            Context context3 = alhrVar.x.getContext();
            alkl alklVar2 = alhrVar.h;
            gn.g(alklVar2);
            algy algyVar = new algy(alklVar2);
            int d = aih.d(context3, R.color.design_fab_stroke_top_outer_color);
            int d2 = aih.d(context3, R.color.design_fab_stroke_top_inner_color);
            z = z2;
            int d3 = aih.d(context3, R.color.design_fab_stroke_end_inner_color);
            aletVar = a3;
            int d4 = aih.d(context3, R.color.design_fab_stroke_end_outer_color);
            algyVar.c = d;
            algyVar.d = d2;
            algyVar.e = d3;
            algyVar.f = d4;
            float f = i2;
            if (algyVar.b != f) {
                algyVar.b = f;
                algyVar.a.setStrokeWidth(f * 1.3333f);
                algyVar.g = true;
                algyVar.invalidateSelf();
            }
            algyVar.b(colorStateList);
            alhrVar.k = algyVar;
            algy algyVar2 = alhrVar.k;
            gn.g(algyVar2);
            alkg alkgVar = alhrVar.i;
            gn.g(alkgVar);
            drawable2 = new LayerDrawable(new Drawable[]{algyVar2, alkgVar});
            drawable = null;
        } else {
            z = z2;
            aletVar = a3;
            drawable = null;
            alhrVar.k = null;
            drawable2 = alhrVar.i;
        }
        alhrVar.j = new RippleDrawable(aljx.b(colorStateList2), drawable2, drawable);
        alhrVar.l = alhrVar.j;
        j().q = dimensionPixelSize;
        alhp j2 = j();
        if (j2.n != dimension) {
            j2.n = dimension;
            j2.f(dimension, j2.o, j2.p);
        }
        alhp j3 = j();
        if (j3.o != dimension2) {
            j3.o = dimension2;
            j3.f(j3.n, dimension2, j3.p);
        }
        alhp j4 = j();
        if (j4.p != dimension3) {
            j4.p = dimension3;
            j4.f(j4.n, j4.o, dimension3);
        }
        alhp j5 = j();
        int i3 = this.k;
        if (j5.v != i3) {
            j5.v = i3;
            j5.i();
        }
        j().s = a2;
        j().t = aletVar;
        j().m = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
