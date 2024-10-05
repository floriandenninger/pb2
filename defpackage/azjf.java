package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azjf extends AtomicReference implements ayqd, ayqx {
    static final azje[] a = new azje[0];
    static final azje[] b = new azje[0];
    private static final long serialVersionUID = -3251430252873581268L;
    final AtomicReference d;
    Throwable f;
    final AtomicBoolean c = new AtomicBoolean();
    final AtomicReference e = new AtomicReference();

    public azjf(AtomicReference atomicReference) {
        this.d = atomicReference;
        lazySet(a);
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.f = th;
        this.e.lazySet(ayrz.a);
        for (azje azjeVar : (azje[]) getAndSet(b)) {
            azjeVar.a.b(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        for (azje azjeVar : (azje[]) get()) {
            azjeVar.a.c(obj);
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return get() == b;
    }

    public final void f(azje azjeVar) {
        azje[] azjeVarArr;
        azje[] azjeVarArr2;
        do {
            azjeVarArr = (azje[]) get();
            int length = azjeVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azjeVarArr[i] == azjeVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            azjeVarArr2 = a;
            if (length != 1) {
                azjeVarArr2 = new azje[length - 1];
                System.arraycopy(azjeVarArr, 0, azjeVarArr2, 0, i);
                System.arraycopy(azjeVarArr, i + 1, azjeVarArr2, i, (length - i) - 1);
            }
        } while (!compareAndSet(azjeVarArr, azjeVarArr2));
    }

    @Override // defpackage.ayqx
    public final void qc() {
        getAndSet(b);
        this.d.compareAndSet(this, null);
        ayrz.c(this.e);
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        ayrz.g(this.e, ayqxVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.e.lazySet(ayrz.a);
        for (azje azjeVar : (azje[]) getAndSet(b)) {
            azjeVar.a.sh();
        }
    }
}
