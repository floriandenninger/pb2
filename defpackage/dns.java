package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dns extends dnk {
    private final doj a;

    public dns() {
        if (dog.a == null) {
            doe doeVar = new doe();
            dog.a = new dog(doeVar);
            doeVar.c = dog.a;
        }
        doj dojVar = new doj(dog.a);
        this.a = dojVar;
        dnr dnrVar = new dnr(this);
        if (dojVar.f == null) {
            dojVar.f = dnrVar;
            return;
        }
        throw new RuntimeException("Overriding existing listener!");
    }

    @Override // defpackage.dni
    public final void d() {
        if (e()) {
            this.a.b();
        }
    }

    @Override // defpackage.dni
    public final boolean e() {
        return this.a.d;
    }

    @Override // defpackage.dni
    public final void f(dmp dmpVar) {
        if (!j()) {
            g();
            return;
        }
        i();
        k(dmpVar);
        doj dojVar = this.a;
        doi doiVar = dojVar.b;
        for (int i = 0; i < doiVar.a.size(); i++) {
            dop dopVar = (dop) doiVar.a.get(i);
            dop dopVar2 = (dop) doiVar.b.get(i);
            String str = (String) doiVar.c.get(i);
            dop g = dopVar2.g(str);
            if (g != null) {
                doi.a(g, dopVar2, str);
            }
            if (dopVar.b == null) {
                dopVar.b = new ArrayList();
            }
            dopVar.b.add(dopVar2);
            if (dopVar2.a == null) {
                dopVar2.a = new LinkedHashMap();
            }
            dopVar2.a.put(str, dopVar);
        }
        dojVar.e = true;
        dojVar.d = true;
        dojVar.a.b(dojVar);
    }

    protected abstract void k(dmp dmpVar);

    public final void l(dop dopVar, dop dopVar2) {
        this.a.a(dopVar, dopVar2, "default_input");
    }

    public final void m(dop dopVar, dop dopVar2, String str) {
        this.a.a(dopVar, dopVar2, str);
    }
}
