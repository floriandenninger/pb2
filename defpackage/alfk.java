package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.youtube.R;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alfk extends FrameLayout {
    private boolean A;
    private int B;
    private boolean C;
    private boolean a;
    private int b;
    final alhw c;
    final algu d;
    public Drawable e;
    public Drawable f;
    int g;
    ko h;
    private ViewGroup i;
    private View j;
    private View k;
    private int l;
    private int m;
    private int n;
    private int o;
    private final Rect p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;
    private ValueAnimator u;
    private long v;
    private int w;
    private alff x;
    private int y;
    private int z;

    public alfk(Context context) {
        this(context, null);
    }

    private static int a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    private final void b(AppBarLayout appBarLayout) {
        if (u()) {
            appBarLayout.e = false;
        }
    }

    private final void d() {
        if (this.a) {
            ViewGroup viewGroup = null;
            this.i = null;
            this.j = null;
            int i = this.b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.i = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.j = view;
                }
            }
            if (this.i == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.i = viewGroup;
            }
            r();
            this.a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alfq g(View view) {
        alfq alfqVar = (alfq) view.getTag(R.id.view_offset_helper);
        if (alfqVar != null) {
            return alfqVar;
        }
        alfq alfqVar2 = new alfq(view);
        view.setTag(R.id.view_offset_helper, alfqVar2);
        return alfqVar2;
    }

    protected static final alfi n() {
        return new alfi();
    }

    private final void o() {
        setContentDescription(this.q ? this.c.i : null);
    }

    private final void p(Drawable drawable, int i, int i2) {
        q(drawable, this.i, i, i2);
    }

    private final void q(Drawable drawable, View view, int i, int i2) {
        if (u() && view != null && this.q) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    private final void r() {
        View view;
        if (!this.q && (view = this.k) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.k);
            }
        }
        if (!this.q || this.i == null) {
            return;
        }
        if (this.k == null) {
            this.k = new View(getContext());
        }
        if (this.k.getParent() == null) {
            this.i.addView(this.k, -1, -1);
        }
    }

    private final void s(int i, int i2, int i3, int i4, boolean z) {
        View view;
        int i5;
        int i6;
        int i7;
        if (!this.q || (view = this.k) == null) {
            return;
        }
        int i8 = 0;
        boolean z2 = jw.aj(view) && this.k.getVisibility() == 0;
        this.r = z2;
        if (!z2) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        int e = jw.e(this);
        View view2 = this.j;
        if (view2 == null) {
            view2 = this.i;
        }
        int e2 = e(view2);
        alhx.a(this, this.k, this.p);
        ViewGroup viewGroup = this.i;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i8 = toolbar.i;
            i6 = toolbar.j;
            i7 = toolbar.k;
            i5 = toolbar.l;
        } else {
            if (Build.VERSION.SDK_INT >= 24) {
                ViewGroup viewGroup2 = this.i;
                if (viewGroup2 instanceof android.widget.Toolbar) {
                    android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup2;
                    i8 = toolbar2.getTitleMarginStart();
                    i6 = toolbar2.getTitleMarginEnd();
                    i7 = toolbar2.getTitleMarginTop();
                    i5 = toolbar2.getTitleMarginBottom();
                }
            }
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        alhw alhwVar = this.c;
        int i9 = this.p.left + (e == 1 ? i6 : i8);
        int i10 = this.p.top + e2 + i7;
        int i11 = this.p.right;
        if (e != 1) {
            i8 = i6;
        }
        alhwVar.j(i9, i10, i11 - i8, (this.p.bottom + e2) - i5);
        this.c.n(e == 1 ? this.n : this.l, this.p.top + this.m, (i3 - i) - (e == 1 ? this.l : this.n), (i4 - i2) - this.o);
        this.c.i(z);
    }

    private final void t() {
        CharSequence title;
        if (this.i != null && this.q && TextUtils.isEmpty(this.c.i)) {
            ViewGroup viewGroup = this.i;
            if (viewGroup instanceof Toolbar) {
                title = ((Toolbar) viewGroup).n;
            } else {
                title = viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
            }
            k(title);
        }
    }

    private final boolean u() {
        return this.y == 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof alfi;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        d();
        if (this.i == null && (drawable = this.e) != null && this.s > 0) {
            drawable.mutate().setAlpha(this.s);
            this.e.draw(canvas);
        }
        if (this.q && this.r) {
            if (this.i != null && this.e != null && this.s > 0 && u()) {
                alhw alhwVar = this.c;
                if (alhwVar.a < alhwVar.d) {
                    int save = canvas.save();
                    canvas.clipRect(this.e.getBounds(), Region.Op.DIFFERENCE);
                    this.c.e(canvas);
                    canvas.restoreToCount(save);
                }
            }
            this.c.e(canvas);
        }
        if (this.f == null || this.s <= 0) {
            return;
        }
        ko koVar = this.h;
        int f = koVar != null ? koVar.f() : 0;
        if (f > 0) {
            this.f.setBounds(0, -this.g, getWidth(), f - this.g);
            this.f.mutate().setAlpha(this.s);
            this.f.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.e;
        if (drawable == null || this.s <= 0 || ((view2 = this.j) == null || view2 == this ? view != this.i : view != view2)) {
            z = false;
        } else {
            q(drawable, view, getWidth(), getHeight());
            this.e.mutate().setAlpha(this.s);
            this.e.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.e;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        alhw alhwVar = this.c;
        if (alhwVar != null) {
            z |= alhwVar.y(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e(View view) {
        return ((getHeight() - g(view).a) - view.getHeight()) - ((alfi) view.getLayoutParams()).bottomMargin;
    }

    public final int f() {
        int i = this.w;
        if (i >= 0) {
            return i + this.z + this.B;
        }
        ko koVar = this.h;
        int f = koVar != null ? koVar.f() : 0;
        int f2 = jw.f(this);
        if (f2 > 0) {
            return Math.min(f2 + f2 + f, getHeight());
        }
        return getHeight() / 3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return n();
    }

    public final void h(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.e = mutate;
            if (mutate != null) {
                p(mutate, getWidth(), getHeight());
                this.e.setCallback(this);
                this.e.setAlpha(this.s);
            }
            jw.G(this);
        }
    }

    public final void i(int i) {
        h(new ColorDrawable(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i) {
        ViewGroup viewGroup;
        if (i != this.s) {
            if (this.e != null && (viewGroup = this.i) != null) {
                jw.G(viewGroup);
            }
            this.s = i;
            jw.G(this);
        }
    }

    public final void k(CharSequence charSequence) {
        this.c.t(charSequence);
        o();
    }

    public final void l(boolean z) {
        if (z != this.q) {
            this.q = z;
            o();
            r();
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        if (this.e == null && this.f == null) {
            return;
        }
        c(getHeight() + this.g < f(), jw.al(this) && !isInEditMode());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            b(appBarLayout);
            jw.T(this, jw.af(appBarLayout));
            if (this.x == null) {
                this.x = new alfj(this);
            }
            appBarLayout.i(this.x);
            jw.K(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        alff alffVar = this.x;
        if (alffVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).k(alffVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ko koVar = this.h;
        if (koVar != null) {
            int f = koVar.f();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!jw.af(childAt) && childAt.getTop() < f) {
                    jw.E(childAt, f);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            g(getChildAt(i6)).b();
        }
        s(i, i2, i3, i4, false);
        t();
        m();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            g(getChildAt(i7)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        d();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        ko koVar = this.h;
        int f = koVar != null ? koVar.f() : 0;
        if ((mode == 0 || this.A) && f > 0) {
            this.z = f;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + f, 1073741824));
        }
        if (this.C && this.c.n > 1) {
            t();
            s(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            alhw alhwVar = this.c;
            int i3 = alhwVar.h;
            if (i3 > 1) {
                alhwVar.f(alhwVar.l);
                this.B = Math.round((-alhwVar.l.ascent()) + alhwVar.l.descent()) * (i3 - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.B, 1073741824));
            }
        }
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            View view = this.j;
            if (view == null || view == this) {
                setMinimumHeight(a(viewGroup));
            } else {
                setMinimumHeight(a(view));
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.e;
        if (drawable != null) {
            p(drawable, i, i2);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f;
        if (drawable != null && drawable.isVisible() != z) {
            this.f.setVisible(z, false);
        }
        Drawable drawable2 = this.e;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.e.setVisible(z, false);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e || drawable == this.f;
    }

    public alfk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public void c(boolean z, boolean z2) {
        TimeInterpolator timeInterpolator;
        if (this.t != z) {
            int i = PrivateKeyType.INVALID;
            if (!z2) {
                if (true != z) {
                    i = 0;
                }
                j(i);
            } else {
                if (true != z) {
                    i = 0;
                }
                d();
                ValueAnimator valueAnimator = this.u;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.u = valueAnimator2;
                    if (i > this.s) {
                        timeInterpolator = aleq.c;
                    } else {
                        timeInterpolator = aleq.d;
                    }
                    valueAnimator2.setInterpolator(timeInterpolator);
                    this.u.addUpdateListener(new alfh(this));
                } else if (valueAnimator.isRunning()) {
                    this.u.cancel();
                }
                this.u.setDuration(this.v);
                this.u.setIntValues(this.s, i);
                this.u.start();
            }
            this.t = z;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return n();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new alfi(getContext(), attributeSet);
    }

    public alfk(Context context, AttributeSet attributeSet, int i) {
        super(aloa.a(context, attributeSet, i, R.style.Widget_Design_CollapsingToolbar), attributeSet, i);
        int i2;
        this.a = true;
        this.p = new Rect();
        this.w = -1;
        this.z = 0;
        this.B = 0;
        Context context2 = getContext();
        alhw alhwVar = new alhw(this);
        this.c = alhwVar;
        alhwVar.u(aleq.e);
        alhwVar.k = false;
        algu alguVar = new algu(context2);
        this.d = alguVar;
        TypedArray a = alig.a(context2, attributeSet, alfo.c, i, R.style.Widget_Design_CollapsingToolbar, new int[0]);
        alhwVar.q(a.getInt(4, 8388691));
        alhwVar.m(a.getInt(0, 8388627));
        int dimensionPixelSize = a.getDimensionPixelSize(5, 0);
        this.o = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.m = dimensionPixelSize;
        this.l = dimensionPixelSize;
        if (a.hasValue(8)) {
            this.l = a.getDimensionPixelSize(8, 0);
        }
        if (a.hasValue(7)) {
            this.n = a.getDimensionPixelSize(7, 0);
        }
        if (a.hasValue(9)) {
            this.m = a.getDimensionPixelSize(9, 0);
        }
        if (a.hasValue(6)) {
            this.o = a.getDimensionPixelSize(6, 0);
        }
        this.q = a.getBoolean(20, true);
        k(a.getText(18));
        alhwVar.o(R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
        alhwVar.k(2132083647);
        if (a.hasValue(10)) {
            alhwVar.o(a.getResourceId(10, 0));
        }
        if (a.hasValue(1)) {
            alhwVar.k(a.getResourceId(1, 0));
        }
        if (a.hasValue(11)) {
            alhwVar.p(alkd.e(context2, a, 11));
        }
        if (a.hasValue(2)) {
            alhwVar.l(alkd.e(context2, a, 2));
        }
        this.w = a.getDimensionPixelSize(16, -1);
        if (a.hasValue(14) && (i2 = a.getInt(14, 1)) != alhwVar.n) {
            alhwVar.n = i2;
            alhwVar.h();
        }
        this.v = a.getInt(15, 600);
        h(a.getDrawable(3));
        Drawable drawable = a.getDrawable(17);
        Drawable drawable2 = this.f;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f.setState(getDrawableState());
                }
                gl.e(this.f, jw.e(this));
                this.f.setVisible(getVisibility() == 0, false);
                this.f.setCallback(this);
                this.f.setAlpha(this.s);
            }
            jw.G(this);
        }
        this.y = a.getInt(19, 0);
        boolean u = u();
        alhwVar.b = u;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            b((AppBarLayout) parent);
        }
        if (u && this.e == null) {
            i(alguVar.a(alguVar.b, getResources().getDimension(R.dimen.design_appbar_elevation)));
        }
        this.b = a.getResourceId(21, -1);
        this.A = a.getBoolean(13, false);
        this.C = a.getBoolean(12, false);
        a.recycle();
        setWillNotDraw(false);
        jw.X(this, new alfg(this));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new alfi(layoutParams);
    }
}
