package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.youtube.R;
import defpackage.jw;
import defpackage.ls;
import defpackage.nx;
import defpackage.pw;
import defpackage.qo;
import defpackage.qq;
import defpackage.qt;
import defpackage.rd;
import defpackage.sb;
import defpackage.ts;
import defpackage.wn;
import defpackage.xe;
import defpackage.yk;
import defpackage.yl;
import defpackage.ym;
import defpackage.yo;
import defpackage.yp;
import defpackage.yq;
import defpackage.yt;
import defpackage.zb;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private int A;
    private int B;
    private xe C;
    private int D;
    private int E;
    private ColorStateList F;
    private ColorStateList G;
    private boolean H;
    private boolean I;

    /* renamed from: J, reason: collision with root package name */
    private final ArrayList f75J;
    private final int[] K;
    private yt L;
    private final Runnable M;
    private final yl N;
    public ActionMenuView a;
    public Drawable b;
    public CharSequence c;
    public ImageButton d;
    public View e;
    public Context f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public CharSequence n;
    public CharSequence o;
    public final ArrayList p;
    public yq q;
    public sb r;
    public yo s;
    public rd t;
    public qo u;
    private TextView v;
    private TextView w;
    private ImageButton x;
    private ImageView y;
    private int z;

    public Toolbar(Context context) {
        this(context, null);
    }

    public static final yp E() {
        return new yp();
    }

    protected static final yp F(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof yp) {
            return new yp((yp) layoutParams);
        }
        if (layoutParams instanceof ls) {
            return new yp((ls) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new yp((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new yp(layoutParams);
    }

    private final int G(int i) {
        int e = jw.e(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, e) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : e == 1 ? 5 : 3;
    }

    private final int H(View view, int i) {
        yp ypVar = (yp) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = ypVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.E & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ypVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i4 < ypVar.topMargin) {
            i4 = ypVar.topMargin;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            if (i5 < ypVar.bottomMargin) {
                i4 = Math.max(0, i4 - (ypVar.bottomMargin - i5));
            }
        }
        return paddingTop + i4;
    }

    private final int I(View view, int i, int[] iArr, int i2) {
        yp ypVar = (yp) view.getLayoutParams();
        int i3 = ypVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int H = H(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, H, max + measuredWidth, view.getMeasuredHeight() + H);
        return max + measuredWidth + ypVar.rightMargin;
    }

    private final int J(View view, int i, int[] iArr, int i2) {
        yp ypVar = (yp) view.getLayoutParams();
        int i3 = ypVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int H = H(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, H, max, view.getMeasuredHeight() + H);
        return max - (measuredWidth + ypVar.leftMargin);
    }

    private final int K(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private final void L(List list, int i) {
        int e = jw.e(this);
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, jw.e(this));
        list.clear();
        if (e != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                yp ypVar = (yp) childAt.getLayoutParams();
                if (ypVar.b == 0 && R(childAt) && G(ypVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            yp ypVar2 = (yp) childAt2.getLayoutParams();
            if (ypVar2.b == 0 && R(childAt2) && G(ypVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void M(View view, boolean z) {
        yp ypVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ypVar = E();
        } else if (!checkLayoutParams(layoutParams)) {
            ypVar = F(layoutParams);
        } else {
            ypVar = (yp) layoutParams;
        }
        ypVar.b = 1;
        if (!z || this.e == null) {
            addView(view, ypVar);
        } else {
            view.setLayoutParams(ypVar);
            this.p.add(view);
        }
    }

    private final void N() {
        if (this.C == null) {
            this.C = new xe();
        }
    }

    private final void O() {
        if (this.y == null) {
            this.y = new AppCompatImageView(getContext());
        }
    }

    private final void P() {
        if (this.x == null) {
            this.x = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            yp E = E();
            E.a = (this.h & 112) | 8388611;
            this.x.setLayoutParams(E);
        }
    }

    private final boolean Q(View view) {
        return view.getParent() == this || this.p.contains(view);
    }

    private final boolean R(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static final int S(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private static final int T(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void U(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void A(ColorStateList colorStateList) {
        this.F = colorStateList;
        TextView textView = this.v;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final boolean B() {
        sb sbVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (sbVar = actionMenuView.c) == null || !sbVar.k()) ? false : true;
    }

    public final boolean C() {
        sb sbVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (sbVar = actionMenuView.c) == null || !sbVar.l()) ? false : true;
    }

    public final boolean D() {
        sb sbVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (sbVar = actionMenuView.c) == null || !sbVar.m()) ? false : true;
    }

    public final int a() {
        xe xeVar = this.C;
        if (xeVar != null) {
            return xeVar.g ? xeVar.a : xeVar.b;
        }
        return 0;
    }

    public final int b() {
        xe xeVar = this.C;
        if (xeVar != null) {
            return xeVar.g ? xeVar.b : xeVar.a;
        }
        return 0;
    }

    public final int c() {
        qq qqVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (qqVar = actionMenuView.a) == null || !qqVar.hasVisibleItems()) ? a() : Math.max(a(), Math.max(this.D, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof yp);
    }

    public final int d() {
        return e() != null ? Math.max(b(), Math.max(this.m, 0)) : b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.x;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final ts f() {
        if (this.L == null) {
            this.L = new yt(this, true);
        }
        return this.L;
    }

    public final Menu g() {
        j();
        return this.a.d();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return E();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new yp(getContext(), attributeSet);
    }

    public final CharSequence h() {
        ImageButton imageButton = this.x;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final void i() {
        yo yoVar = this.s;
        qt qtVar = yoVar == null ? null : yoVar.b;
        if (qtVar != null) {
            qtVar.collapseActionView();
        }
    }

    public final void j() {
        k();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu d = actionMenuView.d();
            if (this.s == null) {
                this.s = new yo(this);
            }
            this.a.c.o();
            ((qq) d).h(this.s, this.f);
        }
    }

    public final void k() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.g(this.g);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.N;
            actionMenuView2.f(this.t, this.u);
            yp E = E();
            E.a = (this.h & 112) | 8388613;
            this.a.setLayoutParams(E);
            M(this.a, false);
        }
    }

    public final void l(int i) {
        new pw(getContext()).inflate(i, g());
    }

    public final void m(int i, int i2) {
        N();
        this.C.a(i, i2);
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            O();
            if (!Q(this.y)) {
                M(this.y, true);
            }
        } else {
            ImageView imageView = this.y;
            if (imageView != null && Q(imageView)) {
                removeView(this.y);
                this.p.remove(this.y);
            }
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void o(int i) {
        p(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.M);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.I = false;
            actionMasked = 9;
        }
        if (!this.I) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.I = true;
                }
                if (i != 10 || i == 3) {
                    this.I = false;
                }
                return true;
            }
        }
        i = actionMasked;
        if (i != 10) {
        }
        this.I = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02af A[LOOP:0: B:43:0x02ad->B:44:0x02af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d1 A[LOOP:1: B:47:0x02cf->B:48:0x02d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02f5 A[LOOP:2: B:51:0x02f3->B:52:0x02f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0345 A[LOOP:3: B:60:0x0343->B:61:0x0345, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0236  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.K;
        boolean b = zb.b(this);
        int i9 = !b ? 1 : 0;
        int i10 = 0;
        if (R(this.x)) {
            U(this.x, i, 0, i2, this.B);
            i3 = this.x.getMeasuredWidth() + S(this.x);
            i4 = Math.max(0, this.x.getMeasuredHeight() + T(this.x));
            i5 = View.combineMeasuredStates(0, this.x.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (R(this.d)) {
            U(this.d, i, 0, i2, this.B);
            i3 = this.d.getMeasuredWidth() + S(this.d);
            i4 = Math.max(i4, this.d.getMeasuredHeight() + T(this.d));
            i5 = View.combineMeasuredStates(i5, this.d.getMeasuredState());
        }
        int d = d();
        int max = Math.max(d, i3);
        iArr[b ? 1 : 0] = Math.max(0, d - i3);
        if (R(this.a)) {
            U(this.a, i, max, i2, this.B);
            i6 = this.a.getMeasuredWidth() + S(this.a);
            i4 = Math.max(i4, this.a.getMeasuredHeight() + T(this.a));
            i5 = View.combineMeasuredStates(i5, this.a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int c = c();
        int max2 = max + Math.max(c, i6);
        iArr[i9] = Math.max(0, c - i6);
        if (R(this.e)) {
            max2 += K(this.e, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.e.getMeasuredHeight() + T(this.e));
            i5 = View.combineMeasuredStates(i5, this.e.getMeasuredState());
        }
        if (R(this.y)) {
            max2 += K(this.y, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.y.getMeasuredHeight() + T(this.y));
            i5 = View.combineMeasuredStates(i5, this.y.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((yp) childAt.getLayoutParams()).b == 0 && R(childAt)) {
                max2 += K(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + T(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.k + this.l;
        int i13 = this.i + this.j;
        if (R(this.v)) {
            K(this.v, i, max2 + i13, i2, i12, iArr);
            i10 = this.v.getMeasuredWidth() + S(this.v);
            int measuredHeight = this.v.getMeasuredHeight() + T(this.v);
            i7 = View.combineMeasuredStates(i5, this.v.getMeasuredState());
            i8 = measuredHeight;
        } else {
            i7 = i5;
            i8 = 0;
        }
        if (R(this.w)) {
            i10 = Math.max(i10, K(this.w, i, max2 + i13, i2, i8 + i12, iArr));
            i8 += this.w.getMeasuredHeight() + T(this.w);
            i7 = View.combineMeasuredStates(i7, this.w.getMeasuredState());
        }
        int max3 = Math.max(i4, i8);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i10 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i7), View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        ActionMenuView actionMenuView = this.a;
        qq qqVar = actionMenuView != null ? actionMenuView.a : null;
        int i = savedState.a;
        if (i != 0 && this.s != null && qqVar != null && (findItem = qqVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.b) {
            removeCallbacks(this.M);
            post(this.M);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        N();
        xe xeVar = this.C;
        boolean z = i == 1;
        if (z == xeVar.g) {
            return;
        }
        xeVar.g = z;
        if (!xeVar.h) {
            xeVar.a = xeVar.e;
            xeVar.b = xeVar.f;
            return;
        }
        if (z) {
            int i2 = xeVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = xeVar.e;
            }
            xeVar.a = i2;
            int i3 = xeVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = xeVar.f;
            }
            xeVar.b = i3;
            return;
        }
        int i4 = xeVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = xeVar.e;
        }
        xeVar.a = i4;
        int i5 = xeVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = xeVar.f;
        }
        xeVar.b = i5;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        qt qtVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        yo yoVar = this.s;
        if (yoVar != null && (qtVar = yoVar.b) != null) {
            savedState.a = qtVar.a;
        }
        savedState.b = C();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.H = false;
            actionMasked = 0;
        }
        if (!this.H) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.H = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.H = false;
        }
        return true;
    }

    public final void p(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            P();
        }
        ImageButton imageButton = this.x;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void q(Drawable drawable) {
        if (drawable != null) {
            P();
            if (!Q(this.x)) {
                M(this.x, true);
            }
        } else {
            ImageButton imageButton = this.x;
            if (imageButton != null && Q(imageButton)) {
                removeView(this.x);
                this.p.remove(this.x);
            }
        }
        ImageButton imageButton2 = this.x;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public final void r(View.OnClickListener onClickListener) {
        P();
        this.x.setOnClickListener(onClickListener);
    }

    public final void s(int i) {
        if (this.g != i) {
            this.g = i;
            if (i == 0) {
                this.f = getContext();
            } else {
                this.f = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void t(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.w == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.w = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.w.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A;
                if (i != 0) {
                    this.w.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.w.setTextColor(colorStateList);
                }
            }
            if (!Q(this.w)) {
                M(this.w, true);
            }
        } else {
            TextView textView = this.w;
            if (textView != null && Q(textView)) {
                removeView(this.w);
                this.p.remove(this.w);
            }
        }
        TextView textView2 = this.w;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.o = charSequence;
    }

    public final void u(Context context, int i) {
        this.A = i;
        TextView textView = this.w;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public final void v(ColorStateList colorStateList) {
        this.G = colorStateList;
        TextView textView = this.w;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void w(int i) {
        x(getContext().getText(i));
    }

    public final void x(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.v == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.v = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.v.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.z;
                if (i != 0) {
                    this.v.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.v.setTextColor(colorStateList);
                }
            }
            if (!Q(this.v)) {
                M(this.v, true);
            }
        } else {
            TextView textView = this.v;
            if (textView != null && Q(textView)) {
                removeView(this.v);
                this.p.remove(this.v);
            }
        }
        TextView textView2 = this.v;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.n = charSequence;
    }

    public final void y(Context context, int i) {
        this.z = i;
        TextView textView = this.v;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public final void z(int i) {
        A(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return F(layoutParams);
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new wn(3);
        int a;
        boolean b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.E = 8388627;
        this.f75J = new ArrayList();
        this.p = new ArrayList();
        this.K = new int[2];
        this.N = new yl(this);
        this.M = new ym(this);
        yk l = yk.l(getContext(), attributeSet, nx.x, i, 0);
        jw.L(this, context, nx.x, attributeSet, l.b, i, 0);
        this.z = l.f(28, 0);
        this.A = l.f(19, 0);
        this.E = l.d(0, this.E);
        this.h = l.d(2, 48);
        int a = l.a(22, 0);
        a = l.q(27) ? l.a(27, a) : a;
        this.l = a;
        this.k = a;
        this.j = a;
        this.i = a;
        int a2 = l.a(25, -1);
        if (a2 >= 0) {
            this.i = a2;
        }
        int a3 = l.a(24, -1);
        if (a3 >= 0) {
            this.j = a3;
        }
        int a4 = l.a(26, -1);
        if (a4 >= 0) {
            this.k = a4;
        }
        int a5 = l.a(23, -1);
        if (a5 >= 0) {
            this.l = a5;
        }
        this.B = l.b(13, -1);
        int a6 = l.a(9, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        int a7 = l.a(5, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        int b = l.b(7, 0);
        int b2 = l.b(8, 0);
        N();
        xe xeVar = this.C;
        xeVar.h = false;
        if (b != Integer.MIN_VALUE) {
            xeVar.e = b;
            xeVar.a = b;
        }
        if (b2 != Integer.MIN_VALUE) {
            xeVar.f = b2;
            xeVar.b = b2;
        }
        if (a6 != Integer.MIN_VALUE || a7 != Integer.MIN_VALUE) {
            xeVar.a(a6, a7);
        }
        this.m = l.a(10, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        this.D = l.a(6, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
        this.b = l.h(4);
        this.c = l.m(3);
        CharSequence m = l.m(21);
        if (!TextUtils.isEmpty(m)) {
            x(m);
        }
        CharSequence m2 = l.m(18);
        if (!TextUtils.isEmpty(m2)) {
            t(m2);
        }
        this.f = getContext();
        s(l.f(17, 0));
        Drawable h = l.h(16);
        if (h != null) {
            q(h);
        }
        CharSequence m3 = l.m(15);
        if (!TextUtils.isEmpty(m3)) {
            p(m3);
        }
        Drawable h2 = l.h(11);
        if (h2 != null) {
            n(h2);
        }
        CharSequence m4 = l.m(12);
        if (!TextUtils.isEmpty(m4)) {
            if (!TextUtils.isEmpty(m4)) {
                O();
            }
            ImageView imageView = this.y;
            if (imageView != null) {
                imageView.setContentDescription(m4);
            }
        }
        if (l.q(29)) {
            A(l.g(29));
        }
        if (l.q(20)) {
            v(l.g(20));
        }
        if (l.q(14)) {
            l(l.f(14, 0));
        }
        l.o();
    }
}
