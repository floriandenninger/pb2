package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class doj {
    public final dog a;
    public final doi b = new doi();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;
    public dnr f;

    public doj(dog dogVar) {
        this.a = dogVar;
    }

    public final void a(dop dopVar, dop dopVar2, String str) {
        if (this.e) {
            throw new RuntimeException("Trying to add binding after DataFlowGraph has already been activated.");
        }
        doi doiVar = this.b;
        doiVar.a.add(dopVar);
        doiVar.b.add(dopVar2);
        doiVar.c.add(str);
        this.c.add(dopVar);
        this.c.add(dopVar2);
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            this.a.c(this);
            doi doiVar = this.b;
            for (int i = 0; i < doiVar.a.size(); i++) {
                dop dopVar = (dop) doiVar.a.get(i);
                dop dopVar2 = (dop) doiVar.b.get(i);
                String str = (String) doiVar.c.get(i);
                if (dopVar2.g(str) == dopVar) {
                    doi.a(dopVar, dopVar2, str);
                }
            }
        }
    }
}
