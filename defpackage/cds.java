package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cds implements Runnable {
    public final bzp d = new bzp();

    public static cds b(String str, caj cajVar, boolean z) {
        return new cdr(cajVar, str, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c(caj cajVar, String str) {
        WorkDatabase workDatabase = cajVar.d;
        cdb r = workDatabase.r();
        cdo y = workDatabase.y();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int h = r.h(str2);
            if (h != 3 && h != 4) {
                r.k(6, str2);
            }
            linkedList.addAll(y.d(str2));
        }
        bzr bzrVar = cajVar.f;
        synchronized (bzrVar.g) {
            ajbh X = ajbh.X();
            String.format("Processor cancelling %s", str);
            X.T(new Throwable[0]);
            bzrVar.f.add(str);
            can canVar = (can) bzrVar.d.remove(str);
            bzr.e(str, canVar == null ? (can) bzrVar.e.remove(str) : canVar);
            if (canVar != null) {
                bzrVar.d();
            }
        }
        Iterator it = cajVar.e.iterator();
        while (it.hasNext()) {
            ((bzs) it.next()).b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(caj cajVar) {
        bzt.b(cajVar.d, cajVar.e);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
            this.d.a(bzd.a);
        } catch (Throwable th) {
            this.d.a(new bza(th));
        }
    }
}
