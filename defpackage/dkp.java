package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoViewTestHelper;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dkp extends djk {
    private static final String C = "dkp";
    private static final int[] D = new int[2];
    public int A;
    public dkn B;
    private boolean E;
    private boolean F;
    private boolean G;
    private final AccessibilityManager H;
    private final dkm I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f184J;
    private Map K;
    private String L;
    private String M;
    public ComponentTree r;
    public final dkv s;
    public final dhe t;
    public final Rect u;
    public boolean v;
    public int w;
    public int x;
    public dko y;
    public ComponentTree z;

    public dkp(Context context) {
        this(new dhe(context));
    }

    private static int O(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        return mode == 0 ? i : View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i) - i2), mode);
    }

    private final void P() {
        ComponentTree componentTree = this.r;
        if (componentTree == null || componentTree.j) {
            return;
        }
        C(new Rect(0, 0, getWidth(), getHeight()));
    }

    private final void Q() {
        if (this.E) {
            return;
        }
        this.E = true;
        ComponentTree componentTree = this.r;
        if (componentTree != null) {
            componentTree.h();
        }
        p(dgo.b(getContext()));
        AccessibilityManager accessibilityManager = this.H;
        dkm dkmVar = this.I;
        if (dkmVar != null) {
            accessibilityManager.addAccessibilityStateChangeListener(new kq(dkmVar, null, null));
        }
        if (L() || M() || N() || doa.n) {
            return;
        }
        P();
    }

    private final void R() {
        ComponentTree componentTree;
        if (this.E) {
            this.E = false;
            if (!L() && !doa.n && (componentTree = this.r) != null && !componentTree.j) {
                C(new Rect());
            }
            this.s.o();
            ComponentTree componentTree2 = this.r;
            if (componentTree2 != null) {
                componentTree2.k();
            }
            AccessibilityManager accessibilityManager = this.H;
            dkm dkmVar = this.I;
            if (dkmVar == null) {
                return;
            }
            accessibilityManager.removeAccessibilityStateChangeListener(new kq(dkmVar, null, null));
        }
    }

    private final void S() {
        if (this.r == null || !(getParent() instanceof View)) {
            return;
        }
        int width = ((View) getParent()).getWidth();
        int height = ((View) getParent()).getHeight();
        int translationX = (int) getTranslationX();
        int translationY = (int) getTranslationY();
        int top = getTop() + translationY;
        int bottom = getBottom() + translationY;
        int left = getLeft();
        int right = getRight() + translationX;
        if (left + translationX < 0 || top < 0 || right > width || bottom > height || this.u.width() != getWidth() || this.u.height() != getHeight()) {
            Rect rect = new Rect();
            if (getLocalVisibleRect(rect)) {
                B(rect, true);
            }
        }
    }

    private static void T(ComponentHost componentHost) {
        int childCount = componentHost.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = componentHost.getChildAt(i);
            if (childAt.isLayoutRequested()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(childAt.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getHeight(), 1073741824));
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
            if (childAt instanceof ComponentHost) {
                T((ComponentHost) childAt);
            }
        }
    }

    private static void U(String str, String str2, qsn qsnVar) {
        boolean z = qsnVar.d;
        int i = qsnVar.c;
        dhz.b(str2, str);
    }

    public final void A() {
        ComponentTree componentTree = this.r;
        if (componentTree == null || componentTree.t == null) {
            return;
        }
        if (componentTree.j) {
            componentTree.l();
        } else if (componentTree.k) {
            Rect rect = new Rect();
            if (!getLocalVisibleRect(rect)) {
                rect.setEmpty();
            }
            C(rect);
        }
    }

    public final void B(Rect rect, boolean z) {
        ComponentTree componentTree = this.r;
        if (componentTree != null) {
            if (componentTree.t == null) {
                if (!isLayoutRequested()) {
                    throw new RuntimeException("Trying to incrementally mount a component with a null main thread LayoutState on a LithoView that hasn't requested layout!");
                }
            } else if (componentTree.j) {
                componentTree.n(rect, z);
            } else if (z && componentTree.k) {
                C(rect);
            }
        }
    }

    final void C(Rect rect) {
        djx djxVar = this.r.t;
        if (djxVar == null) {
            Log.w(C, "Main Thread Layout state is not found");
        } else {
            this.s.r(djxVar, rect, M(), null);
        }
    }

    public final void D() {
        dkv dkvVar = this.s;
        long[] jArr = dkvVar.b;
        if (jArr == null) {
            return;
        }
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            dum g = dkvVar.g(i);
            if (g != null && !g.c) {
                dha dhaVar = dju.a(g).b;
                Object obj = g.a;
                dkvVar.i(dhaVar, obj);
                g.c = true;
                if ((obj instanceof View) && !(obj instanceof ComponentHost)) {
                    View view = (View) obj;
                    if (view.isLayoutRequested()) {
                        dkv.h(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
                    }
                }
            }
        }
        dkvVar.e = true;
    }

    public final void E() {
        ComponentTree componentTree = this.r;
        if (componentTree != null) {
            componentTree.o();
            this.r = null;
            this.M = "release_CT";
        }
    }

    public final void F() {
        this.B = null;
    }

    public final void G(ComponentTree componentTree) {
        Map map;
        if (this.F) {
            throw new RuntimeException("Cannot update ComponentTree while in the middle of measure");
        }
        this.z = null;
        ComponentTree componentTree2 = this.r;
        if (componentTree2 == componentTree) {
            if (this.E) {
                D();
                return;
            }
            return;
        }
        boolean z = true;
        if (componentTree2 != null && componentTree != null && componentTree2.x == componentTree.x) {
            z = false;
        }
        this.G = z;
        I();
        if (this.r != null) {
            boolean z2 = doa.a;
            this.s.j();
            if (this.K != null) {
                this.L = this.r.f();
            }
            if (componentTree != null && componentTree.getLithoView() != null && (map = this.K) != null && map.containsKey("LithoView:SetAlreadyAttachedComponentTree")) {
                ComponentTree componentTree3 = this.r;
                qsn qsnVar = (qsn) this.K.get("LithoView:SetAlreadyAttachedComponentTree");
                U(qsnVar.b + "-LithoView:SetAlreadyAttachedComponentTree, currentView=" + LithoViewTestHelper.a(componentTree3.getLithoView()) + ", newComponent.LV=" + LithoViewTestHelper.a(componentTree.getLithoView()) + ", currentComponent=" + componentTree3.f() + ", newComponent=" + componentTree.f(), "LithoView:SetAlreadyAttachedComponentTree", qsnVar);
            }
            if (this.E) {
                this.r.k();
            }
            ComponentTree componentTree4 = this.r;
            if (!componentTree4.l) {
                componentTree4.n = null;
            } else {
                throw new IllegalStateException("Clearing the LithoView while the ComponentTree is attached");
            }
        }
        this.r = componentTree;
        if (componentTree != null) {
            if (componentTree.s()) {
                String valueOf = String.valueOf(this.r.e());
                throw new IllegalStateException(valueOf.length() != 0 ? "Setting a released ComponentTree to a LithoView, released component was: ".concat(valueOf) : new String("Setting a released ComponentTree to a LithoView, released component was: "));
            }
            ComponentTree componentTree5 = this.r;
            dkp dkpVar = componentTree5.n;
            if (dkpVar != this) {
                if (dkpVar != null) {
                    dkpVar.G(null);
                } else if (componentTree5.l) {
                    componentTree5.k();
                }
                dhe dheVar = componentTree5.h;
                if (dheVar.b != dheVar.a()) {
                    if (did.a(getContext()) != did.a(componentTree5.h.b)) {
                        String valueOf2 = String.valueOf(getContext());
                        String valueOf3 = String.valueOf(componentTree5.h.b);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 72 + String.valueOf(valueOf3).length());
                        sb.append("Base view context differs, view context is: ");
                        sb.append(valueOf2);
                        sb.append(", ComponentTree context is: ");
                        sb.append(valueOf3);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                componentTree5.n = this;
            }
            if (this.E) {
                this.r.h();
            } else {
                requestLayout();
            }
        }
        this.M = this.r == null ? "set_CT" : null;
    }

    public final void H(List list) {
        if (list == null) {
            this.K = null;
            return;
        }
        this.K = new HashMap();
        int i = ((amvj) list).c;
        for (int i2 = 0; i2 < i; i2++) {
            qsn qsnVar = (qsn) list.get(i2);
            this.K.put(qsnVar.a, qsnVar);
        }
    }

    public final void I() {
        dkv dkvVar = this.s;
        dkvVar.c = true;
        dkvVar.g.setEmpty();
        this.u.setEmpty();
    }

    public final void J() {
        this.s.o();
    }

    public final boolean L() {
        ComponentTree componentTree = this.r;
        return componentTree != null && componentTree.j;
    }

    public final boolean M() {
        return this.s.c;
    }

    public final boolean N() {
        return this.s.d;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        try {
            canvas.translate(getPaddingLeft(), getPaddingTop());
            super.draw(canvas);
        } catch (Throwable th) {
            ComponentTree componentTree = this.r;
            if (componentTree == null || componentTree.b() == null) {
                throw th;
            }
            throw new dhv(this.r.b(), th, null);
        }
    }

    public Deque findTestItems(String str) {
        Map map = this.s.a;
        if (map == null) {
            throw new UnsupportedOperationException("Trying to access TestItems while ComponentsConfiguration.isEndToEndTestRun is false.");
        }
        Deque deque = (Deque) map.get(str);
        return deque == null ? new LinkedList() : deque;
    }

    @Override // android.view.View
    public final void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        S();
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        S();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        R();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01bc A[Catch: all -> 0x01e6, TryCatch #1 {, blocks: (B:2:0x0000, B:5:0x0053, B:7:0x0059, B:12:0x0065, B:13:0x0069, B:15:0x006d, B:16:0x0071, B:18:0x0077, B:21:0x007e, B:24:0x0082, B:26:0x008a, B:29:0x0091, B:33:0x0097, B:35:0x00a4, B:37:0x00a8, B:38:0x00ad, B:40:0x00b1, B:42:0x00b9, B:45:0x00c0, B:47:0x00c6, B:49:0x00cc, B:51:0x00f7, B:53:0x00fd, B:55:0x0101, B:59:0x0106, B:64:0x0119, B:66:0x0121, B:68:0x0125, B:70:0x0129, B:71:0x0138, B:74:0x0145, B:79:0x014c, B:81:0x015d, B:83:0x016b, B:84:0x017b, B:85:0x0170, B:86:0x0177, B:87:0x010e, B:88:0x019d, B:90:0x01a1, B:92:0x01a5, B:94:0x01a9, B:96:0x01af, B:99:0x01b4, B:101:0x01bc, B:102:0x01bf, B:105:0x01ce, B:109:0x01de, B:112:0x0014, B:125:0x0019, B:128:0x0024, B:115:0x0029, B:117:0x003c, B:118:0x0043, B:120:0x0049, B:122:0x004f, B:123:0x0041, B:131:0x0027), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0065 A[Catch: all -> 0x01e6, TryCatch #1 {, blocks: (B:2:0x0000, B:5:0x0053, B:7:0x0059, B:12:0x0065, B:13:0x0069, B:15:0x006d, B:16:0x0071, B:18:0x0077, B:21:0x007e, B:24:0x0082, B:26:0x008a, B:29:0x0091, B:33:0x0097, B:35:0x00a4, B:37:0x00a8, B:38:0x00ad, B:40:0x00b1, B:42:0x00b9, B:45:0x00c0, B:47:0x00c6, B:49:0x00cc, B:51:0x00f7, B:53:0x00fd, B:55:0x0101, B:59:0x0106, B:64:0x0119, B:66:0x0121, B:68:0x0125, B:70:0x0129, B:71:0x0138, B:74:0x0145, B:79:0x014c, B:81:0x015d, B:83:0x016b, B:84:0x017b, B:85:0x0170, B:86:0x0177, B:87:0x010e, B:88:0x019d, B:90:0x01a1, B:92:0x01a5, B:94:0x01a9, B:96:0x01af, B:99:0x01b4, B:101:0x01bc, B:102:0x01bf, B:105:0x01ce, B:109:0x01de, B:112:0x0014, B:125:0x0019, B:128:0x0024, B:115:0x0029, B:117:0x003c, B:118:0x0043, B:120:0x0049, B:122:0x004f, B:123:0x0041, B:131:0x0027), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[Catch: all -> 0x01e6, TryCatch #1 {, blocks: (B:2:0x0000, B:5:0x0053, B:7:0x0059, B:12:0x0065, B:13:0x0069, B:15:0x006d, B:16:0x0071, B:18:0x0077, B:21:0x007e, B:24:0x0082, B:26:0x008a, B:29:0x0091, B:33:0x0097, B:35:0x00a4, B:37:0x00a8, B:38:0x00ad, B:40:0x00b1, B:42:0x00b9, B:45:0x00c0, B:47:0x00c6, B:49:0x00cc, B:51:0x00f7, B:53:0x00fd, B:55:0x0101, B:59:0x0106, B:64:0x0119, B:66:0x0121, B:68:0x0125, B:70:0x0129, B:71:0x0138, B:74:0x0145, B:79:0x014c, B:81:0x015d, B:83:0x016b, B:84:0x017b, B:85:0x0170, B:86:0x0177, B:87:0x010e, B:88:0x019d, B:90:0x01a1, B:92:0x01a5, B:94:0x01a9, B:96:0x01af, B:99:0x01b4, B:101:0x01bc, B:102:0x01bf, B:105:0x01ce, B:109:0x01de, B:112:0x0014, B:125:0x0019, B:128:0x0024, B:115:0x0029, B:117:0x003c, B:118:0x0043, B:120:0x0049, B:122:0x004f, B:123:0x0041, B:131:0x0027), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[Catch: all -> 0x01e6, TryCatch #1 {, blocks: (B:2:0x0000, B:5:0x0053, B:7:0x0059, B:12:0x0065, B:13:0x0069, B:15:0x006d, B:16:0x0071, B:18:0x0077, B:21:0x007e, B:24:0x0082, B:26:0x008a, B:29:0x0091, B:33:0x0097, B:35:0x00a4, B:37:0x00a8, B:38:0x00ad, B:40:0x00b1, B:42:0x00b9, B:45:0x00c0, B:47:0x00c6, B:49:0x00cc, B:51:0x00f7, B:53:0x00fd, B:55:0x0101, B:59:0x0106, B:64:0x0119, B:66:0x0121, B:68:0x0125, B:70:0x0129, B:71:0x0138, B:74:0x0145, B:79:0x014c, B:81:0x015d, B:83:0x016b, B:84:0x017b, B:85:0x0170, B:86:0x0177, B:87:0x010e, B:88:0x019d, B:90:0x01a1, B:92:0x01a5, B:94:0x01a9, B:96:0x01af, B:99:0x01b4, B:101:0x01bc, B:102:0x01bf, B:105:0x01ce, B:109:0x01de, B:112:0x0014, B:125:0x0019, B:128:0x0024, B:115:0x0029, B:117:0x003c, B:118:0x0043, B:120:0x0049, B:122:0x004f, B:123:0x0041, B:131:0x0027), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[Catch: all -> 0x01e6, TryCatch #1 {, blocks: (B:2:0x0000, B:5:0x0053, B:7:0x0059, B:12:0x0065, B:13:0x0069, B:15:0x006d, B:16:0x0071, B:18:0x0077, B:21:0x007e, B:24:0x0082, B:26:0x008a, B:29:0x0091, B:33:0x0097, B:35:0x00a4, B:37:0x00a8, B:38:0x00ad, B:40:0x00b1, B:42:0x00b9, B:45:0x00c0, B:47:0x00c6, B:49:0x00cc, B:51:0x00f7, B:53:0x00fd, B:55:0x0101, B:59:0x0106, B:64:0x0119, B:66:0x0121, B:68:0x0125, B:70:0x0129, B:71:0x0138, B:74:0x0145, B:79:0x014c, B:81:0x015d, B:83:0x016b, B:84:0x017b, B:85:0x0170, B:86:0x0177, B:87:0x010e, B:88:0x019d, B:90:0x01a1, B:92:0x01a5, B:94:0x01a9, B:96:0x01af, B:99:0x01b4, B:101:0x01bc, B:102:0x01bf, B:105:0x01ce, B:109:0x01de, B:112:0x0014, B:125:0x0019, B:128:0x0024, B:115:0x0029, B:117:0x003c, B:118:0x0043, B:120:0x0049, B:122:0x004f, B:123:0x0041, B:131:0x0027), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7 A[Catch: all -> 0x01e6, TryCatch #1 {, blocks: (B:2:0x0000, B:5:0x0053, B:7:0x0059, B:12:0x0065, B:13:0x0069, B:15:0x006d, B:16:0x0071, B:18:0x0077, B:21:0x007e, B:24:0x0082, B:26:0x008a, B:29:0x0091, B:33:0x0097, B:35:0x00a4, B:37:0x00a8, B:38:0x00ad, B:40:0x00b1, B:42:0x00b9, B:45:0x00c0, B:47:0x00c6, B:49:0x00cc, B:51:0x00f7, B:53:0x00fd, B:55:0x0101, B:59:0x0106, B:64:0x0119, B:66:0x0121, B:68:0x0125, B:70:0x0129, B:71:0x0138, B:74:0x0145, B:79:0x014c, B:81:0x015d, B:83:0x016b, B:84:0x017b, B:85:0x0170, B:86:0x0177, B:87:0x010e, B:88:0x019d, B:90:0x01a1, B:92:0x01a5, B:94:0x01a9, B:96:0x01af, B:99:0x01b4, B:101:0x01bc, B:102:0x01bf, B:105:0x01ce, B:109:0x01de, B:112:0x0014, B:125:0x0019, B:128:0x0024, B:115:0x0029, B:117:0x003c, B:118:0x0043, B:120:0x0049, B:122:0x004f, B:123:0x0041, B:131:0x0027), top: B:1:0x0000, inners: #0 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkp.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        R();
    }

    @Override // android.view.View
    public final void setHasTransientState(boolean z) {
        super.setHasTransientState(z);
        if (z) {
            if (this.A == 0 && this.r != null) {
                B(new Rect(0, 0, getWidth(), getHeight()), false);
            }
            this.A++;
            return;
        }
        int i = this.A - 1;
        this.A = i;
        if (i == 0 && this.r != null) {
            A();
        }
        if (this.A < 0) {
            this.A = 0;
        }
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        if (f == getTranslationX()) {
            return;
        }
        super.setTranslationX(f);
        S();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (f == getTranslationY()) {
            return;
        }
        super.setTranslationY(f);
        S();
    }

    @Override // android.view.View
    public final String toString() {
        return LithoViewTestHelper.viewToString(this, true);
    }

    @Override // com.facebook.litho.ComponentHost
    protected final boolean x() {
        ComponentTree componentTree = this.r;
        if (componentTree == null || !componentTree.i) {
            return super.x();
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.litho.ComponentHost
    public final void y(int i, int i2, int i3, int i4) {
        char c;
        ComponentTree componentTree = this.r;
        if (componentTree != null) {
            if (componentTree.s()) {
                throw new IllegalStateException("Trying to layout a LithoView holding onto a released ComponentTree");
            }
            int i5 = i4 - i2;
            if (i5 >= 4096 || i3 - i >= 4096) {
                String str = Build.MODEL;
                switch (str.hashCode()) {
                    case -399073275:
                        if (str.equals("SM-J415F")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -399073274:
                        if (str.equals("SM-J415G")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -399013848:
                        if (str.equals("SM-J610F")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -399013847:
                        if (str.equals("SM-J610G")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 513630441:
                        if (str.equals("SM-J415FN")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 515472678:
                        if (str.equals("SM-J610FN")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0 || c == 1 || c == 2 || c == 3 || c == 4 || c == 5) {
                    int i6 = i3 - i;
                    String o = this.r.b() != null ? this.r.b().o() : null;
                    StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 101);
                    sb.append("LithoView has measured greater than 4096 in one dimension. Size: ");
                    sb.append(i6);
                    sb.append("x");
                    sb.append(i5);
                    sb.append(", component: ");
                    sb.append(o);
                    dhz.b("TextureTooBig", sb.toString());
                }
            }
            if (this.f184J || this.r.t == null) {
                this.r.m(View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i3 - i) - getPaddingRight()) - getPaddingLeft()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, (i5 - getPaddingTop()) - getPaddingBottom()), 1073741824), D, false);
                this.G = false;
                this.f184J = false;
            }
            boolean t = this.r.t();
            if (t && !L() && !doa.n) {
                P();
            }
            if (!t) {
                A();
            }
            if (t) {
                return;
            }
            T(this);
        }
    }

    @Override // defpackage.djk
    public final boolean z() {
        if (hasTransientState()) {
            return true;
        }
        if (getParent() instanceof View) {
            return ((View) getParent()).hasTransientState();
        }
        return false;
    }

    public dkp(dhe dheVar) {
        super(dheVar);
        this.u = new Rect();
        this.F = false;
        this.G = false;
        this.w = -1;
        this.x = -1;
        new Rect();
        this.y = null;
        this.I = new dkm(this);
        this.t = dheVar;
        boolean z = doa.a;
        this.s = new dkv(this);
        this.H = (AccessibilityManager) dheVar.b.getSystemService("accessibility");
    }

    public final void K() {
        dkv dkvVar = this.s;
        long[] jArr = dkvVar.b;
        if (jArr != null) {
            int length = jArr.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                } else {
                    dkvVar.p(length, dkvVar.f);
                }
            }
            dkvVar.g.setEmpty();
            dkvVar.d = true;
            esv esvVar = dkvVar.o;
            esv esvVar2 = dkvVar.n;
            dmx dmxVar = dkvVar.m;
            if (dmxVar != null) {
                dmxVar.b.setEmpty();
            }
            dkvVar.j();
        }
        this.u.setEmpty();
    }
}
