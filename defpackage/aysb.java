package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aysb implements ayqx, ayry {
    List a;
    volatile boolean b;

    @Override // defpackage.ayry
    public final boolean d(ayqx ayqxVar) {
        aysw.b(ayqxVar, "d is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List list = this.a;
                    if (list == null) {
                        list = new LinkedList();
                        this.a = list;
                    }
                    list.add(ayqxVar);
                    return true;
                }
            }
        }
        ayqxVar.qc();
        return false;
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.ayry
    public final boolean f(ayqx ayqxVar) {
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            List list = this.a;
            if (list != null && list.remove(ayqxVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.ayry
    public final void i(ayqx ayqxVar) {
        if (f(ayqxVar)) {
            ayqxVar.qc();
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            List list = this.a;
            ArrayList arrayList = null;
            this.a = null;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    ((ayqx) it.next()).qc();
                } catch (Throwable th) {
                    aynu.c(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList != null) {
                if (arrayList.size() == 1) {
                    throw azqi.b((Throwable) arrayList.get(0));
                }
                throw new ayrf(arrayList);
            }
        }
    }
}
