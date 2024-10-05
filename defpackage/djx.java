package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class djx {
    private static Map B;
    private final boolean C;
    private final Map D = new HashMap();
    private List E;
    private int F;
    private int G;
    private final aee H;
    private djy I;

    /* renamed from: J, reason: collision with root package name */
    private din f183J;
    private int K;
    private int L;
    private int M;
    private long N;
    private int O;
    private boolean P;
    private int Q;
    private boolean R;
    private AccessibilityManager S;
    private boolean T;
    private dlr U;
    private dmi V;
    private dlf W;
    private final Set X;
    private final int Y;
    private Map Z;
    public final dhe c;
    public dha d;
    public final List e;
    public final List f;
    public final ArrayList g;
    public final ArrayList h;
    public final Map i;
    public final List j;
    djr k;
    dmi l;
    String m;
    public int n;
    public int o;
    public int p;
    public final int q;
    public int r;
    public boolean s;
    public final Map t;
    public List u;
    public volatile boolean v;
    public volatile boolean w;
    final boolean x;
    public dqp y;
    static final Comparator a = new uo(8);
    static final Comparator b = new uo(9);
    private static final AtomicInteger z = new AtomicInteger(1);
    private static final Object A = new Object();

    public djx(dhe dheVar) {
        new HashMap();
        this.e = new ArrayList(8);
        this.H = new aee(8);
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.M = 0;
        this.N = -1L;
        this.O = -1;
        this.P = true;
        this.Q = 0;
        this.R = false;
        this.p = -1;
        this.r = -1;
        this.T = false;
        this.t = new LinkedHashMap();
        this.X = new HashSet();
        this.w = true;
        boolean z2 = doa.a;
        this.x = false;
        this.c = dheVar;
        this.q = z.getAndIncrement();
        this.U = dheVar.d;
        this.j = doa.e ? new ArrayList(8) : null;
        this.Y = dheVar.b().getConfiguration().orientation;
        this.i = new HashMap();
        this.E = new ArrayList();
        if (dheVar.j != null) {
            this.C = false;
        } else {
            this.C = false;
        }
        this.f = new ArrayList(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r17.f(r7) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d6, code lost:
    
        r23.k = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:7:0x0014, B:9:0x0024, B:10:0x0040, B:12:0x005b, B:13:0x005f, B:15:0x0089, B:17:0x008d, B:20:0x0094, B:22:0x0098, B:24:0x009e, B:26:0x00a6, B:28:0x00ac, B:32:0x00d0, B:33:0x00d9, B:35:0x00ed, B:36:0x00f3, B:38:0x0103, B:40:0x0107, B:44:0x010d, B:45:0x0112, B:47:0x011a, B:54:0x00b9, B:56:0x00c3, B:58:0x00c9, B:62:0x00d6), top: B:6:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:7:0x0014, B:9:0x0024, B:10:0x0040, B:12:0x005b, B:13:0x005f, B:15:0x0089, B:17:0x008d, B:20:0x0094, B:22:0x0098, B:24:0x009e, B:26:0x00a6, B:28:0x00ac, B:32:0x00d0, B:33:0x00d9, B:35:0x00ed, B:36:0x00f3, B:38:0x0103, B:40:0x0107, B:44:0x010d, B:45:0x0112, B:47:0x011a, B:54:0x00b9, B:56:0x00c3, B:58:0x00c9, B:62:0x00d6), top: B:6:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.djx n(defpackage.dhe r16, defpackage.dha r17, defpackage.dhr r18, int r19, int r20, int r21, boolean r22, defpackage.djx r23, int r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djx.n(dhe, dha, dhr, int, int, int, boolean, djx, int, java.lang.String):djx");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(int i, djx djxVar) {
        dhe dheVar = djxVar.c;
        if (!djxVar.v) {
            throw new IllegalStateException("Can not resume a finished LayoutState calculation");
        }
        dlg dlgVar = null;
        djw djwVar = new djw(djxVar, null);
        dheVar.k = djwVar;
        dha dhaVar = djxVar.d;
        int i2 = djxVar.p;
        int i3 = djxVar.F;
        int i4 = djxVar.G;
        taz tazVar = dheVar.l;
        if (tazVar != null) {
            try {
                dlgVar = did.l(dheVar, tazVar, tazVar.a(dheVar, 19));
            } catch (Throwable th) {
                throw th;
            }
        }
        dlg dlgVar2 = dlgVar;
        if (dlgVar2 != null) {
            dlgVar2.a("component", dhaVar.o());
            dlgVar2.a("calculate_layout_state_source", q(i));
        }
        djt.j(dheVar, djxVar.k, i3, i4, djxVar.f183J, dlgVar2);
        v(dheVar, djxVar);
        djwVar.a();
        if (dlgVar2 != null) {
            taz.d(dlgVar2);
        }
    }

    private static dju p(dha dhaVar, long j, djx djxVar, djr djrVar, boolean z2, int i, boolean z3, boolean z4) {
        int i2;
        int i3;
        int i4;
        dmt dmtVar;
        dmi dmiVar;
        int i5;
        boolean z5 = dha.z(dhaVar);
        int i6 = djxVar.O;
        if (i6 >= 0) {
            Rect rect = ((dup) djxVar.e.get(i6)).b;
            int i7 = rect.left;
            i3 = rect.top;
            i2 = i7;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int I = djxVar.K + djrVar.I();
        int J2 = djxVar.L + djrVar.J();
        int H = djrVar.H() + I;
        int C = djrVar.C() + J2;
        int E = z2 ? djrVar.E() : 0;
        int G = z2 ? djrVar.G() : 0;
        int F = z2 ? djrVar.F() : 0;
        int D = z2 ? djrVar.D() : 0;
        dik bb = djrVar.bb();
        if (z5) {
            dmt dmtVar2 = new dmt();
            boolean z6 = djxVar.x;
            if (z2 && djrVar.M()) {
                if (dmtVar2.b != null) {
                    throw new IllegalStateException("Padding already initialized for this ViewNodeInfo.");
                }
                dmtVar2.b = new Rect();
                dmtVar2.b.set(E, G, F, D);
            }
            dmtVar2.d = djrVar.L();
            int i8 = I - i2;
            int i9 = J2 - i3;
            int i10 = H - i2;
            int i11 = C - i3;
            if (djrVar.aP()) {
                int S = djrVar.S();
                int U = djrVar.U();
                int T = djrVar.T();
                int R = djrVar.R();
                if (S == 0) {
                    if (U != 0) {
                        S = 0;
                    } else if (T != 0) {
                        S = 0;
                        U = 0;
                    } else if (R != 0) {
                        S = 0;
                        U = 0;
                        T = 0;
                    }
                }
                if (dmtVar2.c != null) {
                    throw new IllegalStateException("ExpandedTouchBounds already initialized for this ViewNodeInfo.");
                }
                dmtVar2.c = new Rect();
                dmtVar2.c.set(i8 - S, i9 - U, i10 + T, i11 + R);
            }
            dmtVar = dmtVar2;
            i4 = 0;
        } else {
            I += E;
            J2 += G;
            H -= F;
            C -= D;
            i4 = (bb == null || bb.q != 2) ? 0 : 2;
            dmtVar = null;
            bb = null;
        }
        Rect rect2 = new Rect(I, J2, H, C);
        if (z3) {
            i4 |= 1;
        }
        if (z4) {
            i5 = i4 | 4;
            dmiVar = null;
        } else {
            dmiVar = djxVar.V;
            i5 = i4;
        }
        boolean z7 = djxVar.x;
        return new dju(bb, dmtVar, dhaVar, rect2, i2, i3, i5, j, i, djxVar.Y, dmiVar);
    }

    private static String q(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "measure" : "updateStateAsync" : "updateStateSync" : "setSizeSpecAsync" : "setSizeSpec" : "setRootAsync" : "setRoot";
    }

    private static void r(djx djxVar) {
        dmi dmiVar;
        String sb;
        Object obj;
        dlf dlfVar = djxVar.W;
        if (dlfVar == null || dlfVar.b == 0 || (dmiVar = djxVar.V) == null) {
            return;
        }
        if (dmiVar.a == 3 || doa.i) {
            if (!djxVar.X.contains(dmiVar) && djxVar.t.put(dmiVar, dlfVar) != null) {
                djxVar.t.remove(dmiVar);
                djxVar.X.add(dmiVar);
            }
        } else if (djxVar.t.put(dmiVar, dlfVar) != null) {
            String valueOf = String.valueOf(dmiVar);
            djr djrVar = djxVar.k;
            if (djrVar == null) {
                sb = "null";
            } else {
                StringBuilder sb2 = new StringBuilder();
                LinkedList linkedList = new LinkedList();
                linkedList.addLast(null);
                linkedList.addLast(djrVar);
                int i = 0;
                while (!linkedList.isEmpty()) {
                    djr djrVar2 = (djr) linkedList.removeLast();
                    if (djrVar2 == null) {
                        i--;
                    } else {
                        dha W = djrVar2.W();
                        if (W != null) {
                            if (djrVar2 != djrVar) {
                                sb2.append('\n');
                                Iterator it = linkedList.iterator();
                                it.next();
                                it.next();
                                for (int i2 = 0; i2 < i - 1; i2++) {
                                    if (it.next() == null) {
                                        obj = ' ';
                                        sb2.append(obj);
                                        sb2.append(' ');
                                    }
                                    do {
                                    } while (it.next() != null);
                                    obj = "│";
                                    sb2.append(obj);
                                    sb2.append(' ');
                                }
                                sb2.append(linkedList.getLast() == null ? "└╴" : "├╴");
                            }
                            sb2.append(W.o());
                            if (W.o || djrVar2.aQ() || djrVar2.aq() != null) {
                                sb2.append('[');
                                if (W.o) {
                                    sb2.append("manual.key=\"");
                                    sb2.append(W.n());
                                    sb2.append("\";");
                                }
                                if (djrVar2.aQ()) {
                                    sb2.append("trans.key=\"");
                                    sb2.append(djrVar2.ar());
                                    sb2.append("\";");
                                }
                                if (djrVar2.aq() != null) {
                                    sb2.append("test.key=\"");
                                    sb2.append(djrVar2.aq());
                                    sb2.append("\";");
                                }
                                sb2.append(']');
                            }
                            if (djrVar2.c() != 0) {
                                linkedList.addLast(null);
                                int c = djrVar2.c();
                                while (true) {
                                    c--;
                                    if (c < 0) {
                                        break;
                                    } else {
                                        linkedList.addLast(djrVar2.g(c));
                                    }
                                }
                                i++;
                            }
                        }
                    }
                }
                sb = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 102 + String.valueOf(sb).length());
            sb3.append("The transitionId '");
            sb3.append(valueOf);
            sb3.append("' is defined multiple times in the same layout. TransitionIDs must be unique.\nTree:\n");
            sb3.append(sb);
            dhz.a(3, "LayoutState:DuplicateTransitionIds", sb3.toString());
        }
        djxVar.W = null;
        djxVar.V = null;
    }

    private static void s(aee aeeVar, dju djuVar, int i) {
        aeeVar.k(djuVar.j, Integer.valueOf(i));
    }

    private static void t(djx djxVar, dju djuVar, dup dupVar) {
        djuVar.i = djxVar.e.size();
        dup b2 = dju.b(djuVar, dupVar);
        if (dupVar != null) {
            if (dupVar.c == null) {
                dupVar.c = new ArrayList(4);
            }
            dupVar.c.add(b2);
        }
        djxVar.e.add(b2);
        djxVar.g.add(b2);
        djxVar.h.add(b2);
    }

    private static void u(dlf dlfVar, int i, dju djuVar) {
        if (dlfVar != null) {
            dlfVar.e(i, djuVar);
        }
    }

    private static void v(dhe dheVar, djx djxVar) {
        aee aeeVar;
        if (dheVar.k()) {
            return;
        }
        int i = djxVar.F;
        int i2 = djxVar.G;
        djr djrVar = djxVar.k;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            djxVar.n = Math.min(djrVar.H(), View.MeasureSpec.getSize(i));
        } else if (mode == 0) {
            djxVar.n = djrVar.H();
        } else if (mode == 1073741824) {
            djxVar.n = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            djxVar.o = Math.min(djrVar.C(), View.MeasureSpec.getSize(i2));
        } else if (mode2 == 0) {
            djxVar.o = djrVar.C();
        } else if (mode2 == 1073741824) {
            djxVar.o = View.MeasureSpec.getSize(i2);
        }
        djy djyVar = djxVar.I;
        if (djyVar != null && (aeeVar = djyVar.a) != null) {
            aeeVar.j();
        }
        djxVar.N = -1L;
        if (djrVar == dhe.a) {
            return;
        }
        x(null, dheVar, djrVar, djxVar, null);
        Collections.sort(djxVar.g, a);
        Collections.sort(djxVar.h, b);
        boolean z2 = djxVar.C;
        if (dheVar.j()) {
            return;
        }
        boolean z3 = doa.a;
        if (doa.a || doa.e) {
            return;
        }
        djxVar.k = null;
    }

    private final boolean w(djr djrVar) {
        return this.k.aW() ? djrVar == this.k.aj() : djrVar == this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:361:0x01cc, code lost:
    
        if (defpackage.dha.z(r33.W()) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f5 A[LOOP:4: B:142:0x03f3->B:143:0x03f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void x(defpackage.dup r31, defpackage.dhe r32, defpackage.djr r33, defpackage.djx r34, defpackage.din r35) {
        /*
            Method dump skipped, instructions count: 1811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djx.x(dup, dhe, djr, djx, din):void");
    }

    private static dju y(dup dupVar, djr djrVar, djx djxVar, dju djuVar, Drawable drawable, int i, boolean z2) {
        dha disVar = new dis(drawable);
        disVar.q = dhe.d(djrVar.X(), disVar);
        boolean z3 = djuVar != null ? !disVar.ah(djuVar.b, disVar) : false;
        long j = djuVar != null ? djuVar.j : -1L;
        disVar.Q(djxVar.c, djrVar);
        dju p = p(disVar, djxVar.N, djxVar, djrVar, false, 2, djxVar.P, z2);
        djxVar.z(p, djxVar.M, i, j, z3);
        t(djxVar, p, dupVar);
        s(djxVar.H, p, djxVar.e.size() - 1);
        u(djxVar.W, i, p);
        return p;
    }

    private final void z(dju djuVar, int i, int i2, long j, boolean z2) {
        if (this.I == null) {
            this.I = new djy();
        }
        djy djyVar = this.I;
        int i3 = 2;
        if (djyVar.a == null) {
            djyVar.a = new aee(2);
        }
        if (i < 0 || i > 255) {
            StringBuilder sb = new StringBuilder(75);
            sb.append("Level must be non-negative and no greater than 255 actual level ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        long j2 = (djuVar.b.u << 27) | (i << 19) | (i2 << 16);
        int i4 = -1;
        if (j > 0 && ((int) ((j >> 19) & 255)) == i) {
            i4 = (int) (65535 & j);
        }
        int intValue = ((Integer) djyVar.a.g(j2, 0)).intValue();
        if (i4 < intValue) {
            i4 = intValue + 1;
            i3 = 0;
        } else if (true == z2) {
            i3 = 1;
        }
        djuVar.k = i3;
        if (i4 < 0 || i4 > 65535) {
            StringBuilder sb2 = new StringBuilder(83);
            sb2.append("Sequence must be non-negative and no greater than 65535 actual sequence ");
            sb2.append(i4);
            throw new IllegalArgumentException(sb2.toString());
        }
        djuVar.j = i4 | j2;
        djyVar.a.k(j2, Integer.valueOf(i4 + 1));
    }

    public final int a(long j) {
        return ((Integer) this.H.g(j, -1)).intValue();
    }

    public final int b() {
        return this.e.size();
    }

    public final int c() {
        return this.f.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final djr d(dha dhaVar) {
        return (djr) this.i.get(Integer.valueOf(dhaVar.k));
    }

    public final dlr e() {
        dlr dlrVar = this.U;
        this.U = null;
        return dlrVar;
    }

    public final dmw f(int i) {
        return (dmw) this.f.get(i);
    }

    public final dup g(int i) {
        return (dup) this.e.get(i);
    }

    public final List h() {
        List list = this.E;
        this.E = null;
        return list;
    }

    public final Map i() {
        Map map = this.Z;
        this.Z = null;
        return map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void j(dha dhaVar) {
        this.i.remove(Integer.valueOf(dhaVar.k));
    }

    public final boolean k() {
        return dgo.c(this.S) == this.T;
    }

    public final boolean l(int i, int i2) {
        return did.x(this.F, i, this.n) && did.x(this.G, i2, this.o);
    }

    public final boolean m(int i) {
        return this.d.k == i;
    }
}
