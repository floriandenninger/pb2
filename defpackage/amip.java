package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amip {
    private final amip a;
    public final aeg b;
    public boolean c = false;

    public amip(amip amipVar, aeg aegVar) {
        if (amipVar != null) {
            amkq.E(amipVar.c);
        }
        this.a = amipVar;
        this.b = aegVar;
    }

    public static amin b() {
        return new amio(amio.a, new aeg());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amip c(Set set) {
        if (set.isEmpty()) {
            return amio.a;
        }
        if (set.size() == 1) {
            return (amip) set.iterator().next();
        }
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            amip amipVar = (amip) it.next();
            do {
                i += amipVar.b.j;
                amipVar = amipVar.a;
            } while (amipVar != null);
        }
        if (i == 0) {
            return amio.a;
        }
        aeg aegVar = new aeg(i);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            amip amipVar2 = (amip) it2.next();
            do {
                int i2 = 0;
                while (true) {
                    aeg aegVar2 = amipVar2.b;
                    if (i2 >= aegVar2.j) {
                        break;
                    }
                    amkq.J(aegVar.put((amkq) aegVar2.f(i2), amipVar2.b.i(i2)) == null, "Duplicate bindings: %s", amipVar2.b.f(i2));
                    i2++;
                }
                amipVar2 = amipVar2.a;
            } while (amipVar2 != null);
        }
        return new amio(null, aegVar).e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amip d(amip amipVar, amip amipVar2) {
        return amipVar.f() ? amipVar2 : amipVar2.f() ? amipVar : c(amsx.s(amipVar, amipVar2));
    }

    public final amip e() {
        if (this.c) {
            throw new IllegalStateException("Already frozen");
        }
        this.c = true;
        return (this.a == null || !this.b.isEmpty()) ? this : this.a;
    }

    final boolean f() {
        return this == amio.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object g(amkq amkqVar) {
        amip amipVar;
        amkq.N(this.c);
        Object obj = this.b.get(amkqVar);
        return (obj != null || (amipVar = this.a) == null) ? obj : amipVar.g(amkqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(amkq amkqVar) {
        amip amipVar;
        return this.b.containsKey(amkqVar) || ((amipVar = this.a) != null && amipVar.h(amkqVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (amip amipVar = this; amipVar != null; amipVar = amipVar.a) {
            for (int i = 0; i < amipVar.b.j; i++) {
                sb.append(this.b.i(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
