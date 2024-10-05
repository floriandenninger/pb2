package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class wd {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    private final yx a;
    private final yx b;
    tq t;
    public RecyclerView u;
    public final yy v;
    public final yy w;
    public wr x;
    public boolean y;
    public boolean z;

    public wd() {
        wb wbVar = new wb(this, 1);
        this.a = wbVar;
        wb wbVar2 = new wb(this, 0);
        this.b = wbVar2;
        this.v = new yy(wbVar);
        this.w = new yy(wbVar2);
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = true;
        this.C = true;
    }

    public static int ap(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r3 >= 0) goto L8;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int ar(int r1, int r2, int r3, boolean r4) {
        /*
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto Lf
            if (r3 < 0) goto Ld
            goto L11
        Ld:
            r3 = 0
            goto L21
        Lf:
            if (r3 < 0) goto L14
        L11:
            r2 = 1073741824(0x40000000, float:2.0)
            goto L21
        L14:
            r4 = -1
            if (r3 != r4) goto L1b
            r2 = 1073741824(0x40000000, float:2.0)
        L19:
            r3 = r1
            goto L21
        L1b:
            r4 = -2
            if (r3 != r4) goto Ld
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L19
        L21:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd.ar(int, int, int, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int as(int r3, int r4, int r5, int r6, boolean r7) {
        /*
            int r3 = r3 - r5
            r5 = 0
            int r3 = java.lang.Math.max(r5, r3)
            r0 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L19
            if (r6 < 0) goto L10
            goto L1b
        L10:
            if (r6 != r0) goto L2f
            if (r4 == r1) goto L20
            if (r4 == 0) goto L2f
            if (r4 == r2) goto L20
            goto L2f
        L19:
            if (r6 < 0) goto L1e
        L1b:
            r4 = 1073741824(0x40000000, float:2.0)
            goto L31
        L1e:
            if (r6 != r0) goto L22
        L20:
            r6 = r3
            goto L31
        L22:
            r7 = -2
            if (r6 != r7) goto L2f
            if (r4 == r1) goto L2c
            if (r4 != r2) goto L2a
            goto L2c
        L2a:
            r4 = 0
            goto L20
        L2c:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L20
        L2f:
            r4 = 0
            r6 = 0
        L31:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd.as(int, int, int, int, boolean):int");
    }

    public static wc ax(Context context, AttributeSet attributeSet, int i, int i2) {
        wc wcVar = new wc();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oo.a, i, i2);
        wcVar.a = obtainStyledAttributes.getInt(0, 1);
        wcVar.b = obtainStyledAttributes.getInt(10, 1);
        wcVar.c = obtainStyledAttributes.getBoolean(9, false);
        wcVar.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return wcVar;
    }

    public static boolean be(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static final int bi(View view) {
        return ((we) view.getLayoutParams()).d.bottom;
    }

    public static final int bj(View view) {
        Rect rect = ((we) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int bk(View view) {
        Rect rect = ((we) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bl(View view) {
        return ((we) view.getLayoutParams()).d.left;
    }

    public static final int bm(View view) {
        return ((we) view.getLayoutParams()).pL();
    }

    public static final int bn(View view) {
        return ((we) view.getLayoutParams()).d.right;
    }

    public static final int bo(View view) {
        return ((we) view.getLayoutParams()).d.top;
    }

    public static final void bq(View view, int i, int i2, int i3, int i4) {
        we weVar = (we) view.getLayoutParams();
        Rect rect = weVar.d;
        view.layout(i + rect.left + weVar.leftMargin, i2 + rect.top + weVar.topMargin, (i3 - rect.right) - weVar.rightMargin, (i4 - rect.bottom) - weVar.bottomMargin);
    }

    public static final int bw(View view) {
        return view.getBottom() + bi(view);
    }

    public static final int bx(View view) {
        return view.getLeft() - bl(view);
    }

    public static final int by(View view) {
        return view.getRight() + bn(view);
    }

    public static final int bz(View view) {
        return view.getTop() - bo(view);
    }

    private final void c(View view, int i, boolean z) {
        wv l = RecyclerView.l(view);
        if (z || l.v()) {
            this.u.h.a(l);
        } else {
            this.u.h.d(l);
        }
        we weVar = (we) view.getLayoutParams();
        if (l.B() || l.w()) {
            if (l.w()) {
                l.p();
            } else {
                l.i();
            }
            this.t.g(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.u) {
            int c = this.t.c(view);
            if (i == -1) {
                i = this.t.a();
            }
            if (c == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.u.indexOfChild(view) + this.u.p());
            }
            if (c != i) {
                wd wdVar = this.u.n;
                View az = wdVar.az(c);
                if (az == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + c + wdVar.u.toString());
                }
                wdVar.aH(c);
                we weVar2 = (we) az.getLayoutParams();
                wv l2 = RecyclerView.l(az);
                if (l2.v()) {
                    wdVar.u.h.a(l2);
                } else {
                    wdVar.u.h.d(l2);
                }
                wdVar.t.g(az, i, weVar2, l2.v());
            }
        } else {
            this.t.f(view, i, false);
            weVar.e = true;
            wr wrVar = this.x;
            if (wrVar != null && wrVar.f && wr.m(view) == wrVar.b) {
                wrVar.g = view;
            }
        }
        if (weVar.f) {
            l.a.invalidate();
            weVar.f = false;
        }
    }

    public int A(ws wsVar) {
        throw null;
    }

    public int B(ws wsVar) {
        throw null;
    }

    public int C(ws wsVar) {
        throw null;
    }

    public int D(ws wsVar) {
        throw null;
    }

    public int E(ws wsVar) {
        throw null;
    }

    public int F(ws wsVar) {
        throw null;
    }

    public Parcelable P() {
        throw null;
    }

    public View S(int i) {
        int aq = aq();
        for (int i2 = 0; i2 < aq; i2++) {
            View az = az(i2);
            wv l = RecyclerView.l(az);
            if (l != null && l.c() == i && !l.A() && (this.u.M.g || !l.v())) {
                return az;
            }
        }
        return null;
    }

    public void T(String str) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.w(str);
        }
    }

    public void W(RecyclerView recyclerView, wk wkVar) {
    }

    public void X(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.u;
        wk wkVar = recyclerView.d;
        ws wsVar = recyclerView.M;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.u.canScrollVertically(-1) && !this.u.canScrollHorizontally(-1) && !this.u.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        vw vwVar = this.u.m;
        if (vwVar != null) {
            accessibilityEvent.setItemCount(vwVar.b());
        }
    }

    public void Y(Parcelable parcelable) {
        throw null;
    }

    public void Z(int i) {
        throw null;
    }

    public final View aA() {
        View focusedChild;
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.t.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void aB(View view) {
        aC(view, -1);
    }

    public final void aC(View view, int i) {
        c(view, i, true);
    }

    public final void aD(View view) {
        aE(view, -1);
    }

    public final void aE(View view, int i) {
        c(view, i, false);
    }

    public final void aF(View view, Rect rect) {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.f(view));
        }
    }

    public final void aG(wk wkVar) {
        int aq = aq();
        while (true) {
            aq--;
            if (aq < 0) {
                return;
            }
            View az = az(aq);
            wv l = RecyclerView.l(az);
            if (!l.A()) {
                if (!l.t() || l.v() || this.u.m.b) {
                    aH(aq);
                    wkVar.k(az);
                    this.u.h.d(l);
                } else {
                    aU(aq);
                    wkVar.j(l);
                }
            }
        }
    }

    public final void aH(int i) {
        az(i);
        this.t.h(i);
    }

    public final void aI(RecyclerView recyclerView) {
        this.z = true;
        aM(recyclerView);
    }

    public final void aJ(RecyclerView recyclerView, wk wkVar) {
        this.z = false;
        W(recyclerView, wkVar);
    }

    public void aK(int i) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            int a = recyclerView.g.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.g.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aL(int i) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            int a = recyclerView.g.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.g.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void aM(RecyclerView recyclerView) {
    }

    public final void aN(View view, ks ksVar) {
        wv l = RecyclerView.l(view);
        if (l == null || l.v() || this.t.k(l.a)) {
            return;
        }
        RecyclerView recyclerView = this.u;
        pQ(recyclerView.d, recyclerView.M, view, ksVar);
    }

    public void aO(int i) {
    }

    public final void aP() {
        int aq = aq();
        while (true) {
            aq--;
            if (aq < 0) {
                return;
            } else {
                this.t.j(aq);
            }
        }
    }

    public final void aQ(wk wkVar) {
        int aq = aq();
        while (true) {
            aq--;
            if (aq < 0) {
                return;
            }
            if (!RecyclerView.l(az(aq)).A()) {
                aT(aq, wkVar);
            }
        }
    }

    public final void aR(wk wkVar) {
        int size = wkVar.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((wv) wkVar.a.get(i)).a;
            wv l = RecyclerView.l(view);
            if (!l.A()) {
                l.n(false);
                if (l.x()) {
                    this.u.removeDetachedView(view, false);
                }
                vz vzVar = this.u.E;
                if (vzVar != null) {
                    vzVar.b(l);
                }
                l.n(true);
                wkVar.f(view);
            }
        }
        wkVar.a.clear();
        ArrayList arrayList = wkVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.u.invalidate();
        }
    }

    public final void aS(View view, wk wkVar) {
        tq tqVar = this.t;
        int h = tqVar.c.h(view);
        if (h >= 0) {
            if (tqVar.a.g(h)) {
                tqVar.l(view);
            }
            tqVar.c.k(h);
        }
        wkVar.i(view);
    }

    public final void aT(int i, wk wkVar) {
        View az = az(i);
        aU(i);
        wkVar.i(az);
    }

    public final void aU(int i) {
        if (az(i) != null) {
            this.t.j(i);
        }
    }

    public final void aV() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void aW() {
        this.y = true;
    }

    public final void aX(RecyclerView recyclerView) {
        aZ(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void aY(boolean z) {
        if (z != this.C) {
            this.C = z;
            this.D = 0;
            RecyclerView recyclerView = this.u;
            if (recyclerView != null) {
                recyclerView.d.m();
            }
        }
    }

    public final void aZ(int i, int i2) {
        this.H = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.F = mode;
        if (mode == 0 && !RecyclerView.a) {
            this.H = 0;
        }
        this.I = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.G = mode2;
        if (mode2 != 0 || RecyclerView.a) {
            return;
        }
        this.I = 0;
    }

    public boolean ad() {
        throw null;
    }

    public boolean ae() {
        throw null;
    }

    public boolean af() {
        return this.A;
    }

    public boolean ai() {
        return false;
    }

    public void aj(int i, int i2, ws wsVar, up upVar) {
    }

    public void ak(int i, up upVar) {
    }

    public void ao(RecyclerView recyclerView, int i) {
        throw null;
    }

    public final int aq() {
        tq tqVar = this.t;
        if (tqVar != null) {
            return tqVar.a();
        }
        return 0;
    }

    public final int at() {
        RecyclerView recyclerView = this.u;
        vw vwVar = recyclerView != null ? recyclerView.m : null;
        if (vwVar != null) {
            return vwVar.b();
        }
        return 0;
    }

    public final int au() {
        return jw.e(this.u);
    }

    public final int av() {
        return jw.f(this.u);
    }

    public final int aw() {
        return jw.g(this.u);
    }

    public final View ay(View view) {
        View o;
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || (o = recyclerView.o(view)) == null || this.t.k(o)) {
            return null;
        }
        return o;
    }

    public final View az(int i) {
        tq tqVar = this.t;
        if (tqVar != null) {
            return tqVar.d(i);
        }
        return null;
    }

    public final void ba(int i, int i2) {
        this.u.setMeasuredDimension(i, i2);
    }

    public final void bb(int i, int i2) {
        int aq = aq();
        if (aq != 0) {
            int i3 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            int i4 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < aq; i7++) {
                View az = az(i7);
                Rect rect = this.u.k;
                RecyclerView.L(az, rect);
                if (rect.left < i5) {
                    i5 = rect.left;
                }
                if (rect.right > i3) {
                    i3 = rect.right;
                }
                if (rect.top < i6) {
                    i6 = rect.top;
                }
                if (rect.bottom > i4) {
                    i4 = rect.bottom;
                }
            }
            this.u.k.set(i5, i6, i3, i4);
            pR(this.u.k, i, i2);
            return;
        }
        this.u.B(i, i2);
    }

    public final void bc(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.u = null;
            this.t = null;
            this.H = 0;
            this.I = 0;
        } else {
            this.u = recyclerView;
            this.t = recyclerView.g;
            this.H = recyclerView.getWidth();
            this.I = recyclerView.getHeight();
        }
        this.F = 1073741824;
        this.G = 1073741824;
    }

    public final void bd(wr wrVar) {
        wr wrVar2 = this.x;
        if (wrVar2 != null && wrVar != wrVar2 && wrVar2.f) {
            wrVar2.f();
        }
        this.x = wrVar;
        RecyclerView recyclerView = this.u;
        recyclerView.f72J.c();
        if (wrVar.h) {
            Log.w("RecyclerView", "An instance of " + wrVar.getClass().getSimpleName() + " was started more than once. Each instance of" + wrVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        wrVar.c = recyclerView;
        wrVar.d = this;
        int i = wrVar.b;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        RecyclerView recyclerView2 = wrVar.c;
        recyclerView2.M.a = i;
        wrVar.f = true;
        wrVar.e = true;
        wrVar.g = recyclerView2.n.S(wrVar.b);
        wrVar.c.f72J.a();
        wrVar.h = true;
    }

    public final boolean bf() {
        wr wrVar = this.x;
        return wrVar != null && wrVar.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b6, code lost:
    
        if ((r11.bottom - r3) > r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ba, code lost:
    
        if (r3 != 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean bg(android.support.v7.widget.RecyclerView r17, android.view.View r18, android.graphics.Rect r19, boolean r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = 2
            int[] r3 = new int[r3]
            int r4 = r16.getPaddingLeft()
            int r5 = r16.getPaddingTop()
            int r6 = r0.H
            int r7 = r16.getPaddingRight()
            int r8 = r0.I
            int r9 = r16.getPaddingBottom()
            int r10 = r18.getLeft()
            int r11 = r2.left
            int r10 = r10 + r11
            int r11 = r18.getScrollX()
            int r10 = r10 - r11
            int r11 = r18.getTop()
            int r12 = r2.top
            int r11 = r11 + r12
            int r12 = r18.getScrollY()
            int r11 = r11 - r12
            int r12 = r19.width()
            int r2 = r19.height()
            int r4 = r10 - r4
            r13 = 0
            int r14 = java.lang.Math.min(r13, r4)
            int r5 = r11 - r5
            int r15 = java.lang.Math.min(r13, r5)
            int r10 = r10 + r12
            int r6 = r6 - r7
            int r10 = r10 - r6
            int r6 = java.lang.Math.max(r13, r10)
            int r11 = r11 + r2
            int r8 = r8 - r9
            int r11 = r11 - r8
            int r2 = java.lang.Math.max(r13, r11)
            int r7 = r16.au()
            r8 = 1
            if (r7 != r8) goto L68
            if (r6 == 0) goto L63
            r14 = r6
            goto L6f
        L63:
            int r14 = java.lang.Math.max(r14, r10)
            goto L6f
        L68:
            if (r14 == 0) goto L6b
            goto L6f
        L6b:
            int r14 = java.lang.Math.min(r4, r6)
        L6f:
            if (r15 == 0) goto L72
            goto L76
        L72:
            int r15 = java.lang.Math.min(r5, r2)
        L76:
            r3[r13] = r14
            r3[r8] = r15
            r2 = r3[r13]
            r3 = r3[r8]
            if (r21 == 0) goto Lb8
            android.view.View r4 = r17.getFocusedChild()
            if (r4 != 0) goto L87
            goto Lbd
        L87:
            int r5 = r16.getPaddingLeft()
            int r6 = r16.getPaddingTop()
            int r7 = r0.H
            int r9 = r16.getPaddingRight()
            int r10 = r0.I
            int r11 = r16.getPaddingBottom()
            int r10 = r10 - r11
            android.support.v7.widget.RecyclerView r11 = r0.u
            android.graphics.Rect r11 = r11.k
            android.support.v7.widget.RecyclerView.L(r4, r11)
            int r4 = r11.left
            int r4 = r4 - r2
            int r7 = r7 - r9
            if (r4 >= r7) goto Lbd
            int r4 = r11.right
            int r4 = r4 - r2
            if (r4 <= r5) goto Lbd
            int r4 = r11.top
            int r4 = r4 - r3
            if (r4 >= r10) goto Lbd
            int r4 = r11.bottom
            int r4 = r4 - r3
            if (r4 <= r6) goto Lbd
        Lb8:
            if (r2 != 0) goto Lbe
            if (r3 == 0) goto Lbd
            goto Lbf
        Lbd:
            return r13
        Lbe:
            r13 = r2
        Lbf:
            if (r20 == 0) goto Lc5
            r1.scrollBy(r13, r3)
            goto Lc8
        Lc5:
            r1.ai(r13, r3)
        Lc8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd.bg(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public boolean bh(View view, int i, int i2, we weVar) {
        return (!view.isLayoutRequested() && this.B && be(view.getWidth(), i, weVar.width) && be(view.getHeight(), i2, weVar.height)) ? false : true;
    }

    public final void bp(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((we) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.u != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.u.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void br(View view) {
        we weVar = (we) view.getLayoutParams();
        Rect f = this.u.f(view);
        int i = f.left;
        int i2 = f.right;
        int i3 = f.top;
        int i4 = f.bottom;
        int as = as(this.H, this.F, getPaddingLeft() + getPaddingRight() + weVar.leftMargin + weVar.rightMargin + i + i2, weVar.width, ad());
        int as2 = as(this.I, this.G, getPaddingTop() + getPaddingBottom() + weVar.topMargin + weVar.bottomMargin + i3 + i4, weVar.height, ae());
        if (bh(view, as, as2, weVar)) {
            view.measure(as, as2);
        }
    }

    public void bs() {
    }

    public void bt(int i) {
    }

    public final void bu(int i, int i2) {
        this.u.B(i, i2);
    }

    public final void bv(Runnable runnable) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    public int d(int i, wk wkVar, ws wsVar) {
        throw null;
    }

    public int e(int i, wk wkVar, ws wsVar) {
        throw null;
    }

    public abstract we f();

    public final int getPaddingBottom() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return jw.h(recyclerView);
        }
        return 0;
    }

    public final int getPaddingLeft() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return jw.i(recyclerView);
        }
        return 0;
    }

    public final int getPaddingTop() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public we h(Context context, AttributeSet attributeSet) {
        return new we(context, attributeSet);
    }

    public void n(wk wkVar, ws wsVar) {
        throw null;
    }

    public void o(ws wsVar) {
    }

    public int ox(wk wkVar, ws wsVar) {
        return -1;
    }

    public int oy(wk wkVar, ws wsVar) {
        return -1;
    }

    public we pO(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof we) {
            return new we((we) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new we((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new we(layoutParams);
    }

    public View pP(View view, int i, wk wkVar, ws wsVar) {
        return null;
    }

    public void pQ(wk wkVar, ws wsVar, View view, ks ksVar) {
    }

    public void pR(Rect rect, int i, int i2) {
        int width = rect.width();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int height = rect.height();
        int paddingTop = getPaddingTop();
        ba(ap(i, width + paddingLeft + paddingRight, aw()), ap(i2, height + paddingTop + getPaddingBottom(), av()));
    }

    public boolean pS() {
        return false;
    }

    public void pT() {
    }

    public boolean s(we weVar) {
        return weVar != null;
    }

    public void v(int i, int i2) {
    }

    public void x(int i, int i2) {
    }

    public void y(int i, int i2) {
    }

    public void z(int i, int i2) {
        bt(i);
    }
}
