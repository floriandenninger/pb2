package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cte implements csb, cqv {
    private final csa a;
    private final csc b;
    private int c;
    private int d = -1;
    private cqi e;
    private List f;
    private int g;
    private volatile cvy h;
    private File i;
    private ctf j;

    public cte(csc cscVar, csa csaVar) {
        this.b = cscVar;
        this.a = csaVar;
    }

    private final boolean c() {
        return this.g < this.f.size();
    }

    @Override // defpackage.csb
    public final void a() {
        cvy cvyVar = this.h;
        if (cvyVar != null) {
            cvyVar.c.b();
        }
    }

    @Override // defpackage.csb
    public final boolean b() {
        List list;
        List e = this.b.e();
        boolean z = false;
        if (e.isEmpty()) {
            return false;
        }
        csc cscVar = this.b;
        col colVar = cscVar.c.c;
        Class<?> cls = cscVar.d.getClass();
        Class cls2 = cscVar.g;
        Class cls3 = cscVar.j;
        dbl dblVar = colVar.b;
        ddl ddlVar = (ddl) dblVar.a.getAndSet(null);
        if (ddlVar == null) {
            ddlVar = new ddl(cls, cls2, cls3);
        } else {
            ddlVar.a(cls, cls2, cls3);
        }
        synchronized (dblVar.b) {
            list = (List) dblVar.b.get(ddlVar);
        }
        dblVar.a.set(ddlVar);
        if (list == null) {
            list = new ArrayList();
            Iterator it = colVar.a.a(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : colVar.e.e((Class) it.next(), cls2)) {
                    if (!colVar.h.o(cls4, cls3).isEmpty() && !list.contains(cls4)) {
                        list.add(cls4);
                    }
                }
            }
            dbl dblVar2 = colVar.b;
            List unmodifiableList = Collections.unmodifiableList(list);
            synchronized (dblVar2.b) {
                dblVar2.b.put(new ddl(cls, cls2, cls3), unmodifiableList);
            }
        }
        if (list.isEmpty()) {
            if (File.class.equals(this.b.j)) {
                return false;
            }
            String valueOf = String.valueOf(this.b.d.getClass());
            String valueOf2 = String.valueOf(this.b.j);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
            sb.append("Failed to find any load path from ");
            sb.append(valueOf);
            sb.append(" to ");
            sb.append(valueOf2);
            throw new IllegalStateException(sb.toString());
        }
        while (true) {
            if (this.f != null && c()) {
                this.h = null;
                while (!z && c()) {
                    List list2 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    cvz cvzVar = (cvz) list2.get(i);
                    File file = this.i;
                    csc cscVar2 = this.b;
                    this.h = cvzVar.a(file, cscVar2.e, cscVar2.f, cscVar2.h);
                    if (this.h != null && this.b.h(this.h.c.a())) {
                        this.h.c.d(this.b.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= list.size()) {
                int i3 = this.c + 1;
                this.c = i3;
                if (i3 >= e.size()) {
                    return false;
                }
                this.d = 0;
            }
            cqi cqiVar = (cqi) e.get(this.c);
            Class cls5 = (Class) list.get(this.d);
            cqr a = this.b.a(cls5);
            ctk c = this.b.c();
            csc cscVar3 = this.b;
            this.j = new ctf(c, cqiVar, cscVar3.m, cscVar3.e, cscVar3.f, a, cls5, cscVar3.h);
            File a2 = this.b.d().a(this.j);
            this.i = a2;
            if (a2 != null) {
                this.e = cqiVar;
                this.f = this.b.g(a2);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.cqv
    public final void f(Object obj) {
        this.a.e(this.e, obj, this.h.c, 4, this.j);
    }

    @Override // defpackage.cqv
    public final void g(Exception exc) {
        this.a.d(this.j, exc, this.h.c, 4);
    }
}
