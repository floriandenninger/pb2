package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azjb implements ayqd, ayqx {
    static final azja[] a = new azja[0];
    static final azja[] b = new azja[0];
    final AtomicReference c;
    final AtomicReference f = new AtomicReference();
    final AtomicReference d = new AtomicReference(a);
    final AtomicBoolean e = new AtomicBoolean();

    public azjb(AtomicReference atomicReference) {
        this.c = atomicReference;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.c.compareAndSet(this, null);
        azja[] azjaVarArr = (azja[]) this.d.getAndSet(b);
        if (azjaVarArr.length == 0) {
            aynu.j(th);
            return;
        }
        for (azja azjaVar : azjaVarArr) {
            azjaVar.a.b(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        for (azja azjaVar : (azja[]) this.d.get()) {
            azjaVar.a.c(obj);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.d.get() == b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(azja azjaVar) {
        azja[] azjaVarArr;
        azja[] azjaVarArr2;
        do {
            azjaVarArr = (azja[]) this.d.get();
            int length = azjaVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azjaVarArr[i].equals(azjaVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azjaVarArr2 = a;
            } else {
                azja[] azjaVarArr3 = new azja[length - 1];
                System.arraycopy(azjaVarArr, 0, azjaVarArr3, 0, i);
                System.arraycopy(azjaVarArr, i + 1, azjaVarArr3, i, (length - i) - 1);
                azjaVarArr2 = azjaVarArr3;
            }
        } while (!this.d.compareAndSet(azjaVarArr, azjaVarArr2));
    }

    @Override // defpackage.ayqx
    public final void qc() {
        AtomicReference atomicReference = this.d;
        azja[] azjaVarArr = b;
        if (((azja[]) atomicReference.getAndSet(azjaVarArr)) != azjaVarArr) {
            this.c.compareAndSet(this, null);
            ayrz.c(this.f);
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.g(this.f, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.c.compareAndSet(this, null);
        for (azja azjaVar : (azja[]) this.d.getAndSet(b)) {
            azjaVar.a.sh();
        }
    }
}
