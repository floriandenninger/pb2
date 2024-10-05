package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pme extends pld {
    private final pls A;
    private bdb B;
    final ber b;
    final pnv c;
    public final pso d;
    public final pmn e;
    public final psv f;
    public final pos g;
    public final List h;
    public final avk i;
    public final Looper j;
    public final bey k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public poi q;
    public boolean r;
    public pnv s;
    public pnf t;
    public pnt u;
    public int v;
    public long w;
    private final beq x;
    private final CopyOnWriteArraySet y;
    private final boolean z;

    public pme(poe[] poeVarArr, beq beqVar, pmv pmvVar, bey beyVar, final avk avkVar, boolean z, poi poiVar, pli pliVar, long j, psf psfVar, Looper looper, poa poaVar, pnv pnvVar) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = pts.e;
        String.valueOf(hexString).length();
        String.valueOf(str).length();
        int length = poeVarArr.length;
        boolean z2 = true;
        pse.g(length > 0);
        pse.c(beqVar);
        this.x = beqVar;
        this.k = beyVar;
        this.i = avkVar;
        this.z = z;
        this.q = poiVar;
        this.r = false;
        this.j = looper;
        this.l = 0;
        this.f = new psv(looper, psfVar, new plx(0));
        this.y = new CopyOnWriteArraySet();
        this.h = new ArrayList();
        this.B = new bdb();
        ber berVar = new ber(new pog[length], new bel[length], null);
        this.b = berVar;
        this.g = new pos();
        psm psmVar = new psm();
        muf.G(new int[]{1, 2, 12, 13, 14, 15, 16, 17, 18, 19}, psmVar);
        muf.H(28, beqVar.d(), psmVar);
        muf.F(pnvVar, psmVar);
        pnv E = muf.E(psmVar);
        this.c = E;
        psm psmVar2 = new psm();
        muf.F(E, psmVar2);
        psmVar2.b(3);
        psmVar2.b(9);
        this.s = muf.E(psmVar2);
        this.t = pnf.a;
        this.v = -1;
        this.d = psfVar.a(looper, null);
        pls plsVar = new pls(this);
        this.A = plsVar;
        this.u = pnt.g(berVar);
        if (avkVar != null) {
            if (avkVar.e != null && !avkVar.b.b.isEmpty()) {
                z2 = false;
            }
            pse.g(z2);
            avkVar.e = poaVar;
            avkVar.f = avkVar.a.a(looper, null);
            psv psvVar = avkVar.d;
            avkVar.d = new psv(psvVar.d, looper, psvVar.a, new pst() { // from class: avh
                @Override // defpackage.pst
                public final void a(Object obj, psn psnVar) {
                    avm avmVar = (avm) obj;
                    SparseArray sparseArray = avk.this.c;
                    SparseArray sparseArray2 = new SparseArray(psnVar.b());
                    for (int i = 0; i < psnVar.b(); i++) {
                        int a = psnVar.a(i);
                        avl avlVar = (avl) sparseArray.get(a);
                        pse.c(avlVar);
                        sparseArray2.append(a, avlVar);
                    }
                    avmVar.O();
                }
            });
            u(avkVar);
            ((bfi) beyVar).h.a(new Handler(looper), avkVar);
        }
        this.e = new pmn(poeVarArr, beqVar, berVar, pmvVar, beyVar, this.l, avkVar, poiVar, pliVar, j, looper, psfVar, plsVar);
    }

    public static boolean F(pnt pntVar) {
        return pntVar.d == 3 && pntVar.j && pntVar.k == 0;
    }

    private final int L() {
        if (this.u.a.z()) {
            return this.v;
        }
        pnt pntVar = this.u;
        return pntVar.a.jH(pntVar.s.a, this.g).c;
    }

    private final long M(pnt pntVar) {
        if (pntVar.a.z()) {
            return plh.c(this.w);
        }
        if (pntVar.s.a()) {
            return pntVar.q;
        }
        return H(pntVar.a, pntVar.s, pntVar.q);
    }

    private static long N(pnt pntVar) {
        pot potVar = new pot();
        pos posVar = new pos();
        pntVar.a.jH(pntVar.s.a, posVar);
        long j = pntVar.b;
        return j == -9223372036854775807L ? pntVar.a.y(posVar.c, potVar).m : posVar.e + j;
    }

    private final Pair O(pou pouVar, int i, long j) {
        if (pouVar.z()) {
            this.v = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.w = j;
            return null;
        }
        if (i == -1 || i >= pouVar.h()) {
            i = pouVar.c(false);
            j = pouVar.y(i, this.a).a();
        }
        return pouVar.v(this.a, this.g, i, plh.c(j));
    }

    private final pnt P(pnt pntVar, pou pouVar, Pair pair) {
        ash ashVar;
        ber berVar;
        pnt i;
        pse.e(pouVar.z() || pair != null);
        pou pouVar2 = pntVar.a;
        pnt f = pntVar.f(pouVar);
        if (pouVar.z()) {
            ash ashVar2 = pnt.r;
            long c = plh.c(this.w);
            pnt h = f.i(ashVar2, c, c, c, 0L, asj.a, this.b, amru.q()).h(ashVar2);
            h.o = h.q;
            return h;
        }
        Object obj = f.s.a;
        int i2 = pts.a;
        boolean z = !obj.equals(pair.first);
        ash ashVar3 = z ? new ash(pair.first) : f.s;
        long longValue = ((Long) pair.second).longValue();
        long c2 = plh.c(o());
        if (!pouVar2.z()) {
            c2 -= pouVar2.jH(obj, this.g).e;
        }
        if (z || longValue < c2) {
            pse.g(!ashVar3.a());
            asj asjVar = z ? asj.a : f.g;
            if (z) {
                ashVar = ashVar3;
                berVar = this.b;
            } else {
                ashVar = ashVar3;
                berVar = f.h;
            }
            pnt h2 = f.i(ashVar, longValue, longValue, longValue, 0L, asjVar, berVar, z ? amru.q() : f.i).h(ashVar);
            h2.o = longValue;
            return h2;
        }
        if (longValue == c2) {
            int d = pouVar.d(f.t.a);
            if (d != -1 && pouVar.x(d, this.g).c == pouVar.jH(ashVar3.a, this.g).c) {
                return f;
            }
            pouVar.jH(ashVar3.a, this.g);
            long d2 = ashVar3.a() ? this.g.d(ashVar3.b, ashVar3.c) : this.g.d;
            i = f.i(ashVar3, f.q, f.q, f.c, d2 - f.q, f.g, f.h, f.i).h(ashVar3);
            i.o = d2;
        } else {
            pse.g(!ashVar3.a());
            long max = Math.max(0L, f.p - (longValue - c2));
            long j = f.o;
            if (f.t.equals(f.s)) {
                j = longValue + max;
            }
            i = f.i(ashVar3, longValue, longValue, longValue, max, f.g, f.h, f.i);
            i.o = j;
        }
        return i;
    }

    public final void A(boolean z, int i, int i2) {
        pnt pntVar = this.u;
        if (pntVar.j == z && pntVar.k == i) {
            return;
        }
        this.m++;
        pnt b = pntVar.b(z, i);
        this.e.a.c(1, z ? 1 : 0, i).b();
        D(b, 0, i2, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // defpackage.poa
    public final void B(pnu pnuVar) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        if (r1.y(k(), r7.a).i != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pme.C():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(final defpackage.pnt r40, final int r41, final int r42, boolean r43, boolean r44, final int r45, long r46, int r48) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pme.D(pnt, int, int, boolean, boolean, int, long, int):void");
    }

    @Override // defpackage.poa
    public final boolean E() {
        return this.u.j;
    }

    @Override // defpackage.poa
    public final boolean G() {
        return this.u.s.a();
    }

    public final long H(pou pouVar, ash ashVar, long j) {
        pouVar.jH(ashVar.a, this.g);
        return j + this.g.e;
    }

    @Override // defpackage.poa
    public final void I() {
    }

    @Override // defpackage.poa
    public final void J() {
        throw null;
    }

    public final void K(plp plpVar) {
        pnt pntVar = this.u;
        pnt h = pntVar.h(pntVar.s);
        h.o = h.q;
        h.p = 0L;
        pnt e = h.e(1);
        if (plpVar != null) {
            e = e.c(plpVar);
        }
        pnt pntVar2 = e;
        this.m++;
        this.e.a.a(6).b();
        D(pntVar2, 0, 1, false, pntVar2.a.z() && !this.u.a.z(), 4, M(pntVar2), -1);
    }

    @Override // defpackage.poa
    public final int S() {
        throw null;
    }

    @Override // defpackage.poa
    public final int j() {
        throw null;
    }

    @Override // defpackage.poa
    public final int k() {
        int L = L();
        if (L == -1) {
            return 0;
        }
        return L;
    }

    @Override // defpackage.poa
    public final int l() {
        return this.u.d;
    }

    @Override // defpackage.poa
    public final int m() {
        return this.u.k;
    }

    @Override // defpackage.poa
    public final int n() {
        return this.l;
    }

    public final long o() {
        if (G()) {
            pnt pntVar = this.u;
            pntVar.a.jH(pntVar.s.a, this.g);
            pnt pntVar2 = this.u;
            if (pntVar2.b == -9223372036854775807L) {
                return pntVar2.a.y(k(), this.a).a();
            }
            return plh.d(this.g.e) + plh.d(this.u.b);
        }
        return p();
    }

    @Override // defpackage.poa
    public final long p() {
        return plh.d(M(this.u));
    }

    @Override // defpackage.poa
    public final long q() {
        if (!G()) {
            pou s = s();
            if (s.z()) {
                return -9223372036854775807L;
            }
            return s.y(k(), this.a).b();
        }
        pnt pntVar = this.u;
        ash ashVar = pntVar.s;
        pntVar.a.jH(ashVar.a, this.g);
        return plh.d(this.g.d(ashVar.b, ashVar.c));
    }

    public final pod r(poc pocVar) {
        pmn pmnVar = this.e;
        pou pouVar = this.u.a;
        k();
        return new pod(pmnVar, pocVar, this.e.b);
    }

    @Override // defpackage.poa
    public final pou s() {
        return this.u.a;
    }

    public final void t(plq plqVar) {
        this.y.add(plqVar);
    }

    public final void u(pnw pnwVar) {
        this.f.a(pnwVar);
    }

    @Override // defpackage.poa
    public final void v() {
        throw null;
    }

    @Override // defpackage.poa
    public final void w() {
        throw null;
    }

    @Override // defpackage.poa
    public final void x(int i, long j) {
        pou pouVar = this.u.a;
        if (i >= 0 && (pouVar.z() || i < pouVar.h())) {
            this.m++;
            if (G()) {
                Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                pml pmlVar = new pml(this.u);
                pmlVar.a(1);
                this.A.a(pmlVar);
                return;
            }
            int i2 = l() != 1 ? 2 : 1;
            int k = k();
            pnt P = P(this.u.e(i2), pouVar, O(pouVar, i, j));
            this.e.a.b(3, new pmm(pouVar, i, plh.c(j))).b();
            D(P, 0, 1, true, true, 1, M(P), k);
            return;
        }
        throw new pmu();
    }

    public final void y(List list, int i, long j, boolean z) {
        long j2;
        int i2 = i;
        int L = L();
        long p = p();
        this.m++;
        if (!this.h.isEmpty()) {
            int size = this.h.size();
            for (int i3 = size - 1; i3 >= 0; i3--) {
                this.h.remove(i3);
            }
            bdb bdbVar = this.B;
            int[] iArr = new int[bdbVar.b.length - size];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = bdbVar.b;
                if (i4 >= iArr2.length) {
                    break;
                }
                int i6 = iArr2[i4];
                if (i6 < 0 || i6 >= size) {
                    int i7 = i4 - i5;
                    if (i6 >= 0) {
                        i6 -= size;
                    }
                    iArr[i7] = i6;
                } else {
                    i5++;
                }
                i4++;
            }
            this.B = new bdb(iArr, new Random(bdbVar.a.nextLong()));
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            pno pnoVar = new pno((bbr) list.get(i8), this.z);
            arrayList.add(pnoVar);
            this.h.add(i8, new pmd(pnoVar.b, pnoVar.a.d));
        }
        this.B = this.B.b(arrayList.size());
        pkx pkxVar = new pkx(this.h, this.B);
        if (pkxVar.z() || i2 < pkxVar.a) {
            if (z) {
                i2 = pkxVar.c(false);
                j2 = -9223372036854775807L;
            } else if (i2 == -1) {
                i2 = L;
                j2 = p;
            } else {
                j2 = j;
            }
            pnt P = P(this.u, pkxVar, O(pkxVar, i2, j2));
            int i9 = P.d;
            if (i2 != -1 && i9 != 1) {
                i9 = (pkxVar.z() || i2 >= pkxVar.a) ? 4 : 2;
            }
            pnt e = P.e(i9);
            this.e.a.b(17, new pmi(arrayList, this.B, i2, plh.c(j2))).b();
            D(e, 0, 1, false, (this.u.s.a.equals(e.s.a) || this.u.a.z()) ? false : true, 4, M(e), -1);
            return;
        }
        throw new pmu();
    }

    @Override // defpackage.poa
    public final void z(boolean z) {
        A(true, 0, 1);
    }
}
