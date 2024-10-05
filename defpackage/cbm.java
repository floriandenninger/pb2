package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cbm implements cbf {
    public final List a = new ArrayList();
    public Object b;
    public final cbx c;
    public cbl d;

    public cbm(cbx cbxVar) {
        this.c = cbxVar;
    }

    @Override // defpackage.cbf
    public final void a(Object obj) {
        this.b = obj;
        e(this.d, obj);
    }

    public abstract boolean b(cda cdaVar);

    public abstract boolean c(Object obj);

    public final void d(cbl cblVar) {
        if (this.d != cblVar) {
            this.d = cblVar;
            e(cblVar, this.b);
        }
    }

    public final void e(cbl cblVar, Object obj) {
        if (this.a.isEmpty() || cblVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            List list = this.a;
            synchronized (((cbi) cblVar).b) {
                cbh cbhVar = ((cbi) cblVar).a;
                if (cbhVar != null) {
                    cbhVar.f(list);
                }
            }
            return;
        }
        List<String> list2 = this.a;
        synchronized (((cbi) cblVar).b) {
            ArrayList arrayList = new ArrayList();
            for (String str : list2) {
                if (((cbi) cblVar).c(str)) {
                    ajbh X = ajbh.X();
                    String.format("Constraints met for %s", str);
                    X.T(new Throwable[0]);
                    arrayList.add(str);
                }
            }
            cbh cbhVar2 = ((cbi) cblVar).a;
            if (cbhVar2 != null) {
                cbhVar2.e(arrayList);
            }
        }
    }
}
