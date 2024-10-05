package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ar {
    protected int A;
    protected int B;
    public int C;
    protected int D;
    protected int E;
    public int F;
    public int G;
    public float H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public Object f101J;
    public int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    public int V;
    public int W;
    boolean X;
    boolean Y;
    public float Z;
    public float aa;
    ar ab;
    ar ac;
    public int ad;
    public int ae;
    private int af;
    private int ag;
    final aq i;
    final aq j;
    final aq k;
    final aq l;
    final aq m;
    final aq n;
    final aq o;
    final aq p;
    protected final ArrayList q;
    public ar r;
    int s;
    int t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int a = -1;
    public int b = -1;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;

    public ar() {
        aq aqVar = new aq(this, 2);
        this.i = aqVar;
        aq aqVar2 = new aq(this, 3);
        this.j = aqVar2;
        aq aqVar3 = new aq(this, 4);
        this.k = aqVar3;
        aq aqVar4 = new aq(this, 5);
        this.l = aqVar4;
        aq aqVar5 = new aq(this, 6);
        this.m = aqVar5;
        aq aqVar6 = new aq(this, 8);
        this.n = aqVar6;
        aq aqVar7 = new aq(this, 9);
        this.o = aqVar7;
        this.p = new aq(this, 7);
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.K = 0;
        this.V = 0;
        this.W = 0;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.ab = null;
        this.ac = null;
        arrayList.add(aqVar);
        arrayList.add(aqVar2);
        arrayList.add(aqVar3);
        arrayList.add(aqVar4);
        arrayList.add(aqVar6);
        arrayList.add(aqVar7);
        arrayList.add(aqVar5);
    }

    private final void A(an anVar, boolean z, boolean z2, aq aqVar, aq aqVar2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        int i8;
        int i9 = i6;
        ap e = anVar.e(aqVar);
        ap e2 = anVar.e(aqVar2);
        ap e3 = anVar.e(aqVar.b);
        ap e4 = anVar.e(aqVar2.b);
        int a = aqVar.a();
        int a2 = aqVar2.a();
        int i10 = this.K;
        boolean z5 = i10 != 8;
        int i11 = i10 == 8 ? 0 : i3;
        boolean z6 = (!z5) | z2;
        if (e3 == null && e4 == null) {
            ak a3 = anVar.a();
            a3.g(e, i);
            anVar.g(a3);
            if (z3) {
                return;
            }
            if (z) {
                anVar.g(an.c(anVar, e2, e, i4, true));
                return;
            } else {
                if (z6) {
                    anVar.g(an.c(anVar, e2, e, i11, false));
                    return;
                }
                ak a4 = anVar.a();
                a4.g(e2, i2);
                anVar.g(a4);
                return;
            }
        }
        if (e3 != null && e4 == null) {
            ak a5 = anVar.a();
            a5.h(e, e3, a);
            anVar.g(a5);
            if (z) {
                anVar.g(an.c(anVar, e2, e, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                ak a6 = anVar.a();
                a6.h(e2, e, i11);
                anVar.g(a6);
                return;
            } else {
                ak a7 = anVar.a();
                a7.g(e2, i2);
                anVar.g(a7);
                return;
            }
        }
        if (e3 == null) {
            ak a8 = anVar.a();
            a8.h(e2, e4, -a2);
            anVar.g(a8);
            if (z) {
                anVar.g(an.c(anVar, e2, e, i4, true));
                return;
            }
            if (z3) {
                return;
            }
            if (z6) {
                ak a9 = anVar.a();
                a9.h(e2, e, i11);
                anVar.g(a9);
                return;
            } else {
                ak a10 = anVar.a();
                a10.g(e, i);
                anVar.g(a10);
                return;
            }
        }
        if (!z6) {
            if (z3) {
                anVar.i(e, e3, a, 3);
                anVar.j(e2, e4, -a2, 3);
                anVar.g(an.b(anVar, e, e3, a, f, e4, e2, a2, true));
                return;
            }
            if (z4) {
                return;
            }
            if (i5 != 1) {
                if (i9 != 0 || i7 != 0) {
                    if (i7 > 0) {
                        anVar.j(e2, e, i7, 3);
                    }
                    anVar.i(e, e3, a, 2);
                    anVar.j(e2, e4, -a2, 2);
                    anVar.m(e, e3, a, f, e4, e2, a2);
                    return;
                }
                ak a11 = anVar.a();
                a11.h(e, e3, a);
                anVar.g(a11);
                ak a12 = anVar.a();
                a12.h(e2, e4, -a2);
                anVar.g(a12);
                return;
            }
            if (i9 > i11) {
                i8 = i7;
            } else {
                i8 = i7;
                i9 = i11;
            }
            if (i8 > 0) {
                if (i8 >= i9) {
                    anVar.j(e2, e, i8, 3);
                }
                anVar.n(e2, e, i8, 3);
                anVar.i(e, e3, a, 2);
                anVar.j(e2, e4, -a2, 2);
                anVar.m(e, e3, a, f, e4, e2, a2);
                return;
            }
            i8 = i9;
            anVar.n(e2, e, i8, 3);
            anVar.i(e, e3, a, 2);
            anVar.j(e2, e4, -a2, 2);
            anVar.m(e, e3, a, f, e4, e2, a2);
            return;
        }
        if (z) {
            anVar.g(an.c(anVar, e2, e, i4, true));
        } else {
            ak a13 = anVar.a();
            a13.h(e2, e, i11);
            anVar.g(a13);
        }
        int i12 = aqVar.h;
        if (i12 != aqVar2.h) {
            if (i12 == 2) {
                ak a14 = anVar.a();
                a14.h(e, e3, a);
                anVar.g(a14);
                ap f2 = anVar.f();
                ak a15 = anVar.a();
                a15.j(e2, e4, f2, -a2);
                anVar.g(a15);
                return;
            }
            ap f3 = anVar.f();
            ak a16 = anVar.a();
            a16.i(e, e3, f3, a);
            anVar.g(a16);
            ak a17 = anVar.a();
            a17.h(e2, e4, -a2);
            anVar.g(a17);
            return;
        }
        if (e3 == e4) {
            anVar.g(an.b(anVar, e, e3, 0, 0.5f, e4, e2, 0, true));
            return;
        }
        if (z4) {
            return;
        }
        int i13 = aqVar.i;
        ap f4 = anVar.f();
        ak a18 = anVar.a();
        a18.i(e, e3, f4, a);
        if (i13 != 2) {
            anVar.k(a18, (int) (-a18.d.a(f4)));
        }
        anVar.g(a18);
        int i14 = aqVar2.i;
        ap f5 = anVar.f();
        ak a19 = anVar.a();
        a19.j(e2, e4, f5, -a2);
        if (i14 != 2) {
            anVar.k(a19, (int) (-a19.d.a(f5)));
        }
        anVar.g(a19);
        anVar.g(an.b(anVar, e, e3, a, f, e4, e2, a2, false));
    }

    public final int a() {
        return this.x + this.t;
    }

    public final int b() {
        return this.af + this.A;
    }

    public final int c() {
        return this.ag + this.B;
    }

    public final int d() {
        if (this.K == 8) {
            return 0;
        }
        return this.t;
    }

    public final int e() {
        int i = this.t;
        if (this.ae == 3) {
            if (this.d == 1) {
                i = Math.max(this.g, i);
            } else {
                i = this.g;
                if (i > 0) {
                    this.t = i;
                } else {
                    i = 0;
                }
            }
            int i2 = this.h;
            if (i2 > 0 && i2 < i) {
                return i2;
            }
        }
        return i;
    }

    public final int f() {
        int i = this.s;
        if (this.ad == 3) {
            if (this.c == 1) {
                i = Math.max(this.e, i);
            } else {
                i = this.e;
                if (i > 0) {
                    this.s = i;
                } else {
                    i = 0;
                }
            }
            int i2 = this.f;
            if (i2 > 0 && i2 < i) {
                return i2;
            }
        }
        return i;
    }

    public final int g() {
        return this.w + this.s;
    }

    public final int h() {
        if (this.K == 8) {
            return 0;
        }
        return this.s;
    }

    public void i() {
        this.i.b();
        this.j.b();
        this.k.b();
        this.l.b();
        this.m.b();
        this.n.b();
        this.o.b();
        this.p.b();
        this.r = null;
        this.s = 0;
        this.t = 0;
        this.u = 0.0f;
        this.v = -1;
        this.w = 0;
        this.x = 0;
        this.af = 0;
        this.ag = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0.5f;
        this.I = 0.5f;
        this.ad = 1;
        this.ae = 1;
        this.f101J = null;
        this.K = 0;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = 0.0f;
        this.aa = 0.0f;
        this.a = -1;
        this.b = -1;
    }

    public void j(al alVar) {
        this.i.e();
        this.j.e();
        this.k.e();
        this.l.e();
        this.m.e();
        this.p.e();
        this.n.e();
        this.o.e();
    }

    public final void k(int i) {
        this.t = i;
        int i2 = this.E;
        if (i < i2) {
            this.t = i2;
        }
    }

    public final void l(int i, int i2) {
        this.w = i;
        int i3 = i2 - i;
        this.s = i3;
        int i4 = this.D;
        if (i3 < i4) {
            this.s = i4;
        }
    }

    public final void m(int i) {
        if (i < 0) {
            this.E = 0;
        } else {
            this.E = i;
        }
    }

    public final void n(int i) {
        if (i < 0) {
            this.D = 0;
        } else {
            this.D = i;
        }
    }

    public void o(int i, int i2) {
        this.A = i;
        this.B = i2;
    }

    public final void p(int i, int i2) {
        this.x = i;
        int i3 = i2 - i;
        this.t = i3;
        int i4 = this.E;
        if (i3 < i4) {
            this.t = i4;
        }
    }

    public final void q(int i) {
        this.s = i;
        int i2 = this.D;
        if (i < i2) {
            this.s = i2;
        }
    }

    public void r() {
        int i = this.w;
        int i2 = this.x;
        int i3 = this.s;
        int i4 = this.t;
        this.af = i;
        this.ag = i2;
        this.y = (i3 + i) - i;
        this.z = (i4 + i2) - i2;
    }

    public final boolean s() {
        return this.C > 0;
    }

    public final boolean t() {
        return this.r == null;
    }

    public final String toString() {
        return "(" + this.w + ", " + this.x + ") - (" + this.s + " x " + this.t + ") wrap: (" + this.F + " x " + this.G + ")";
    }

    public aq u(int i) {
        switch (i - 1) {
            case 1:
                return this.i;
            case 2:
                return this.j;
            case 3:
                return this.k;
            case 4:
                return this.l;
            case 5:
                return this.m;
            case 6:
            default:
                return this.p;
            case 7:
                return this.n;
            case 8:
                return this.o;
        }
    }

    public final void v(int i, ar arVar, int i2, int i3, int i4) {
        u(i).d(arVar.u(i2), i3, i4, 2, 0, true);
    }

    public final void w(int i) {
        this.ad = i;
        if (i == 2) {
            q(this.F);
        }
    }

    public final void x(int i) {
        this.ae = i;
        if (i == 2) {
            k(this.G);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ec, code lost:
    
        if (r13 != (-1)) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(defpackage.an r42) {
        /*
            Method dump skipped, instructions count: 1207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar.y(an):void");
    }

    public void z() {
        int i;
        int i2;
        int p = an.p(this.i);
        int p2 = an.p(this.j);
        int p3 = an.p(this.k) - p;
        int p4 = an.p(this.l) - p2;
        this.w = p;
        this.x = p2;
        if (this.K == 8) {
            this.s = 0;
            this.t = 0;
            return;
        }
        if (this.ad == 1 && p3 < (i2 = this.s)) {
            p3 = i2;
        }
        if (this.ae == 1 && p4 < (i = this.t)) {
            p4 = i;
        }
        this.s = p3;
        this.t = p4;
        int i3 = this.E;
        if (p4 < i3) {
            this.t = i3;
        }
        int i4 = this.D;
        if (p3 < i4) {
            this.s = i4;
        }
    }
}
