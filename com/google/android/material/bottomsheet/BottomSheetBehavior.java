package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.youtube.R;
import defpackage.ahe;
import defpackage.ahh;
import defpackage.akm;
import defpackage.akn;
import defpackage.alfw;
import defpackage.alfx;
import defpackage.alfz;
import defpackage.alga;
import defpackage.algb;
import defpackage.algc;
import defpackage.algd;
import defpackage.algl;
import defpackage.alkd;
import defpackage.alkg;
import defpackage.alkl;
import defpackage.jw;
import defpackage.kr;
import defpackage.lf;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class BottomSheetBehavior extends ahe {
    public int A;
    public boolean B;
    private int C;
    private float D;
    private boolean E;
    private int F;
    private int G;
    private boolean H;
    private int I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f177J;
    private boolean K;
    private alkl L;
    private boolean M;
    private algd N;
    private ValueAnimator O;
    private boolean P;
    private int Q;
    private boolean R;
    private int S;
    private VelocityTracker T;
    private int U;
    private Map V;
    private int W;
    private final akm X;
    public boolean a;
    public int b;
    public alkg c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    int k;
    public int l;
    public int m;
    float n;
    public int o;
    float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public akn u;
    int v;
    public int w;
    public WeakReference x;
    public WeakReference y;
    public final ArrayList z;

    public BottomSheetBehavior() {
        this.C = 0;
        this.a = true;
        this.d = -1;
        this.I = -1;
        this.N = null;
        this.n = 0.5f;
        this.p = -1.0f;
        this.s = true;
        this.t = 4;
        this.z = new ArrayList();
        this.W = -1;
        this.X = new alfz(this);
    }

    private final int M() {
        int i;
        if (this.E) {
            return Math.min(Math.max(this.F, this.w - ((this.v * 9) / 16)), this.S) + this.i;
        }
        return (this.f177J || this.f || (i = this.e) <= 0) ? this.b + this.i : Math.max(this.b, i + this.G);
    }

    private final lf N(int i) {
        return new alga(this, i);
    }

    private final void O() {
        int M = M();
        if (this.a) {
            this.o = Math.max(this.w - M, this.l);
        } else {
            this.o = this.w - M;
        }
    }

    private final void P() {
        this.m = (int) (this.w * (1.0f - this.n));
    }

    private final void Q(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.H) {
            this.L = alkl.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
            alkg alkgVar = new alkg(this.L);
            this.c = alkgVar;
            alkgVar.j(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.c.setTint(typedValue.data);
                return;
            }
            this.c.l(colorStateList);
        }
    }

    private final void R(View view, kr krVar, int i) {
        jw.at(view, krVar, N(i));
    }

    private final void S() {
        this.A = -1;
        VelocityTracker velocityTracker = this.T;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.T = null;
        }
    }

    private final void T() {
        View view;
        int i;
        WeakReference weakReference = this.x;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        jw.J(view, 524288);
        jw.J(view, 262144);
        jw.J(view, 1048576);
        int i2 = this.W;
        if (i2 != -1) {
            jw.J(view, i2);
        }
        if (!this.a && this.t != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            lf N = N(6);
            List x = jw.x(view);
            int i3 = 0;
            while (true) {
                if (i3 >= x.size()) {
                    int i4 = -1;
                    int i5 = 0;
                    while (true) {
                        int length = jw.a.length;
                        if (i5 >= 32 || i4 != -1) {
                            break;
                        }
                        i4 = jw.a[i5];
                        boolean z = true;
                        for (int i6 = 0; i6 < x.size(); i6++) {
                            z &= ((kr) x.get(i6)).a() != i4;
                        }
                        if (true != z) {
                            i4 = -1;
                        }
                        i5++;
                    }
                    i = i4;
                } else {
                    if (TextUtils.equals(string, ((kr) x.get(i3)).b())) {
                        i = ((kr) x.get(i3)).a();
                        break;
                    }
                    i3++;
                }
            }
            if (i != -1) {
                jw.y(view, new kr(null, i, string, N, null));
            }
            this.W = i;
        }
        if (this.q && this.t != 5) {
            R(view, kr.g, 5);
        }
        int i7 = this.t;
        if (i7 == 3) {
            R(view, kr.f, true == this.a ? 4 : 6);
            return;
        }
        if (i7 != 4) {
            if (i7 != 6) {
                return;
            }
            R(view, kr.f, 4);
            R(view, kr.e, 3);
        } else {
            R(view, kr.e, true == this.a ? 3 : 6);
        }
    }

    private final void U(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.M != z) {
            this.M = z;
            if (this.c == null || (valueAnimator = this.O) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.O.reverse();
                return;
            }
            float f = i == 3 ? 0.0f : 1.0f;
            this.O.setFloatValues(1.0f - f, f);
            this.O.start();
        }
    }

    private final void V(boolean z) {
        WeakReference weakReference = this.x;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.V != null) {
                    return;
                } else {
                    this.V = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.x.get() && z) {
                    this.V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.V = null;
        }
    }

    private final boolean W() {
        if (this.u != null) {
            return this.s || this.t == 1;
        }
        return false;
    }

    private static final int X(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
    }

    public static BottomSheetBehavior x(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ahh)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        ahe aheVar = ((ahh) layoutParams).a;
        if (!(aheVar instanceof BottomSheetBehavior)) {
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        return (BottomSheetBehavior) aheVar;
    }

    public final void A(algb algbVar) {
        this.z.remove(algbVar);
    }

    public final void B(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.k = i;
    }

    public final void C(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        if (this.x != null) {
            O();
        }
        H((this.a && this.t == 6) ? 3 : this.t);
        T();
    }

    public final void D(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.n = f;
        if (this.x != null) {
            P();
        }
    }

    public final void E(boolean z) {
        if (this.q != z) {
            this.q = z;
            if (!z && this.t == 5) {
                G(4);
            }
            T();
        }
    }

    public final void G(int i) {
        if (i == this.t) {
            return;
        }
        WeakReference weakReference = this.x;
        if (weakReference == null) {
            if (i != 4 && i != 3 && i != 6) {
                if (!this.q || i != 5) {
                    return;
                } else {
                    i = 5;
                }
            }
            this.t = i;
            return;
        }
        View view = (View) weakReference.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent == null || !parent.isLayoutRequested() || !jw.aj(view)) {
            I(view, i);
        } else {
            view.post(new alfw(this, view, i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0032, code lost:
    
        if (r7 == 4) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(int r7) {
        /*
            r6 = this;
            int r0 = r6.t
            if (r0 != r7) goto L5
            return
        L5:
            r6.t = r7
            r0 = 6
            r1 = 3
            r2 = 5
            r3 = 4
            if (r7 == r3) goto L18
            if (r7 == r1) goto L18
            if (r7 == r0) goto L18
            boolean r4 = r6.q
            if (r4 == 0) goto L18
            if (r7 != r2) goto L18
            r7 = 5
        L18:
            java.lang.ref.WeakReference r4 = r6.x
            if (r4 != 0) goto L1d
            return
        L1d:
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L26
            return
        L26:
            r5 = 0
            if (r7 != r1) goto L2e
            r0 = 1
            r6.V(r0)
            goto L3a
        L2e:
            if (r7 == r0) goto L35
            if (r7 == r2) goto L35
            if (r7 != r3) goto L3a
            goto L36
        L35:
            r3 = r7
        L36:
            r6.V(r5)
            r7 = r3
        L3a:
            r6.U(r7)
        L3d:
            java.util.ArrayList r0 = r6.z
            int r0 = r0.size()
            if (r5 >= r0) goto L53
            java.util.ArrayList r0 = r6.z
            java.lang.Object r0 = r0.get(r5)
            algb r0 = (defpackage.algb) r0
            r0.b(r4, r7)
            int r5 = r5 + 1
            goto L3d
        L53:
            r6.T()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.H(int):void");
    }

    public final void J(View view, int i, int i2, boolean z) {
        akn aknVar = this.u;
        if (aknVar == null || (!z ? !aknVar.l(view, view.getLeft(), i2) : !aknVar.j(view.getLeft(), i2))) {
            H(i);
            return;
        }
        H(2);
        U(i);
        if (this.N == null) {
            this.N = new algd(this, view, i);
        }
        algd algdVar = this.N;
        if (!algdVar.a) {
            algdVar.b = i;
            jw.H(view, algdVar);
            this.N.a = true;
            return;
        }
        algdVar.b = i;
    }

    public final boolean K(View view, float f) {
        if (this.r) {
            return true;
        }
        if (view.getTop() < this.o) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.o)) / ((float) M()) > 0.5f;
    }

    public final void L() {
        View view;
        if (this.x != null) {
            O();
            if (this.t != 4 || (view = (View) this.x.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.ahe
    public final void a(ahh ahhVar) {
        this.x = null;
        this.u = null;
    }

    @Override // defpackage.ahe
    public final void b() {
        this.x = null;
        this.u = null;
    }

    @Override // defpackage.ahe
    public void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.y;
        if (view2 == (weakReference != null ? (View) weakReference.get() : null)) {
            int top = view.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < v()) {
                    int v = top - v();
                    iArr[1] = v;
                    jw.E(view, -v);
                    H(3);
                } else {
                    if (!this.s) {
                        return;
                    }
                    iArr[1] = i2;
                    jw.E(view, -i2);
                    H(1);
                }
            } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                int i5 = this.o;
                if (i4 <= i5 || this.q) {
                    if (!this.s) {
                        return;
                    }
                    iArr[1] = i2;
                    jw.E(view, -i2);
                    H(1);
                } else {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    jw.E(view, -i6);
                    H(4);
                }
            }
            z(view.getTop());
            this.Q = i2;
            this.R = true;
        }
    }

    @Override // defpackage.ahe
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // defpackage.ahe
    public void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == v()) {
            H(3);
            return;
        }
        WeakReference weakReference = this.y;
        if (weakReference != null && view2 == weakReference.get() && this.R) {
            if (this.Q <= 0) {
                if (this.q) {
                    VelocityTracker velocityTracker = this.T;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.D);
                        yVelocity = this.T.getYVelocity(this.A);
                    }
                    if (K(view, yVelocity)) {
                        i2 = this.w;
                        i3 = 5;
                    }
                }
                if (this.Q == 0) {
                    int top = view.getTop();
                    if (!this.a) {
                        int i4 = this.m;
                        if (top < i4) {
                            if (top < Math.abs(top - this.o)) {
                                i2 = v();
                            } else {
                                i2 = this.m;
                            }
                        } else {
                            if (Math.abs(top - i4) < Math.abs(top - this.o)) {
                                i2 = this.m;
                            }
                            i2 = this.o;
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top - this.l) < Math.abs(top - this.o)) {
                        i2 = this.l;
                    } else {
                        i2 = this.o;
                        i3 = 4;
                    }
                } else {
                    if (!this.a) {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - this.m) < Math.abs(top2 - this.o)) {
                            i2 = this.m;
                            i3 = 6;
                        } else {
                            i2 = this.o;
                            i3 = 4;
                        }
                    }
                    i2 = this.o;
                    i3 = 4;
                }
            } else if (this.a) {
                i2 = this.l;
            } else {
                int top3 = view.getTop();
                int i5 = this.m;
                if (top3 > i5) {
                    i2 = i5;
                    i3 = 6;
                } else {
                    i2 = v();
                }
            }
            J(view, i3, i2, false);
            this.R = false;
        }
    }

    @Override // defpackage.ahe
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        akn aknVar;
        if (!view.isShown() || !this.s) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            S();
            actionMasked = 0;
        }
        if (this.T == null) {
            this.T = VelocityTracker.obtain();
        }
        this.T.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.U = (int) motionEvent.getY();
            if (this.t != 2) {
                WeakReference weakReference = this.y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m(view2, x, this.U)) {
                    this.A = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.B = true;
                }
            }
            this.P = this.A == -1 && !coordinatorLayout.m(view, x, this.U);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
            this.A = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (!this.P && (aknVar = this.u) != null && aknVar.k(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.y;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.P || this.t == 1 || coordinatorLayout.m(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.u == null || Math.abs(((float) this.U) - motionEvent.getY()) <= ((float) this.u.a)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    @Override // defpackage.ahe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, int r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // defpackage.ahe
    public boolean j(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        WeakReference weakReference = this.y;
        return (weakReference == null || view2 != weakReference.get() || this.t == 3) ? false : true;
    }

    @Override // defpackage.ahe
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.Q = 0;
        this.R = false;
        return (i & 2) != 0;
    }

    @Override // defpackage.ahe
    public boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.t == 1 && actionMasked == 0) {
            return true;
        }
        if (W()) {
            this.u.f(motionEvent);
        }
        if (actionMasked == 0) {
            S();
        }
        if (this.T == null) {
            this.T = VelocityTracker.obtain();
        }
        this.T.addMovement(motionEvent);
        if (W() && actionMasked == 2 && !this.P) {
            float abs = Math.abs(this.U - motionEvent.getY());
            akn aknVar = this.u;
            if (abs > aknVar.a) {
                aknVar.e(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.P;
    }

    @Override // defpackage.ahe
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(X(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.d, marginLayoutParams.width), X(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.I, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.ahe
    public final void q(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.C;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.b = savedState.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = savedState.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.q = savedState.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.r = savedState.g;
            }
        }
        int i2 = savedState.a;
        if (i2 == 1 || i2 == 2) {
            this.t = 4;
        } else {
            this.t = i2;
        }
    }

    @Override // defpackage.ahe
    public final Parcelable r(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    public final int v() {
        if (this.a) {
            return this.l;
        }
        return Math.max(this.k, this.K ? 0 : this.j);
    }

    final View w(View view) {
        if (jw.an(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View w = w(viewGroup.getChildAt(i));
            if (w != null) {
                return w;
            }
        }
        return null;
    }

    public final void y(algb algbVar) {
        if (this.z.contains(algbVar)) {
            return;
        }
        this.z.add(algbVar);
    }

    public final void z(int i) {
        float f;
        float f2;
        View view = (View) this.x.get();
        if (view == null || this.z.isEmpty()) {
            return;
        }
        int i2 = this.o;
        if (i > i2 || i2 == v()) {
            int i3 = this.o;
            f = i3 - i;
            f2 = this.w - i3;
        } else {
            int i4 = this.o;
            f = i4 - i;
            f2 = i4 - v();
        }
        float f3 = f / f2;
        for (int i5 = 0; i5 < this.z.size(); i5++) {
            ((algb) this.z.get(i5)).mx(view, f3);
        }
    }

    public final void F(int i) {
        if (i == -1) {
            if (this.E) {
                return;
            } else {
                this.E = true;
            }
        } else {
            if (!this.E && this.b == i) {
                return;
            }
            this.E = false;
            this.b = Math.max(0, i);
        }
        L();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = 0;
        this.a = true;
        this.d = -1;
        this.I = -1;
        this.N = null;
        this.n = 0.5f;
        this.p = -1.0f;
        this.s = true;
        this.t = 4;
        this.z = new ArrayList();
        this.W = -1;
        this.X = new alfz(this);
        this.G = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, algl.a);
        this.H = obtainStyledAttributes.hasValue(17);
        if (!obtainStyledAttributes.hasValue(3)) {
            Q(context, attributeSet, false, null);
        } else {
            Q(context, attributeSet, true, alkd.e(context, obtainStyledAttributes, 3));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.O = ofFloat;
        ofFloat.setDuration(500L);
        this.O.addUpdateListener(new alfx(this));
        this.p = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.I = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || peekValue.data != -1) {
            F(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            F(peekValue.data);
        }
        E(obtainStyledAttributes.getBoolean(8, false));
        this.f177J = obtainStyledAttributes.getBoolean(12, false);
        C(obtainStyledAttributes.getBoolean(6, true));
        this.r = obtainStyledAttributes.getBoolean(11, false);
        this.s = obtainStyledAttributes.getBoolean(4, true);
        this.C = obtainStyledAttributes.getInt(10, 0);
        D(obtainStyledAttributes.getFloat(7, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            B(obtainStyledAttributes.getDimensionPixelOffset(5, 0));
        } else {
            B(peekValue2.data);
        }
        this.f = obtainStyledAttributes.getBoolean(13, false);
        this.g = obtainStyledAttributes.getBoolean(14, false);
        this.h = obtainStyledAttributes.getBoolean(15, false);
        this.K = obtainStyledAttributes.getBoolean(16, true);
        obtainStyledAttributes.recycle();
        this.D = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void I(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.o;
        } else if (i == 6) {
            i2 = this.m;
            if (this.a && i2 <= (i3 = this.l)) {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = v();
        } else {
            if (!this.q || i != 5) {
                StringBuilder sb = new StringBuilder(35);
                sb.append("Illegal state argument: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            i2 = this.w;
            i = 5;
        }
        J(view, i, i2, false);
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new algc(0);
        final int a;
        int b;
        boolean e;
        boolean f;
        boolean g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.a = bottomSheetBehavior.t;
            this.b = bottomSheetBehavior.b;
            this.e = bottomSheetBehavior.a;
            this.f = bottomSheetBehavior.q;
            this.g = bottomSheetBehavior.r;
        }
    }
}
