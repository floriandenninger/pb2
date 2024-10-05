package com.google.android.apps.youtube.app.ui.swipetocontainer;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
import defpackage.aadw;
import defpackage.amkq;
import defpackage.asvu;
import defpackage.aypy;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.gjj;
import defpackage.njy;
import defpackage.njz;
import defpackage.nkh;
import defpackage.nkj;
import defpackage.zay;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwipeToContainerFrameLayout extends njy {
    public aypy a;
    public SharedPreferences b;
    public int c;
    public int d;
    public zay e;
    public nkh f;
    public final Rect g;
    public boolean h;
    public boolean i;
    public aadw j;
    private int k;
    private final ayqw l;
    private View m;
    private View n;
    private ObjectAnimator o;
    private ObjectAnimator p;
    private nkj q;
    private float r;
    private float s;

    public SwipeToContainerFrameLayout(Context context) {
        super(context);
        this.c = 0;
        this.l = new ayqw();
        this.g = new Rect();
        m(context, null);
    }

    private final float h() {
        return this.m.getMeasuredWidth() - (getLeft() - this.m.getX());
    }

    private final float i() {
        return Math.abs(this.m.getX());
    }

    private final void j() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.p;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
    }

    private final void k(long j) {
        nkj nkjVar = this.q;
        nkjVar.a = this.m;
        nkjVar.b = 0;
        this.p.addListener(nkjVar);
        this.p.setDuration(j);
        this.p.setFloatValues(-getRight());
        this.o.setDuration(j);
        this.o.setFloatValues(0.0f);
        this.p.start();
        this.o.start();
        nkh nkhVar = this.f;
        if (nkhVar != null) {
            nkhVar.r(this.d, 0.0f);
        }
    }

    private final void l(long j) {
        nkj nkjVar = this.q;
        nkjVar.a = this.n;
        nkjVar.b = 1;
        this.o.addListener(nkjVar);
        this.o.setDuration(j);
        this.o.setFloatValues(getRight());
        this.p.setDuration(j);
        this.p.setFloatValues(0.0f);
        this.p.start();
        this.o.start();
        nkh nkhVar = this.f;
        if (nkhVar != null) {
            nkhVar.r(this.d, 1.0f);
        }
    }

    private final void m(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, njz.a);
        boolean z = false;
        this.d = obtainStyledAttributes.getResourceId(0, 0);
        this.k = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        amkq.F(this.d != 0, "containerViewId must be specified");
        amkq.F(this.k != 0, "watchWhileRootViewId must be specified");
        aadw aadwVar = this.j;
        if (aadwVar != null && this.b != null) {
            asvu asvuVar = aadwVar.b().e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            if (asvuVar.H && this.b.getBoolean("enable_swipe_container", false)) {
                z = true;
            }
        }
        this.h = z;
        if (z) {
            this.e = new zay(getContext());
            this.q = new nkj(this);
        }
    }

    private final void n() {
        if (this.c == 2) {
            return;
        }
        this.c = 2;
        if (!r(this.m)) {
            this.m.setVisibility(0);
            this.m.bringToFront();
            this.m.setX(-getRight());
            this.s = this.m.getTranslationX();
        }
        if (r(this.n)) {
            return;
        }
        this.n.setVisibility(0);
    }

    private final void o(int i) {
        float i2;
        this.p.removeAllListeners();
        this.o.removeAllListeners();
        if (i == 1) {
            i2 = i();
        } else if (i == 2) {
            i2 = h();
        } else if (q()) {
            i2 = i();
        } else {
            i2 = h();
        }
        int round = Math.round(Math.min(Math.max(i2 / getRight(), 0.0f), 1.0f) * 400.0f);
        if (i == 2 || i == 1) {
            round = (int) (round * 0.8f);
        }
        long j = round;
        if (i != 0) {
            if (i != 1) {
                k(j);
                return;
            } else {
                l(j);
                return;
            }
        }
        if (q()) {
            l(j);
        } else {
            k(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        if (r6.aj != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean p() {
        /*
            r8 = this;
            android.view.View r0 = r8.m
            r1 = 0
            if (r0 == 0) goto Lae
            android.view.View r0 = r8.n
            if (r0 == 0) goto Lae
            nkh r0 = r8.f
            if (r0 == 0) goto Lae
            nkg r0 = (defpackage.nkg) r0
            android.app.Activity r2 = r0.a
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.orientation
            boolean r2 = defpackage.etx.t(r2)
            gje r3 = r0.f
            boolean r3 = r3.E()
            r4 = 1
            if (r3 == 0) goto L48
            gje r3 = r0.f
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r3 = r3.d()
            if (r3 == 0) goto L48
            gje r3 = r0.f
            com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor r3 = r3.d()
            apxf r3 = r3.e()
            java.lang.String r3 = defpackage.etx.x(r3)
            java.lang.String r5 = "FEwhat_to_watch"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L48
            r3 = 1
            goto L49
        L48:
            r3 = 0
        L49:
            fgq r5 = r0.g
            fhg r5 = r5.g()
            fhg r6 = defpackage.fhg.NONE
            if (r5 == r6) goto L60
            fgq r5 = r0.g
            fhg r5 = r5.g()
            fhg r6 = defpackage.fhg.INLINE_MINIMAL
            if (r5 != r6) goto L5e
            goto L60
        L5e:
            r5 = 0
            goto L61
        L60:
            r5 = 1
        L61:
            boolean r6 = r0.n
            if (r6 == 0) goto L98
            htu r6 = r0.q
            if (r6 == 0) goto L98
            htv r6 = r6.aq
            htq r6 = (defpackage.htq) r6
            htu r6 = r6.a
            boolean r7 = r6.ar()
            if (r7 != 0) goto L77
        L75:
            r6 = 1
            goto L99
        L77:
            dd r6 = r6.mN()
            r7 = 2131430584(0x7f0b0cb8, float:1.8482873E38)
            ce r6 = r6.e(r7)
            boolean r7 = r6 instanceof defpackage.hvc
            if (r7 == 0) goto L87
            goto L75
        L87:
            boolean r7 = r6 instanceof defpackage.htl
            if (r7 == 0) goto L98
            htl r6 = (defpackage.htl) r6
            boolean r7 = r6.aT()
            if (r7 != 0) goto L75
            boolean r6 = r6.aj
            if (r6 != 0) goto L98
            goto L75
        L98:
            r6 = 0
        L99:
            apxf r7 = r0.m
            if (r7 == 0) goto Lae
            if (r2 == 0) goto Lae
            if (r3 == 0) goto Lae
            if (r5 == 0) goto Lae
            if (r6 != 0) goto Lae
            ygc r0 = r0.s
            boolean r0 = r0.d()
            if (r0 != 0) goto Lae
            return r4
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout.p():boolean");
    }

    private final boolean q() {
        return this.c == 2 && i() < ((float) (getRight() / 2));
    }

    private static final boolean r(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public final boolean c() {
        if (this.c == 0) {
            return false;
        }
        n();
        o(2);
        return true;
    }

    public final boolean f() {
        if (g() || !p()) {
            return false;
        }
        n();
        o(1);
        return true;
    }

    public final boolean g() {
        int i = this.c;
        return i == 1 || (i == 2 && this.q.b == 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        this.l.c();
        if (this.h) {
            this.l.d(this.a.ax(new ayrs() { // from class: nki
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    zay zayVar = SwipeToContainerFrameLayout.this.e;
                    if (zayVar != null) {
                        zayVar.f();
                    }
                }
            }));
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.l.c();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r9 != 4) goto L43;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.p()
            r1 = 0
            if (r0 == 0) goto Lc1
            zay r0 = r8.e
            if (r0 != 0) goto Ld
            goto Lc1
        Ld:
            int r0 = r9.getActionMasked()
            if (r0 == 0) goto L6b
            r2 = 1
            if (r0 == r2) goto L60
            r3 = 3
            r4 = 2
            if (r0 == r4) goto L28
            if (r0 == r3) goto L60
            r2 = 6
            if (r0 == r2) goto L21
            goto Lc1
        L21:
            zay r0 = r8.e
            r0.e(r9)
            goto Lc1
        L28:
            zay r0 = r8.e
            int r9 = r0.c(r9, r3)
            if (r9 == r2) goto L50
            if (r9 == r4) goto L4a
            if (r9 == r3) goto L39
            r0 = 4
            if (r9 == r0) goto L4a
            goto Lc1
        L39:
            int r9 = r8.c
            if (r9 != r2) goto L44
            zay r9 = r8.e
            r9.f()
            goto Lc1
        L44:
            if (r9 != r4) goto L49
            r8.j()
        L49:
            return r2
        L4a:
            zay r9 = r8.e
            r9.f()
            goto Lc1
        L50:
            int r9 = r8.c
            if (r9 != 0) goto L5a
            zay r9 = r8.e
            r9.f()
            goto Lc1
        L5a:
            if (r9 != r4) goto L5f
            r8.j()
        L5f:
            return r2
        L60:
            zay r9 = r8.e
            r9.f()
            r9 = 0
            r8.r = r9
            r8.s = r9
            goto Lc1
        L6b:
            android.graphics.Rect r0 = new android.graphics.Rect
            int r2 = r8.getLeft()
            int r3 = r8.getTop()
            int r4 = r8.getRight()
            int r5 = r8.getBottom()
            r0.<init>(r2, r3, r4, r5)
            android.graphics.Rect r2 = r8.g
            android.graphics.Rect r3 = new android.graphics.Rect
            int r4 = r0.left
            int r5 = r2.left
            int r4 = r4 + r5
            int r5 = r0.top
            int r6 = r2.top
            int r5 = r5 + r6
            int r6 = r0.right
            int r7 = r2.right
            int r6 = r6 - r7
            int r0 = r0.bottom
            int r2 = r2.bottom
            int r0 = r0 - r2
            r3.<init>(r4, r5, r6, r0)
            float r0 = r9.getX()
            int r0 = (int) r0
            float r2 = r9.getY()
            int r2 = (int) r2
            boolean r0 = r3.contains(r0, r2)
            if (r0 != 0) goto Lac
            return r1
        Lac:
            zay r0 = r8.e
            r0.g(r9)
            android.view.View r9 = r8.n
            float r9 = r9.getTranslationX()
            r8.r = r9
            android.view.View r9 = r8.m
            float r9 = r9.getTranslationX()
            r8.s = r9
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        if (!z || (view = this.n) == null || this.m == null) {
            return;
        }
        int i5 = this.c;
        if (i5 == 0) {
            view.setTranslationX(0.0f);
            this.m.setTranslationX(-getRight());
        } else if (i5 != 1) {
            c();
        } else {
            view.setTranslationX(getRight());
            this.m.setTranslationX(0.0f);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.a) {
            f();
        } else {
            c();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        j();
        savedState.a = g();
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        if (r5 < r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0 != 3) goto L36;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.p()
            r1 = 0
            if (r0 == 0) goto L9e
            zay r0 = r7.e
            if (r0 != 0) goto Ld
            goto L9e
        Ld:
            r0.d(r8)
            r7.n()
            int r0 = r8.getActionMasked()
            r2 = 1
            r3 = 2
            if (r0 == r2) goto L8f
            if (r0 == r3) goto L22
            r1 = 3
            if (r0 == r1) goto L8f
            goto L9d
        L22:
            zay r0 = r7.e
            int r4 = r0.f
            int r4 = r8.findPointerIndex(r4)
            if (r4 >= 0) goto L2d
            goto L35
        L2d:
            float r8 = r8.getX(r4)
            float r0 = r0.b
            float r0 = r0 - r8
            int r1 = (int) r0
        L35:
            int r8 = -r1
            float r8 = (float) r8
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L3d
            goto L9d
        L3d:
            android.view.View r0 = r7.n
            int r1 = r0.getLeft()
            int r4 = r7.getRight()
            float r5 = r7.r
            float r5 = r5 + r8
            float r1 = (float) r1
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 > 0) goto L51
        L4f:
            r5 = r1
            goto L56
        L51:
            float r1 = (float) r4
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L4f
        L56:
            r0.setX(r5)
            android.view.View r0 = r7.m
            int r1 = r7.getLeft()
            int r4 = r7.getRight()
            float r5 = r7.s
            float r5 = r5 + r8
            float r8 = (float) r1
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 > 0) goto L71
            int r8 = -r4
            float r8 = (float) r8
            float r8 = java.lang.Math.max(r8, r5)
        L71:
            r0.setX(r8)
            nkh r8 = r7.f
            if (r8 == 0) goto L9d
            int r0 = r7.d
            int r1 = r7.c
            if (r1 == r3) goto L81
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L8b
        L81:
            float r1 = r7.h()
            int r3 = r7.getRight()
            float r3 = (float) r3
            float r1 = r1 / r3
        L8b:
            r8.r(r0, r1)
            goto L9d
        L8f:
            zay r0 = r7.e
            int r8 = r0.i(r8, r3)
            r7.o(r8)
            zay r8 = r7.e
            r8.f()
        L9d:
            return r2
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (!this.h || view == null) {
            return;
        }
        int id = view.getId();
        if (this.d == id) {
            this.m = view;
            view.setVisibility(8);
            this.p = ObjectAnimator.ofFloat(this.m, "translationX", 0.0f);
        } else if (this.k == id) {
            this.n = view;
            this.o = ObjectAnimator.ofFloat(view, "translationX", 0.0f);
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (!this.h || view == null) {
            return;
        }
        int id = view.getId();
        if (this.d == id) {
            this.m = null;
            this.p = null;
        } else if (this.k == id) {
            this.n = null;
            this.o = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        zay zayVar = this.e;
        if (zayVar != null) {
            zayVar.f();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new gjj(19);
        public boolean a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SwipeToContainerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.l = new ayqw();
        this.g = new Rect();
        m(context, attributeSet);
    }

    public SwipeToContainerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
        this.l = new ayqw();
        this.g = new Rect();
        m(context, attributeSet);
    }

    public SwipeToContainerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = 0;
        this.l = new ayqw();
        this.g = new Rect();
        m(context, attributeSet);
    }
}
