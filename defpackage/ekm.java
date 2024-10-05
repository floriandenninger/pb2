package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ekm {
    private final Set a = new HashSet();
    private ekh b;
    private ekj c;

    public final void a(eki ekiVar) {
        this.a.add(ekiVar);
    }

    public final void b(ekh ekhVar) {
        if (amkq.b(ekhVar, this.b)) {
            return;
        }
        this.b = ekhVar;
        if (ekhVar != null) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((eki) it.next()).n(this.b);
            }
        }
    }

    public final void c(ekj ekjVar) {
        if (amkq.b(ekjVar, this.c)) {
            return;
        }
        if (this.c != null) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((eki) it.next()).s();
            }
        }
        this.c = ekjVar;
        if (ekjVar != null) {
            Iterator it2 = this.a.iterator();
            while (it2.hasNext()) {
                ((eki) it2.next()).o(this.c);
            }
        }
    }
}
