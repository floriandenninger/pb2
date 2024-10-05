package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.litho.ComponentTree;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dsx implements dqr, dre {
    public static Field a;
    public final duj D;
    public int E;
    public final dtf F;
    public final drm H;
    public final ajzp I;
    private final int M;
    private final boolean O;
    private final boolean P;
    private final dtb Q;
    private final boolean R;
    private final boolean S;
    private final boolean T;
    private final boolean U;
    private final boolean V;
    private final boolean ab;
    private dlo ac;
    private int ad;
    private final dkf ae;
    private final boolean af;
    private dtl al;
    private final dkb am;
    private final dsf ao;
    public final dsj d;
    public final dhe f;
    public final float h;
    public final List j;
    public final boolean k;
    final boolean m;
    public boolean q;
    public RecyclerView t;
    public int w;
    volatile dlo x;
    public diy y;
    private static final dlo K = new dlo();
    private static final Rect L = new Rect();

    /* renamed from: J, reason: collision with root package name */
    static final esv f187J = new esv();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final Handler g = new Handler(Looper.getMainLooper());
    public final AtomicBoolean i = new AtomicBoolean(false);
    private final AtomicBoolean N = new AtomicBoolean(false);
    public final AtomicLong l = new AtomicLong(-1);
    private final Deque W = new ArrayDeque();
    private final AtomicBoolean X = new AtomicBoolean(false);
    private final AtomicBoolean Y = new AtomicBoolean(false);
    final Deque n = new ArrayDeque();
    final Runnable o = new dsd(this, 1);
    private final dsf an = new dsf(this);
    private final ViewTreeObserver.OnPreDrawListener Z = new dsc(this);
    private final Runnable aa = new dsd(this, 0);
    private final dsf ak = new dsf(this);
    public final dnw p = new dsg(this);
    public int r = -1;
    public int s = -1;
    int u = -1;
    int v = -1;
    public volatile boolean z = false;
    private boolean ag = false;
    private int ah = 0;
    public final String A = "";
    public final boolean[] B = new boolean[1];
    public final boolean[] C = new boolean[1];
    private dsk ai = null;
    private final duh aj = new dsh(this);
    public final Runnable G = new dsd(this, 2);
    public final vw e = new dsv(this);

    public dsx(dss dssVar) {
        this.w = -1;
        this.f = dssVar.c;
        this.d = dssVar.o;
        boolean z = dssVar.q;
        this.P = z;
        this.M = z ? 0 : dssVar.a;
        this.h = dssVar.b;
        drm drmVar = dssVar.r;
        this.H = drmVar;
        dkb dkbVar = dssVar.s;
        if (dkbVar != null) {
            this.am = dkbVar;
            this.ae = dlu.d(dkbVar);
        } else if (doa.s != null) {
            dkb dkbVar2 = doa.s;
            this.am = dkbVar2;
            this.ae = dlu.d(dkbVar2);
        } else {
            this.am = null;
            this.ae = null;
        }
        boolean z2 = dssVar.e;
        this.F = new dtf(z2, z2 ? dssVar.f : 0);
        boolean z3 = drmVar.h() == 0 ? dssVar.d : false;
        this.ab = z3;
        this.ao = z3 ? new dsf(this) : null;
        this.q = false;
        boolean W = drmVar.a.m ^ W();
        this.m = W;
        if (W) {
            this.Q = dtb.b;
        } else {
            this.Q = dtb.a;
        }
        this.D = new duj(this.u, this.v, dssVar.r);
        this.j = dssVar.g;
        int i = dssVar.k;
        if (i != -1) {
            this.w = i;
            this.k = true;
        } else {
            this.k = false;
        }
        this.af = dssVar.p;
        this.R = dssVar.h;
        this.O = dssVar.n;
        this.S = dssVar.i;
        this.T = dssVar.j;
        this.U = dssVar.l;
        this.V = dssVar.m;
        this.I = dssVar.t;
    }

    public static void G(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((dqx) list.get(i)).k();
        }
    }

    private final dlo R(int i, int i2, boolean z) {
        int size;
        int i3;
        dlo dloVar = new dlo();
        int h = this.H.h();
        boolean N = N(i, i2, h, z);
        int i4 = 0;
        if (h != 1) {
            int size2 = View.MeasureSpec.getSize(i);
            if (!N) {
                i3 = View.MeasureSpec.getSize(i2);
            } else if (this.x != null) {
                i3 = this.x.b;
            } else {
                i4 = size2;
                size = 0;
            }
            size = i3;
            i4 = size2;
        } else {
            size = View.MeasureSpec.getSize(i2);
            if (!N) {
                i4 = View.MeasureSpec.getSize(i);
            } else if (this.x != null) {
                i4 = this.x.a;
            }
        }
        dloVar.a = i4;
        dloVar.b = size;
        return dloVar;
    }

    private final void S(dqx dqxVar) {
        int o = o(dqxVar);
        int n = n(dqxVar);
        if (dqxVar.r(o, n)) {
            if (dqxVar.o()) {
                ComponentTree b = dqxVar.b();
                if (b.A != null) {
                    b.A = null;
                    U();
                    return;
                }
                return;
            }
            return;
        }
        dqxVar.g(this.f, o, n);
    }

    private final void T(int i, int i2) {
        v(i, i2, this.Q);
    }

    private final void U() {
        if (did.t()) {
            s();
        } else {
            dnz.a.a(this.p);
        }
    }

    private final void V(dsk dskVar) {
        ArrayList arrayList = dskVar.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dsm dsmVar = (dsm) arrayList.get(i);
            if (dsmVar instanceof dsl) {
                S(((dsl) dsmVar).b);
            }
        }
    }

    private final boolean W() {
        return this.H.a.k;
    }

    private final boolean X() {
        return !(this.x == null || this.w == -1) || this.k;
    }

    private final boolean Y() {
        return this.i.get() && !this.N.get();
    }

    private static final void Z(dqx dqxVar, dte dteVar) {
        dqxVar.d();
        dqxVar.n(dteVar);
    }

    private final afxg aa() {
        int m;
        if (!this.b.isEmpty()) {
            int m2 = m(this.b, this.m);
            if (this.u >= this.b.size() || m2 < 0) {
                return null;
            }
            return new afxg(m2, this.b);
        }
        if (this.c.isEmpty() || (m = m(this.c, this.m)) < 0) {
            return null;
        }
        return new afxg(m, this.c);
    }

    static int m(List list, boolean z) {
        if (z) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (((dqx) list.get(size)).d().j()) {
                    return size;
                }
            }
        } else {
            int size2 = list.size();
            for (int i = 0; i < size2; i++) {
                if (((dqx) list.get(i)).d().j()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void t(dte dteVar) {
        if (dteVar == null) {
            throw new RuntimeException("Received null RenderInfo to insert/update!");
        }
    }

    public static void x(dqx dqxVar) {
        if (dqxVar.q()) {
            Object e = dqxVar.b.e("prevent_release");
            if (((e instanceof Boolean) && ((Boolean) e).booleanValue()) || dqxVar.d().i() || dqxVar.b() == null || dqxVar.b().getLithoView() != null) {
                return;
            }
            dqxVar.e();
        }
    }

    public final void A(dst dstVar) {
        dqx next = dstVar.next();
        if (this.b.isEmpty() || next == null || this.w != -1) {
            return;
        }
        int o = o(next);
        int n = n(next);
        if (next.r(o, n)) {
            return;
        }
        next.h(this.f, o, n, new drz(this, dstVar, next));
    }

    public final void B() {
        afxg aa;
        int m;
        if (this.i.get()) {
            if (this.N.get()) {
                dlo dloVar = this.ac;
                if (dloVar.a == 0 || dloVar.b == 0) {
                    J();
                    return;
                }
                dlo R = R(this.r, this.s, true);
                dlo dloVar2 = new dlo();
                int i = R.a;
                int i2 = R.b;
                int c = this.H.c();
                if (c == -1) {
                    c = 0;
                }
                List list = this.b;
                drl drlVar = new drl(i, i2, this.H.h());
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                dlo dloVar3 = new dlo();
                while (true) {
                    if (drlVar.d >= (drlVar.c == 1 ? drlVar.b : drlVar.a) || c >= list.size()) {
                        break;
                    }
                    dqx dqxVar = (dqx) list.get(c);
                    dte d = dqxVar.d();
                    if (d.k()) {
                        break;
                    }
                    dqxVar.i(this.f, this.H.i(makeMeasureSpec), this.H.f(makeMeasureSpec2, d), dloVar3);
                    int i3 = dloVar3.a;
                    int i4 = dloVar3.b;
                    int i5 = drlVar.d;
                    if (1 == drlVar.c) {
                        i3 = i4;
                    }
                    drlVar.d = i5 + i3;
                    c++;
                }
                int i6 = drlVar.d;
                if (this.H.h() == 1) {
                    dloVar2.a = i;
                    dloVar2.b = Math.min(i6, i2);
                } else {
                    dloVar2.a = Math.min(i6, i);
                    dloVar2.b = i2;
                }
                list.size();
                if (dth.a) {
                    hashCode();
                }
                if (!X() && (aa = aa()) != null) {
                    Q(i, i2, aa, this.H.h());
                }
                int i7 = dloVar2.a;
                dlo dloVar4 = this.ac;
                if (i7 == dloVar4.a && dloVar2.b == dloVar4.b) {
                    return;
                }
                J();
                return;
            }
            if (!X() && (m = m(this.b, this.m)) >= 0) {
                afxg afxgVar = new afxg(m, this.b);
                dlo dloVar5 = this.ac;
                Q(dloVar5.a, dloVar5.b, afxgVar, this.H.h());
            }
            z();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqr
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final void c(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.t;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e(recyclerView2);
        }
        if (this.z) {
            s();
        }
        this.t = recyclerView;
        this.ag = true;
        LinearLayoutManager linearLayoutManager = this.H.a;
        linearLayoutManager.aY(this.af);
        recyclerView.getPaddingLeft();
        recyclerView.af(linearLayoutManager);
        recyclerView.ac(this.e);
        recyclerView.aD(this.D.d);
        if (linearLayoutManager instanceof drr) {
            new Rect(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
            ((drr) linearLayoutManager).a();
        }
        if (recyclerView instanceof drn) {
            ((drn) recyclerView).aa = this.an;
        } else if (recyclerView.getViewTreeObserver() != null) {
            recyclerView.getViewTreeObserver().addOnPreDrawListener(this.Z);
        }
        this.D.a(this.aj);
        int i = this.u;
        if (i != -1) {
            this.H.a.aa(i, this.ad);
        }
        RecyclerView recyclerView3 = this.t;
        if (recyclerView3 == null) {
            return;
        }
        int i2 = dti.o;
        dti dtiVar = recyclerView3.getParent() instanceof dti ? (dti) recyclerView3.getParent() : null;
        if (dtiVar != null) {
            dtl dtlVar = new dtl(this);
            this.al = dtlVar;
            if (dtlVar.a == null) {
                dtlVar.a = dtiVar;
                dtlVar.a.p();
                dtlVar.b = dtiVar.l.n;
                if (dtlVar.b == null) {
                    throw new RuntimeException("LayoutManager of RecyclerView is not initialized yet.");
                }
                dtlVar.a.l.aD(dtlVar);
                return;
            }
            throw new RuntimeException("SectionsRecyclerView has already been initialized but never reset.");
        }
    }

    public final void D(int i, int i2) {
        dqx dqxVar;
        boolean z;
        boolean z2;
        if (dth.a) {
            hashCode();
        }
        synchronized (this) {
            dqxVar = (dqx) this.b.remove(i);
            this.b.add(i2, dqxVar);
            int i3 = this.w;
            z = true;
            if (i3 != -1) {
                float f = i2;
                int i4 = this.u;
                float f2 = i3 * this.h;
                z2 = f >= ((float) i4) - f2 && f <= ((float) (i4 + i3)) + f2;
            }
        }
        if (dqxVar.q() && !z2) {
            dqxVar.e();
        }
        this.e.oe(i, i2);
        duj dujVar = this.D;
        int i5 = this.w;
        if (!dujVar.d() && i5 != -1) {
            int i6 = dujVar.a;
            boolean z3 = i2 >= i6 && i2 <= (i6 + i5) + (-1);
            boolean z4 = i >= i6 && i <= (i6 + i5) + (-1);
            if (!z3 && !z4) {
                z = false;
            }
        }
        dujVar.c(z);
    }

    public final void E(List list) {
        this.g.post(new drx(list));
    }

    public final void F(dsl dslVar) {
        r(dslVar);
        dqx dqxVar = dslVar.b;
        dqxVar.s(this.ak);
        if (Y()) {
            S(dqxVar);
        }
    }

    public final void H(int i) {
        dqx dqxVar;
        if (dth.a) {
            hashCode();
        }
        synchronized (this) {
            dqxVar = (dqx) this.b.remove(i);
        }
        this.e.n(i);
        duj dujVar = this.D;
        dujVar.c(dujVar.g(i));
        this.g.post(new dsb(dqxVar, 1));
    }

    public final void I(int i, int i2) {
        if (dth.a) {
            hashCode();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add((dqx) this.b.remove(i));
            }
        }
        this.e.m(i, i2);
        duj dujVar = this.D;
        dujVar.c(dujVar.g(i));
        E(arrayList);
    }

    public final void J() {
        if (dth.a) {
            hashCode();
        }
        if (this.t != null) {
            this.g.removeCallbacks(this.o);
            this.t.removeCallbacks(this.o);
            jw.H(this.t, this.o);
        } else {
            this.g.removeCallbacks(this.o);
            this.g.post(this.o);
        }
    }

    @Override // defpackage.dqr
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void e(RecyclerView recyclerView) {
        int bz;
        int bx;
        LinearLayoutManager linearLayoutManager = this.H.a;
        View S = linearLayoutManager.S(this.u);
        if (S != null) {
            boolean W = W();
            if (this.H.h() == 0) {
                if (W) {
                    bx = (recyclerView.getWidth() - linearLayoutManager.getPaddingRight()) - wd.by(S);
                } else {
                    bx = wd.bx(S) - linearLayoutManager.getPaddingLeft();
                }
                this.ad = bx;
            } else {
                if (W) {
                    bz = (recyclerView.getHeight() - linearLayoutManager.getPaddingBottom()) - wd.bw(S);
                } else {
                    bz = wd.bz(S) - linearLayoutManager.getPaddingTop();
                }
                this.ad = bz;
            }
        } else {
            this.ad = 0;
        }
        recyclerView.aF(this.D.d);
        if (recyclerView instanceof drn) {
            ((drn) recyclerView).aa = null;
        } else if (recyclerView.getViewTreeObserver() != null) {
            recyclerView.getViewTreeObserver().removeOnPreDrawListener(this.Z);
        }
        y();
        recyclerView.ac(null);
        recyclerView.af(null);
        duj dujVar = this.D;
        duh duhVar = this.aj;
        if (duhVar != null) {
            synchronized (dujVar) {
                if (!dujVar.c.isEmpty()) {
                    dujVar.c.remove(duhVar);
                }
            }
        }
        synchronized (this) {
            int size = this.b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((dqx) this.b.get(size)).e();
                }
            }
        }
        if (this.t != recyclerView) {
            return;
        }
        this.t = null;
        dtl dtlVar = this.al;
        if (dtlVar != null) {
            dti dtiVar = dtlVar.a;
            if (dtiVar == null) {
                throw new IllegalStateException("SectionsRecyclerView has not been set yet.");
            }
            dtiVar.l.aF(dtlVar);
            dtlVar.b = null;
            dtlVar.a = null;
        }
    }

    public final void L(int i, dte dteVar) {
        boolean k;
        if (dth.a) {
            hashCode();
            String.valueOf(dteVar.r()).length();
        }
        synchronized (this) {
            dqx dqxVar = (dqx) this.b.get(i);
            k = dqxVar.d().k();
            t(dteVar);
            this.F.a(dteVar);
            Z(dqxVar, dteVar);
        }
        if (k || dteVar.k()) {
            this.e.oc(i);
        }
        duj dujVar = this.D;
        dujVar.c(dujVar.e(i, 1));
    }

    public final void M(int i, List list) {
        if (dth.a) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = ((dte) list.get(i2)).r();
            }
            hashCode();
            list.size();
            String.valueOf(Arrays.toString(strArr)).length();
        }
        synchronized (this) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = i + i3;
                dqx dqxVar = (dqx) this.b.get(i4);
                dte dteVar = (dte) list.get(i3);
                t(dteVar);
                if (dteVar.k() || dqxVar.d().k()) {
                    this.e.oc(i4);
                }
                this.F.a(dteVar);
                Z(dqxVar, dteVar);
            }
        }
        duj dujVar = this.D;
        dujVar.c(dujVar.e(i, list.size()));
    }

    public final synchronized void O(boolean z, dpo dpoVar) {
        if (this.ai == null) {
            this.ai = new dsk();
        }
        dsk dskVar = this.ai;
        dskVar.b = z;
        dskVar.d = dpoVar;
        this.W.addLast(dskVar);
        this.X.set(true);
        this.ai = null;
    }

    public final void P(boolean z, dpo dpoVar) {
        if (dth.a) {
            hashCode();
        }
        if (this.z) {
            throw new RuntimeException("Trying to do a sync notifyChangeSetComplete when using asynchronous mutations!");
        }
        if (dpoVar != null) {
            dpoVar.a();
            this.n.addLast(dpoVar);
        }
        y();
        if (z) {
            if (dkl.b(null)) {
                throw null;
            }
            B();
        }
    }

    final void Q(int i, int i2, afxg afxgVar, int i3) {
        String str;
        dlo dloVar;
        if (this.k) {
            return;
        }
        dlg dlgVar = null;
        boolean b = dkl.b(null);
        dst dstVar = new dst(afxgVar.a, afxgVar.b, this.b.size() - 1, this.m);
        if (!this.b.isEmpty()) {
            dkb dkbVar = this.am;
            int i4 = dkbVar == null ? 1 : dkbVar.a;
            for (int i5 = 0; i5 < i4; i5++) {
                A(dstVar);
            }
        }
        dqx dqxVar = (dqx) afxgVar.a.get(afxgVar.b);
        int o = o(dqxVar);
        int n = n(dqxVar);
        if (b) {
            throw null;
        }
        dhe dheVar = this.f;
        taz tazVar = dheVar.l;
        if (tazVar != null) {
            str = dheVar.c;
        } else {
            dqxVar.d().l();
            dqxVar.d().m();
            str = null;
            tazVar = null;
        }
        if (tazVar != null) {
            dhe dheVar2 = this.f;
            dlgVar = did.aw(tazVar, str, tazVar.a(dheVar2, 20), dheVar2.m);
        }
        try {
            if (this.M <= 0 || !did.t()) {
                dlo dloVar2 = new dlo();
                dqxVar.i(this.f, o, n, dloVar2);
                if (this.P) {
                    List list = this.b;
                    dhe dheVar3 = this.f;
                    dlo dloVar3 = new dlo();
                    Iterator it = list.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        ((dqx) it.next()).i(dheVar3, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0), dloVar3);
                        i6 = Math.max(i6, dloVar3.b);
                    }
                    dloVar2.b = i6;
                }
                int max = Math.max(this.H.a(dloVar2.a, dloVar2.b, i, i2), 1);
                this.x = dloVar2;
                this.w = max;
            } else {
                if (i3 == 0) {
                    dloVar = new dlo(i / this.M, i2);
                } else {
                    dloVar = new dlo(i, i2 / this.M);
                }
                this.x = dloVar;
                this.w = this.M;
            }
            if (dlgVar != null) {
                taz.d(dlgVar);
            }
        } catch (Throwable th) {
            if (dlgVar != null) {
                taz.d(dlgVar);
            }
            throw th;
        }
    }

    @Override // defpackage.dqr
    public final void a() {
        ArrayList arrayList;
        if (did.t()) {
            G(this.b);
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList(this.b);
        }
        E(arrayList);
    }

    @Override // defpackage.dqr
    public final void b(dlo dloVar, int i, int i2, diy diyVar) {
        afxg aa;
        boolean z;
        boolean z2 = diyVar != null;
        int h = this.H.h();
        if (h != 0) {
            if (View.MeasureSpec.getMode(i2) == 0) {
                throw new IllegalStateException("Height mode has to be EXACTLY OR AT MOST for a vertical scrolling RecyclerView");
            }
            if (!z2 && View.MeasureSpec.getMode(i) == 0) {
                throw new IllegalStateException("Can't use Unspecified width on a vertical scrolling Recycler if dynamic measurement is not allowed");
            }
        } else {
            if (View.MeasureSpec.getMode(i) == 0) {
                throw new IllegalStateException("Width mode has to be EXACTLY OR AT MOST for an horizontal scrolling RecyclerView");
            }
            if (!z2 && View.MeasureSpec.getMode(i2) == 0) {
                throw new IllegalStateException("Can't use Unspecified height on an horizontal scrolling Recycler if dynamic measurement is not allowed");
            }
        }
        boolean N = N(i, i2, h, z2);
        if (this.k && N) {
            throw new RuntimeException("Cannot use manual estimated viewport count when the RecyclerBinder needs an item to determine its size!");
        }
        this.Y.set(true);
        try {
            synchronized (this) {
                if (this.r != -1 && !this.N.get()) {
                    if (h != 1) {
                        if (did.x(this.s, i2, this.ac.b)) {
                            dloVar.a = View.MeasureSpec.getSize(i);
                            dloVar.b = this.ac.b;
                            if (z) {
                                return;
                            } else {
                                return;
                            }
                        }
                    } else if (did.x(this.r, i, this.ac.a)) {
                        dloVar.a = this.ac.a;
                        dloVar.b = View.MeasureSpec.getSize(i2);
                        this.Y.set(false);
                        if (this.z) {
                            U();
                            return;
                        }
                        return;
                    }
                    this.i.set(false);
                    if (!this.k) {
                        this.w = -1;
                    }
                    this.x = null;
                    int size = this.b.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((dqx) this.b.get(i3)).j();
                    }
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        this.e.mw();
                    } else {
                        this.g.removeCallbacks(this.aa);
                        this.g.post(this.aa);
                    }
                }
                this.r = i;
                this.s = i2;
                if (!X() && (aa = aa()) != null) {
                    Q(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), aa, h);
                }
                dlo R = R(i, i2, z2);
                if (h != 1) {
                    if (N && this.x == null) {
                        this.y = diyVar;
                        this.N.set(true);
                    }
                    boolean z3 = this.ab;
                    if (true != z3) {
                        diyVar = null;
                    }
                    this.y = diyVar;
                    this.N.set(z3);
                } else {
                    if (N && this.x == null) {
                        this.y = diyVar;
                        this.N.set(true);
                    }
                    this.y = null;
                }
                int i4 = R.a;
                dloVar.a = i4;
                int i5 = R.b;
                dloVar.b = i5;
                this.ac = new dlo(i4, i5);
                this.i.set(true);
                Iterator it = this.W.iterator();
                while (it.hasNext()) {
                    V((dsk) it.next());
                }
                dsk dskVar = this.ai;
                if (dskVar != null) {
                    V(dskVar);
                }
                if (this.w != -1) {
                    T(this.u, this.v);
                }
                this.Y.set(false);
                if (this.z) {
                    U();
                }
            }
        } finally {
            this.Y.set(false);
            if (this.z) {
                U();
            }
        }
    }

    @Override // defpackage.dqr
    public final synchronized void d(int i, int i2) {
        boolean x;
        if (this.r != -1) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            int h = this.H.h();
            int i3 = this.r;
            if (i3 != -1) {
                if (h != 0) {
                    x = did.x(i3, makeMeasureSpec, this.ac.a);
                } else {
                    x = did.x(this.s, makeMeasureSpec2, this.ac.b);
                }
                if (x) {
                    return;
                }
            }
        }
        b(K, View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824), this.y);
    }

    @Override // defpackage.dqr
    public final boolean f() {
        return this.q;
    }

    @Override // defpackage.dqr
    public final /* bridge */ /* synthetic */ void g() {
    }

    @Override // defpackage.dqr
    public final void h() {
    }

    @Override // defpackage.dqr
    public final /* bridge */ /* synthetic */ void i() {
    }

    @Override // defpackage.dre
    public final synchronized ComponentTree j(int i) {
        dqx dqxVar = (dqx) this.b.get(i);
        int o = o(dqxVar);
        int n = n(dqxVar);
        if (dqxVar.r(o, n)) {
            return dqxVar.b();
        }
        dqxVar.i(this.f, o, n, null);
        return dqxVar.b();
    }

    @Override // defpackage.dre
    public final boolean k(int i) {
        return l(i) && ((dqx) this.b.get(i)).d().i();
    }

    @Override // defpackage.dre
    public final boolean l(int i) {
        return i >= 0 && i < this.b.size();
    }

    public final int n(dqx dqxVar) {
        if (this.ab) {
            return 0;
        }
        if (Y()) {
            return this.H.f(View.MeasureSpec.makeMeasureSpec(this.ac.b, 1073741824), dqxVar.d());
        }
        return this.H.f(this.s, dqxVar.d());
    }

    public final int o(dqx dqxVar) {
        if (Y()) {
            drm drmVar = this.H;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.ac.a, 1073741824);
            dqxVar.d();
            return drmVar.i(makeMeasureSpec);
        }
        drm drmVar2 = this.H;
        int i = this.r;
        dqxVar.d();
        return drmVar2.i(i);
    }

    public final dqx p(dte dteVar) {
        dkf dkfVar = this.ae;
        if (dkfVar == null) {
            dkfVar = null;
        }
        dsf dsfVar = this.ao;
        boolean z = this.R;
        boolean z2 = this.O;
        boolean z3 = this.S;
        boolean z4 = this.T;
        boolean z5 = this.U;
        boolean z6 = this.V;
        dqw c = dqx.c();
        if (dteVar == null) {
            dteVar = dqv.q();
        }
        c.a = dteVar;
        c.b = dkfVar;
        c.i = dsfVar;
        c.c = z;
        c.h = z2;
        c.e = z3;
        c.d = z4;
        c.f = z5;
        c.g = z6;
        if (c.a != null) {
            return new dqx(c);
        }
        throw new IllegalArgumentException("A RenderInfo must be specified to create a ComponentTreeHolder");
    }

    public final dsl q(int i, dte dteVar) {
        dqx p = p(dteVar);
        p.l(false);
        return new dsl(i, p);
    }

    public final void r(dsm dsmVar) {
        if (this.ai == null) {
            this.ai = new dsk();
        }
        this.ai.a.add(dsmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        monitor-enter(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r4 = r3.a.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (r5 >= r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        r6 = (defpackage.dsm) r3.a.get(r5);
        r7 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        if (r7 == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        if (r7 == 1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r7 == 2) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        if (r7 == 3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        if (r7 == 4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        r6 = (defpackage.dso) r6;
        D(r6.b, r6.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fd, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        r6 = (defpackage.dso) r6;
        I(r6.a, r6.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a5, code lost:
    
        H(((defpackage.dsn) r6).a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        r6 = (defpackage.dsq) r6;
        M(r6.a, r6.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
    
        r6 = (defpackage.dsp) r6;
        L(r6.a, r6.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        r6 = (defpackage.dsl) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c9, code lost:
    
        if (r6.b.p() != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cd, code lost:
    
        if (defpackage.dth.a == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cf, code lost:
    
        hashCode();
        r7 = r6.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d4, code lost:
    
        r10.F.a(r6.b.d());
        r10.b.add(r6.a, r6.b);
        r6.b.l(true);
        r10.e.od(r6.a);
        r10.D.f(r6.a, r10.w);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        monitor-exit(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0102, code lost:
    
        r3.d.a();
        r10.n.addLast(r3.d);
        y();
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x005f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsx.s():void");
    }

    public final void u() {
        if (doa.a || doa.e) {
            long id = Thread.currentThread().getId();
            long andSet = this.l.getAndSet(id);
            if (id == andSet || andSet == -1) {
                return;
            }
            StringBuilder sb = new StringBuilder(94);
            sb.append("Multiple threads applying change sets at once! (");
            sb.append(andSet);
            sb.append(" and ");
            sb.append(id);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void v(int i, int i2, dtb dtbVar) {
        int i3;
        synchronized (this) {
            if (Y() && (i3 = this.w) != -1) {
                if (i == -1 || i2 == -1) {
                    i = 0;
                    i2 = 0;
                }
                int max = Math.max(i3, i2 - i);
                int size = this.b.size();
                int i4 = (int) (max * this.h);
                dtbVar.a(size, new dsa(this, i - i4, i + max + i4, size));
            }
        }
    }

    public final void w(int i, List list) {
        if (dth.a) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = ((dte) list.get(i2)).r();
            }
            hashCode();
            list.size();
            String.valueOf(Arrays.toString(strArr)).length();
        }
        synchronized (this) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                dte dteVar = (dte) list.get(i3);
                t(dteVar);
                dqx p = p(dteVar);
                if (!this.z) {
                    this.b.add(i + i3, p);
                    this.F.a(dteVar);
                } else {
                    throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
                }
            }
        }
        this.e.l(i, list.size());
        duj dujVar = this.D;
        list.size();
        dujVar.c(dujVar.f(i, this.w));
    }

    public final void y() {
        if (!this.n.isEmpty() && this.ag) {
            RecyclerView recyclerView = this.t;
            if (recyclerView != null && recyclerView.as() && recyclerView.r && recyclerView.getWindowVisibility() == 0) {
                Object obj = recyclerView;
                while (true) {
                    if (obj instanceof View) {
                        View view = (View) obj;
                        if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                            break;
                        } else {
                            obj = view.getParent();
                        }
                    } else if (recyclerView.getGlobalVisibleRect(L)) {
                        if (this.n.size() > 20) {
                            this.n.clear();
                            StringBuilder sb = new StringBuilder();
                            sb.append("recyclerView: ");
                            sb.append(recyclerView);
                            sb.append(", hasPendingAdapterUpdates(): ");
                            sb.append(recyclerView.as());
                            sb.append(", isAttachedToWindow(): ");
                            sb.append(recyclerView.r);
                            sb.append(", getWindowVisibility(): ");
                            sb.append(recyclerView.getWindowVisibility());
                            sb.append(", vie visible hierarchy: ");
                            ArrayList arrayList = new ArrayList();
                            Object obj2 = recyclerView;
                            while (obj2 instanceof View) {
                                View view2 = (View) obj2;
                                String simpleName = view2.getClass().getSimpleName();
                                float alpha = view2.getAlpha();
                                int visibility = view2.getVisibility();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(simpleName).length() + 52);
                                sb2.append("view=");
                                sb2.append(simpleName);
                                sb2.append(", alpha=");
                                sb2.append(alpha);
                                sb2.append(", visibility=");
                                sb2.append(visibility);
                                arrayList.add(sb2.toString());
                                if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                    break;
                                } else {
                                    obj2 = view2.getParent();
                                }
                            }
                            sb.append(arrayList);
                            sb.append(", getGlobalVisibleRect(): ");
                            sb.append(recyclerView.getGlobalVisibleRect(L));
                            sb.append(", isComputingLayout(): ");
                            sb.append(recyclerView.au());
                            sb.append(", isSubAdapter: false, visible range: [");
                            sb.append(this.u);
                            sb.append(", ");
                            sb.append(this.v);
                            sb.append("]");
                            String valueOf = String.valueOf(sb);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 56);
                            sb3.append("@OnDataRendered callbacks aren't triggered as expected: ");
                            sb3.append(valueOf);
                            dhz.a(2, "RecyclerBinder:DataRenderedNotTriggered", sb3.toString());
                            return;
                        }
                        return;
                    }
                }
            }
            boolean z = recyclerView != null;
            ArrayDeque arrayDeque = new ArrayDeque(this.n);
            this.n.clear();
            this.g.postAtFrontOfQueue(new dry(arrayDeque, z));
        }
    }

    public final void z() {
        if (this.t != null && this.D.d()) {
            this.t.removeCallbacks(this.G);
            jw.H(this.t, this.G);
        }
        T(this.u, this.v);
    }

    static boolean N(int i, int i2, int i3, boolean z) {
        if (i3 != 1) {
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                return false;
            }
        } else if (View.MeasureSpec.getMode(i) == 1073741824) {
            return false;
        }
        return z;
    }
}
