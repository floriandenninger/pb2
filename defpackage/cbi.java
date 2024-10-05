package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbi implements cbl {
    public final cbh a;
    public final Object b;
    private final cbm[] c;

    static {
        ajbh.S("WorkConstraintsTracker");
    }

    public cbi(Context context, cfa cfaVar, cbh cbhVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = cbhVar;
        this.c = new cbm[]{new cbj(applicationContext, cfaVar), new cbk(applicationContext, cfaVar), new cbr(applicationContext, cfaVar), new cbn(applicationContext, cfaVar), new cbq(applicationContext, cfaVar), new cbp(applicationContext, cfaVar), new cbo(applicationContext, cfaVar)};
        this.b = new Object();
    }

    public final void a(Iterable iterable) {
        synchronized (this.b) {
            cbm[] cbmVarArr = this.c;
            for (int i = 0; i < 7; i++) {
                cbmVarArr[i].d(null);
            }
            cbm[] cbmVarArr2 = this.c;
            for (int i2 = 0; i2 < 7; i2++) {
                cbm cbmVar = cbmVarArr2[i2];
                cbmVar.a.clear();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    cda cdaVar = (cda) it.next();
                    if (cbmVar.b(cdaVar)) {
                        cbmVar.a.add(cdaVar.c);
                    }
                }
                if (cbmVar.a.isEmpty()) {
                    cbmVar.c.f(cbmVar);
                } else {
                    cbx cbxVar = cbmVar.c;
                    synchronized (cbxVar.b) {
                        if (cbxVar.c.add(cbmVar)) {
                            if (cbxVar.c.size() == 1) {
                                cbxVar.d = cbxVar.b();
                                ajbh X = ajbh.X();
                                String.format("%s: initial state = %s", cbxVar.getClass().getSimpleName(), cbxVar.d);
                                X.T(new Throwable[0]);
                                cbxVar.d();
                            }
                            cbmVar.a(cbxVar.d);
                        }
                    }
                }
                cbmVar.e(cbmVar.d, cbmVar.b);
            }
            cbm[] cbmVarArr3 = this.c;
            for (int i3 = 0; i3 < 7; i3++) {
                cbmVarArr3[i3].d(this);
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            cbm[] cbmVarArr = this.c;
            for (int i = 0; i < 7; i++) {
                cbm cbmVar = cbmVarArr[i];
                if (!cbmVar.a.isEmpty()) {
                    cbmVar.a.clear();
                    cbmVar.c.f(cbmVar);
                }
            }
        }
    }

    public final boolean c(String str) {
        synchronized (this.b) {
            cbm[] cbmVarArr = this.c;
            for (int i = 0; i < 7; i++) {
                cbm cbmVar = cbmVarArr[i];
                Object obj = cbmVar.b;
                if (obj != null && cbmVar.c(obj) && cbmVar.a.contains(str)) {
                    ajbh X = ajbh.X();
                    String.format("Work %s constrained by %s", str, cbmVar.getClass().getSimpleName());
                    X.T(new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }
}
