package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azjs extends AtomicReference implements ayqd, ayqx {
    static final azjp[] a = new azjp[0];
    static final azjp[] b = new azjp[0];
    private static final long serialVersionUID = -533785617179540163L;
    final azjr c;
    boolean d;
    final AtomicReference e = new AtomicReference(a);
    final AtomicBoolean f = new AtomicBoolean();

    public azjs(azjr azjrVar) {
        this.c = azjrVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (!this.d) {
            this.d = true;
            this.c.c(th);
            h();
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        this.c.d(obj);
        g();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.e.get() == b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(azjp azjpVar) {
        azjp[] azjpVarArr;
        azjp[] azjpVarArr2;
        do {
            azjpVarArr = (azjp[]) this.e.get();
            int length = azjpVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azjpVarArr[i].equals(azjpVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azjpVarArr2 = a;
            } else {
                azjp[] azjpVarArr3 = new azjp[length - 1];
                System.arraycopy(azjpVarArr, 0, azjpVarArr3, 0, i);
                System.arraycopy(azjpVarArr, i + 1, azjpVarArr3, i, (length - i) - 1);
                azjpVarArr2 = azjpVarArr3;
            }
        } while (!this.e.compareAndSet(azjpVarArr, azjpVarArr2));
    }

    final void g() {
        for (azjp azjpVar : (azjp[]) this.e.get()) {
            this.c.e(azjpVar);
        }
    }

    final void h() {
        for (azjp azjpVar : (azjp[]) this.e.getAndSet(b)) {
            this.c.e(azjpVar);
        }
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.e.set(b);
        ayrz.c(this);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.g(this, ayqxVar)) {
            g();
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c.b();
        h();
    }
}
