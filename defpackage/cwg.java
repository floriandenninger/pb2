package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwg {
    private static final cvz a = new cwe(0);
    private final List b = new ArrayList();
    private final Set c = new HashSet();
    private final hy d;

    public cwg(hy hyVar) {
        this.d = hyVar;
    }

    private final cvz h(cwf cwfVar) {
        cvz c = cwfVar.b.c(this);
        did.ap(c);
        return c;
    }

    private final void i(Class cls, Class cls2, cwa cwaVar, boolean z) {
        cwf cwfVar = new cwf(cls, cls2, cwaVar);
        List list = this.b;
        list.add(z ? list.size() : 0, cwfVar);
    }

    public final synchronized cvz a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (cwf cwfVar : this.b) {
                if (this.c.contains(cwfVar)) {
                    z = true;
                } else if (cwfVar.b(cls, cls2)) {
                    this.c.add(cwfVar);
                    arrayList.add(h(cwfVar));
                    this.c.remove(cwfVar);
                }
            }
            if (arrayList.size() > 1) {
                return new cwd(arrayList, this.d);
            }
            if (arrayList.size() == 1) {
                return (cvz) arrayList.get(0);
            }
            if (!z) {
                throw new coi(cls, cls2);
            }
            return a;
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (cwf cwfVar : this.b) {
                if (!this.c.contains(cwfVar) && cwfVar.a(cls)) {
                    this.c.add(cwfVar);
                    arrayList.add(h(cwfVar));
                    this.c.remove(cwfVar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (cwf cwfVar : this.b) {
            if (!arrayList.contains(cwfVar.a) && cwfVar.a(cls)) {
                arrayList.add(cwfVar.a);
            }
        }
        return arrayList;
    }

    final synchronized List d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            cwf cwfVar = (cwf) it.next();
            if (cwfVar.b(cls, cls2)) {
                it.remove();
                arrayList.add(cwfVar.b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized List e(Class cls, Class cls2, cwa cwaVar) {
        List d;
        d = d(cls, cls2);
        f(cls, cls2, cwaVar);
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f(Class cls, Class cls2, cwa cwaVar) {
        i(cls, cls2, cwaVar, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g(Class cls, Class cls2, cwa cwaVar) {
        i(cls, cls2, cwaVar, false);
    }
}
