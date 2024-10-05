package com.google.android.apps.youtube.app.watch.nextgenwatch.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBarWrapper;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FlexyBehavior;
import com.google.android.apps.youtube.app.watch.nextgenwatch.overscroll.WatchOverscrollBehavior;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.youtube.R;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acsb;
import defpackage.acsc;
import defpackage.ahh;
import defpackage.aii;
import defpackage.ajoy;
import defpackage.amkq;
import defpackage.aswb;
import defpackage.aypg;
import defpackage.aypn;
import defpackage.ayrs;
import defpackage.ayrv;
import defpackage.azqv;
import defpackage.azrw;
import defpackage.fxu;
import defpackage.gfw;
import defpackage.gju;
import defpackage.gpe;
import defpackage.jw;
import defpackage.kow;
import defpackage.nqp;
import defpackage.nty;
import defpackage.nva;
import defpackage.nxd;
import defpackage.nzl;
import defpackage.oam;
import defpackage.obk;
import defpackage.obm;
import defpackage.obo;
import defpackage.obp;
import defpackage.obu;
import defpackage.obx;
import defpackage.odd;
import defpackage.odg;
import defpackage.odn;
import defpackage.ody;
import defpackage.odz;
import defpackage.oea;
import defpackage.oec;
import defpackage.oed;
import defpackage.oee;
import defpackage.oef;
import defpackage.oeh;
import defpackage.oei;
import defpackage.oej;
import defpackage.oel;
import defpackage.oep;
import defpackage.oeq;
import defpackage.oer;
import defpackage.oeu;
import defpackage.wbs;
import defpackage.whu;
import defpackage.yjk;
import defpackage.zax;
import defpackage.zay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NextGenWatchLayout extends odn implements obo, oam, nva {
    public boolean A;
    public final oee B;
    public boolean C;
    public boolean D;
    public aadw E;
    public ajoy F;
    private final azqv G;
    private final int H;
    private final int I;

    /* renamed from: J, reason: collision with root package name */
    private final int f163J;
    private final int K;
    private final int L;
    private final int M;
    private View N;
    private View O;
    private azrw P;
    private ArrayList Q;
    private oeh R;
    private oei S;
    private WatchOverscrollBehavior T;
    private final zay U;
    private boolean V;
    private int W;
    public final fxu a;
    private int aa;
    private int ab;
    private final Point ac;
    private boolean ad;
    private final Paint ae;
    public gju b;
    public oel c;
    public acra d;
    public oeu e;
    public aypn f;
    public odg g;
    public UpForFullController h;
    public FullscreenExitController i;
    public nqp j;
    public gpe k;
    public oeq l;
    public aaea m;
    public kow n;
    public boolean o;
    public final int p;
    public View q;
    public View r;
    public View s;
    public RelativeLayout t;
    public RelativeLayout u;
    public final ArrayList v;
    public oed w;
    oec x;
    oef y;
    public obu z;

    public NextGenWatchLayout(Context context) {
        this(context, null);
    }

    private final void A() {
        boolean g = this.c.a.g();
        whu.I(this.q, g);
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            whu.I((View) this.v.get(i), g);
        }
        whu.I(this.r, this.c.p());
        whu.I(this.s, oel.r(this.c.c().n()));
        whu.I(this.N, this.c.n());
        whu.I((View) this.P.get(), this.c.n());
        if (this.c.q()) {
            if (yjk.aa(getContext())) {
                View view = this.O;
                if ((view instanceof ViewStub) && (view.getParent() instanceof ViewGroup)) {
                    View inflate = ((ViewStub) this.O).inflate();
                    this.O = inflate;
                    this.a.c((ViewGroup) inflate);
                }
            }
            if (!this.a.d()) {
                View view2 = this.O;
                if (!(view2 instanceof ViewStub) && view2 != null) {
                    this.a.c((ViewGroup) view2);
                }
            }
        }
        View view3 = this.O;
        if (view3 == null || (view3 instanceof ViewStub)) {
            return;
        }
        whu.I(view3, this.c.q());
    }

    private final void B(int i) {
        int h = h(i);
        i(odd.a(h), h);
    }

    private final boolean C() {
        odg odgVar = this.g;
        return (odgVar.a() && odgVar.a.t() && !odgVar.f.f && !odgVar.g) || this.c.f() || this.c.e();
    }

    private final boolean D(Canvas canvas, View view, long j) {
        oee oeeVar = this.B;
        if (view == oeeVar.c.r && view.getVisibility() == 0) {
            if (!oeeVar.c.r()) {
                oeeVar.b.draw(canvas);
            }
            oeeVar.a.draw(canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    private final boolean E() {
        return this.W != 0;
    }

    private final boolean F() {
        obu obuVar = this.z;
        return obuVar != null && obuVar.e();
    }

    private final boolean G() {
        return jw.e(this) == 1;
    }

    private final boolean H(int i, int i2) {
        this.c.k(this);
        oel oelVar = this.c;
        boolean G = G();
        obk obkVar = oelVar.f;
        if (obkVar != null) {
            obkVar.c(G);
        }
        for (int i3 = 0; i3 < oelVar.b.size(); i3++) {
            ((obk) oelVar.b.valueAt(i3)).c(G);
        }
        oel oelVar2 = this.c;
        boolean z = true;
        if (i == oelVar2.d && i2 == oelVar2.e) {
            z = false;
        }
        oelVar2.d = i;
        oelVar2.e = i2;
        obk obkVar2 = oelVar2.f;
        if (obkVar2 != null) {
            obkVar2.z(i, i2);
        }
        if (oelVar2.f == null) {
            for (int i4 = 0; i4 < oelVar2.b.size(); i4++) {
                ((obk) oelVar2.b.valueAt(i4)).z(oelVar2.d, oelVar2.e);
            }
        }
        this.c.h(this);
        return z;
    }

    static void o(View view, boolean z, int i, int i2, int i3, int i4) {
        if (view == null) {
            return;
        }
        if (z || view.getVisibility() != 8) {
            view.layout(i, i2, i3, i4);
        }
    }

    private final float s() {
        int c;
        int t = t();
        int min = Math.min(0, t);
        int max = Math.max(0, t);
        int i = this.W;
        if (i == 1) {
            c = aii.c(this.ab, min, max);
            this.ab = c;
        } else {
            if (i != 2) {
                return 0.0f;
            }
            c = aii.c(this.aa, min, max);
            this.aa = c;
        }
        return c / t;
    }

    private final int t() {
        int i;
        int i2;
        obu obuVar = this.z;
        int i3 = 0;
        if (obuVar == null) {
            return 0;
        }
        int i4 = this.W;
        if (i4 == 2) {
            int a = obuVar.a(2);
            return G() ? -a : a;
        }
        if (i4 == 1) {
            i3 = obuVar.a(1);
            if (this.g.a() && this.c.t() && !this.c.m() && (i2 = obuVar.c) != 128 && i2 != 512) {
                return -i3;
            }
            if (this.h.g() && this.c.e() && ((i = obuVar.c) == 1 || i == 256)) {
                return -i3;
            }
        }
        return i3;
    }

    private final obu u() {
        obu obuVar = this.z;
        obuVar.getClass();
        return obuVar;
    }

    private final void x(boolean z) {
        ViewParent parent = getParent();
        if (parent == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z);
    }

    private final void y(obu obuVar) {
        obu obuVar2 = this.z;
        if (obuVar2 != null) {
            obuVar2.c();
        }
        this.z = obuVar;
        this.c.l(obuVar.d);
        this.z.getClass();
    }

    private final void z(int i, MotionEvent motionEvent) {
        obu obuVar;
        int i2;
        int i3;
        if (E()) {
            x(false);
            if (this.z != null && !F()) {
                float s = s();
                boolean z = i != 1 ? !(i != 2 || t() >= 0) : t() > 0;
                int i4 = u().c;
                if ((i4 != 128 && i4 != 512 && i4 != 1 && i4 != 256 && (z || s > 0.5f)) || this.g.b(this.ab) || this.h.h(-this.U.b(motionEvent))) {
                    int a = odd.a(i4);
                    if (a != this.c.b()) {
                        if (a == 2 || a == 1 || a == 3) {
                            int i5 = a == 2 ? 35988 : 35989;
                            obu obuVar2 = this.z;
                            if (obuVar2 != null && obuVar2.c == 128) {
                                i5 = 90951;
                            }
                            int i6 = (obuVar2 == null || obuVar2.c != 512) ? i5 : 90951;
                            if (obuVar2 != null && ((i3 = obuVar2.c) == 256 || i3 == 1)) {
                                i6 = 106927;
                            }
                            acsc c = acsb.c(i6);
                            this.d.D(new acqx(c));
                            this.d.I(65, new acqx(c), null);
                        } else if (a == 0) {
                            this.d.I(3, new acqx(acsb.c(34699)), null);
                        }
                    }
                    obu obuVar3 = this.z;
                    if (obuVar3 == null || obuVar3.c != 256 || !this.h.h(this.ab)) {
                        if (this.g.b(this.ab) && (obuVar = this.z) != null && ((i2 = obuVar.c) == 128 || i2 == 512)) {
                            if (!this.c.m()) {
                                obu obuVar4 = this.z;
                                obuVar4.getClass();
                                int h = h(4);
                                y(new obu(this, obuVar4.c, h, obuVar4.d, this.c.d(odd.a(h)), this.e, this.f, this.m));
                                s = 0.0f;
                            }
                        }
                        u().f(s, new oej(this));
                    }
                    s = 1.0f;
                    u().f(s, new oej(this));
                } else {
                    obu u = u();
                    u.b();
                    View view = u.a;
                    int i7 = u.c;
                    int i8 = u.b;
                    obx obxVar = u.d;
                    obxVar.b();
                    this.z = new obu(view, i7, i8, obxVar, u.f);
                    u().f(1.0f - s, new oej(this));
                }
            }
            this.W = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addChildrenForAccessibility(ArrayList arrayList) {
        super.addChildrenForAccessibility(arrayList);
        if (this.c.f() || this.c.s()) {
            return;
        }
        Collections.sort(arrayList, new Comparator() { // from class: odw
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                View view = (View) obj;
                View view2 = (View) obj2;
                View view3 = NextGenWatchLayout.this.q;
                if (view != view3) {
                    if (view2 == view3) {
                        return 1;
                    }
                    if (!(view instanceof InlineTimeBarWrapper)) {
                        return view2 instanceof InlineTimeBarWrapper ? 1 : 0;
                    }
                }
                return -1;
            }
        });
    }

    @Override // defpackage.oam
    public final View b() {
        return this.r;
    }

    @Override // defpackage.oam
    public final View c() {
        return this.s;
    }

    @Override // defpackage.oam
    public final void d(obo oboVar) {
        this.c.h(oboVar);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        Rect c;
        float a;
        if (view == this.r) {
            int save = canvas.save();
            boolean D = D(canvas, view, j);
            canvas.restoreToCount(save);
            return D;
        }
        if (view == this.N || view == this.O || view == this.P.get()) {
            if (view == this.O) {
                c = this.S.c();
            } else if (view == this.P.get()) {
                c = this.w.c();
            } else if (view == this.t) {
                c = this.x.c();
            } else {
                c = this.R.c();
            }
            if (view == this.O) {
                a = this.S.a();
            } else if (view == this.P) {
                a = this.w.a();
            } else if (view == this.t) {
                a = this.x.a();
            } else {
                a = this.R.a();
            }
            int save2 = canvas.save();
            canvas.clipRect(c);
            if (view != this.P.get() && r() && a > 0.0f && a < 1.0f) {
                canvas.drawRect(c, this.ae);
            }
            boolean D2 = D(canvas, view, j);
            canvas.restoreToCount(save2);
            return D2;
        }
        return D(canvas, view, j);
    }

    final int h(int i) {
        if (C() && i != 0) {
            if (!this.c.e() || i != 4) {
                if (this.h.g() && this.c.e() && this.V && i == 2) {
                    aswb aswbVar = this.h.a.a().e;
                    if (aswbVar == null) {
                        aswbVar = aswb.a;
                    }
                    return aswbVar.aH ? 256 : 1;
                }
                obu obuVar = this.z;
                if (obuVar == null || obuVar.c != 256) {
                    if (this.c.f()) {
                        oee oeeVar = this.B;
                        if (i != 2) {
                            return i == 4 ? 16 : 0;
                        }
                        NextGenWatchLayout nextGenWatchLayout = oeeVar.c;
                        return nextGenWatchLayout.k(true != nextGenWatchLayout.b.f() ? 3 : 1);
                    }
                    obu obuVar2 = this.z;
                    if (obuVar2 == null || obuVar2.c != 128) {
                        if (obuVar2 == null || obuVar2.c != 512) {
                            if (this.g.a() && this.c.t() && i == 4) {
                                return this.i.b ? 512 : 128;
                            }
                        } else {
                            return k(0);
                        }
                    } else {
                        return k(1);
                    }
                } else {
                    return k(3);
                }
            } else {
                return k(2);
            }
        }
        return 0;
    }

    public final int i(int i, int i2) {
        int b = this.c.b();
        int k = k(b);
        if (odd.b(k, i2)) {
            return j(b, k, i, i2);
        }
        return 2;
    }

    public final int j(int i, int i2, int i3, int i4) {
        obu obuVar = this.z;
        if (obuVar != null) {
            obuVar.b();
            if (obuVar.b == i2 && obuVar.c == i4) {
                return 1;
            }
        }
        y(new obu(this, i2, i4, this.c.d(i), this.c.d(i3), this.e, this.f, this.m));
        return 0;
    }

    public final int k(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return this.B.c.r() ? 64 : 4;
        }
        if (i != 3) {
            return i != 4 ? 16 : 8;
        }
        return 1;
    }

    public final FlexyBehavior l() {
        nzl m = m();
        if (m != null) {
            return m.d;
        }
        return null;
    }

    public final nzl m() {
        obp b = obk.b(this.c.d(1));
        if (b instanceof nzl) {
            return (nzl) b;
        }
        if (!(b instanceof obm)) {
            return null;
        }
        obm obmVar = (obm) b;
        obp obpVar = obmVar.a;
        if (!(obpVar instanceof nzl)) {
            obp obpVar2 = obmVar.b;
            if (obpVar2 instanceof nzl) {
                return (nzl) obpVar2;
            }
            return null;
        }
        return (nzl) obpVar;
    }

    public final void n() {
        super.bringChildToFront(this.r);
        super.bringChildToFront(this.q);
        super.bringChildToFront(this.N);
        View view = this.O;
        if (view instanceof ViewStub) {
            super.bringChildToFront(view);
        }
        if (!this.A) {
            super.bringChildToFront((View) this.P.get());
        }
        int size = this.v.size();
        for (int i = 0; i < size; i++) {
            super.bringChildToFront((View) this.v.get(i));
        }
        if (this.A) {
            super.bringChildToFront((View) this.P.get());
        }
        super.bringChildToFront(this.s);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gfw.b();
        oel oelVar = this.c;
        obk obkVar = oelVar.f;
        if (obkVar != null) {
            obkVar.x();
        }
        for (int i = 0; i < oelVar.b.size(); i++) {
            ((obk) oelVar.b.get(i)).x();
        }
        final oeq oeqVar = this.l;
        oeqVar.c.d(aypn.e(oeqVar.b.a(), oeqVar.a.h().i(aypg.LATEST), nxd.l).n().X(new ayrs() { // from class: oeo
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                View view = oeq.this.d;
                if (view == null) {
                    return;
                }
                view.setClickable(bool.booleanValue());
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gfw.b();
        oel oelVar = this.c;
        obk obkVar = oelVar.f;
        if (obkVar != null) {
            obkVar.y();
        }
        for (int i = 0; i < oelVar.b.size(); i++) {
            ((obk) oelVar.b.get(i)).y();
        }
        this.l.c.c();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.q = findViewById(this.H);
        this.N = findViewById(this.K);
        this.O = findViewById(this.L);
        this.r = findViewById(this.I);
        this.P = new ody(this);
        this.q.setFocusableInTouchMode(true);
        jw.M(this.q, new odz(this));
        this.s = findViewById(this.f163J);
        this.R = new oeh(this.c, this.N);
        this.S = new oei(this.c, this.a);
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        arrayList.add(this.R);
        this.Q.add(this.S);
        oed oedVar = new oed(this.c, (View) this.P.get());
        this.w = oedVar;
        this.Q.add(oedVar);
        final oec oecVar = new oec(this, this.c, this.t);
        aypn.e(oecVar.c.j.h().m, oecVar.c.k.a, nxd.k).X(new ayrs() { // from class: oeb
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                oec oecVar2 = oec.this;
                Pair pair = (Pair) obj;
                oecVar2.a = ((Integer) pair.first).intValue();
                oecVar2.b = ((Boolean) pair.second).booleanValue();
                oecVar2.f();
                RelativeLayout relativeLayout = oecVar2.c.t;
                if (relativeLayout != null) {
                    relativeLayout.requestLayout();
                }
            }
        });
        this.x = oecVar;
        this.Q.add(oecVar);
        oef oefVar = new oef(this, this.c, this.u);
        this.y = oefVar;
        this.Q.add(oefVar);
        FlexyBehavior l = l();
        if (l != null) {
            nqp nqpVar = (nqp) this.F.a.get();
            nqpVar.getClass();
            this.T = new WatchOverscrollBehavior(nqpVar, l);
        }
        this.j.h().m.A(new ayrv() { // from class: odu
            @Override // defpackage.ayrv
            public final Object a(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() < NextGenWatchLayout.this.c.a().height());
            }
        }).n().X(new ayrs() { // from class: odt
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                NextGenWatchLayout nextGenWatchLayout = NextGenWatchLayout.this;
                nextGenWatchLayout.A = ((Boolean) obj).booleanValue();
                nextGenWatchLayout.q();
            }
        });
        View findViewById = findViewById(this.M);
        kow kowVar = this.n;
        if (kowVar.i && (findViewById instanceof ViewStub)) {
            this.v.add(kowVar.f((ViewStub) findViewById, nty.c));
        }
        oee oeeVar = this.B;
        NextGenWatchLayout nextGenWatchLayout = oeeVar.c;
        View view = nextGenWatchLayout.r;
        if (view instanceof ViewStub) {
            nextGenWatchLayout.r = ((ViewStub) view).inflate();
        }
        NextGenWatchLayout nextGenWatchLayout2 = oeeVar.c;
        View view2 = nextGenWatchLayout2.s;
        if (view2 instanceof ViewStub) {
            nextGenWatchLayout2.s = ((ViewStub) view2).inflate();
        }
        n();
        A();
        oeq oeqVar = this.l;
        View view3 = this.q;
        oeqVar.d = view3;
        jw.M(view3, new oep(oeqVar, view3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r2 != 3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ab, code lost:
    
        if (r6.y > r7.a) goto L48;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.c.s()) {
            return;
        }
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            oea oeaVar = (oea) arrayList.get(i5);
            if (oeaVar.g()) {
                Rect b = oeaVar.b();
                if (b.width() > 0 && b.height() > 0) {
                    oeaVar.e().layout(0, 0, b.width(), b.height());
                }
                oeaVar.f();
                oeaVar.e().setAlpha(oeaVar.a());
            }
        }
        obp c = this.c.c();
        Rect t = c.t();
        o(this.q, z, t.left, t.top, t.left + this.q.getMeasuredWidth(), t.top + this.q.getMeasuredHeight());
        int size2 = this.v.size();
        for (int i6 = 0; i6 < size2; i6++) {
            View view = (View) this.v.get(i6);
            o(view, z, t.left, t.top, t.left + view.getMeasuredWidth(), t.top + view.getMeasuredHeight());
        }
        if (this.c.p()) {
            Rect s = c.s();
            o(this.r, z, s.left, s.top, s.left + this.r.getMeasuredWidth(), s.top + this.r.getMeasuredHeight());
        }
        oee oeeVar = this.B;
        if (!oeeVar.c.r()) {
            Rect s2 = c.s();
            o(oeeVar.c.s, true, s2.left, s2.top, s2.left + oeeVar.c.s.getMeasuredWidth(), s2.top + oeeVar.c.s.getMeasuredHeight());
        } else {
            Rect t2 = c.t();
            o(oeeVar.c.s, true, t2.left, t2.top, t2.left + oeeVar.c.s.getMeasuredWidth(), t2.top + oeeVar.c.s.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        Rect s;
        View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
        boolean H = H(size2, size);
        A();
        if (!this.c.s() || H) {
            ArrayList arrayList = this.Q;
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                oea oeaVar = (oea) arrayList.get(i3);
                if (oeaVar.g()) {
                    Rect b = oeaVar.b();
                    oeaVar.e().measure(View.MeasureSpec.makeMeasureSpec(b.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(b.height(), 1073741824));
                }
            }
            obp c = this.c.c();
            if (this.c.p()) {
                Rect s2 = c.s();
                this.r.measure(View.MeasureSpec.makeMeasureSpec(s2.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(s2.height(), 1073741824));
                oee oeeVar = this.B;
                if (oeeVar.c.r()) {
                    s = c.t();
                } else {
                    s = c.s();
                }
                oeeVar.c.s.measure(View.MeasureSpec.makeMeasureSpec(s.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(s.height(), 1073741824));
            }
            Rect t = c.t();
            int width = t.width();
            int height = t.height();
            this.q.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
            int size4 = this.v.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((View) this.v.get(i4)).measure(View.MeasureSpec.makeMeasureSpec(width, CellularSignalStrengthError.ERROR_NOT_SUPPORTED), View.MeasureSpec.makeMeasureSpec(height, CellularSignalStrengthError.ERROR_NOT_SUPPORTED));
            }
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        H(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
    
        if (r0.c == 1) goto L51;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == null) {
            return;
        }
        if (this.q != view) {
            if (this.N == view) {
                throw new IllegalStateException("Metadata view must not be removed.");
            }
            this.v.remove(view);
            return;
        }
        throw new IllegalStateException("Player view must not be removed.");
    }

    public final void p(int i) {
        if (this.c.a.h(i) || this.z != null) {
            obu obuVar = this.z;
            if (obuVar != null) {
                obuVar.c();
            }
            this.z = null;
            this.c.l(null);
            this.B.a(i == 2 ? 1.0f : 0.0f);
        }
    }

    @Override // defpackage.obo
    public final void pa(obp obpVar) {
        gfw.b();
        if (this.ad != this.c.t()) {
            this.ad = this.c.t();
            q();
        }
        if (isInLayout()) {
            post(new Runnable() { // from class: odv
                @Override // java.lang.Runnable
                public final void run() {
                    NextGenWatchLayout.this.requestLayout();
                }
            });
        } else {
            requestLayout();
        }
        if (this.c.n()) {
            ArrayList arrayList = this.Q;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((oea) arrayList.get(i)).f();
            }
        }
    }

    public final void q() {
        int i = true != (this.A && !this.ad) ? 0 : 4;
        this.q.setImportantForAccessibility(i);
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((View) arrayList.get(i2)).setImportantForAccessibility(i);
        }
        n();
    }

    public final boolean r() {
        return this.D ? this.k.f : this.o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.U.f();
    }

    @Override // defpackage.nva
    public final void v(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        ((ViewGroup) this.P.get()).addView(relativeLayout2);
        this.u = relativeLayout2;
        ((ViewGroup) this.P.get()).addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        this.t = relativeLayout;
        if (this.T != null) {
            this.j.h().b.z(this.j.h(), relativeLayout);
            ((ahh) relativeLayout.getLayoutParams()).b(this.T);
        }
        this.G.c(true);
    }

    @Override // defpackage.nva
    public final void w(RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        ((ViewGroup) this.P.get()).removeView(relativeLayout2);
        this.u = null;
        ((ViewGroup) this.P.get()).removeView(relativeLayout);
        this.t = null;
        this.G.c(false);
    }

    public NextGenWatchLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NextGenWatchLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new fxu();
        this.G = azqv.ap();
        this.W = 0;
        Paint paint = new Paint();
        this.ae = paint;
        paint.setColor(wbs.W(context, R.attr.ytBrandBackgroundSolid).orElse(0));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oer.b);
        int resourceId = obtainStyledAttributes.getResourceId(6, 0);
        this.H = resourceId;
        amkq.N(resourceId != 0);
        this.I = obtainStyledAttributes.getResourceId(3, 0);
        this.f163J = obtainStyledAttributes.getResourceId(4, 0);
        this.L = obtainStyledAttributes.getResourceId(7, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(5, 0);
        this.K = resourceId2;
        amkq.N(resourceId2 != 0);
        amkq.N(obtainStyledAttributes.getResourceId(1, 0) != 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        this.p = resourceId3;
        amkq.N(resourceId3 != 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(8, 0);
        this.M = resourceId4;
        amkq.N(resourceId4 != 0);
        obtainStyledAttributes.recycle();
        this.v = new ArrayList();
        zax zaxVar = new zax(context);
        zaxVar.c = 2;
        this.U = zaxVar.a();
        this.B = new oee(this, context);
        this.C = true;
        this.ac = new Point();
    }
}
