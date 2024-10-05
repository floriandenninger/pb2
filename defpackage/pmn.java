package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pmn implements Handler.Callback, bbo, bep, pnp, pll, pob {
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private boolean F;
    private boolean G;
    private int H;
    private pmm I;

    /* renamed from: J, reason: collision with root package name */
    private long f269J;
    private int K;
    private boolean L;
    private plp M;
    private final pls N;
    private final pli O;
    public final pso a;
    public final Looper b;
    public boolean c;
    public boolean d;
    private final poe[] e;
    private final Set f;
    private final pof[] g;
    private final beq h;
    private final ber i;
    private final pmv j;
    private final bey k;
    private final HandlerThread l;
    private final pot m;
    private final pos n;
    private final long o;
    private final boolean p;
    private final plm q;
    private final ArrayList r;
    private final psf s;
    private final pnj t;
    private final pnq u;
    private final long v;
    private poi w;
    private pnt x;
    private pml y;
    private boolean E = false;
    private boolean z = false;

    public pmn(poe[] poeVarArr, beq beqVar, ber berVar, pmv pmvVar, bey beyVar, int i, avk avkVar, poi poiVar, pli pliVar, long j, Looper looper, psf psfVar, pls plsVar) {
        this.N = plsVar;
        this.e = poeVarArr;
        this.h = beqVar;
        this.i = berVar;
        this.j = pmvVar;
        this.k = beyVar;
        this.D = i;
        this.w = poiVar;
        this.O = pliVar;
        this.v = j;
        this.s = psfVar;
        this.o = pmvVar.a();
        this.p = pmvVar.i();
        this.x = pnt.g(berVar);
        this.y = new pml(this.x);
        this.g = new pof[poeVarArr.length];
        for (int i2 = 0; i2 < poeVarArr.length; i2++) {
            poeVarArr[i2].au(i2);
            this.g[i2] = poeVarArr[i2].am();
        }
        this.q = new plm(this);
        this.r = new ArrayList();
        this.f = amkq.as();
        this.m = new pot();
        this.n = new pos();
        beqVar.e = this;
        beqVar.f = beyVar;
        this.L = true;
        Handler handler = new Handler(looper);
        this.t = new pnj(avkVar, handler);
        this.u = new pnq(this, avkVar, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.l = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.b = looper2;
        this.a = psfVar.a(looper2, this);
    }

    private final void A(long j, long j2) {
        this.a.f();
        ((pto) this.a).b.sendEmptyMessageAtTime(2, j + j2);
    }

    private final void B(boolean z) {
        ash ashVar = this.t.d.f.i;
        long S = S(ashVar, this.x.q, true, false);
        if (S != this.x.q) {
            pnt pntVar = this.x;
            this.x = T(ashVar, S, pntVar.b, pntVar.c, z, 5);
        }
    }

    private final void C(boolean z, int i, boolean z2, int i2) {
        this.y.a(z2 ? 1 : 0);
        pml pmlVar = this.y;
        pmlVar.a = true;
        pmlVar.f = true;
        pmlVar.g = i2;
        this.x = this.x.b(z, i);
        this.B = false;
        for (png pngVar = this.t.d; pngVar != null; pngVar = pngVar.h) {
            for (bel belVar : pngVar.j.c) {
            }
        }
        if (!P()) {
            G();
            J();
            return;
        }
        int i3 = this.x.d;
        if (i3 == 3) {
            E();
            this.a.g(2);
        } else if (i3 == 2) {
            this.a.g(2);
        }
    }

    private final void D(int i) {
        pnt pntVar = this.x;
        if (pntVar.d != i) {
            this.x = pntVar.e(i);
        }
    }

    private final void E() {
        this.B = false;
        plm plmVar = this.q;
        plmVar.f = true;
        plmVar.a.b();
        for (poe poeVar : this.e) {
            if (M(poeVar)) {
                poeVar.av();
            }
        }
    }

    private final void F(boolean z, boolean z2) {
        w(z || !this.F, false, true, false);
        this.y.a(z2 ? 1 : 0);
        this.j.g();
        D(1);
    }

    private final void G() {
        this.q.a();
        for (poe poeVar : this.e) {
            if (M(poeVar)) {
                W(poeVar);
            }
        }
    }

    private final void H() {
        png pngVar = this.t.f;
        boolean z = this.C || (pngVar != null && pngVar.a.p());
        pnt pntVar = this.x;
        if (z != pntVar.f) {
            this.x = new pnt(pntVar.a, pntVar.s, pntVar.b, pntVar.c, pntVar.d, pntVar.e, z, pntVar.g, pntVar.h, pntVar.i, pntVar.t, pntVar.j, pntVar.k, pntVar.l, pntVar.o, pntVar.p, pntVar.q, pntVar.m, pntVar.n);
        }
    }

    private final void I(asj asjVar, ber berVar) {
        this.j.h(this.e, asjVar, berVar.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0118, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J() {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmn.J():void");
    }

    private final synchronized void K(amnv amnvVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) amnvVar.get()).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final boolean L() {
        png pngVar = this.t.f;
        return (pngVar == null || pngVar.c() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean M(poe poeVar) {
        return poeVar.ad() != 0;
    }

    private final boolean N() {
        png pngVar = this.t.d;
        long j = pngVar.f.d;
        if (pngVar.d) {
            return j == -9223372036854775807L || this.x.q < j || !P();
        }
        return false;
    }

    private static boolean O(pnt pntVar, pos posVar) {
        ash ashVar = pntVar.s;
        pou pouVar = pntVar.a;
        return pouVar.z() || pouVar.jH(ashVar.a, posVar).f;
    }

    private final boolean P() {
        pnt pntVar = this.x;
        return pntVar.j && pntVar.k == 0;
    }

    private static pms[] Q(bel belVar) {
        int d = belVar != null ? belVar.d() : 0;
        pms[] pmsVarArr = new pms[d];
        for (int i = 0; i < d; i++) {
            pmsVarArr[i] = belVar.f(i);
        }
        return pmsVarArr;
    }

    private final long R(ash ashVar, long j, boolean z) {
        pnj pnjVar = this.t;
        return S(ashVar, j, pnjVar.d != pnjVar.e, z);
    }

    private final long S(ash ashVar, long j, boolean z, boolean z2) {
        pnj pnjVar;
        G();
        this.B = false;
        if (z2 || this.x.d == 3) {
            D(2);
        }
        png pngVar = this.t.d;
        png pngVar2 = pngVar;
        while (pngVar2 != null && !ashVar.equals(pngVar2.f.i)) {
            pngVar2 = pngVar2.h;
        }
        if (z || pngVar != pngVar2 || (pngVar2 != null && pngVar2.f(j) < 0)) {
            for (poe poeVar : this.e) {
                l(poeVar);
            }
            if (pngVar2 != null) {
                while (true) {
                    pnjVar = this.t;
                    if (pnjVar.d == pngVar2) {
                        break;
                    }
                    pnjVar.a();
                }
                pnjVar.h(pngVar2);
                pngVar2.k = 0L;
                n();
            }
        }
        if (pngVar2 != null) {
            this.t.h(pngVar2);
            if (!pngVar2.d) {
                pngVar2.f = pngVar2.f.b(j);
            } else if (pngVar2.e) {
                j = pngVar2.a.e(j);
                pngVar2.a.h(j - this.o, this.p);
            }
            y(j);
            u();
        } else {
            this.t.d();
            y(j);
        }
        q(false);
        this.a.g(2);
        return j;
    }

    private final pnt T(ash ashVar, long j, long j2, long j3, boolean z, int i) {
        asj asjVar;
        ber berVar;
        List list;
        asj asjVar2;
        ber berVar2;
        this.L = (!this.L && j == this.x.q && ashVar.equals(this.x.s)) ? false : true;
        x();
        pnt pntVar = this.x;
        asj asjVar3 = pntVar.g;
        ber berVar3 = pntVar.h;
        List list2 = pntVar.i;
        if (this.u.h) {
            png pngVar = this.t.d;
            if (pngVar == null) {
                asjVar2 = asj.a;
            } else {
                asjVar2 = pngVar.i;
            }
            if (pngVar == null) {
                berVar2 = this.i;
            } else {
                berVar2 = pngVar.j;
            }
            bel[] belVarArr = berVar2.c;
            amrp amrpVar = new amrp();
            boolean z2 = false;
            for (bel belVar : belVarArr) {
                if (belVar != null) {
                    Metadata metadata = belVar.f(0).l;
                    if (metadata == null) {
                        amrpVar.h(new Metadata(new Metadata.Entry[0]));
                    } else {
                        amrpVar.h(metadata);
                        z2 = true;
                    }
                }
            }
            amru g = z2 ? amrpVar.g() : amru.q();
            if (pngVar != null) {
                pnh pnhVar = pngVar.f;
                if (pnhVar.b != j2) {
                    pngVar.f = pnhVar.a(j2);
                }
            }
            list = g;
            asjVar = asjVar2;
            berVar = berVar2;
        } else if (ashVar.equals(pntVar.s)) {
            asjVar = asjVar3;
            berVar = berVar3;
            list = list2;
        } else {
            asjVar = asj.a;
            berVar = this.i;
            list = amru.q();
        }
        if (z) {
            pml pmlVar = this.y;
            if (pmlVar.d && pmlVar.e != 5) {
                pse.e(i == 5);
            } else {
                pmlVar.a = true;
                pmlVar.d = true;
                pmlVar.e = i;
            }
        }
        return this.x.i(ashVar, j, j2, j3, f(), asjVar, berVar, list);
    }

    private final void U(pou pouVar, ash ashVar, pou pouVar2, ash ashVar2, long j) {
        if (pouVar.z() || !V(pouVar, ashVar)) {
            float f = this.q.h().b;
            pnu pnuVar = this.x.l;
            if (f != pnuVar.b) {
                this.q.q(pnuVar);
                return;
            }
            return;
        }
        pouVar.y(pouVar.jH(ashVar.a, this.n).c, this.m);
        pli pliVar = this.O;
        pnb pnbVar = this.m.k;
        int i = pts.a;
        long j2 = pnbVar.a;
        pliVar.h = plh.c(-9223372036854775807L);
        long j3 = pnbVar.b;
        pliVar.j = plh.c(-9223372036854775807L);
        long j4 = pnbVar.c;
        pliVar.k = plh.c(-9223372036854775807L);
        float f2 = pnbVar.d;
        float f3 = pliVar.a;
        pliVar.n = 0.97f;
        float f4 = pnbVar.e;
        float f5 = pliVar.b;
        pliVar.m = 1.03f;
        pliVar.a();
        if (j != -9223372036854775807L) {
            this.O.b(e(pouVar, ashVar.a, j));
            return;
        }
        if (pts.R(!pouVar2.z() ? pouVar2.y(pouVar2.jH(ashVar2.a, this.n).c, this.m).b : null, this.m.b)) {
            return;
        }
        this.O.b(-9223372036854775807L);
    }

    private final boolean V(pou pouVar, ash ashVar) {
        if (!ashVar.a() && !pouVar.z()) {
            pouVar.y(pouVar.jH(ashVar.a, this.n).c, this.m);
            if (this.m.d()) {
                pot potVar = this.m;
                if (potVar.i && potVar.f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final void W(poe poeVar) {
        if (poeVar.ad() == 2) {
            poeVar.aw();
        }
    }

    private static final void X(poe poeVar, long j) {
        poeVar.at();
        if (poeVar instanceof pqc) {
            pqc pqcVar = (pqc) poeVar;
            pse.g(pqcVar.t);
            pqcVar.a = j;
        }
    }

    static Object a(pot potVar, pos posVar, int i, boolean z, Object obj, pou pouVar, pou pouVar2) {
        int d = pouVar.d(obj);
        int g = pouVar.g();
        int i2 = 0;
        int i3 = d;
        int i4 = -1;
        while (true) {
            if (i2 >= g || i4 != -1) {
                break;
            }
            i3 = pouVar.u(i3, posVar, potVar, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = pouVar2.d(pouVar.i(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return pouVar2.i(i4);
    }

    public static final void d(pod podVar) {
        podVar.c();
        try {
            podVar.a.rk(podVar.b, podVar.c);
        } finally {
            podVar.a(true);
        }
    }

    private final long e(pou pouVar, Object obj, long j) {
        pouVar.y(pouVar.jH(obj, this.n).c, this.m);
        pot potVar = this.m;
        if (potVar.f != -9223372036854775807L && potVar.d()) {
            pot potVar2 = this.m;
            if (potVar2.i) {
                return plh.c(pts.o(potVar2.g) - this.m.f) - (j + this.n.e);
            }
        }
        return -9223372036854775807L;
    }

    private final long f() {
        return g(this.x.o);
    }

    private final long g(long j) {
        png pngVar = this.t.f;
        if (pngVar == null) {
            return 0L;
        }
        return Math.max(0L, j - pngVar.e(this.f269J));
    }

    private final Pair h(pou pouVar) {
        long j = 0;
        if (pouVar.z()) {
            return Pair.create(pnt.r, 0L);
        }
        Pair v = pouVar.v(this.m, this.n, pouVar.c(this.E), -9223372036854775807L);
        ash j2 = this.t.j(pouVar, v.first, 0L);
        long longValue = ((Long) v.second).longValue();
        if (j2.a()) {
            pouVar.jH(j2.a, this.n);
            if (j2.c == this.n.c(j2.b)) {
                this.n.g();
            }
        } else {
            j = longValue;
        }
        return Pair.create(j2, Long.valueOf(j));
    }

    private static Pair i(pou pouVar, pmm pmmVar, boolean z, int i, boolean z2, pot potVar, pos posVar) {
        Pair v;
        pou pouVar2 = pmmVar.a;
        if (pouVar.z()) {
            return null;
        }
        pou pouVar3 = true == pouVar2.z() ? pouVar : pouVar2;
        try {
            v = pouVar3.v(potVar, posVar, pmmVar.b, pmmVar.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (pouVar.equals(pouVar3)) {
            return v;
        }
        if (pouVar.d(v.first) != -1) {
            return (pouVar3.jH(v.first, posVar).f && pouVar3.y(posVar.c, potVar).o == pouVar3.d(v.first)) ? pouVar.v(potVar, posVar, pouVar.jH(v.first, posVar).c, pmmVar.c) : v;
        }
        Object a = a(potVar, posVar, i, z2, v.first, pouVar3, pouVar);
        if (a != null) {
            return pouVar.v(potVar, posVar, pouVar.jH(a, posVar).c, -9223372036854775807L);
        }
        return null;
    }

    private final void l(poe poeVar) {
        if (M(poeVar)) {
            plm plmVar = this.q;
            if (poeVar == plmVar.c) {
                plmVar.d = null;
                plmVar.c = null;
                plmVar.e = true;
            }
            W(poeVar);
            poeVar.an();
            this.H--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:303:0x03c0, code lost:
    
        if (N() != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x042a, code lost:
    
        if (r42.j.c(f(), r42.q.h().b, r42.B, r32) == false) goto L254;
     */
    /* JADX WARN: Removed duplicated region for block: B:249:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0517  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m() {
        /*
            Method dump skipped, instructions count: 1417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmn.m():void");
    }

    private final void n() {
        o(new boolean[this.e.length]);
    }

    private final void o(boolean[] zArr) {
        psx psxVar;
        png pngVar = this.t.e;
        ber berVar = pngVar.j;
        for (int i = 0; i < this.e.length; i++) {
            if (!berVar.b(i) && this.f.remove(this.e[i])) {
                this.e[i].ar();
            }
        }
        for (int i2 = 0; i2 < this.e.length; i2++) {
            if (berVar.b(i2)) {
                boolean z = zArr[i2];
                poe poeVar = this.e[i2];
                if (M(poeVar)) {
                    continue;
                } else {
                    pnj pnjVar = this.t;
                    png pngVar2 = pnjVar.e;
                    boolean z2 = pngVar2 == pnjVar.d;
                    ber berVar2 = pngVar2.j;
                    pog pogVar = berVar2.b[i2];
                    pms[] Q = Q(berVar2.c[i2]);
                    boolean z3 = P() && this.x.d == 3;
                    boolean z4 = !z && z3;
                    this.H++;
                    this.f.add(poeVar);
                    poeVar.ao(pogVar, Q, pngVar2.c[i2], this.f269J, z4, z2, pngVar2.d(), pngVar2.k);
                    poeVar.rk(11, new pmh(this));
                    plm plmVar = this.q;
                    psx i3 = poeVar.i();
                    if (i3 != null && i3 != (psxVar = plmVar.d)) {
                        if (psxVar == null) {
                            plmVar.d = i3;
                            plmVar.c = poeVar;
                            plmVar.d.q(plmVar.a.a);
                        } else {
                            throw plp.b(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z3) {
                        poeVar.av();
                    }
                }
            }
        }
        pngVar.g = true;
    }

    private final void p(IOException iOException, int i) {
        plp plpVar = new plp(0, iOException, i);
        png pngVar = this.t.d;
        if (pngVar != null) {
            plpVar = plpVar.a(pngVar.f.i);
        }
        prh.j("ExoPlayerImplInternal", "Playback error", plpVar);
        F(false, false);
        this.x = this.x.c(plpVar);
    }

    private final void q(boolean z) {
        long b;
        png pngVar = this.t.f;
        ash ashVar = pngVar == null ? this.x.s : pngVar.f.i;
        boolean z2 = !this.x.t.equals(ashVar);
        if (z2) {
            this.x = this.x.h(ashVar);
        }
        pnt pntVar = this.x;
        if (pngVar == null) {
            b = pntVar.q;
        } else {
            b = pngVar.b();
        }
        pntVar.o = b;
        this.x.p = f();
        if ((z2 || z) && pngVar != null && pngVar.d) {
            I(pngVar.i, pngVar.j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0307, code lost:
    
        B(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0304, code lost:
    
        r9 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0302, code lost:
    
        if (r0.h(r5) != false) goto L143;
     */
    /* JADX WARN: Not initialized variable reg: 30, insn: 0x03c7: MOVE (r9 I:??[long, double]) = (r30 I:??[long, double]), block:B:162:0x03c7 */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0372 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r(defpackage.pou r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmn.r(pou, boolean):void");
    }

    private final void s(pnu pnuVar, boolean z) {
        t(pnuVar, pnuVar.b, true, z);
    }

    private final void t(pnu pnuVar, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.y.a(1);
            }
            this.x = this.x.d(pnuVar);
        }
        float f2 = pnuVar.b;
        png pngVar = this.t.d;
        while (true) {
            i = 0;
            if (pngVar == null) {
                break;
            }
            bel[] belVarArr = pngVar.j.c;
            int length = belVarArr.length;
            while (i < length) {
                bel belVar = belVarArr[i];
                if (belVar != null) {
                    belVar.n(f2);
                }
                i++;
            }
            pngVar = pngVar.h;
        }
        poe[] poeVarArr = this.e;
        int length2 = poeVarArr.length;
        while (i < length2) {
            poe poeVar = poeVarArr[i];
            if (poeVar != null) {
                poeVar.O(f, pnuVar.b);
            }
            i++;
        }
    }

    private final void u() {
        long e;
        boolean b;
        if (L()) {
            png pngVar = this.t.f;
            long g = g(pngVar.c());
            if (pngVar == this.t.d) {
                e = pngVar.e(this.f269J);
            } else {
                e = pngVar.e(this.f269J) - pngVar.f.a;
            }
            b = this.j.b(e, g, this.q.h().b);
        } else {
            b = false;
        }
        this.C = b;
        if (b) {
            png pngVar2 = this.t.f;
            long j = this.f269J;
            pse.g(pngVar2.l());
            pngVar2.a.o(pngVar2.e(j));
        }
        H();
    }

    private final void v() {
        pml pmlVar = this.y;
        pnt pntVar = this.x;
        boolean z = pmlVar.a | (pmlVar.b != pntVar);
        pmlVar.a = z;
        pmlVar.b = pntVar;
        if (z) {
            this.N.a(pmlVar);
            this.y = new pml(this.x);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pmn.w(boolean, boolean, boolean, boolean):void");
    }

    private final void x() {
        png pngVar = this.t.d;
        boolean z = false;
        if (pngVar != null && pngVar.f.g && this.z) {
            z = true;
        }
        this.A = z;
    }

    private final void y(long j) {
        png pngVar = this.t.d;
        if (pngVar != null) {
            j = pngVar.f(j);
        }
        this.f269J = j;
        this.q.a.a(j);
        for (poe poeVar : this.e) {
            if (M(poeVar)) {
                poeVar.as(this.f269J);
            }
        }
        for (png pngVar2 = this.t.d; pngVar2 != null; pngVar2 = pngVar2.h) {
            for (bel belVar : pngVar2.j.c) {
            }
        }
    }

    private final void z(pou pouVar, pou pouVar2) {
        if (pouVar.z() && pouVar2.z()) {
            return;
        }
        int size = this.r.size() - 1;
        if (size >= 0) {
            pmk pmkVar = (pmk) this.r.get(size);
            Object obj = pmkVar.b;
            pod podVar = pmkVar.a;
            throw null;
        }
        Collections.sort(this.r);
    }

    @Override // defpackage.pob
    public final synchronized void b(pod podVar) {
        if (!this.c && this.l.isAlive()) {
            this.a.b(14, podVar).b();
            return;
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        podVar.a(false);
    }

    public final synchronized boolean c() {
        if (!this.c && this.l.isAlive()) {
            this.a.g(7);
            K(new amnv() { // from class: pmf
                @Override // defpackage.amnv
                public final Object get() {
                    return Boolean.valueOf(pmn.this.c);
                }
            }, this.v);
            return this.c;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v28, types: [att, bey] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        png pngVar;
        int i;
        long longValue;
        ash ashVar;
        boolean z2;
        long j;
        Throwable th;
        boolean z3;
        long j2;
        long R;
        pnt pntVar;
        int i2;
        pnt T;
        int i3;
        try {
            switch (message.what) {
                case 0:
                    this.y.a(1);
                    w(false, false, false, true);
                    this.j.e();
                    D(true != this.x.a.z() ? 2 : 4);
                    pnq pnqVar = this.u;
                    ?? r2 = this.k;
                    pse.g(!pnqVar.h);
                    pnqVar.i = r2;
                    for (int i4 = 0; i4 < pnqVar.a.size(); i4++) {
                        pno pnoVar = (pno) pnqVar.a.get(i4);
                        pnqVar.d(pnoVar);
                        pnqVar.g.add(pnoVar);
                    }
                    pnqVar.h = true;
                    this.a.g(2);
                    break;
                case 1:
                    C(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m();
                    break;
                case 3:
                    pmm pmmVar = (pmm) message.obj;
                    this.y.a(1);
                    Pair i5 = i(this.x.a, pmmVar, true, this.D, this.E, this.m, this.n);
                    if (i5 == null) {
                        Pair h = h(this.x.a);
                        ash ashVar2 = (ash) h.first;
                        longValue = ((Long) h.second).longValue();
                        z2 = !this.x.a.z();
                        j = -9223372036854775807L;
                        ashVar = ashVar2;
                    } else {
                        Object obj = i5.first;
                        longValue = ((Long) i5.second).longValue();
                        long j3 = pmmVar.c == -9223372036854775807L ? -9223372036854775807L : longValue;
                        ash j4 = this.t.j(this.x.a, obj, longValue);
                        if (j4.a()) {
                            this.x.a.jH(j4.a, this.n);
                            if (this.n.c(j4.b) == j4.c) {
                                this.n.g();
                            }
                            ashVar = j4;
                            j = j3;
                            z2 = true;
                            longValue = 0;
                        } else {
                            ashVar = j4;
                            z2 = pmmVar.c == -9223372036854775807L;
                            j = j3;
                        }
                    }
                    try {
                        if (this.x.a.z()) {
                            this.I = pmmVar;
                        } else if (i5 == null) {
                            if (this.x.d != 1) {
                                D(4);
                            }
                            w(false, true, false, true);
                        } else {
                            try {
                                if (ashVar.equals(this.x.s)) {
                                    png pngVar2 = this.t.d;
                                    j2 = (pngVar2 == null || !pngVar2.d || longValue == 0) ? longValue : pngVar2.a.a(longValue, this.w);
                                    if (plh.d(j2) == plh.d(this.x.q) && ((i2 = (pntVar = this.x).d) == 2 || i2 == 3)) {
                                        long j5 = pntVar.q;
                                        T = T(ashVar, j5, j, j5, z2, 2);
                                        this.x = T;
                                        break;
                                    }
                                } else {
                                    j2 = longValue;
                                }
                                pnt pntVar2 = this.x;
                                pou pouVar = pntVar2.a;
                                U(pouVar, ashVar, pouVar, pntVar2.s, j);
                                longValue = R;
                            } catch (Throwable th2) {
                                th = th2;
                                z3 = z2;
                                longValue = R;
                                Throwable th3 = th;
                                this.x = T(ashVar, longValue, j, longValue, z3, 2);
                                throw th3;
                            }
                            R = R(ashVar, j2, this.x.d == 4);
                            z2 |= longValue != R;
                        }
                        T = T(ashVar, longValue, j, longValue, z2, 2);
                        this.x = T;
                    } catch (Throwable th4) {
                        th = th4;
                        z3 = z2;
                    }
                    break;
                case 4:
                    this.q.q((pnu) message.obj);
                    s(this.q.h(), true);
                    break;
                case 5:
                    this.w = (poi) message.obj;
                    break;
                case 6:
                    F(false, true);
                    break;
                case 7:
                    w(true, false, true, false);
                    this.j.f();
                    D(1);
                    this.l.quit();
                    synchronized (this) {
                        this.c = true;
                        notifyAll();
                    }
                    return true;
                case 8:
                    if (this.t.g((bbp) message.obj)) {
                        png pngVar3 = this.t.f;
                        float f = this.q.h().b;
                        pou pouVar2 = this.x.a;
                        pngVar3.d = true;
                        pngVar3.i = pngVar3.a.g();
                        ber g = pngVar3.g(f, pouVar2);
                        pnh pnhVar = pngVar3.f;
                        long j6 = pnhVar.a;
                        long j7 = pnhVar.d;
                        if (j7 != -9223372036854775807L && j6 >= j7) {
                            j6 = Math.max(0L, j7 - 1);
                        }
                        long m = pngVar3.m(g, j6);
                        long j8 = pngVar3.k;
                        pnh pnhVar2 = pngVar3.f;
                        pngVar3.k = j8 + (pnhVar2.a - m);
                        pngVar3.f = pnhVar2.b(m);
                        I(pngVar3.i, pngVar3.j);
                        if (pngVar3 == this.t.d) {
                            y(pngVar3.f.a);
                            n();
                            pnt pntVar3 = this.x;
                            ash ashVar3 = pntVar3.s;
                            long j9 = pngVar3.f.a;
                            this.x = T(ashVar3, j9, pntVar3.b, j9, false, 5);
                        }
                        u();
                        break;
                    }
                    break;
                case 9:
                    if (this.t.g((bbp) message.obj)) {
                        this.t.f(this.f269J);
                        u();
                        break;
                    }
                    break;
                case 10:
                    float f2 = this.q.h().b;
                    pnj pnjVar = this.t;
                    png pngVar4 = pnjVar.d;
                    png pngVar5 = pnjVar.e;
                    boolean z4 = true;
                    while (pngVar4 != null && pngVar4.d) {
                        ber g2 = pngVar4.g(f2, this.x.a);
                        ber berVar = pngVar4.j;
                        if (berVar != null && berVar.c.length == g2.c.length) {
                            for (int i6 = 0; i6 < g2.c.length; i6++) {
                                if (g2.a(berVar, i6)) {
                                }
                            }
                            z4 &= pngVar4 != pngVar5;
                            pngVar4 = pngVar4.h;
                        }
                        if (z4) {
                            pnj pnjVar2 = this.t;
                            png pngVar6 = pnjVar2.d;
                            boolean h2 = pnjVar2.h(pngVar6);
                            boolean[] zArr = new boolean[this.e.length];
                            long a = pngVar6.a(g2, this.x.q, h2, zArr);
                            pnt pntVar4 = this.x;
                            boolean z5 = (pntVar4.d == 4 || a == pntVar4.q) ? false : true;
                            pnt pntVar5 = this.x;
                            i3 = 2;
                            this.x = T(pntVar5.s, a, pntVar5.b, pntVar5.c, z5, 5);
                            if (z5) {
                                y(a);
                            }
                            boolean[] zArr2 = new boolean[this.e.length];
                            int i7 = 0;
                            while (true) {
                                poe[] poeVarArr = this.e;
                                if (i7 < poeVarArr.length) {
                                    poe poeVar = poeVarArr[i7];
                                    boolean M = M(poeVar);
                                    zArr2[i7] = M;
                                    bcy bcyVar = pngVar6.c[i7];
                                    if (M) {
                                        if (bcyVar != poeVar.ai()) {
                                            l(poeVar);
                                        } else if (zArr[i7]) {
                                            poeVar.as(this.f269J);
                                        }
                                    }
                                    i7++;
                                } else {
                                    o(zArr2);
                                }
                            }
                        } else {
                            i3 = 2;
                            this.t.h(pngVar4);
                            if (pngVar4.d) {
                                pngVar4.m(g2, Math.max(pngVar4.f.a, pngVar4.e(this.f269J)));
                            }
                        }
                        q(true);
                        if (this.x.d != 4) {
                            u();
                            J();
                            this.a.g(i3);
                            break;
                        }
                    }
                    break;
                case 11:
                    int i8 = message.arg1;
                    this.D = i8;
                    pnj pnjVar3 = this.t;
                    pou pouVar3 = this.x.a;
                    pnjVar3.b = i8;
                    if (!pnjVar3.i(pouVar3)) {
                        B(true);
                    }
                    q(false);
                    break;
                case 12:
                    boolean z6 = message.arg1 != 0;
                    this.E = z6;
                    pnj pnjVar4 = this.t;
                    pou pouVar4 = this.x.a;
                    pnjVar4.c = z6;
                    if (!pnjVar4.i(pouVar4)) {
                        B(true);
                    }
                    q(false);
                    break;
                case 13:
                    boolean z7 = message.arg1 != 0;
                    AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                    if (this.F != z7) {
                        this.F = z7;
                        if (!z7) {
                            for (poe poeVar2 : this.e) {
                                if (!M(poeVar2) && this.f.remove(poeVar2)) {
                                    poeVar2.ar();
                                }
                            }
                        }
                    }
                    if (atomicBoolean != null) {
                        synchronized (this) {
                            atomicBoolean.set(true);
                            notifyAll();
                        }
                        break;
                    }
                    break;
                case 14:
                    pod podVar = (pod) message.obj;
                    long j10 = podVar.e;
                    if (podVar.d == this.b) {
                        d(podVar);
                        int i9 = this.x.d;
                        if (i9 == 3 || i9 == 2) {
                            this.a.g(2);
                            break;
                        }
                    } else {
                        this.a.b(15, podVar).b();
                        break;
                    }
                case 15:
                    final pod podVar2 = (pod) message.obj;
                    Looper looper = podVar2.d;
                    if (!looper.getThread().isAlive()) {
                        Log.w("TAG", "Trying to send message on a dead thread.");
                        podVar2.a(false);
                        break;
                    } else {
                        this.s.a(looper, null).e(new Runnable() { // from class: pmg
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    pmn.d(pod.this);
                                } catch (plp e) {
                                    prh.j("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                                    throw new RuntimeException(e);
                                }
                            }
                        });
                        break;
                    }
                case 16:
                    s((pnu) message.obj, false);
                    break;
                case 17:
                    pmi pmiVar = (pmi) message.obj;
                    this.y.a(1);
                    if (pmiVar.b != -1) {
                        this.I = new pmm(new pkx(pmiVar.a, pmiVar.d), pmiVar.b, pmiVar.c);
                    }
                    pnq pnqVar2 = this.u;
                    List list = pmiVar.a;
                    bdb bdbVar = pmiVar.d;
                    pnqVar2.f(0, pnqVar2.a.size());
                    r(pnqVar2.g(pnqVar2.a.size(), list, bdbVar), false);
                    break;
                case 18:
                    pmi pmiVar2 = (pmi) message.obj;
                    int i10 = message.arg1;
                    this.y.a(1);
                    pnq pnqVar3 = this.u;
                    if (i10 == -1) {
                        i10 = pnqVar3.a();
                    }
                    r(pnqVar3.g(i10, pmiVar2.a, pmiVar2.d), false);
                    break;
                case 19:
                    pmj pmjVar = (pmj) message.obj;
                    this.y.a(1);
                    pnq pnqVar4 = this.u;
                    int i11 = pmjVar.a;
                    int i12 = pmjVar.b;
                    int i13 = pmjVar.c;
                    bdb bdbVar2 = pmjVar.d;
                    pse.e(pnqVar4.a() >= 0);
                    pnqVar4.j = null;
                    r(pnqVar4.b(), false);
                    break;
                case 20:
                    int i14 = message.arg1;
                    int i15 = message.arg2;
                    bdb bdbVar3 = (bdb) message.obj;
                    this.y.a(1);
                    pnq pnqVar5 = this.u;
                    pse.e(i14 >= 0 && i14 <= i15 && i15 <= pnqVar5.a());
                    pnqVar5.j = bdbVar3;
                    pnqVar5.f(i14, i15);
                    r(pnqVar5.b(), false);
                    break;
                case 21:
                    bdb bdbVar4 = (bdb) message.obj;
                    this.y.a(1);
                    pnq pnqVar6 = this.u;
                    int a2 = pnqVar6.a();
                    if (bdbVar4.a() != a2) {
                        bdbVar4 = new bdb(new Random(bdbVar4.a.nextLong())).b(a2);
                    }
                    pnqVar6.j = bdbVar4;
                    r(pnqVar6.b(), false);
                    break;
                case 22:
                    r(this.u.b(), true);
                    break;
                case 23:
                    this.z = message.arg1 != 0;
                    x();
                    if (this.A) {
                        pnj pnjVar5 = this.t;
                        if (pnjVar5.e != pnjVar5.d) {
                            B(true);
                            q(false);
                            break;
                        }
                    }
                    break;
                case 24:
                    boolean z8 = message.arg1 == 1;
                    if (z8 != this.G) {
                        this.G = z8;
                        pnt pntVar6 = this.x;
                        int i16 = pntVar6.d;
                        if (!z8 && i16 != 4 && i16 != 1) {
                            this.a.g(2);
                            break;
                        }
                        this.x = pntVar6.a(z8);
                    }
                    break;
                case 25:
                    B(true);
                    break;
                default:
                    return false;
            }
        } catch (atf e) {
            p(e, e.a);
        } catch (ayg e2) {
            p(e2, e2.a);
        } catch (bas e3) {
            p(e3, 1002);
        } catch (pnr e4) {
            int i17 = e4.b;
            if (i17 == 1) {
                i = true != e4.a ? 3003 : 3001;
            } else if (i17 == 4) {
                i = true != e4.a ? 3004 : 3002;
            } else {
                i = 1000;
            }
            p(e4, i);
        } catch (IOException e5) {
            p(e5, 2000);
        } catch (RuntimeException e6) {
            plp b = plp.b(e6, ((e6 instanceof IllegalStateException) || (e6 instanceof IllegalArgumentException)) ? 1004 : 1000);
            prh.j("ExoPlayerImplInternal", "Playback error", b);
            F(true, false);
            this.x = this.x.c(b);
        } catch (plp e7) {
            plp plpVar = e7;
            if (plpVar.a == 1 && (pngVar = this.t.e) != null) {
                plpVar = plpVar.a(pngVar.f.i);
            }
            if (!plpVar.g || this.M != null) {
                plp plpVar2 = this.M;
                if (plpVar2 != null) {
                    plpVar = plpVar2;
                }
                prh.j("ExoPlayerImplInternal", "Playback error", plpVar);
                z = true;
                F(true, false);
                this.x = this.x.c(plpVar);
            } else {
                prh.k("ExoPlayerImplInternal", "Recoverable renderer error", plpVar);
                this.M = plpVar;
                pso psoVar = this.a;
                psoVar.h(psoVar.b(25, plpVar));
            }
        }
        z = true;
        v();
        return z;
    }

    @Override // defpackage.bcz
    public final /* bridge */ /* synthetic */ void j(bda bdaVar) {
        this.a.b(9, (bbp) bdaVar).b();
    }

    @Override // defpackage.bbo
    public final void k(bbp bbpVar) {
        this.a.b(8, bbpVar).b();
    }
}
