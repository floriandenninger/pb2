package com.facebook.litho;

import android.content.Context;
import android.graphics.Rect;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import defpackage.amsj;
import defpackage.anaf;
import defpackage.dha;
import defpackage.dhe;
import defpackage.dhn;
import defpackage.dho;
import defpackage.dhp;
import defpackage.dhr;
import defpackage.dhs;
import defpackage.dht;
import defpackage.dhu;
import defpackage.dhz;
import defpackage.dic;
import defpackage.did;
import defpackage.dja;
import defpackage.djc;
import defpackage.djg;
import defpackage.djm;
import defpackage.djn;
import defpackage.djo;
import defpackage.djp;
import defpackage.djw;
import defpackage.djx;
import defpackage.dke;
import defpackage.dkf;
import defpackage.dkl;
import defpackage.dkn;
import defpackage.dkp;
import defpackage.dln;
import defpackage.dlo;
import defpackage.dlr;
import defpackage.dlu;
import defpackage.dmc;
import defpackage.dmg;
import defpackage.dmh;
import defpackage.dna;
import defpackage.dng;
import defpackage.doa;
import defpackage.dqp;
import defpackage.dsf;
import defpackage.jw;
import defpackage.taz;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ComponentTree {
    private static volatile Looper D = null;
    public static final String a = "ComponentTree";
    public volatile dsf A;
    public final amsj B;
    private boolean E;
    private String F;
    private Deque G;
    private int H;
    private final djo I;

    /* renamed from: J, reason: collision with root package name */
    private final boolean f155J;
    private final boolean K;
    private dkf L;
    private final Runnable M;
    private final Object N;
    private dhp O;
    private final Object P;
    private final List Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private boolean X;
    private int Y;
    private final dja Z;
    private volatile dqp aa;
    private final amsj ab;
    private amsj ac;
    public final boolean c;
    public final djp d = new djp();
    public List e;
    public final Object f;
    public dhu g;
    public final dhe h;
    public boolean i;
    public final boolean j;
    public final boolean k;
    public boolean l;
    public final boolean m;
    public dkp n;
    public dkf o;
    public volatile boolean p;
    public dmc q;
    public dmc r;
    public dha s;
    public djx t;
    public djx u;
    public djx v;
    public dlr w;
    public final int x;
    public final boolean y;
    public final boolean z;
    private static final AtomicInteger C = new AtomicInteger(0);
    public static final ThreadLocal b = new ThreadLocal();

    public ComponentTree(dho dhoVar) {
        new dhn(this, 1);
        this.f = new Object();
        this.L = new dke(Looper.getMainLooper());
        this.M = new dhn(this, 0);
        this.N = new Object();
        this.P = new Object();
        this.Q = new ArrayList();
        this.R = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.B = new amsj((byte[]) null, (byte[]) null, (char[]) null);
        this.Z = new dja();
        this.ab = new amsj((byte[]) null, (short[]) null);
        dhe dheVar = new dhe(dhoVar.a, new dlr(null), (amsj) null, (djw) null, (byte[]) null, (byte[]) null, (byte[]) null);
        dheVar.j = this;
        dheVar.f = null;
        this.h = dheVar;
        this.s = dhoVar.c;
        this.j = dhoVar.d;
        this.k = dhoVar.b;
        this.f155J = dhoVar.e;
        this.K = dhoVar.f;
        this.o = dhoVar.g;
        this.m = true;
        this.p = dhoVar.i;
        g(dhoVar.j);
        this.z = dhoVar.l;
        this.y = dhoVar.k;
        dlr dlrVar = dhoVar.h;
        this.w = dlrVar == null ? dlr.a(null) : dlrVar;
        this.x = C.getAndIncrement();
        this.I = new djo(this);
        dkf dkfVar = this.L;
        djg djgVar = did.l;
        this.L = dkfVar;
        dkf dkfVar2 = this.o;
        if (dkfVar2 == null) {
            if (doa.r == null) {
                dkfVar2 = new dke(y());
            } else {
                if (dlu.a == null) {
                    synchronized (dlu.class) {
                        if (dlu.a == null) {
                            dlu.a = new dlu(dlu.c);
                        }
                    }
                }
                dkfVar2 = dlu.a;
            }
        } else if (D != null) {
            boolean z = doa.a;
        }
        if (doa.q) {
            dkfVar2 = dkfVar2 instanceof dlu ? new djc(anaf.E(((dlu) dkfVar2).b)) : dkfVar2;
            djg djgVar2 = did.l;
        } else {
            dln dlnVar = new dln(dkfVar2);
            djg djgVar3 = did.l;
            dkfVar2 = dlnVar;
        }
        this.o = dkfVar2;
        this.c = did.s(dheVar.b);
    }

    private final void A() {
        this.Z.a();
    }

    private final synchronized void B() {
        Map map;
        djx djxVar = F() ? this.t : this.u;
        if (djxVar != null) {
            amsj amsjVar = this.ab;
            dqp dqpVar = djxVar.y;
            if (dqpVar != null && (map = dqpVar.a) != null) {
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    dna dnaVar = (dna) dqpVar.a.get((String) it.next());
                    for (dha dhaVar : dnaVar.b) {
                        String str = dnaVar.a;
                        if (amsjVar.t(dhaVar)) {
                            String str2 = dnaVar.a;
                            dhaVar.am();
                        }
                    }
                }
            }
        }
        this.ab.a.clear();
    }

    private final void C() {
        dsf dsfVar = this.A;
        if (dsfVar != null) {
            dsfVar.a.s();
            this.A = null;
        }
    }

    private final void D(Rect rect, boolean z) {
        boolean[] zArr;
        boolean[] zArr2;
        ViewGroup viewGroup;
        boolean[] zArr3;
        ComponentTree componentTree;
        djx djxVar = this.t;
        if (djxVar == null) {
            Log.w(a, "Main Thread Layout state is not found");
            return;
        }
        if (!this.n.M() && this.p) {
            boolean z2 = doa.a;
        }
        this.i = true;
        if (!this.p) {
            this.n.s.i = true;
            this.p = true;
        }
        try {
            dkp dkpVar = this.n;
            if (dkpVar.A > 0 && (componentTree = dkpVar.r) != null && componentTree.j) {
                if (!dkpVar.M()) {
                }
                rect = new Rect(0, 0, dkpVar.getWidth(), dkpVar.getHeight());
                z = false;
            }
            dkpVar.u.set(rect);
            dkn dknVar = dkpVar.B;
            if (dknVar != null && dkl.b(null) && (zArr3 = dknVar.a) != null && !zArr3[0]) {
                throw null;
            }
            dkn dknVar2 = dkpVar.B;
            if (dknVar2 != null && dkl.b(null) && (zArr = dknVar2.a) != null && zArr[0] && (zArr2 = dknVar2.b) != null && !zArr2[0] && (viewGroup = (ViewGroup) dkpVar.getParent()) != null) {
                if (dknVar2.c) {
                    throw null;
                }
                if (dknVar2.d) {
                    if (dkpVar.getBottom() >= viewGroup.getHeight() - viewGroup.getPaddingBottom()) {
                        throw null;
                    }
                } else if (dkpVar.getRight() >= viewGroup.getWidth() - viewGroup.getPaddingRight()) {
                    throw null;
                }
            }
            dkpVar.s.m(djxVar, rect, z);
        } finally {
            this.i = false;
            this.r = null;
            this.q = null;
        }
    }

    private final boolean E() {
        return H(this.t) || H(this.u);
    }

    private final boolean F() {
        if (H(this.t)) {
            return true;
        }
        return !I(this.u, this.T, this.U) && I(this.t, this.T, this.U);
    }

    private static boolean G(djx djxVar, int i, int i2, int i3) {
        return djxVar != null && djxVar.m(i) && djxVar.n == i2 && djxVar.o == i3 && djxVar.k();
    }

    private final boolean H(djx djxVar) {
        dha dhaVar = this.s;
        if (dhaVar != null) {
            return djxVar != null && djxVar.d.k == dhaVar.k && djxVar.l(this.T, this.U) && djxVar.k();
        }
        return false;
    }

    private static boolean I(djx djxVar, int i, int i2) {
        return djxVar != null && djxVar.l(i, i2) && djxVar.k();
    }

    private final void J() {
        if (F()) {
            this.u = null;
            return;
        }
        dkp dkpVar = this.n;
        if (dkpVar != null) {
            dkpVar.I();
        }
        this.t = this.u;
        this.u = null;
    }

    private final dqp K() {
        dqp dqpVar = this.aa;
        if (dqpVar == null) {
            synchronized (this) {
                dqpVar = this.aa;
                if (dqpVar == null) {
                    dqpVar = new dqp();
                    this.aa = dqpVar;
                }
            }
        }
        return dqpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059 A[Catch: all -> 0x0115, TryCatch #1 {, blocks: (B:4:0x000d, B:6:0x0011, B:12:0x001f, B:15:0x0029, B:18:0x003c, B:23:0x0046, B:30:0x0055, B:32:0x0059, B:36:0x0060, B:38:0x0064, B:44:0x0071, B:50:0x0093, B:53:0x00af, B:55:0x00b3, B:57:0x00b7, B:59:0x00bb, B:60:0x00bd, B:82:0x009f, B:85:0x00a3, B:86:0x00ab, B:95:0x0019, B:97:0x001d, B:98:0x010d, B:99:0x0114), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009f A[Catch: all -> 0x0115, DONT_GENERATE, TryCatch #1 {, blocks: (B:4:0x000d, B:6:0x0011, B:12:0x001f, B:15:0x0029, B:18:0x003c, B:23:0x0046, B:30:0x0055, B:32:0x0059, B:36:0x0060, B:38:0x0064, B:44:0x0071, B:50:0x0093, B:53:0x00af, B:55:0x00b3, B:57:0x00b7, B:59:0x00bb, B:60:0x00bd, B:82:0x009f, B:85:0x00a3, B:86:0x00ab, B:95:0x0019, B:97:0x001d, B:98:0x010d, B:99:0x0114), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void L(defpackage.dha r18, int r19, int r20, boolean r21, defpackage.dlo r22, int r23, java.lang.String r24, defpackage.amsj r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.L(dha, int, int, boolean, dlo, int, java.lang.String, amsj, boolean):void");
    }

    private final djx M(dhe dheVar, dha dhaVar, int i, int i2, boolean z, amsj amsjVar, int i3, String str) {
        dhr dhrVar;
        boolean z2;
        String sb;
        Object dhrVar2 = new dhr(this, dheVar, dhaVar, i, i2, z, amsjVar, i3, str, null, null, null);
        synchronized (this.P) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.Q.size()) {
                    dhrVar = dhrVar2;
                    z2 = false;
                    break;
                }
                dhrVar = (dhr) this.Q.get(i4);
                if (!dhrVar.j && dhrVar.equals(dhrVar2)) {
                    z2 = true;
                    break;
                }
                i4++;
            }
            if (!z2) {
                this.Q.add(dhrVar);
            }
            dhrVar.f.incrementAndGet();
        }
        djx a2 = dhrVar.a(i3);
        synchronized (this.P) {
            if (dhrVar.f.decrementAndGet() >= 0) {
                if (dhrVar.f.get() == 0) {
                    dhrVar.b();
                    this.Q.remove(dhrVar);
                }
            } else {
                throw new IllegalStateException("LayoutStateFuture ref count is below 0");
            }
        }
        Context context = dheVar.b;
        if (context != dhaVar.r) {
            String valueOf = String.valueOf(context);
            String valueOf2 = String.valueOf(dhaVar.r);
            String o = dhaVar.o();
            if (!doa.a) {
                sb = "Dumping of the component tree is not support on non-internal builds";
            } else if (dheVar == null) {
                sb = "ComponentContext is null";
            } else {
                dic e = dic.e(dheVar.j);
                if (e == null) {
                    sb = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    did.A(e, 0, sb2);
                    sb = sb2.toString();
                }
            }
            int length = String.valueOf(valueOf).length();
            int length2 = String.valueOf(valueOf2).length();
            StringBuilder sb3 = new StringBuilder(length + 128 + length2 + String.valueOf(o).length() + String.valueOf(sb).length());
            sb3.append("ComponentTree context is different from root builder context, ComponentTree context=");
            sb3.append(valueOf);
            sb3.append(", root builder context=");
            sb3.append(valueOf2);
            sb3.append(", root=");
            sb3.append(o);
            sb3.append(", ContextTree=");
            sb3.append(sb);
            dhz.a(2, "ComponentTree:CTContextIsDifferentFromRootBuilderContext", sb3.toString());
        }
        return a2;
    }

    public static dho c(dhe dheVar, dha dhaVar) {
        dho dhoVar = new dho(dheVar);
        if (dhaVar != null) {
            dhoVar.c = dhaVar;
            return dhoVar;
        }
        throw new NullPointerException("Creating a ComponentTree with a null root is not allowed!");
    }

    private static synchronized Looper y() {
        Looper looper;
        synchronized (ComponentTree.class) {
            if (D == null) {
                boolean z = doa.a;
                HandlerThread handlerThread = new HandlerThread("ComponentLayoutThread", 5);
                handlerThread.start();
                D = handlerThread.getLooper();
            }
            looper = D;
        }
        return looper;
    }

    private final void z(List list) {
        A();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dha dhaVar = (dha) it.next();
            this.B.x(dhaVar.q, dhaVar, dhaVar.m);
            synchronized (this.Z) {
                dhaVar.s(this.Z);
            }
        }
        this.B.y();
    }

    public final int a(int i, boolean z, dmc dmcVar, dng dngVar) {
        dmg dmgVar;
        if (dmcVar == null) {
            return -1;
        }
        if (!this.p && (dmgVar = dmcVar.b) != null) {
            return (int) dmh.c(dmgVar, this.t, dngVar);
        }
        if (!this.p || z) {
            return -1;
        }
        return i;
    }

    public final synchronized dha b() {
        return this.s;
    }

    public final synchronized dlr d() {
        return dlr.a(this.w);
    }

    public final synchronized String e() {
        return this.F;
    }

    public final synchronized String f() {
        dha dhaVar = this.s;
        if (dhaVar == null) {
            return null;
        }
        return dhaVar.o();
    }

    public final void g(dhs dhsVar) {
        if (dhsVar == null) {
            return;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new ArrayList();
            }
            this.e.add(dhsVar);
        }
    }

    public dkp getLithoView() {
        return this.n;
    }

    public final void h() {
        int i;
        dkp dkpVar = this.n;
        if (dkpVar == null) {
            throw new IllegalStateException("Trying to attach a ComponentTree without a set View");
        }
        djo djoVar = this.I;
        if (djoVar != null) {
            djoVar.a(dkpVar);
        }
        synchronized (this) {
            this.l = true;
            J();
            dha dhaVar = this.s;
            if (dhaVar != null) {
                i = dhaVar.k;
            } else {
                boolean z = this.E;
                String str = this.F;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
                sb.append("Trying to attach a ComponentTree with a null root. Is released: ");
                sb.append(z);
                sb.append(", Released Component name is: ");
                sb.append(str);
                throw new IllegalStateException(sb.toString());
            }
        }
        int measuredWidth = this.n.getMeasuredWidth();
        int measuredHeight = this.n.getMeasuredHeight();
        if (measuredWidth == 0) {
            if (measuredHeight == 0) {
                return;
            } else {
                measuredWidth = 0;
            }
        }
        if (!G(this.t, i, measuredWidth, measuredHeight) || this.n.M()) {
            this.n.requestLayout();
        } else {
            this.n.D();
        }
    }

    public final void i() {
        if (!this.l) {
            C();
            return;
        }
        synchronized (this) {
            if (this.s == null) {
                return;
            }
            djx djxVar = this.t;
            J();
            djx djxVar2 = this.t;
            int i = this.s.k;
            if (djxVar2 == djxVar) {
                return;
            }
            C();
            if (this.l) {
                int measuredWidth = this.n.getMeasuredWidth();
                int measuredHeight = this.n.getMeasuredHeight();
                if (measuredWidth == 0) {
                    if (measuredHeight == 0) {
                        return;
                    } else {
                        measuredWidth = 0;
                    }
                }
                if (!G(this.t, i, measuredWidth, measuredHeight)) {
                    this.n.requestLayout();
                } else {
                    t();
                }
            }
        }
    }

    public final synchronized void j(List list, String str) {
        dlr dlrVar = this.w;
        if (dlrVar != null) {
            dlrVar.i(list, str);
        }
    }

    public final void k() {
        djo djoVar = this.I;
        if (djoVar != null) {
            int size = djoVar.a.size();
            for (int i = 0; i < size; i++) {
                djn djnVar = (djn) djoVar.a.get(i);
                djnVar.a.clear();
                ViewPager viewPager = (ViewPager) djnVar.b.get();
                if (viewPager != null) {
                    jw.H(viewPager, new djm(djnVar, viewPager, 0));
                }
            }
            djoVar.a.clear();
        }
        synchronized (this) {
            this.l = false;
        }
    }

    public final void l() {
        if (!this.j) {
            throw new IllegalStateException("Calling incrementalMountComponent() but incremental mount is not enabled");
        }
        if (this.n == null) {
            return;
        }
        Rect rect = new Rect();
        boolean z = doa.a;
        if (!this.n.getLocalVisibleRect(rect)) {
            if (this.p) {
                return;
            }
            if ((this.r == null || rect.height() != 0) && (this.q == null || rect.width() != 0)) {
                return;
            }
        }
        n(rect, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (defpackage.did.w(r13.U, r13.W) != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r14, int r15, int[] r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.ComponentTree.m(int, int, int[], boolean):void");
    }

    public final void n(Rect rect, boolean z) {
        if (this.i) {
            dht dhtVar = new dht(rect, z);
            Deque deque = this.G;
            if (deque == null) {
                this.G = new ArrayDeque();
            } else if (deque.size() > 25) {
                dkp dkpVar = this.n;
                String a2 = dkpVar != null ? LithoViewTestHelper.a(dkpVar) : null;
                Object obj = this.s;
                if (obj == null) {
                    obj = f();
                }
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 55 + String.valueOf(valueOf).length());
                sb.append("Reentrant mounts exceed max attempts, view=");
                sb.append(a2);
                sb.append(", component=");
                sb.append(valueOf);
                dhz.a(3, "ComponentTree:ReentrantMountsExceedMaxAttempts", sb.toString());
                this.G.clear();
                return;
            }
            this.G.add(dhtVar);
            return;
        }
        D(rect, z);
        Deque deque2 = this.G;
        if (deque2 != null) {
            ArrayDeque arrayDeque = new ArrayDeque(deque2);
            this.G.clear();
            while (!arrayDeque.isEmpty()) {
                dht dhtVar2 = (dht) arrayDeque.pollFirst();
                this.n.I();
                D(dhtVar2.a, dhtVar2.b);
            }
        }
    }

    public final void o() {
        int i;
        if (this.i) {
            throw new IllegalStateException("Releasing a ComponentTree that is currently being mounted");
        }
        synchronized (this) {
            ((dke) this.L).removeCallbacks(this.M);
            synchronized (this.N) {
                dhp dhpVar = this.O;
                if (dhpVar != null) {
                    this.o.a(dhpVar);
                    this.O = null;
                }
            }
            synchronized (this.f) {
                dhu dhuVar = this.g;
                if (dhuVar != null) {
                    this.o.a(dhuVar);
                    this.g = null;
                }
            }
            synchronized (this.P) {
                for (int i2 = 0; i2 < this.Q.size(); i2++) {
                    ((dhr) this.Q.get(i2)).b();
                }
                this.Q.clear();
            }
            this.E = true;
            dha dhaVar = this.s;
            if (dhaVar != null) {
                this.F = dhaVar.o();
            }
            dkp dkpVar = this.n;
            if (dkpVar != null) {
                dkpVar.G(null);
            }
            this.s = null;
            B();
            this.t = null;
            this.u = null;
            this.v = null;
            this.w = null;
            this.e = null;
        }
        synchronized (this.Z) {
            A();
        }
        if (this.aa != null) {
            dqp dqpVar = this.aa;
            synchronized (dqpVar) {
                Map map = dqpVar.a;
                if (map == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(map.values());
                dqpVar.a.clear();
                int size = arrayList.size();
                for (i = 0; i < size; i++) {
                    dha dhaVar2 = (dha) arrayList.get(i);
                    dhe dheVar = dhaVar2.q;
                    dhaVar2.ap();
                }
            }
        }
    }

    public final void q(boolean z, String str, boolean z2) {
        boolean z3 = doa.a;
        synchronized (this) {
            dha dhaVar = this.s;
            if (dhaVar == null) {
                return;
            }
            if (this.X) {
                if (this.Y != 2) {
                    this.Y = true != z ? 2 : 1;
                    return;
                }
                return;
            }
            dha j = dhaVar.j();
            amsj E = amsj.E(this.ac);
            if (z2) {
                int i = this.H + 1;
                this.H = i;
                if (i == 50) {
                    dhz.a(3, "ComponentTree:StateUpdatesWhenLayoutInProgressExceedsThreshold", "State Updates when create layout in progress exceeds threshold");
                }
            }
            L(j, -1, -1, z, null, true != z ? 4 : 5, str, E, z2);
        }
    }

    public final synchronized boolean r(int i, int i2) {
        boolean z;
        if (!I(this.t, i, i2)) {
            z = I(this.u, i, i2);
        }
        return z;
    }

    public final synchronized boolean s() {
        return this.E;
    }

    public final boolean t() {
        if (this.n.M() || this.n.N()) {
            if (this.j) {
                l();
            } else {
                Rect rect = new Rect();
                this.n.getLocalVisibleRect(rect);
                n(rect, true);
            }
            return true;
        }
        if (!this.f155J) {
            return false;
        }
        dkp dkpVar = this.n;
        if (dkpVar.s.e) {
            return false;
        }
        dkpVar.D();
        return false;
    }

    public final taz u() {
        return this.h.l;
    }

    public final synchronized void v(int i, int i2, int i3) {
        Map map;
        djx djxVar = F() ? this.t : this.u;
        if (djxVar != null) {
            amsj amsjVar = this.ab;
            dqp dqpVar = djxVar.y;
            if (dqpVar != null && (map = dqpVar.a) != null) {
                Iterator it = map.keySet().iterator();
                while (it.hasNext()) {
                    dna dnaVar = (dna) dqpVar.a.get((String) it.next());
                    for (dha dhaVar : dnaVar.b) {
                        String str = dnaVar.a;
                        if (!amsjVar.t(dhaVar)) {
                            int i4 = (int) (((i3 - i2) + 1) * dnaVar.c.a);
                            if (i >= i2 - i4 && i <= i4 + i3) {
                                String str2 = dnaVar.a;
                                dhaVar.al();
                                String str3 = dnaVar.a;
                                amsjVar.u(dhaVar, 1);
                            }
                        }
                        String str4 = dnaVar.a;
                        if (amsjVar.t(dhaVar)) {
                            int i5 = (int) (((i3 - i2) + 1) * dnaVar.c.a);
                            if (i < i2 - i5 || i > i5 + i3) {
                                String str5 = dnaVar.a;
                                dhaVar.am();
                                String str6 = dnaVar.a;
                                amsjVar.u(dhaVar, 2);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void w(dlo dloVar, int i, String str, amsj amsjVar, boolean z) {
        ArrayList arrayList;
        int i2;
        boolean z2;
        List list;
        Map map;
        int i3;
        int i4;
        dlr dlrVar;
        synchronized (this.N) {
            dhp dhpVar = this.O;
            arrayList = null;
            if (dhpVar != null) {
                this.o.a(dhpVar);
                this.O = null;
            }
        }
        synchronized (this) {
            if (this.T != -1 && this.U != -1 && this.s != null) {
                if (E()) {
                    if (dloVar != null) {
                        djx djxVar = this.u;
                        if (djxVar == null) {
                            djxVar = this.t;
                        }
                        dloVar.a = djxVar.n;
                        dloVar.b = djxVar.o;
                    }
                    return;
                }
                int i5 = this.T;
                int i6 = this.U;
                this.V = i5;
                this.W = i6;
                dha j = this.s.j();
                boolean z3 = true;
                this.S++;
                djx M = M(this.h, j, i5, i6, this.K, amsjVar, i, str);
                if (M == null) {
                    if (!this.E && dloVar != null) {
                        throw new IllegalStateException("LayoutState is null, but only async operations can return a null LayoutState");
                    }
                    return;
                }
                if (dloVar != null) {
                    dloVar.a = M.n;
                    dloVar.b = M.o;
                }
                synchronized (this) {
                    this.V = -1;
                    this.W = -1;
                    z2 = !E() && I(M, this.T, this.U);
                    dlr e = M.e();
                    if (z2) {
                        if (e != null && (dlrVar = this.w) != null) {
                            dlrVar.h(e);
                        }
                        if (this.e != null) {
                            i3 = M.n;
                            i4 = M.o;
                        } else {
                            i3 = 0;
                            i4 = 0;
                        }
                        list = M.h();
                        map = M.i();
                        this.u = M;
                        this.v = M;
                    } else {
                        list = null;
                        map = null;
                        i3 = 0;
                        i4 = 0;
                        z3 = false;
                    }
                    if (e != null) {
                        this.d.b(e);
                    }
                    if (!z) {
                        this.H = 0;
                    }
                }
                if (z2) {
                    synchronized (this) {
                        List list2 = this.e;
                        if (list2 != null) {
                            arrayList = new ArrayList(list2);
                        }
                    }
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (i2 = 0; i2 < size; i2++) {
                            ((dhs) arrayList.get(i2)).a(i3, i4);
                        }
                    }
                    if (this.aa != null) {
                        this.aa.f(map);
                    } else if (map != null) {
                        K().f(map);
                    }
                }
                if (list != null) {
                    z(list);
                }
                if (z3) {
                    if (!did.t()) {
                        ((dke) this.L).post(this.M);
                    } else {
                        i();
                    }
                }
            }
        }
    }

    public final void x(dha dhaVar, int i, int i2, boolean z, dlo dloVar, int i3, amsj amsjVar) {
        L(dhaVar, i, i2, z, dloVar, i3, null, amsjVar, false);
    }

    public final void p(dha dhaVar, int i, int i2, dlo dloVar) {
        if (dhaVar == null) {
            throw new IllegalArgumentException("Root component can't be null");
        }
        x(dhaVar, i, i2, false, dloVar, 0, null);
    }
}
