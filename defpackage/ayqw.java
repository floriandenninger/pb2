package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayqw implements ayqx, ayry {
    azqn a;
    public volatile boolean b;

    public ayqw() {
    }

    public ayqw(ayqx... ayqxVarArr) {
        this.a = new azqn(ayqxVarArr.length + 1);
        for (ayqx ayqxVar : ayqxVarArr) {
            aysw.b(ayqxVar, "A Disposable in the disposables array is null");
            this.a.b(ayqxVar);
        }
    }

    static final void h(azqn azqnVar) {
        if (azqnVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : azqnVar.d) {
            if (obj instanceof ayqx) {
                try {
                    ((ayqx) obj).qc();
                } catch (Throwable th) {
                    aynu.c(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw azqi.b((Throwable) arrayList.get(0));
            }
            throw new ayrf(arrayList);
        }
    }

    public final int a() {
        if (this.b) {
            return 0;
        }
        synchronized (this) {
            if (this.b) {
                return 0;
            }
            azqn azqnVar = this.a;
            return azqnVar != null ? azqnVar.b : 0;
        }
    }

    public final void c() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            azqn azqnVar = this.a;
            this.a = null;
            h(azqnVar);
        }
    }

    @Override // defpackage.ayry
    public final boolean d(ayqx ayqxVar) {
        aysw.b(ayqxVar, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    azqn azqnVar = this.a;
                    if (azqnVar == null) {
                        azqnVar = new azqn(16, null);
                        this.a = azqnVar;
                    }
                    azqnVar.b(ayqxVar);
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
        Object[] objArr;
        int i;
        int a;
        Object obj;
        Object obj2;
        aysw.b(ayqxVar, "disposables is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            azqn azqnVar = this.a;
            if (azqnVar != null && (obj = (objArr = azqnVar.d)[(a = azqn.a(ayqxVar.hashCode()) & (i = azqnVar.a))]) != null) {
                if (obj.equals(ayqxVar)) {
                    azqnVar.c(a, objArr, i);
                    return true;
                }
                do {
                    a = (a + 1) & i;
                    obj2 = objArr[a];
                    if (obj2 != null) {
                    }
                } while (!obj2.equals(ayqxVar));
                azqnVar.c(a, objArr, i);
                return true;
            }
            return false;
        }
    }

    public final void g(ayqx... ayqxVarArr) {
        aysw.b(ayqxVarArr, "disposables is null");
        int i = 0;
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    azqn azqnVar = this.a;
                    if (azqnVar == null) {
                        azqnVar = new azqn(ayqxVarArr.length + 1);
                        this.a = azqnVar;
                    }
                    int length = ayqxVarArr.length;
                    while (i < length) {
                        ayqx ayqxVar = ayqxVarArr[i];
                        aysw.b(ayqxVar, "A Disposable in the disposables array is null");
                        azqnVar.b(ayqxVar);
                        i++;
                    }
                    return;
                }
            }
        }
        int length2 = ayqxVarArr.length;
        while (i < length2) {
            ayqxVarArr[i].qc();
            i++;
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
            azqn azqnVar = this.a;
            this.a = null;
            h(azqnVar);
        }
    }
}
