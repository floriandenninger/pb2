package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afk {
    public float A;
    int B;
    float C;
    public final int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final afj f45J;
    public final afj K;
    public final afj L;
    public final afj M;
    public final afj N;
    final afj O;
    final afj P;
    public final afj Q;
    public final afj[] R;
    protected final ArrayList S;
    public afk T;
    int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int aa;
    public int ab;
    public int ac;
    public float ad;
    public float ae;
    public Object af;
    public int ag;
    public String ah;
    public int ai;
    public int aj;
    public final float[] ak;
    public final afk[] al;
    public final afk[] am;
    public int an;
    public int ao;
    public final int[] ap;
    private boolean b;
    private final boolean[] c;
    public afu f;
    public afu g;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public final int[] u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;
    public boolean e = false;
    public agc h = null;
    public age i = null;
    public final boolean[] j = {true, true};
    private boolean a = true;
    public int k = -1;
    public int l = -1;

    public afk() {
        new HashMap();
        this.b = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = 0.0f;
        this.F = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        afj afjVar = new afj(this, 2);
        this.f45J = afjVar;
        afj afjVar2 = new afj(this, 3);
        this.K = afjVar2;
        afj afjVar3 = new afj(this, 4);
        this.L = afjVar3;
        afj afjVar4 = new afj(this, 5);
        this.M = afjVar4;
        afj afjVar5 = new afj(this, 6);
        this.N = afjVar5;
        afj afjVar6 = new afj(this, 8);
        this.O = afjVar6;
        afj afjVar7 = new afj(this, 9);
        this.P = afjVar7;
        afj afjVar8 = new afj(this, 7);
        this.Q = afjVar8;
        this.R = new afj[]{afjVar, afjVar3, afjVar2, afjVar4, afjVar5, afjVar8};
        ArrayList arrayList = new ArrayList();
        this.S = arrayList;
        this.c = new boolean[2];
        this.ap = new int[]{1, 1};
        this.T = null;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        this.ad = 0.5f;
        this.ae = 0.5f;
        this.ag = 0;
        this.ah = null;
        this.ai = 0;
        this.aj = 0;
        this.ak = new float[]{-1.0f, -1.0f};
        this.al = new afk[]{null, null};
        this.am = new afk[]{null, null};
        this.an = -1;
        this.ao = -1;
        arrayList.add(afjVar);
        arrayList.add(afjVar2);
        arrayList.add(afjVar3);
        arrayList.add(afjVar4);
        arrayList.add(afjVar6);
        arrayList.add(afjVar7);
        arrayList.add(afjVar8);
        arrayList.add(afjVar5);
    }

    private final boolean a(int i) {
        afj afjVar;
        afj afjVar2;
        int i2 = i + i;
        afj[] afjVarArr = this.R;
        afj afjVar3 = afjVarArr[i2];
        afj afjVar4 = afjVar3.e;
        return (afjVar4 == null || afjVar4.e == afjVar3 || (afjVar2 = (afjVar = afjVarArr[i2 + 1]).e) == null || afjVar2.e != afjVar) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x049d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(defpackage.afb r29, boolean r30, boolean r31, boolean r32, boolean r33, defpackage.aff r34, defpackage.aff r35, int r36, boolean r37, defpackage.afj r38, defpackage.afj r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afk.c(afb, boolean, boolean, boolean, boolean, aff, aff, int, boolean, afj, afj, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void A(int i, int i2) {
        this.H = i;
        this.I = i2;
        this.a = false;
    }

    public final void B(int i) {
        if (i < 0) {
            this.ac = 0;
        } else {
            this.ac = i;
        }
    }

    public final void C(int i) {
        if (i < 0) {
            this.ab = 0;
        } else {
            this.ab = i;
        }
    }

    public final void D(int i) {
        this.U = i;
        int i2 = this.ab;
        if (i < i2) {
            this.U = i2;
        }
    }

    public void E(boolean z, boolean z2) {
        int i;
        int i2;
        agc agcVar = this.h;
        boolean z3 = z & agcVar.h;
        age ageVar = this.i;
        boolean z4 = z2 & ageVar.h;
        int i3 = agcVar.i.f;
        int i4 = ageVar.i.f;
        int i5 = agcVar.j.f;
        int i6 = ageVar.j.f;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.Y = i3;
        }
        if (z4) {
            this.Z = i4;
        }
        if (this.ag == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        if (z3) {
            if (this.ap[0] == 1 && i8 < (i2 = this.U)) {
                i8 = i2;
            }
            this.U = i8;
            int i10 = this.ab;
            if (i8 < i10) {
                this.U = i10;
            }
        }
        if (z4) {
            if (this.ap[1] == 1 && i9 < (i = this.V)) {
                i9 = i;
            }
            this.V = i9;
            int i11 = this.ac;
            if (i9 < i11) {
                this.V = i11;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F() {
        return (this instanceof afq) || (this instanceof afn);
    }

    public final boolean G(int i) {
        if (i == 0) {
            return (this.f45J.e != null ? 1 : 0) + (this.L.e != null ? 1 : 0) < 2;
        }
        return ((this.K.e != null ? 1 : 0) + (this.M.e != null ? 1 : 0)) + (this.N.e != null ? 1 : 0) < 2;
    }

    public final boolean H(int i, int i2) {
        afj afjVar;
        afj afjVar2;
        if (i == 0) {
            afj afjVar3 = this.f45J.e;
            return afjVar3 != null && afjVar3.c && (afjVar2 = this.L.e) != null && afjVar2.c && (afjVar2.a() - this.L.b()) - (this.f45J.e.a() + this.f45J.b()) >= i2;
        }
        afj afjVar4 = this.K.e;
        if (afjVar4 != null && afjVar4.c && (afjVar = this.M.e) != null && afjVar.c && (afjVar.a() - this.M.b()) - (this.K.e.a() + this.K.b()) >= i2) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        afj afjVar = this.f45J;
        afj afjVar2 = afjVar.e;
        if (afjVar2 != null && afjVar2.e == afjVar) {
            return true;
        }
        afj afjVar3 = this.L;
        afj afjVar4 = afjVar3.e;
        return afjVar4 != null && afjVar4.e == afjVar3;
    }

    public final boolean J() {
        afj afjVar = this.K;
        afj afjVar2 = afjVar.e;
        if (afjVar2 != null && afjVar2.e == afjVar) {
            return true;
        }
        afj afjVar3 = this.M;
        afj afjVar4 = afjVar3.e;
        return afjVar4 != null && afjVar4.e == afjVar3;
    }

    public final boolean K() {
        return this.a && this.ag != 8;
    }

    public afj L(int i) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? this.Q : this.N : this.M : this.L : this.K : this.f45J;
    }

    public final int M(int i) {
        if (i == 0) {
            return N();
        }
        return O();
    }

    public final int N() {
        return this.ap[0];
    }

    public final int O() {
        return this.ap[1];
    }

    public final void P(int i, afk afkVar, int i2, int i3, int i4) {
        L(i).j(afkVar.L(i2), i3, i4);
    }

    public final void Q(int i) {
        this.ap[0] = i;
    }

    public final void R(int i) {
        this.ap[1] = i;
    }

    public void S(boolean z) {
        int i;
        age ageVar;
        agc agcVar;
        int o = afb.o(this.f45J);
        int o2 = afb.o(this.K);
        int o3 = afb.o(this.L);
        int o4 = afb.o(this.M);
        if (z && (agcVar = this.h) != null) {
            afx afxVar = agcVar.i;
            if (afxVar.i) {
                afx afxVar2 = agcVar.j;
                if (afxVar2.i) {
                    o = afxVar.f;
                    o3 = afxVar2.f;
                }
            }
        }
        if (z && (ageVar = this.i) != null) {
            afx afxVar3 = ageVar.i;
            if (afxVar3.i) {
                afx afxVar4 = ageVar.j;
                if (afxVar4.i) {
                    o2 = afxVar3.f;
                    o4 = afxVar4.f;
                }
            }
        }
        int i2 = o4 - o2;
        if (o3 - o < 0 || i2 < 0 || o == Integer.MIN_VALUE || o == Integer.MAX_VALUE || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE) {
            o = 0;
            o2 = 0;
            o3 = 0;
            o4 = 0;
        }
        int i3 = o3 - o;
        int i4 = o4 - o2;
        this.Y = o;
        this.Z = o2;
        if (this.ag == 8) {
            this.U = 0;
            this.V = 0;
            return;
        }
        int[] iArr = this.ap;
        int i5 = iArr[0];
        if (i5 == 1) {
            int i6 = this.U;
            if (i3 < i6) {
                i3 = i6;
            }
            i5 = 1;
        }
        if (iArr[1] == 1 && i4 < (i = this.V)) {
            i4 = i;
        }
        this.U = i3;
        this.V = i4;
        int i7 = this.ac;
        if (i4 < i7) {
            this.V = i7;
        }
        int i8 = this.ab;
        if (i3 < i8) {
            this.U = i8;
        } else {
            i8 = i3;
        }
        int i9 = this.w;
        if (i9 > 0 && i5 == 3) {
            this.U = Math.min(i8, i9);
        }
        int i10 = this.z;
        if (i10 > 0 && this.ap[1] == 3) {
            this.V = Math.min(this.V, i10);
        }
        int i11 = this.U;
        if (i3 != i11) {
            this.k = i11;
        }
        int i12 = this.V;
        if (i4 != i12) {
            this.l = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0402, code lost:
    
        if (r6 == (-1)) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x02d0, code lost:
    
        if (r6 == 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r50.m != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x040e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.afb r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afk.b(afb, boolean):void");
    }

    public boolean d() {
        return this.ag != 8;
    }

    public boolean e() {
        return this.b || (this.f45J.c && this.L.c);
    }

    public boolean f() {
        return this.m || (this.K.c && this.M.c);
    }

    public final int g() {
        return l() + this.V;
    }

    public final int h() {
        if (this.ag == 8) {
            return 0;
        }
        return this.V;
    }

    public final int i() {
        return k() + this.U;
    }

    public final int j() {
        if (this.ag == 8) {
            return 0;
        }
        return this.U;
    }

    public final int k() {
        afk afkVar = this.T;
        return afkVar != null ? ((afl) afkVar).ar + this.Y : this.Y;
    }

    public final int l() {
        afk afkVar = this.T;
        return afkVar != null ? ((afl) afkVar).as + this.Z : this.Z;
    }

    public final afk m(int i) {
        afj afjVar;
        afj afjVar2;
        if (i != 0) {
            if (i == 1 && (afjVar2 = (afjVar = this.M).e) != null && afjVar2.e == afjVar) {
                return afjVar2.d;
            }
            return null;
        }
        afj afjVar3 = this.L;
        afj afjVar4 = afjVar3.e;
        if (afjVar4 == null || afjVar4.e != afjVar3) {
            return null;
        }
        return afjVar4.d;
    }

    public final afk n(int i) {
        afj afjVar;
        afj afjVar2;
        if (i != 0) {
            if (i == 1 && (afjVar2 = (afjVar = this.K).e) != null && afjVar2.e == afjVar) {
                return afjVar2.d;
            }
            return null;
        }
        afj afjVar3 = this.f45J;
        afj afjVar4 = afjVar3.e;
        if (afjVar4 == null || afjVar4.e != afjVar3) {
            return null;
        }
        return afjVar4.d;
    }

    public final agg o(int i) {
        if (i == 0) {
            return this.h;
        }
        if (i == 1) {
            return this.i;
        }
        return null;
    }

    public final void p(afl aflVar, afb afbVar, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            afp.a(aflVar, afbVar, this);
            hashSet.remove(this);
            b(afbVar, aflVar.W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.f45J.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((afj) it.next()).d.p(aflVar, afbVar, hashSet, 0, true);
                }
            }
            HashSet hashSet3 = this.L.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((afj) it2.next()).d.p(aflVar, afbVar, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.K.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((afj) it3.next()).d.p(aflVar, afbVar, hashSet, 1, true);
            }
        }
        HashSet hashSet5 = this.M.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((afj) it4.next()).d.p(aflVar, afbVar, hashSet, 1, true);
            }
        }
        HashSet hashSet6 = this.N.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((afj) it5.next()).d.p(aflVar, afbVar, hashSet, 1, true);
            }
        }
    }

    public final void q(afb afbVar) {
        afbVar.b(this.f45J);
        afbVar.b(this.K);
        afbVar.b(this.L);
        afbVar.b(this.M);
        if (this.aa > 0) {
            afbVar.b(this.N);
        }
    }

    public final void r() {
        if (this.h == null) {
            this.h = new agc(this);
        }
        if (this.i == null) {
            this.i = new age(this);
        }
    }

    public void s() {
        this.f45J.d();
        this.K.d();
        this.L.d();
        this.M.d();
        this.N.d();
        this.O.d();
        this.P.d();
        this.Q.d();
        this.T = null;
        this.E = 0.0f;
        this.U = 0;
        this.V = 0;
        this.W = 0.0f;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.aa = 0;
        this.ab = 0;
        this.ac = 0;
        this.ad = 0.5f;
        this.ae = 0.5f;
        int[] iArr = this.ap;
        iArr[0] = 1;
        iArr[1] = 1;
        this.af = null;
        this.ag = 0;
        this.ai = 0;
        this.aj = 0;
        float[] fArr = this.ak;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.p = -1;
        this.q = -1;
        int[] iArr2 = this.D;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.j;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.c;
        zArr2[0] = false;
        zArr2[1] = false;
        this.a = true;
        int[] iArr3 = this.u;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.k = -1;
        this.l = -1;
    }

    public final void t() {
        this.b = false;
        this.m = false;
        this.n = false;
        this.o = false;
        int size = this.S.size();
        for (int i = 0; i < size; i++) {
            afj afjVar = (afj) this.S.get(i);
            afjVar.c = false;
            afjVar.b = 0;
        }
    }

    public String toString() {
        String str;
        String str2 = this.ah;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder(str2.length() + 5);
            sb.append("id: ");
            sb.append(str2);
            sb.append(" ");
            str = sb.toString();
        } else {
            str = "";
        }
        int i = this.Y;
        int i2 = this.Z;
        int i3 = this.U;
        int i4 = this.V;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 56);
        sb2.append("");
        sb2.append(str);
        sb2.append("(");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(") - (");
        sb2.append(i3);
        sb2.append(" x ");
        sb2.append(i4);
        sb2.append(")");
        return sb2.toString();
    }

    public void u(afa afaVar) {
        this.f45J.i();
        this.K.i();
        this.L.i();
        this.M.i();
        this.N.i();
        this.Q.i();
        this.O.i();
        this.P.i();
    }

    public final void v(int i) {
        this.aa = i;
        this.F = i > 0;
    }

    public final void w(int i, int i2) {
        if (this.b) {
            return;
        }
        this.f45J.e(i);
        this.L.e(i2);
        this.Y = i;
        this.U = i2 - i;
        this.b = true;
    }

    public final void x(int i, int i2) {
        if (this.m) {
            return;
        }
        this.K.e(i);
        this.M.e(i2);
        this.Z = i;
        this.V = i2 - i;
        if (this.F) {
            this.N.e(i + this.aa);
        }
        this.m = true;
    }

    public final void y(int i) {
        this.V = i;
        int i2 = this.ac;
        if (i < i2) {
            this.V = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z(int i, boolean z) {
        this.c[i] = z;
    }
}
