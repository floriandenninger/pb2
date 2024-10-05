package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avj {
    public final pos a;
    public ash c;
    public ash d;
    public ash e;
    public amru b = amru.q();
    private amrz f = amvo.b;

    public avj(pos posVar) {
        this.a = posVar;
    }

    public static ash b(poa poaVar, amru amruVar, ash ashVar, pos posVar) {
        int d;
        pou s = poaVar.s();
        pom pomVar = (pom) poaVar;
        pomVar.Q();
        pme pmeVar = pomVar.c;
        if (pmeVar.u.a.z()) {
            d = 0;
        } else {
            pnt pntVar = pmeVar.u;
            d = pntVar.a.d(pntVar.s.a);
        }
        Object i = s.z() ? null : s.i(d);
        int b = (poaVar.G() || s.z()) ? -1 : s.x(d, posVar).b(plh.c(poaVar.p()) - posVar.e);
        for (int i2 = 0; i2 < amruVar.size(); i2++) {
            ash ashVar2 = (ash) amruVar.get(i2);
            if (e(ashVar2, i, poaVar.G(), poaVar.S(), poaVar.j(), b)) {
                return ashVar2;
            }
        }
        if (amruVar.isEmpty() && ashVar != null) {
            if (e(ashVar, i, poaVar.G(), poaVar.S(), poaVar.j(), b)) {
                return ashVar;
            }
        }
        return null;
    }

    private final void d(amrw amrwVar, ash ashVar, pou pouVar) {
        if (ashVar == null) {
            return;
        }
        if (pouVar.d(ashVar.a) != -1) {
            amrwVar.g(ashVar, pouVar);
            return;
        }
        pou pouVar2 = (pou) this.f.get(ashVar);
        if (pouVar2 != null) {
            amrwVar.g(ashVar, pouVar2);
        }
    }

    private static boolean e(ash ashVar, Object obj, boolean z, int i, int i2, int i3) {
        if (!ashVar.a.equals(obj)) {
            return false;
        }
        if (z) {
            if (ashVar.b != i || ashVar.c != i2) {
                return false;
            }
        } else if (ashVar.b != -1 || ashVar.e != i3) {
            return false;
        }
        return true;
    }

    public final void a(pou pouVar) {
        amrw h = amrz.h();
        if (!this.b.isEmpty()) {
            for (int i = 0; i < this.b.size(); i++) {
                d(h, (ash) this.b.get(i), pouVar);
            }
            if (!this.b.contains(this.c)) {
                d(h, this.c, pouVar);
            }
        } else {
            d(h, this.d, pouVar);
            if (!amkq.b(this.e, this.d)) {
                d(h, this.e, pouVar);
            }
            if (!amkq.b(this.c, this.d) && !amkq.b(this.c, this.e)) {
                d(h, this.c, pouVar);
            }
        }
        this.f = h.c();
    }

    public final pou c(ash ashVar) {
        return (pou) this.f.get(ashVar);
    }
}
