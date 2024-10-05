package android.support.v7.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import defpackage.asc;
import defpackage.ir;
import defpackage.is;
import defpackage.ji;
import defpackage.jt;
import defpackage.jw;
import defpackage.jx;
import defpackage.ll;
import defpackage.lo;
import defpackage.off;
import defpackage.oo;
import defpackage.sg;
import defpackage.sh;
import defpackage.tq;
import defpackage.ub;
import defpackage.ul;
import defpackage.up;
import defpackage.ur;
import defpackage.vv;
import defpackage.vw;
import defpackage.vy;
import defpackage.vz;
import defpackage.wa;
import defpackage.wd;
import defpackage.we;
import defpackage.wf;
import defpackage.wg;
import defpackage.wh;
import defpackage.wj;
import defpackage.wk;
import defpackage.wl;
import defpackage.wm;
import defpackage.wn;
import defpackage.wq;
import defpackage.wr;
import defpackage.ws;
import defpackage.wt;
import defpackage.wu;
import defpackage.wv;
import defpackage.wx;
import defpackage.yz;
import defpackage.za;
import defpackage.zh;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ir {
    public static final /* synthetic */ int V = 0;
    private static final int[] W = {R.attr.nestedScrollingEnabled};
    public static final boolean a;
    private static final Class[] aa;
    public static final Interpolator b;
    static final wt c;
    public EdgeEffect A;
    public EdgeEffect B;
    public EdgeEffect C;
    public EdgeEffect D;
    public vz E;
    public int F;
    public int G;
    public wg H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final wu f72J;
    public ur K;
    public up L;
    public final ws M;
    public boolean N;
    public boolean O;
    public boolean P;
    public wx Q;
    public final int[] R;
    final List S;
    public jt T;
    public lo U;
    private final int[] aA;
    private Runnable aB;
    private boolean aC;
    private int aD;
    private int aE;
    private wa aF;
    private final wa aG;
    private final wm ab;
    private final Rect ac;
    private final ArrayList ad;
    private wh ae;
    private int af;
    private boolean ag;
    private int ah;
    private final AccessibilityManager ai;
    private int aj;
    private int ak;
    private int al;
    private VelocityTracker am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private final int ar;
    private float as;
    private float at;
    private boolean au;
    private List av;
    private vy aw;
    private final int[] ax;
    private is ay;
    private final int[] az;
    public final wk d;
    SavedState e;
    public sh f;
    public tq g;
    public final za h;
    public boolean i;
    public final Runnable j;
    public final Rect k;
    public final RectF l;
    public vw m;
    public wd n;
    public wl o;
    public final List p;
    public final ArrayList q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public List x;
    public boolean y;
    boolean z;

    static {
        a = Build.VERSION.SDK_INT >= 23;
        aa = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
        b = new zh(1);
        c = new wt();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public static void L(View view, Rect rect) {
        we weVar = (we) view.getLayoutParams();
        Rect rect2 = weVar.d;
        rect.set((view.getLeft() - rect2.left) - weVar.leftMargin, (view.getTop() - rect2.top) - weVar.topMargin, view.getRight() + rect2.right + weVar.rightMargin, view.getBottom() + rect2.bottom + weVar.bottomMargin);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.A
            r1 = 0
            if (r0 == 0) goto L36
            float r0 = defpackage.ji.d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L36
            android.widget.EdgeEffect r0 = r3.A
            float r4 = -r4
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = defpackage.ji.e(r0, r4, r2)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.A
            float r5 = defpackage.ji.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L34
            android.widget.EdgeEffect r5 = r3.A
            r5.onRelease()
        L34:
            r1 = r4
            goto L58
        L36:
            android.widget.EdgeEffect r0 = r3.C
            if (r0 == 0) goto L58
            float r0 = defpackage.ji.d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L58
            android.widget.EdgeEffect r0 = r3.C
            float r4 = defpackage.ji.e(r0, r4, r5)
            android.widget.EdgeEffect r5 = r3.C
            float r5 = defpackage.ji.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L34
            android.widget.EdgeEffect r5 = r3.C
            r5.onRelease()
            goto L34
        L58:
            int r4 = r3.getWidth()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L68
            r3.invalidate()
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.a(int, float):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int aH(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.B
            r1 = 0
            if (r0 == 0) goto L33
            float r0 = defpackage.ji.d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L33
            android.widget.EdgeEffect r0 = r3.B
            float r4 = -r4
            float r4 = defpackage.ji.e(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.B
            float r5 = defpackage.ji.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L31
            android.widget.EdgeEffect r5 = r3.B
            r5.onRelease()
        L31:
            r1 = r4
            goto L58
        L33:
            android.widget.EdgeEffect r0 = r3.D
            if (r0 == 0) goto L58
            float r0 = defpackage.ji.d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L58
            android.widget.EdgeEffect r0 = r3.D
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = defpackage.ji.e(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.D
            float r5 = defpackage.ji.d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L31
            android.widget.EdgeEffect r5 = r3.D
            r5.onRelease()
            goto L31
        L58:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L68
            r3.invalidate()
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.aH(int, float):int");
    }

    private final is aI() {
        if (this.ay == null) {
            this.ay = new is(this);
        }
        return this.ay;
    }

    private final void aJ() {
        aR();
        ah(0);
    }

    private final void aK() {
        int a2;
        yz yzVar;
        this.M.b(1);
        K(this.M);
        this.M.i = false;
        al();
        this.h.c();
        R();
        aO();
        View focusedChild = (this.au && hasFocus() && this.m != null) ? getFocusedChild() : null;
        wv h = focusedChild != null ? h(focusedChild) : null;
        if (h == null) {
            aQ();
        } else {
            ws wsVar = this.M;
            wsVar.m = this.m.b ? h.e : -1L;
            if (this.y) {
                a2 = -1;
            } else {
                a2 = h.v() ? h.d : h.a();
            }
            wsVar.l = a2;
            ws wsVar2 = this.M;
            View view = h.a;
            int id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    id = view.getId();
                }
            }
            wsVar2.n = id;
        }
        ws wsVar3 = this.M;
        wsVar3.h = wsVar3.j && this.O;
        this.O = false;
        this.N = false;
        wsVar3.g = wsVar3.k;
        wsVar3.e = this.m.b();
        aM(this.ax);
        if (this.M.j) {
            int a3 = this.g.a();
            for (int i = 0; i < a3; i++) {
                wv l = l(this.g.d(i));
                if (!l.A() && (!l.t() || this.m.b)) {
                    vz.q(l);
                    l.d();
                    this.h.i(l, vz.w(l));
                    if (this.M.h && l.y() && !l.v() && !l.A() && !l.t()) {
                        this.h.b(e(l), l);
                    }
                }
            }
        }
        if (this.M.k) {
            int b2 = this.g.b();
            for (int i2 = 0; i2 < b2; i2++) {
                wv l2 = l(this.g.e(i2));
                if (!l2.A() && l2.d == -1) {
                    l2.d = l2.c;
                }
            }
            ws wsVar4 = this.M;
            boolean z = wsVar4.f;
            wsVar4.f = false;
            this.n.n(this.d, wsVar4);
            this.M.f = z;
            for (int i3 = 0; i3 < this.g.a(); i3++) {
                wv l3 = l(this.g.d(i3));
                if (!l3.A() && ((yzVar = (yz) this.h.a.get(l3)) == null || (yzVar.b & 4) == 0)) {
                    vz.q(l3);
                    boolean q = l3.q(8192);
                    l3.d();
                    asc w = vz.w(l3);
                    if (q) {
                        aG(l3, w);
                    } else {
                        za zaVar = this.h;
                        yz yzVar2 = (yz) zaVar.a.get(l3);
                        if (yzVar2 == null) {
                            yzVar2 = yz.a();
                            zaVar.a.put(l3, yzVar2);
                        }
                        yzVar2.b |= 2;
                        yzVar2.c = w;
                    }
                }
            }
            y();
        } else {
            y();
        }
        S();
        am(false);
        this.M.d = 2;
    }

    private final void aL() {
        al();
        R();
        this.M.b(6);
        this.f.e();
        this.M.e = this.m.b();
        this.M.c = 0;
        SavedState savedState = this.e;
        if (savedState != null) {
            int i = this.m.c;
            Parcelable parcelable = savedState.a;
            if (parcelable != null) {
                this.n.Y(parcelable);
            }
            this.e = null;
        }
        ws wsVar = this.M;
        wsVar.g = false;
        this.n.n(this.d, wsVar);
        ws wsVar2 = this.M;
        wsVar2.f = false;
        wsVar2.j = wsVar2.j && this.E != null;
        wsVar2.d = 4;
        S();
        am(false);
    }

    private final void aM(int[] iArr) {
        int a2 = this.g.a();
        if (a2 != 0) {
            int i = Integer.MAX_VALUE;
            int i2 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            for (int i3 = 0; i3 < a2; i3++) {
                wv l = l(this.g.d(i3));
                if (!l.A()) {
                    int c2 = l.c();
                    if (c2 < i) {
                        i = c2;
                    }
                    if (c2 > i2) {
                        i2 = c2;
                    }
                }
            }
            iArr[0] = i;
            iArr[1] = i2;
            return;
        }
        iArr[0] = -1;
        iArr[1] = -1;
    }

    private final void aN(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.al) {
            int i = actionIndex == 0 ? 1 : 0;
            this.al = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.ap = x;
            this.an = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.aq = y;
            this.ao = y;
        }
    }

    private final void aO() {
        boolean z;
        if (this.y) {
            this.f.j();
            if (this.z) {
                this.n.pT();
            }
        }
        if (aU()) {
            this.f.g();
        } else {
            this.f.e();
        }
        boolean z2 = this.N || this.O;
        ws wsVar = this.M;
        boolean z3 = this.t && this.E != null && ((z = this.y) || z2 || this.n.y) && (!z || this.m.b);
        wsVar.j = z3;
        wsVar.k = z3 && z2 && !this.y && aU();
    }

    private final void aP(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.k.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof we) {
            we weVar = (we) layoutParams;
            if (!weVar.e) {
                Rect rect = weVar.d;
                this.k.left -= rect.left;
                this.k.right += rect.right;
                this.k.top -= rect.top;
                this.k.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.k);
            offsetRectIntoDescendantCoords(view, this.k);
        } else {
            view2 = null;
        }
        this.n.bg(this, view, this.k, !this.t, view2 == null);
    }

    private final void aQ() {
        ws wsVar = this.M;
        wsVar.m = -1L;
        wsVar.l = -1;
        wsVar.n = -1;
    }

    private final void aR() {
        VelocityTracker velocityTracker = this.am;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        an(0);
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.B;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.B.isFinished();
        }
        EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.C.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.D.isFinished();
        }
        if (z) {
            jw.G(this);
        }
    }

    private final void aS() {
        wr wrVar;
        this.f72J.c();
        wd wdVar = this.n;
        if (wdVar == null || (wrVar = wdVar.x) == null) {
            return;
        }
        wrVar.f();
    }

    private final boolean aT(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.ad.size();
        for (int i = 0; i < size; i++) {
            wh whVar = (wh) this.ad.get(i);
            if (whVar.n(this, motionEvent) && action != 3) {
                this.ae = whVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aU() {
        return this.E != null && this.n.pS();
    }

    private final void aV(Context context, String str, AttributeSet attributeSet, int i) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            if (trim.charAt(0) == '.') {
                trim = context.getPackageName() + trim;
            } else if (!trim.contains(".")) {
                trim = RecyclerView.class.getPackage().getName() + '.' + trim;
            }
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(wd.class);
                try {
                    constructor = asSubclass.getConstructor(aa);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                } catch (NoSuchMethodException e) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e2);
                    }
                }
                constructor.setAccessible(true);
                af((wd) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e7);
            }
        }
    }

    public static wv l(View view) {
        if (view == null) {
            return null;
        }
        return ((we) view.getLayoutParams()).c;
    }

    public static RecyclerView m(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView m = m(viewGroup.getChildAt(i));
            if (m != null) {
                return m;
            }
        }
        return null;
    }

    public static void x(wv wvVar) {
        WeakReference weakReference = wvVar.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == wvVar.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            wvVar.b = null;
        }
    }

    public final void A() {
        if (!this.t || this.y) {
            D();
            return;
        }
        if (this.f.l()) {
            if (!this.f.k(4) || this.f.k(11)) {
                if (this.f.l()) {
                    D();
                    return;
                }
                return;
            }
            al();
            R();
            this.f.g();
            if (!this.u) {
                int a2 = this.g.a();
                int i = 0;
                while (true) {
                    if (i < a2) {
                        wv l = l(this.g.d(i));
                        if (l != null && !l.A() && l.y()) {
                            D();
                            break;
                        }
                        i++;
                    } else {
                        this.f.d();
                        break;
                    }
                }
            }
            am(true);
            S();
        }
    }

    public final void B(int i, int i2) {
        setMeasuredDimension(wd.ap(i, getPaddingLeft() + getPaddingRight(), jw.g(this)), wd.ap(i2, getPaddingTop() + getPaddingBottom(), jw.f(this)));
    }

    public final void C(View view) {
        l(view);
        List list = this.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((wf) this.x.get(size)).a(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e7, code lost:
    
        if (r17.g.k(getFocusedChild()) != false) goto L137;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void D() {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.D():void");
    }

    public final void E(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        aI().i(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void F(int i, int i2) {
        this.ak++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        lo loVar = this.U;
        if (loVar != null) {
            ((off) loVar).k();
        }
        List list = this.av;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((lo) this.av.get(size)).c(this, i, i2);
                }
            }
        }
        this.ak--;
    }

    public final void G() {
        if (this.D != null) {
            return;
        }
        EdgeEffect c2 = this.T.c(this, 3);
        this.D = c2;
        if (this.i) {
            c2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            c2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void H() {
        if (this.A != null) {
            return;
        }
        EdgeEffect c2 = this.T.c(this, 0);
        this.A = c2;
        if (this.i) {
            c2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            c2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void I() {
        if (this.C != null) {
            return;
        }
        EdgeEffect c2 = this.T.c(this, 2);
        this.C = c2;
        if (this.i) {
            c2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            c2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void J() {
        if (this.B != null) {
            return;
        }
        EdgeEffect c2 = this.T.c(this, 1);
        this.B = c2;
        if (this.i) {
            c2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            c2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void K(ws wsVar) {
        if (this.F == 2) {
            OverScroller overScroller = this.f72J.c;
            wsVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            wsVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            wsVar.o = 0;
            wsVar.p = 0;
        }
    }

    public final void M() {
        this.D = null;
        this.B = null;
        this.C = null;
        this.A = null;
    }

    public final void N() {
        if (this.q.size() == 0) {
            return;
        }
        wd wdVar = this.n;
        if (wdVar != null) {
            wdVar.T("Cannot invalidate item decorations during a scroll or layout");
        }
        P();
        requestLayout();
    }

    public final void O(int i) {
        if (this.n == null) {
            return;
        }
        ah(2);
        this.n.Z(i);
        awakenScrollBars();
    }

    final void P() {
        int b2 = this.g.b();
        for (int i = 0; i < b2; i++) {
            ((we) this.g.e(i).getLayoutParams()).e = true;
        }
        wk wkVar = this.d;
        int size = wkVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            we weVar = (we) ((wv) wkVar.c.get(i2)).a.getLayoutParams();
            if (weVar != null) {
                weVar.e = true;
            }
        }
    }

    public final void Q(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b2 = this.g.b();
        for (int i4 = 0; i4 < b2; i4++) {
            wv l = l(this.g.e(i4));
            if (l != null && !l.A()) {
                int i5 = l.c;
                if (i5 >= i3) {
                    l.k(-i2, z);
                    this.M.f = true;
                } else if (i5 >= i) {
                    l.f(8);
                    l.k(-i2, z);
                    l.c = i - 1;
                    this.M.f = true;
                }
            }
        }
        wk wkVar = this.d;
        int size = wkVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                wv wvVar = (wv) wkVar.c.get(size);
                if (wvVar != null) {
                    int i6 = wvVar.c;
                    if (i6 >= i3) {
                        wvVar.k(-i2, z);
                    } else if (i6 >= i) {
                        wvVar.f(8);
                        wkVar.h(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void R() {
        this.aj++;
    }

    final void S() {
        T(true);
    }

    public final void T(boolean z) {
        int i;
        int i2 = this.aj - 1;
        this.aj = i2;
        if (i2 <= 0) {
            this.aj = 0;
            if (z) {
                int i3 = this.ah;
                this.ah = 0;
                if (i3 != 0 && at()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                for (int size = this.S.size() - 1; size >= 0; size--) {
                    wv wvVar = (wv) this.S.get(size);
                    if (wvVar.a.getParent() == this && !wvVar.A() && (i = wvVar.p) != -1) {
                        jw.V(wvVar.a, i);
                        wvVar.p = -1;
                    }
                }
                this.S.clear();
            }
        }
    }

    public final void U() {
        if (this.P || !this.r) {
            return;
        }
        jw.H(this, this.aB);
        this.P = true;
    }

    public final void V(boolean z) {
        this.z = z | this.z;
        this.y = true;
        int b2 = this.g.b();
        for (int i = 0; i < b2; i++) {
            wv l = l(this.g.e(i));
            if (l != null && !l.A()) {
                l.f(6);
            }
        }
        P();
        wk wkVar = this.d;
        int size = wkVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            wv wvVar = (wv) wkVar.c.get(i2);
            if (wvVar != null) {
                wvVar.f(6);
                wvVar.e(null);
            }
        }
        vw vwVar = wkVar.h.m;
        if (vwVar == null || !vwVar.b) {
            wkVar.g();
        }
    }

    public final void W() {
        vz vzVar = this.E;
        if (vzVar != null) {
            vzVar.c();
        }
        wd wdVar = this.n;
        if (wdVar != null) {
            wdVar.aQ(this.d);
            this.n.aR(this.d);
        }
        this.d.e();
    }

    public final void X(wf wfVar) {
        List list = this.x;
        if (list == null) {
            return;
        }
        list.remove(wfVar);
    }

    public final void Y(wh whVar) {
        this.ad.remove(whVar);
        if (this.ae == whVar) {
            this.ae = null;
        }
    }

    public final void Z(int i, int i2, int[] iArr) {
        wv wvVar;
        al();
        R();
        K(this.M);
        int d = i != 0 ? this.n.d(i, this.d, this.M) : 0;
        int e = i2 != 0 ? this.n.e(i2, this.d, this.M) : 0;
        int a2 = this.g.a();
        for (int i3 = 0; i3 < a2; i3++) {
            View d2 = this.g.d(i3);
            wv k = k(d2);
            if (k != null && (wvVar = k.i) != null) {
                View view = wvVar.a;
                int left = d2.getLeft();
                int top = d2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        S();
        am(false);
        if (iArr != null) {
            iArr[0] = d;
            iArr[1] = e;
        }
    }

    public final void aA(int i, int i2) {
        aI().m(i, i2);
    }

    public final void aB(ll llVar) {
        aC(llVar, -1);
    }

    public final void aC(ll llVar, int i) {
        wd wdVar = this.n;
        if (wdVar != null) {
            wdVar.T("Cannot add item decoration during a scroll  or layout");
        }
        if (this.q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.q.add(llVar);
        } else {
            this.q.add(0, llVar);
        }
        P();
        requestLayout();
    }

    public final void aD(lo loVar) {
        if (this.av == null) {
            this.av = new ArrayList();
        }
        this.av.add(loVar);
    }

    public final void aE(ll llVar) {
        wd wdVar = this.n;
        if (wdVar != null) {
            wdVar.T("Cannot remove item decoration during a scroll  or layout");
        }
        this.q.remove(llVar);
        if (this.q.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        P();
        requestLayout();
    }

    public final void aF(lo loVar) {
        List list = this.av;
        if (list != null) {
            list.remove(loVar);
        }
    }

    public final void aG(wv wvVar, asc ascVar) {
        wvVar.m(0, 8192);
        if (this.M.h && wvVar.y() && !wvVar.v() && !wvVar.A()) {
            this.h.b(e(wvVar), wvVar);
        }
        this.h.i(wvVar, ascVar);
    }

    public final void aa(int i) {
        if (this.v) {
            return;
        }
        ao();
        wd wdVar = this.n;
        if (wdVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            wdVar.Z(i);
            awakenScrollBars();
        }
    }

    public final void ab(wx wxVar) {
        this.Q = wxVar;
        jw.M(this, wxVar);
    }

    public void ac(vw vwVar) {
        suppressLayout(false);
        vw vwVar2 = this.m;
        if (vwVar2 != null) {
            vwVar2.v(this.ab);
            this.m.t();
        }
        W();
        this.f.j();
        vw vwVar3 = this.m;
        this.m = vwVar;
        if (vwVar != null) {
            vwVar.u(this.ab);
            vwVar.r();
        }
        wd wdVar = this.n;
        if (wdVar != null) {
            wdVar.bs();
        }
        wk wkVar = this.d;
        vw vwVar4 = this.m;
        wkVar.e();
        wj b2 = wkVar.b();
        if (vwVar3 != null) {
            b2.e();
        }
        if (b2.b == 0) {
            b2.d();
        }
        if (vwVar4 != null) {
            b2.c();
        }
        this.M.f = true;
        V(false);
        requestLayout();
    }

    public final void ad(vy vyVar) {
        if (vyVar == this.aw) {
            return;
        }
        this.aw = vyVar;
        setChildrenDrawingOrderEnabled(vyVar != null);
    }

    public final void ae(vz vzVar) {
        vz vzVar2 = this.E;
        if (vzVar2 != null) {
            vzVar2.c();
            this.E.j = null;
        }
        this.E = vzVar;
        if (vzVar != null) {
            vzVar.j = this.aF;
        }
    }

    public void af(wd wdVar) {
        if (wdVar == this.n) {
            return;
        }
        ao();
        if (this.n != null) {
            vz vzVar = this.E;
            if (vzVar != null) {
                vzVar.c();
            }
            this.n.aQ(this.d);
            this.n.aR(this.d);
            this.d.e();
            if (this.r) {
                this.n.aJ(this, this.d);
            }
            this.n.bc(null);
            this.n = null;
        } else {
            this.d.e();
        }
        tq tqVar = this.g;
        tqVar.a.d();
        int size = tqVar.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            tqVar.c.j((View) tqVar.b.get(size));
            tqVar.b.remove(size);
        }
        wa waVar = tqVar.c;
        int g = waVar.g();
        for (int i = 0; i < g; i++) {
            View i2 = waVar.i(i);
            waVar.a.C(i2);
            i2.clearAnimation();
        }
        waVar.a.removeAllViews();
        this.n = wdVar;
        if (wdVar != null) {
            if (wdVar.u != null) {
                throw new IllegalArgumentException("LayoutManager " + wdVar + " is already attached to a RecyclerView:" + wdVar.u.p());
            }
            this.n.bc(this);
            if (this.r) {
                this.n.aI(this);
            }
        }
        this.d.m();
        requestLayout();
    }

    public final void ag(wj wjVar) {
        wk wkVar = this.d;
        wj wjVar2 = wkVar.g;
        if (wjVar2 != null) {
            wjVar2.e();
        }
        wkVar.g = wjVar;
        wj wjVar3 = wkVar.g;
        if (wjVar3 == null || wkVar.h.m == null) {
            return;
        }
        wjVar3.c();
    }

    public final void ah(int i) {
        if (i == this.F) {
            return;
        }
        this.F = i;
        if (i != 2) {
            aS();
        }
        wd wdVar = this.n;
        if (wdVar != null) {
            wdVar.aO(i);
        }
        List list = this.av;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((lo) this.av.get(size)).b(this, i);
            }
        }
    }

    public final void ai(int i, int i2) {
        aj(i, i2, null);
    }

    public final void aj(int i, int i2, Interpolator interpolator) {
        az(i, i2, interpolator, false);
    }

    public final void ak(int i) {
        if (this.v) {
            return;
        }
        wd wdVar = this.n;
        if (wdVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            wdVar.ao(this, i);
        }
    }

    public final void al() {
        int i = this.af + 1;
        this.af = i;
        if (i != 1 || this.v) {
            return;
        }
        this.u = false;
    }

    public final void am(boolean z) {
        int i = this.af;
        if (i <= 0) {
            this.af = 1;
            i = 1;
        }
        if (!z && !this.v) {
            this.u = false;
        }
        if (i == 1) {
            if (z && this.u && !this.v && this.n != null && this.m != null) {
                D();
            }
            if (!this.v) {
                this.u = false;
            }
        }
        this.af--;
    }

    public final void an(int i) {
        aI().c(i);
    }

    public final void ao() {
        ah(0);
        aS();
    }

    public final boolean aq(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return aI().g(i, i2, iArr, iArr2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public boolean ar(int i, int i2) {
        RecyclerView recyclerView;
        wd wdVar;
        int i3;
        wr d;
        int a2;
        wd wdVar2 = this.n;
        if (wdVar2 == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.v) {
            return false;
        }
        int ad = wdVar2.ad();
        boolean ae = this.n.ae();
        int i4 = (ad == 0 || Math.abs(i) < this.I) ? 0 : i;
        int i5 = (!ae || Math.abs(i2) < this.I) ? 0 : i2;
        if (i4 == 0) {
            if (i5 == 0) {
                return false;
            }
            i4 = 0;
        }
        if (i4 != 0) {
            EdgeEffect edgeEffect = this.A;
            if (edgeEffect != null && ji.d(edgeEffect) != 0.0f) {
                this.A.onAbsorb(-i4);
            } else {
                EdgeEffect edgeEffect2 = this.C;
                if (edgeEffect2 != null && ji.d(edgeEffect2) != 0.0f) {
                    this.C.onAbsorb(i4);
                }
            }
            i4 = 0;
        }
        if (i5 != 0) {
            EdgeEffect edgeEffect3 = this.B;
            if (edgeEffect3 != null && ji.d(edgeEffect3) != 0.0f) {
                this.B.onAbsorb(-i5);
            } else {
                EdgeEffect edgeEffect4 = this.D;
                if (edgeEffect4 != null && ji.d(edgeEffect4) != 0.0f) {
                    this.D.onAbsorb(i5);
                }
            }
            i5 = 0;
        }
        if (i4 == 0) {
            if (i5 == 0) {
                return false;
            }
            i4 = 0;
        }
        float f = i4;
        float f2 = i5;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = ad != 0 || ae;
            dispatchNestedFling(f, f2, z);
            wg wgVar = this.H;
            if (wgVar != null && (wdVar = (recyclerView = wgVar.a).n) != null && recyclerView.m != null && ((Math.abs(i5) > (i3 = recyclerView.I) || Math.abs(i4) > i3) && (wdVar instanceof wq) && (d = wgVar.d(wdVar)) != null && (a2 = wgVar.a(wdVar, i4, i5)) != -1)) {
                d.b = a2;
                wdVar.bd(d);
                return true;
            }
            if (z) {
                if (ae) {
                    ad = (ad == true ? 1 : 0) | 2;
                }
                aA(ad, 1);
                int i6 = this.ar;
                int max = Math.max(-i6, Math.min(i4, i6));
                int i7 = this.ar;
                int max2 = Math.max(-i7, Math.min(i5, i7));
                wu wuVar = this.f72J;
                wuVar.e.ah(2);
                wuVar.b = 0;
                wuVar.a = 0;
                Interpolator interpolator = wuVar.d;
                Interpolator interpolator2 = b;
                if (interpolator != interpolator2) {
                    wuVar.d = interpolator2;
                    wuVar.c = new OverScroller(wuVar.e.getContext(), interpolator2);
                }
                wuVar.c.fling(0, 0, max, max2, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, Integer.MAX_VALUE, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, Integer.MAX_VALUE);
                wuVar.a();
                return true;
            }
        }
        return false;
    }

    public final boolean as() {
        return !this.t || this.y || this.f.l();
    }

    public final boolean at() {
        AccessibilityManager accessibilityManager = this.ai;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean au() {
        return this.aj > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0110, code lost:
    
        if (r2 == 0.0f) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean av(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.av(int, int, android.view.MotionEvent, int):boolean");
    }

    public final void aw() {
        int d = d();
        if (d > 0) {
            int d2 = d();
            if (d2 <= 0) {
                throw new IndexOutOfBoundsException("0 is an invalid index for size " + d2);
            }
            aE((ll) this.q.get(0));
            return;
        }
        throw new IndexOutOfBoundsException("0 is an invalid index for size " + d);
    }

    public final void ax(wv wvVar, int i) {
        if (!au()) {
            jw.V(wvVar.a, i);
        } else {
            wvVar.p = i;
            this.S.add(wvVar);
        }
    }

    public final void ay() {
        wk wkVar = this.d;
        wkVar.e = 0;
        wkVar.m();
    }

    public final void az(int i, int i2, Interpolator interpolator, boolean z) {
        wd wdVar = this.n;
        if (wdVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        if (true != wdVar.ad()) {
            i = 0;
        }
        if (true != this.n.ae()) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return;
            } else {
                i = 0;
            }
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            aA(i3, 1);
        }
        this.f72J.b(i, i2, CellularSignalStrengthError.ERROR_NOT_SUPPORTED, interpolator);
    }

    public final int b(wv wvVar) {
        if (wvVar.q(524) || !wvVar.s()) {
            return -1;
        }
        sh shVar = this.f;
        int i = wvVar.c;
        int size = shVar.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            sg sgVar = (sg) shVar.a.get(i2);
            int i3 = sgVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = sgVar.b;
                    if (i4 <= i) {
                        int i5 = sgVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = sgVar.b;
                    if (i6 == i) {
                        i = sgVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (sgVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (sgVar.b <= i) {
                i += sgVar.d;
            }
        }
        return i;
    }

    public final int c(View view) {
        wv l = l(view);
        if (l != null) {
            return l.a();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof we) && this.n.s((we) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        wd wdVar = this.n;
        if (wdVar != null && wdVar.ad()) {
            return this.n.A(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        wd wdVar = this.n;
        if (wdVar != null && wdVar.ad()) {
            return this.n.B(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        wd wdVar = this.n;
        if (wdVar != null && wdVar.ad()) {
            return this.n.C(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        wd wdVar = this.n;
        if (wdVar != null && wdVar.ae()) {
            return this.n.D(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        wd wdVar = this.n;
        if (wdVar != null && wdVar.ae()) {
            return this.n.E(this.M);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        wd wdVar = this.n;
        if (wdVar != null && wdVar.ae()) {
            return this.n.F(this.M);
        }
        return 0;
    }

    public final int d() {
        return this.q.size();
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return aI().d(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return aI().e(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return aI().f(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return aI().h(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.q.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((ll) this.q.get(i)).f(canvas, this);
        }
        EdgeEffect edgeEffect = this.A;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.A;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.B;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.C;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.C;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.D;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.D;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || (this.E != null && this.q.size() > 0 && this.E.j())) {
            jw.G(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    final long e(wv wvVar) {
        return this.m.b ? wvVar.e : wvVar.c;
    }

    public final Rect f(View view) {
        we weVar = (we) view.getLayoutParams();
        if (!weVar.e) {
            return weVar.d;
        }
        if (!this.M.g || (!weVar.pM() && !weVar.c.t())) {
            Rect rect = weVar.d;
            rect.set(0, 0, 0, 0);
            int size = this.q.size();
            for (int i = 0; i < size; i++) {
                this.k.set(0, 0, 0, 0);
                ((ll) this.q.get(i)).d(this.k, view, this, this.M);
                rect.left += this.k.left;
                rect.top += this.k.top;
                rect.right += this.k.right;
                rect.bottom += this.k.bottom;
            }
            weVar.e = false;
            return rect;
        }
        return weVar.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0065, code lost:
    
        if (r3.findNextFocus(r13, r14, true != ((r13.n.au() == 1) ^ (r15 == 2)) ? 17 : 66) == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r3.findNextFocus(r13, r14, r15 == 2 ? 130 : 33) != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (o(r14) != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        al();
        r13.n.pP(r14, r15, r13.d, r13.M);
        am(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0195, code lost:
    
        if (r8 > 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01b6, code lost:
    
        if (r10 > 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b9, code lost:
    
        if (r8 < 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01bc, code lost:
    
        if (r10 < 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c5, code lost:
    
        if ((r10 * r3) > 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d2, code lost:
    
        if (r1 == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ce, code lost:
    
        if ((r10 * r3) < 0) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0107  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final wj g() {
        return this.d.b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        wd wdVar = this.n;
        if (wdVar == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
        }
        return wdVar.f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        wd wdVar = this.n;
        if (wdVar == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
        }
        return wdVar.h(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.n != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        vy vyVar = this.aw;
        return vyVar == null ? super.getChildDrawingOrder(i, i2) : vyVar.a(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.i;
    }

    public final wv h(View view) {
        View o = o(view);
        if (o == null) {
            return null;
        }
        return k(o);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return aI().j();
    }

    public final wv i(int i) {
        wv wvVar = null;
        if (this.y) {
            return null;
        }
        int b2 = this.g.b();
        for (int i2 = 0; i2 < b2; i2++) {
            wv l = l(this.g.e(i2));
            if (l != null && !l.v() && b(l) == i) {
                if (!this.g.k(l.a)) {
                    return l;
                }
                wvVar = l;
            }
        }
        return wvVar;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.r;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return aI().a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.wv j(int r6, boolean r7) {
        /*
            r5 = this;
            tq r0 = r5.g
            int r0 = r0.b()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            tq r3 = r5.g
            android.view.View r3 = r3.e(r2)
            wv r3 = l(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.c()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            tq r1 = r5.g
            android.view.View r4 = r3.a
            boolean r1 = r1.k(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.j(int, boolean):wv");
    }

    public final wv k(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return l(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final View n(float f, float f2) {
        int a2 = this.g.a();
        while (true) {
            a2--;
            if (a2 < 0) {
                return null;
            }
            View d = this.g.d(a2);
            float translationX = d.getTranslationX();
            float translationY = d.getTranslationY();
            if (f >= d.getLeft() + translationX && f <= d.getRight() + translationX && f2 >= d.getTop() + translationY && f2 <= d.getBottom() + translationY) {
                return d;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View o(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.o(android.view.View):android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.aj = 0;
        this.r = true;
        this.t = this.t && !isLayoutRequested();
        wd wdVar = this.n;
        if (wdVar != null) {
            wdVar.aI(this);
        }
        this.P = false;
        ur urVar = (ur) ur.a.get();
        this.K = urVar;
        if (urVar == null) {
            this.K = new ur();
            Display u = jw.u(this);
            float f = 60.0f;
            if (!isInEditMode() && u != null) {
                float refreshRate = u.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            this.K.e = 1.0E9f / f;
            ur.a.set(this.K);
        }
        this.K.c.add(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vz vzVar = this.E;
        if (vzVar != null) {
            vzVar.c();
        }
        ao();
        this.r = false;
        wd wdVar = this.n;
        if (wdVar != null) {
            wdVar.aJ(this, this.d);
        }
        this.S.clear();
        removeCallbacks(this.aB);
        yz.b();
        ur urVar = this.K;
        if (urVar != null) {
            urVar.c.remove(this);
            this.K = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            ((ll) this.q.get(i)).e(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
    
        if (r0 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017b, code lost:
    
        if (r10.F != 2) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        D();
        this.t = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        wd wdVar = this.n;
        if (wdVar == null) {
            B(i, i2);
            return;
        }
        boolean z = false;
        if (wdVar.af()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.n.bu(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aC = z;
            if (z || this.m == null) {
                return;
            }
            if (this.M.d == 1) {
                aK();
            }
            this.n.aZ(i, i2);
            this.M.i = true;
            aL();
            this.n.bb(i, i2);
            if (this.n.ai()) {
                this.n.aZ(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.M.i = true;
                aL();
                this.n.bb(i, i2);
            }
            this.aD = getMeasuredWidth();
            this.aE = getMeasuredHeight();
            return;
        }
        if (this.s) {
            this.n.bu(i, i2);
            return;
        }
        if (this.w) {
            al();
            R();
            aO();
            S();
            ws wsVar = this.M;
            if (wsVar.k) {
                wsVar.g = true;
            } else {
                this.f.e();
                this.M.g = false;
            }
            this.w = false;
            am(false);
        } else if (this.M.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        vw vwVar = this.m;
        if (vwVar != null) {
            this.M.e = vwVar.b();
        } else {
            this.M.e = 0;
        }
        al();
        this.n.bu(i, i2);
        am(false);
        this.M.g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (au()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.e = savedState;
        super.onRestoreInstanceState(savedState.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.e;
        if (savedState2 != null) {
            savedState.a = savedState2.a;
        } else {
            wd wdVar = this.n;
            savedState.a = wdVar != null ? wdVar.P() : null;
        }
        return savedState;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        M();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0188, code lost:
    
        if (r0 != 0) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final String p() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        wv l = l(view);
        if (l != null) {
            if (l.x()) {
                l.j();
            } else if (!l.A()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + l + p());
            }
        }
        view.clearAnimation();
        C(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.n.bf() && !au() && view2 != null) {
            aP(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.n.bg(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.ad.size();
        for (int i = 0; i < size; i++) {
            ((wh) this.ad.get(i)).h(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.af != 0 || this.v) {
            this.u = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        wd wdVar = this.n;
        if (wdVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        boolean ad = wdVar.ad();
        boolean ae = this.n.ae();
        if (!ad) {
            if (!ae) {
                return;
            } else {
                ae = true;
            }
        }
        if (true != ad) {
            i = 0;
        }
        if (true != ae) {
            i2 = 0;
        }
        av(i, i2, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!au()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.ah |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.i) {
            M();
        }
        this.i = z;
        super.setClipToPadding(z);
        if (this.t) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        aI().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return aI().l(i);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        aI().b();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.v) {
            w("Do not suppressLayout in layout or scroll");
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.v = true;
                this.ag = true;
                ao();
                return;
            }
            this.v = false;
            if (this.u && this.n != null && this.m != null) {
                requestLayout();
            }
            this.u = false;
        }
    }

    public final void t(wv wvVar) {
        View view = wvVar.a;
        ViewParent parent = view.getParent();
        this.d.l(k(view));
        if (wvVar.x()) {
            this.g.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (parent != this) {
            this.g.f(view, -1, true);
            return;
        }
        tq tqVar = this.g;
        int h = tqVar.c.h(view);
        if (h < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        tqVar.a.e(h);
        tqVar.i(view);
    }

    public final void u(wf wfVar) {
        if (this.x == null) {
            this.x = new ArrayList();
        }
        this.x.add(wfVar);
    }

    public final void v(wh whVar) {
        this.ad.add(whVar);
    }

    public final void w(String str) {
        if (au()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + p());
            }
            throw new IllegalStateException(str);
        }
        if (this.ak > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + p()));
        }
    }

    final void y() {
        int b2 = this.g.b();
        for (int i = 0; i < b2; i++) {
            wv l = l(this.g.e(i));
            if (!l.A()) {
                l.g();
            }
        }
        wk wkVar = this.d;
        int size = wkVar.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((wv) wkVar.c.get(i2)).g();
        }
        int size2 = wkVar.a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((wv) wkVar.a.get(i3)).g();
        }
        ArrayList arrayList = wkVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((wv) wkVar.b.get(i4)).g();
            }
        }
    }

    public final void z(int i, int i2) {
        EdgeEffect edgeEffect = this.A;
        boolean z = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A.onRelease();
            z = this.A.isFinished();
        }
        EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.C.onRelease();
            z |= this.C.isFinished();
        }
        EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.B.onRelease();
            z |= this.B.isFinished();
        }
        EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.D.onRelease();
            z |= this.D.isFinished();
        }
        if (z) {
            jw.G(this);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.youtube.R.attr.recyclerViewStyle);
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new wn(0);
        Parcelable a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readParcelable(classLoader == null ? wd.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ab = new wm(this);
        this.d = new wk(this);
        this.h = new za();
        this.j = new vv(this, 1);
        this.k = new Rect();
        this.ac = new Rect();
        this.l = new RectF();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.ad = new ArrayList();
        this.af = 0;
        this.y = false;
        this.z = false;
        this.aj = 0;
        this.ak = 0;
        this.T = c;
        this.E = new ub();
        this.F = 0;
        this.al = -1;
        this.as = Float.MIN_VALUE;
        this.at = Float.MIN_VALUE;
        this.au = true;
        this.f72J = new wu(this);
        this.L = new up();
        this.M = new ws();
        this.N = false;
        this.O = false;
        this.aF = new wa(this);
        this.P = false;
        this.ax = new int[2];
        this.az = new int[2];
        this.aA = new int[2];
        this.R = new int[2];
        this.S = new ArrayList();
        this.aB = new vv(this, 0);
        this.aD = 0;
        this.aE = 0;
        this.aG = new wa(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.G = viewConfiguration.getScaledTouchSlop();
        this.as = jx.a(viewConfiguration, context);
        this.at = jx.b(viewConfiguration, context);
        this.I = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ar = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.E.j = this.aF;
        this.f = new sh(new wa(this), null);
        this.g = new tq(new wa(this), null);
        if (jw.d(this) == 0) {
            jw.W(this, 8);
        }
        if (jw.c(this) == 0) {
            jw.V(this, 1);
        }
        this.ai = (AccessibilityManager) getContext().getSystemService("accessibility");
        ab(new wx(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oo.a, i, 0);
        jw.L(this, context, oo.a, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.i = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + p());
            }
            Resources resources = getContext().getResources();
            new ul(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.google.android.youtube.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.google.android.youtube.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.google.android.youtube.R.dimen.fastscroll_margin));
        }
        obtainStyledAttributes.recycle();
        aV(context, string, attributeSet, i);
        int[] iArr = W;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        jw.L(this, context, iArr, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        wd wdVar = this.n;
        if (wdVar == null) {
            throw new IllegalStateException("RecyclerView has no LayoutManager" + p());
        }
        return wdVar.pO(layoutParams);
    }
}
