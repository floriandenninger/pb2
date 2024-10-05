package defpackage;

import com.google.android.libraries.youtube.mdx.model.ScreenId;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addy extends ji implements ypd {
    public static final /* synthetic */ int h = 0;
    private static final String i = zga.a("MDX.MediaRouteManager");
    public final axpg a;
    public final axpg b;
    public bpv c;
    public adlm d;
    public adei e;
    public adgb f;
    public ykl g;
    private final ypa j;
    private final axpg k;
    private final axpg l;
    private final axpg m;
    private final axpg n;
    private final axpg o;
    private final axpg p;
    private final axpg q;
    private final axpg r;
    private final axpg s;
    private final adcq t;
    private boolean v;
    private int u = 0;
    private final adlr w = new addx(this);

    public addy(axpg axpgVar, ypa ypaVar, axpg axpgVar2, axpg axpgVar3, axpg axpgVar4, axpg axpgVar5, axpg axpgVar6, axpg axpgVar7, axpg axpgVar8, axpg axpgVar9, axpg axpgVar10, axpg axpgVar11, adcq adcqVar) {
        this.a = axpgVar;
        this.j = ypaVar;
        this.l = axpgVar2;
        this.m = axpgVar3;
        this.n = axpgVar4;
        this.b = axpgVar5;
        this.o = axpgVar6;
        this.p = axpgVar7;
        this.r = axpgVar8;
        this.k = axpgVar9;
        this.q = axpgVar10;
        this.s = axpgVar11;
        this.t = adcqVar;
    }

    private final bpv P(adgb adgbVar) {
        String q;
        for (bpv bpvVar : bpw.i()) {
            if (adeg.g(bpvVar) && (q = adgb.q(bpvVar.q)) != null) {
                Optional findFirst = Stream.CC.concat(Collection.EL.stream(((adlj) this.o.get()).b()), Collection.EL.stream(((adlj) this.o.get()).c())).filter(new opz(q, 8)).findFirst();
                if (findFirst.isPresent() && adgbVar.h().equals(((adgb) findFirst.get()).h())) {
                    return bpvVar;
                }
            }
        }
        return null;
    }

    private final adei Q(bpv bpvVar) {
        if (bpvVar.equals(bpw.g()) || !bpvVar.n((bph) this.m.get())) {
            return null;
        }
        if (((adeg) this.k.get()).e(bpvVar)) {
            return new adei(bpvVar.c, bpvVar.d, adeh.c);
        }
        if (adeg.g(bpvVar)) {
            String q = adgb.q(bpvVar.q);
            if (q == null) {
                zga.c(i, "Can not find screen from MDx route");
                return null;
            }
            Optional findFirst = Stream.CC.concat(Collection.EL.stream(((adlj) this.o.get()).b()), Collection.EL.stream(((adlj) this.o.get()).c())).filter(new opz(q, 10)).findFirst();
            if (!findFirst.isPresent() || !(findFirst.get() instanceof adfy)) {
                if (!findFirst.isPresent() || !(findFirst.get() instanceof adga)) {
                    zga.c(i, "Can not get MDx screen from the route info");
                    return null;
                }
                return new adei(bpvVar.c, bpvVar.d, adeh.a);
            }
            return new adei(bpvVar.c, bpvVar.d, new adeh(2));
        }
        if (((adeg) this.k.get()).f(bpvVar)) {
            return new adei(bpvVar.c, bpvVar.d, adeh.b);
        }
        String str = i;
        String valueOf = String.valueOf(bpvVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("Unknown type of route info: ");
        sb.append(valueOf);
        zga.c(str, sb.toString());
        return null;
    }

    private final void R() {
        if (this.v) {
            return;
        }
        ((adlt) this.l.get()).m();
        this.v = true;
    }

    private final void S(boolean z) {
        this.j.d(new adej(z));
    }

    private final void T() {
        boolean z;
        if (this.v) {
            adce adceVar = (adce) this.r.get();
            yjk.f();
            synchronized (adceVar.c) {
                z = true;
                if (adceVar.a.isEmpty() && adceVar.b.isEmpty()) {
                    z = false;
                }
            }
            if (z || this.u > 0) {
                return;
            }
            ((adlt) this.l.get()).n();
            this.v = false;
        }
    }

    public final bpv A(final ScreenId screenId) {
        final int i2 = 1;
        Optional findFirst = Collection.EL.stream(((adlj) this.o.get()).b()).filter(new Predicate() { // from class: addw
            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return i2 != 0 ? Predicate.CC.$default$and(this, predicate) : Predicate.CC.$default$and(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate negate() {
                return i2 != 0 ? Predicate.CC.$default$negate(this) : Predicate.CC.$default$negate(this);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return i2 != 0 ? Predicate.CC.$default$or(this, predicate) : Predicate.CC.$default$or(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final boolean test(Object obj) {
                if (i2 == 0) {
                    ScreenId screenId2 = screenId;
                    int i3 = addy.h;
                    return screenId2.equals(((adga) obj).b());
                }
                ScreenId screenId3 = screenId;
                int i4 = addy.h;
                return screenId3.equals(((adfy) obj).a.f());
            }
        }).findFirst();
        if (findFirst.isPresent()) {
            return P((adgb) findFirst.get());
        }
        final int i3 = 0;
        Optional findFirst2 = Collection.EL.stream(((adlj) this.o.get()).c()).filter(new Predicate() { // from class: addw
            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return i3 != 0 ? Predicate.CC.$default$and(this, predicate) : Predicate.CC.$default$and(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate negate() {
                return i3 != 0 ? Predicate.CC.$default$negate(this) : Predicate.CC.$default$negate(this);
            }

            @Override // j$.util.function.Predicate
            public final /* synthetic */ Predicate or(Predicate predicate) {
                return i3 != 0 ? Predicate.CC.$default$or(this, predicate) : Predicate.CC.$default$or(this, predicate);
            }

            @Override // j$.util.function.Predicate
            public final boolean test(Object obj) {
                if (i3 == 0) {
                    ScreenId screenId2 = screenId;
                    int i32 = addy.h;
                    return screenId2.equals(((adga) obj).b());
                }
                ScreenId screenId3 = screenId;
                int i4 = addy.h;
                return screenId3.equals(((adfy) obj).a.f());
            }
        }).findFirst();
        if (findFirst2.isPresent()) {
            return P((adgb) findFirst2.get());
        }
        return null;
    }

    public final void B(Object obj) {
        yjk.f();
        ((adce) this.r.get()).a(obj);
        T();
    }

    public final synchronized void C(bpv bpvVar) {
        bpvVar.g();
    }

    public final synchronized void D() {
        adlm adlmVar = this.d;
        boolean z = false;
        int i2 = 1;
        if (adlmVar != null && adlmVar.ae()) {
            z = true;
        }
        if (true == z) {
            i2 = 2;
        }
        bpw.o(i2);
    }

    public final synchronized void E(boolean z) {
        adei adeiVar = this.e;
        if (adeiVar != null) {
            String str = adeiVar.a;
            int a = adeiVar.a();
            str.length();
            adyu.bY(a).length();
        }
        this.j.d(new adek(this.e, z));
    }

    public final void F() {
        yjk.f();
        R();
        int i2 = this.u;
        this.u = i2 + 1;
        if (i2 == 0) {
            ((adlt) this.l.get()).i(this.w);
            I(this);
            adij adijVar = (adij) this.s.get();
            adijVar.f.g(adijVar.h.kI(adijVar.e));
            adijVar.f.g(adijVar.d.kI(adijVar.e));
            bpw bpwVar = (bpw) this.a.get();
            this.t.a();
            if (this.t.b()) {
                bqe bqeVar = new bqe();
                bqeVar.b(true);
                bpw.n(bqeVar.a());
            }
            bpwVar.p((bph) this.m.get(), this);
            addu adduVar = (addu) this.p.get();
            adyu adyuVar = adduVar.m;
            if (Math.random() < 0.5d) {
                adduVar.f.g(adduVar.j);
                adduVar.a();
            }
            adlm adlmVar = this.d;
            adei Q = Q(bpw.j());
            this.e = Q;
            if (Q != null) {
                this.c = bpw.j();
                this.d = ((adlt) this.l.get()).g();
                if (this.e.a() == 4 && this.n.get() != null) {
                    ((aifs) this.n.get()).o(new aige(5, 3));
                }
            } else {
                if (this.d != null) {
                    zga.h(i, "onStart: disconnecting previously selected mdx session");
                    this.d.D();
                }
                this.c = null;
                this.d = null;
            }
            if (adlmVar != this.d) {
                E(false);
            }
        }
    }

    public final void G() {
        yjk.f();
        int i2 = this.u - 1;
        this.u = i2;
        if (i2 == 0) {
            ((adij) this.s.get()).f.c();
            addu adduVar = (addu) this.p.get();
            adduVar.f.m(adduVar.j);
            adduVar.c.removeCallbacks(adduVar.k);
            if (this.d == null) {
                ((adce) this.r.get()).a(this);
                if (this.t.b()) {
                    ((bpw) this.a.get()).q((bph) this.m.get(), this, 0);
                } else {
                    ((bpw) this.a.get()).r(this);
                }
            }
            T();
        }
    }

    public final void H(Object obj) {
        yjk.f();
        R();
        ((adce) this.r.get()).b(obj, true);
    }

    public final void I(Object obj) {
        yjk.f();
        R();
        ((adce) this.r.get()).b(obj, false);
    }

    public final void J(adgb adgbVar, ykl yklVar) {
        yjk.f();
        if ((adgbVar instanceof adfy) || (adgbVar instanceof adga)) {
            String str = i;
            String valueOf = String.valueOf(adgbVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Selecting mdx route for ");
            sb.append(valueOf);
            zga.h(str, sb.toString());
            bpv P = P(adgbVar);
            if (P == null) {
                this.f = adgbVar;
                this.g = yklVar;
                return;
            } else {
                C(P);
                if (yklVar != null) {
                    yklVar.b(adgbVar, true);
                    return;
                }
                return;
            }
        }
        yklVar.a(adgbVar, new IllegalArgumentException("screen must be DIAL or ManualPairing"));
    }

    public final void K() {
        bpv j = bpw.j();
        if (bpw.g() == j) {
            return;
        }
        adda addaVar = (adda) this.q.get();
        String str = j.c;
        adcy a = adcz.a();
        a.b(true);
        addaVar.b(str, a.a());
        D();
    }

    public final boolean L(bpv bpvVar) {
        return ((adeg) this.k.get()).f(bpvVar) || adeg.g(bpvVar);
    }

    public final boolean M(bpv bpvVar, adle adleVar) {
        adleVar.getClass();
        amkq.E(adleVar.g());
        return N(bpvVar, adleVar);
    }

    public final boolean N(bpv bpvVar, adle adleVar) {
        yjk.f();
        if (!L(bpvVar)) {
            zga.m(i, "unable to select non youtube mdx route");
            return false;
        }
        adda addaVar = (adda) this.q.get();
        String str = bpvVar.c;
        adcw a = adcx.a();
        a.a = adleVar;
        adcx a2 = a.a();
        synchronized (addaVar.c) {
            addaVar.b = ammw.a(str, a2);
        }
        C(bpvVar);
        return true;
    }

    public final void O(bpv bpvVar) {
        bpvVar.getClass();
        N(bpvVar, null);
    }

    @Override // defpackage.ji
    public final void j(final bpv bpvVar) {
        String q;
        String.valueOf(String.valueOf(bpvVar)).length();
        if (this.f != null && adeg.g(bpvVar) && (q = adgb.q(bpvVar.q)) != null) {
            Stream.CC.concat(Collection.EL.stream(((adlj) this.o.get()).b()), Collection.EL.stream(((adlj) this.o.get()).c())).filter(new opz(q, 9)).findFirst().ifPresent(new Consumer() { // from class: addv
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    addy addyVar = addy.this;
                    bpv bpvVar2 = bpvVar;
                    if (addyVar.f.h().equals(((adgb) obj).h())) {
                        addyVar.C(bpvVar2);
                        ykl yklVar = addyVar.g;
                        if (yklVar != null) {
                            yklVar.b(addyVar.f, true);
                        }
                        addyVar.f = null;
                        addyVar.g = null;
                    }
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
        }
        if (Q(bpvVar) != null) {
            S(true);
        }
    }

    @Override // defpackage.ji
    public final void k(bpv bpvVar) {
        if (Q(bpvVar) != null) {
            S(true);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i2) {
        if (i2 == -1) {
            return new Class[]{ahcu.class};
        }
        if (i2 == 0) {
            bpw.m(((aiwg) this.b.get()).a());
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ji
    public final void l(bpv bpvVar) {
        if (Q(bpvVar) != null) {
            S(false);
        }
    }

    @Override // defpackage.ji
    public final void p(bpv bpvVar, int i2) {
        String str = i;
        String valueOf = String.valueOf(bpvVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("MediaRouter.onRouteSelected: ");
        sb.append(valueOf);
        sb.append(" reason: ");
        sb.append(i2);
        zga.h(str, sb.toString());
        adei Q = Q(bpvVar);
        this.e = Q;
        if (Q != null) {
            if (Q.a() - 1 != 3) {
                this.d = ((adlt) this.l.get()).g();
            } else if (this.n.get() != null) {
                ((aifs) this.n.get()).o(new aige(5, 3));
            }
            this.c = bpvVar;
        } else {
            this.c = null;
            this.d = null;
        }
        this.f = null;
        this.g = null;
        E(true);
    }

    @Override // defpackage.ji
    public final void r(bpv bpvVar, int i2) {
        bpv bpvVar2;
        axpg axpgVar;
        String str = i;
        String valueOf = String.valueOf(bpvVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
        sb.append("MediaRouter.onRouteUnselected: ");
        sb.append(valueOf);
        sb.append(" reason: ");
        sb.append(i2);
        zga.h(str, sb.toString());
        if (this.t.b() || (bpvVar2 = this.c) == null || !bpvVar2.equals(bpvVar)) {
            return;
        }
        if (this.e.a() - 1 == 3 && (axpgVar = this.n) != null) {
            ((aifs) axpgVar.get()).o(new aige());
        }
        this.d = null;
        this.e = null;
        this.c = null;
        E(true);
    }
}
