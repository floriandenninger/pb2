package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csc {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public cod c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public cqn h;
    public Map i;
    public Class j;
    public boolean k;
    public boolean l;
    public cqi m;
    public cof n;
    public csk o;
    public boolean p;
    public boolean q;
    public csp r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cqr a(Class cls) {
        cqr cqrVar = (cqr) this.i.get(cls);
        if (cqrVar == null) {
            Iterator it = this.i.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    cqrVar = (cqr) entry.getValue();
                    break;
                }
            }
        }
        if (cqrVar != null) {
            return cqrVar;
        }
        if (!this.i.isEmpty() || !this.p) {
            return cxc.b;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 115);
        sb.append("Missing transformation for ");
        sb.append(valueOf);
        sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ctb b(Class cls) {
        ctb ctbVar;
        col colVar = this.c.c;
        Class cls2 = this.g;
        Class cls3 = this.j;
        dbk dbkVar = colVar.c;
        ddl ddlVar = (ddl) dbkVar.c.getAndSet(null);
        if (ddlVar == null) {
            ddlVar = new ddl();
        }
        ddlVar.a(cls, cls2, cls3);
        synchronized (dbkVar.b) {
            ctbVar = (ctb) dbkVar.b.get(ddlVar);
        }
        dbkVar.c.set(ddlVar);
        dbk dbkVar2 = colVar.c;
        if (dbk.a.equals(ctbVar)) {
            return null;
        }
        if (ctbVar != null) {
            return ctbVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : colVar.e.e(cls, cls2)) {
            for (Class cls5 : colVar.h.o(cls4, cls3)) {
                arrayList.add(new csg(cls, cls4, cls5, colVar.e.d(cls, cls4), colVar.h.n(cls4, cls5), colVar.d));
            }
        }
        ctb ctbVar2 = arrayList.isEmpty() ? null : new ctb(cls, cls2, cls3, arrayList, colVar.d);
        dbk dbkVar3 = colVar.c;
        synchronized (dbkVar3.b) {
            dbkVar3.b.put(new ddl(cls, cls2, cls3), ctbVar2 != null ? ctbVar2 : dbk.a);
        }
        return ctbVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ctk c() {
        return this.c.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cuc d() {
        return this.r.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List e() {
        if (!this.l) {
            this.l = true;
            this.b.clear();
            List f = f();
            int size = f.size();
            for (int i = 0; i < size; i++) {
                cvy cvyVar = (cvy) f.get(i);
                if (!this.b.contains(cvyVar.a)) {
                    this.b.add(cvyVar.a);
                }
                for (int i2 = 0; i2 < cvyVar.b.size(); i2++) {
                    if (!this.b.contains(cvyVar.b.get(i2))) {
                        this.b.add((cqi) cvyVar.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List f() {
        if (!this.k) {
            this.k = true;
            this.a.clear();
            List c = this.c.c.c(this.d);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                cvy a = ((cvz) c.get(i)).a(this.d, this.e, this.f, this.h);
                if (a != null) {
                    this.a.add(a);
                }
            }
        }
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List g(File file) {
        return this.c.c.c(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(Class cls) {
        return b(cls) != null;
    }
}
