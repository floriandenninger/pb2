package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agfe implements agtv {
    final /* synthetic */ agff a;

    public agfe(agff agffVar) {
        this.a = agffVar;
    }

    @Override // defpackage.agtv
    public final void a(agnz agnzVar) {
    }

    @Override // defpackage.agtv
    public final void b(agnz agnzVar) {
    }

    @Override // defpackage.agtv
    public final void c() {
    }

    @Override // defpackage.agtv
    public final void d(agnz agnzVar) {
        if (agtw.ai(agnzVar)) {
            this.a.i.execute(new agfd(this, agnzVar, 1));
        }
    }

    @Override // defpackage.agtv
    public final void e(agnz agnzVar) {
        if (agtw.ai(agnzVar)) {
            this.a.i.execute(new agfd(this, agnzVar, 0));
        }
    }

    @Override // defpackage.agtv
    public final void f(agnz agnzVar) {
        if (agtw.ai(agnzVar)) {
            this.a.y(agtw.t(agnzVar.f), agtw.r(agnzVar.f));
        }
    }

    @Override // defpackage.agtv
    public final void g() {
        this.a.i.execute(new Runnable() { // from class: agfc
            @Override // java.lang.Runnable
            public final void run() {
                agfe agfeVar = agfe.this;
                agff agffVar = agfeVar.a;
                if (agffVar.c.equals(agffVar.e.a())) {
                    agsz b = ((agsy) agfeVar.a.q.get()).b();
                    agff agffVar2 = agfeVar.a;
                    boolean z = false;
                    for (agnz agnzVar : agffVar2.e.b(agffVar2.c).values()) {
                        if (agnzVar.c()) {
                            String t = agtw.t(agnzVar.f);
                            for (String str : ((agil) agfeVar.a.j.get()).t(t)) {
                                agsx k = ((akgl) agfeVar.a.r.get()).k(str);
                                if (k == null) {
                                    agni n = ((agil) agfeVar.a.j.get()).n(str);
                                    if (n != null) {
                                        k = ((akgl) agfeVar.a.r.get()).l(n.a, null);
                                    } else {
                                        zga.b("[Offline] pudl transfer playlist not in database");
                                    }
                                }
                                k.e(t);
                                b.c(t);
                                z = true;
                            }
                        }
                    }
                    Iterator it = ((akgl) agfeVar.a.r.get()).a.values().iterator();
                    while (it.hasNext()) {
                        agfeVar.a.r(((agsx) it.next()).c());
                    }
                    if (z) {
                        ((aghc) agfeVar.a.o.get()).v(b.b());
                    }
                }
            }
        });
    }

    @Override // defpackage.agtv
    public final void h(agnz agnzVar) {
        if (agtw.ai(agnzVar)) {
            this.a.i.execute(new agfd(this, agnzVar, 2));
        }
    }

    @Override // defpackage.agtv
    public final void i(agnz agnzVar) {
    }

    @Override // defpackage.agtv
    public final void j(agnz agnzVar) {
    }

    @Override // defpackage.agtv
    public final void k(agnz agnzVar, atqs atqsVar, agnf agnfVar) {
        if (agtw.ai(agnzVar)) {
            this.a.i.execute(new agfd(this, agnzVar, 3));
        }
    }

    @Override // defpackage.agtv
    public final void l(agnz agnzVar) {
    }

    public final void m(agnz agnzVar) {
        for (agsx agsxVar : ((akgl) this.a.r.get()).m(agtw.t(agnzVar.f))) {
            if (agsxVar.j(agnzVar)) {
                this.a.r(agsxVar.c());
            }
        }
    }
}
