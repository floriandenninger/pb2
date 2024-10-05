package defpackage;

import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class bakm extends bakn {
    private static final long serialVersionUID = -6728465968995518215L;
    private transient bajh A;
    private transient bajh B;
    private transient bajh C;
    private transient bajh D;
    private transient bajh E;
    private transient bajh F;
    private transient bajh H;
    private transient bajh I;

    /* renamed from: J, reason: collision with root package name */
    private transient bajh f144J;
    private transient bajh K;
    private transient bajh Xb;
    public final bajf a;
    public final Object b;
    public transient bajp c;
    public transient bajp d;
    public transient bajp e;
    public transient bajp f;
    public transient bajp g;
    public transient bajh h;
    public transient bajh i;
    public transient bajh j;
    public transient bajh k;
    public transient bajh l;
    public transient bajh m;
    private transient bajp n;
    private transient bajp o;
    private transient bajp p;
    private transient bajp q;
    private transient bajp r;
    private transient bajp s;
    private transient bajp t;
    private transient bajh u;
    private transient bajh v;
    private transient bajh w;
    private transient bajh x;
    private transient bajh y;
    private transient bajh z;

    /* JADX INFO: Access modifiers changed from: protected */
    public bakm(bajf bajfVar, Object obj) {
        this.a = bajfVar;
        this.b = obj;
        O();
    }

    private final void O() {
        bakl baklVar = new bakl();
        bajf bajfVar = this.a;
        if (bajfVar != null) {
            bajp F = bajfVar.F();
            if (bakl.b(F)) {
                baklVar.a = F;
            }
            bajp I = bajfVar.I();
            if (bakl.b(I)) {
                baklVar.b = I;
            }
            bajp G = bajfVar.G();
            if (bakl.b(G)) {
                baklVar.c = G;
            }
            bajp E = bajfVar.E();
            if (bakl.b(E)) {
                baklVar.d = E;
            }
            bajp D = bajfVar.D();
            if (bakl.b(D)) {
                baklVar.e = D;
            }
            bajp B = bajfVar.B();
            if (bakl.b(B)) {
                baklVar.f = B;
            }
            bajp J2 = bajfVar.J();
            if (bakl.b(J2)) {
                baklVar.g = J2;
            }
            bajp K = bajfVar.K();
            if (bakl.b(K)) {
                baklVar.h = K;
            }
            bajp H = bajfVar.H();
            if (bakl.b(H)) {
                baklVar.i = H;
            }
            bajp L = bajfVar.L();
            if (bakl.b(L)) {
                baklVar.j = L;
            }
            bajp A = bajfVar.A();
            if (bakl.b(A)) {
                baklVar.k = A;
            }
            bajp C = bajfVar.C();
            if (bakl.b(C)) {
                baklVar.l = C;
            }
            bajh n = bajfVar.n();
            if (bakl.a(n)) {
                baklVar.m = n;
            }
            bajh m = bajfVar.m();
            if (bakl.a(m)) {
                baklVar.n = m;
            }
            bajh s = bajfVar.s();
            if (bakl.a(s)) {
                baklVar.o = s;
            }
            bajh r = bajfVar.r();
            if (bakl.a(r)) {
                baklVar.p = r;
            }
            bajh p = bajfVar.p();
            if (bakl.a(p)) {
                baklVar.q = p;
            }
            bajh o = bajfVar.o();
            if (bakl.a(o)) {
                baklVar.r = o;
            }
            bajh k = bajfVar.k();
            if (bakl.a(k)) {
                baklVar.s = k;
            }
            bajh d = bajfVar.d();
            if (bakl.a(d)) {
                baklVar.t = d;
            }
            bajh l = bajfVar.l();
            if (bakl.a(l)) {
                baklVar.u = l;
            }
            bajh e = bajfVar.e();
            if (bakl.a(e)) {
                baklVar.v = e;
            }
            bajh j = bajfVar.j();
            if (bakl.a(j)) {
                baklVar.w = j;
            }
            bajh g = bajfVar.g();
            if (bakl.a(g)) {
                baklVar.x = g;
            }
            bajh f = bajfVar.f();
            if (bakl.a(f)) {
                baklVar.y = f;
            }
            bajh h = bajfVar.h();
            if (bakl.a(h)) {
                baklVar.z = h;
            }
            bajh t = bajfVar.t();
            if (bakl.a(t)) {
                baklVar.A = t;
            }
            bajh u = bajfVar.u();
            if (bakl.a(u)) {
                baklVar.B = u;
            }
            bajh v = bajfVar.v();
            if (bakl.a(v)) {
                baklVar.C = v;
            }
            bajh q = bajfVar.q();
            if (bakl.a(q)) {
                baklVar.D = q;
            }
            bajh w = bajfVar.w();
            if (bakl.a(w)) {
                baklVar.E = w;
            }
            bajh y = bajfVar.y();
            if (bakl.a(y)) {
                baklVar.F = y;
            }
            bajh x = bajfVar.x();
            if (bakl.a(x)) {
                baklVar.G = x;
            }
            bajh c = bajfVar.c();
            if (bakl.a(c)) {
                baklVar.H = c;
            }
            bajh i = bajfVar.i();
            if (bakl.a(i)) {
                baklVar.I = i;
            }
        }
        N(baklVar);
        bajp bajpVar = baklVar.a;
        if (bajpVar == null) {
            bajpVar = super.F();
        }
        this.n = bajpVar;
        bajp bajpVar2 = baklVar.b;
        if (bajpVar2 == null) {
            bajpVar2 = super.I();
        }
        this.o = bajpVar2;
        bajp bajpVar3 = baklVar.c;
        if (bajpVar3 == null) {
            bajpVar3 = super.G();
        }
        this.p = bajpVar3;
        bajp bajpVar4 = baklVar.d;
        if (bajpVar4 == null) {
            bajpVar4 = super.E();
        }
        this.q = bajpVar4;
        bajp bajpVar5 = baklVar.e;
        if (bajpVar5 == null) {
            bajpVar5 = super.D();
        }
        this.r = bajpVar5;
        bajp bajpVar6 = baklVar.f;
        if (bajpVar6 == null) {
            bajpVar6 = super.B();
        }
        this.c = bajpVar6;
        bajp bajpVar7 = baklVar.g;
        if (bajpVar7 == null) {
            bajpVar7 = super.J();
        }
        this.d = bajpVar7;
        bajp bajpVar8 = baklVar.h;
        if (bajpVar8 == null) {
            bajpVar8 = super.K();
        }
        this.e = bajpVar8;
        bajp bajpVar9 = baklVar.i;
        if (bajpVar9 == null) {
            bajpVar9 = super.H();
        }
        this.f = bajpVar9;
        bajp bajpVar10 = baklVar.j;
        if (bajpVar10 == null) {
            bajpVar10 = super.L();
        }
        this.g = bajpVar10;
        bajp bajpVar11 = baklVar.k;
        if (bajpVar11 == null) {
            bajpVar11 = super.A();
        }
        this.s = bajpVar11;
        bajp bajpVar12 = baklVar.l;
        if (bajpVar12 == null) {
            bajpVar12 = super.C();
        }
        this.t = bajpVar12;
        bajh bajhVar = baklVar.m;
        if (bajhVar == null) {
            bajhVar = super.n();
        }
        this.u = bajhVar;
        bajh bajhVar2 = baklVar.n;
        if (bajhVar2 == null) {
            bajhVar2 = super.m();
        }
        this.h = bajhVar2;
        bajh bajhVar3 = baklVar.o;
        if (bajhVar3 == null) {
            bajhVar3 = super.s();
        }
        this.v = bajhVar3;
        bajh bajhVar4 = baklVar.p;
        if (bajhVar4 == null) {
            bajhVar4 = super.r();
        }
        this.w = bajhVar4;
        bajh bajhVar5 = baklVar.q;
        if (bajhVar5 == null) {
            bajhVar5 = super.p();
        }
        this.x = bajhVar5;
        bajh bajhVar6 = baklVar.r;
        if (bajhVar6 == null) {
            bajhVar6 = super.o();
        }
        this.y = bajhVar6;
        bajh bajhVar7 = baklVar.s;
        if (bajhVar7 == null) {
            bajhVar7 = super.k();
        }
        this.z = bajhVar7;
        bajh bajhVar8 = baklVar.t;
        if (bajhVar8 == null) {
            bajhVar8 = super.d();
        }
        this.A = bajhVar8;
        bajh bajhVar9 = baklVar.u;
        if (bajhVar9 == null) {
            bajhVar9 = super.l();
        }
        this.B = bajhVar9;
        bajh bajhVar10 = baklVar.v;
        if (bajhVar10 == null) {
            bajhVar10 = super.e();
        }
        this.C = bajhVar10;
        bajh bajhVar11 = baklVar.w;
        if (bajhVar11 == null) {
            bajhVar11 = super.j();
        }
        this.D = bajhVar11;
        bajh bajhVar12 = baklVar.x;
        if (bajhVar12 == null) {
            bajhVar12 = super.g();
        }
        this.i = bajhVar12;
        bajh bajhVar13 = baklVar.y;
        if (bajhVar13 == null) {
            bajhVar13 = super.f();
        }
        this.j = bajhVar13;
        bajh bajhVar14 = baklVar.z;
        if (bajhVar14 == null) {
            bajhVar14 = super.h();
        }
        this.E = bajhVar14;
        bajh bajhVar15 = baklVar.A;
        if (bajhVar15 == null) {
            bajhVar15 = super.t();
        }
        this.k = bajhVar15;
        bajh bajhVar16 = baklVar.B;
        if (bajhVar16 == null) {
            bajhVar16 = super.u();
        }
        this.F = bajhVar16;
        bajh bajhVar17 = baklVar.C;
        if (bajhVar17 == null) {
            bajhVar17 = super.v();
        }
        this.Xb = bajhVar17;
        bajh bajhVar18 = baklVar.D;
        if (bajhVar18 == null) {
            bajhVar18 = super.q();
        }
        this.l = bajhVar18;
        bajh bajhVar19 = baklVar.E;
        if (bajhVar19 == null) {
            bajhVar19 = super.w();
        }
        this.m = bajhVar19;
        bajh bajhVar20 = baklVar.F;
        if (bajhVar20 == null) {
            bajhVar20 = super.y();
        }
        this.H = bajhVar20;
        bajh bajhVar21 = baklVar.G;
        if (bajhVar21 == null) {
            bajhVar21 = super.x();
        }
        this.I = bajhVar21;
        bajh bajhVar22 = baklVar.H;
        if (bajhVar22 == null) {
            bajhVar22 = super.c();
        }
        this.f144J = bajhVar22;
        bajh bajhVar23 = baklVar.I;
        if (bajhVar23 == null) {
            bajhVar23 = super.i();
        }
        this.K = bajhVar23;
        bajf bajfVar2 = this.a;
        if (bajfVar2 == null) {
            return;
        }
        if (this.z == bajfVar2.k() && this.x == this.a.p() && this.v == this.a.s()) {
            this.a.n();
        }
        this.a.m();
        if (this.m == this.a.w() && this.l == this.a.q()) {
            this.a.f();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        O();
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajp A() {
        return this.s;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajp B() {
        return this.c;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajp C() {
        return this.t;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajp D() {
        return this.r;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajp E() {
        return this.q;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajp F() {
        return this.n;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajp G() {
        return this.p;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajp H() {
        return this.f;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajp I() {
        return this.o;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajp J() {
        return this.d;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajp K() {
        return this.e;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajp L() {
        return this.g;
    }

    protected abstract void N(bakl baklVar);

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh c() {
        return this.f144J;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh d() {
        return this.A;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh e() {
        return this.C;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh f() {
        return this.j;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh g() {
        return this.i;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh h() {
        return this.E;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh i() {
        return this.K;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh j() {
        return this.D;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh k() {
        return this.z;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh l() {
        return this.B;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh m() {
        return this.h;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh n() {
        return this.u;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh o() {
        return this.y;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh p() {
        return this.x;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh q() {
        return this.l;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh r() {
        return this.w;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh s() {
        return this.v;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh t() {
        return this.k;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh u() {
        return this.F;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh v() {
        return this.Xb;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh w() {
        return this.m;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh x() {
        return this.I;
    }

    @Override // defpackage.bakn, defpackage.bajf
    public final bajh y() {
        return this.H;
    }

    @Override // defpackage.bajf
    public bajn z() {
        bajf bajfVar = this.a;
        if (bajfVar != null) {
            return bajfVar.z();
        }
        return null;
    }
}
