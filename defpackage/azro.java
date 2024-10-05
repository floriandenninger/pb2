package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azro extends azrs {
    static final azrm[] a = new azrm[0];
    static final azrm[] b = new azrm[0];
    final AtomicReference c = new AtomicReference(a);
    boolean d;
    final azrn e;

    public azro(azrn azrnVar) {
        this.e = azrnVar;
    }

    public static azro e() {
        return new azro(new azrn());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aN(azrm azrmVar) {
        azrm[] azrmVarArr;
        azrm[] azrmVarArr2;
        do {
            azrmVarArr = (azrm[]) this.c.get();
            if (azrmVarArr == b || azrmVarArr == a) {
                return;
            }
            int length = azrmVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azrmVarArr[i] == azrmVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azrmVarArr2 = a;
            } else {
                azrm[] azrmVarArr3 = new azrm[length - 1];
                System.arraycopy(azrmVarArr, 0, azrmVarArr3, 0, i);
                System.arraycopy(azrmVarArr, i + 1, azrmVarArr3, i, (length - i) - 1);
                azrmVarArr2 = azrmVarArr3;
            }
        } while (!this.c.compareAndSet(azrmVarArr, azrmVarArr2));
    }

    final azrm[] aO(Object obj) {
        return this.e.compareAndSet(null, obj) ? (azrm[]) this.c.getAndSet(b) : b;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        aysw.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d) {
            aynu.j(th);
            return;
        }
        this.d = true;
        Object b2 = azqm.b(th);
        azrn azrnVar = this.e;
        azrnVar.a(b2);
        for (azrm azrmVar : aO(b2)) {
            azrnVar.b(azrmVar);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        aysw.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d) {
            return;
        }
        azrn azrnVar = this.e;
        azrnVar.a.add(obj);
        azrnVar.c++;
        for (azrm azrmVar : (azrm[]) this.c.get()) {
            azrnVar.b(azrmVar);
        }
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        azrm azrmVar = new azrm(ayqdVar, this);
        ayqdVar.se(azrmVar);
        if (azrmVar.d) {
            return;
        }
        while (true) {
            azrm[] azrmVarArr = (azrm[]) this.c.get();
            if (azrmVarArr == b) {
                break;
            }
            int length = azrmVarArr.length;
            azrm[] azrmVarArr2 = new azrm[length + 1];
            System.arraycopy(azrmVarArr, 0, azrmVarArr2, 0, length);
            azrmVarArr2[length] = azrmVar;
            if (this.c.compareAndSet(azrmVarArr, azrmVarArr2)) {
                if (azrmVar.d) {
                    aN(azrmVar);
                    return;
                }
            }
        }
        this.e.b(azrmVar);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (this.d) {
            ayqxVar.qc();
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.d) {
            return;
        }
        this.d = true;
        azqm azqmVar = azqm.a;
        azrn azrnVar = this.e;
        azrnVar.a(azqmVar);
        for (azrm azrmVar : aO(azqmVar)) {
            azrnVar.b(azrmVar);
        }
    }
}
