package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azqy extends azqw {
    static final azqx[] b = new azqx[0];
    static final azqx[] c = new azqx[0];
    final AtomicReference d = new AtomicReference(c);
    Throwable e;

    public static azqy ap() {
        return new azqy();
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        azqx[] azqxVarArr;
        azqx[] azqxVarArr2;
        azqx azqxVar = new azqx(banwVar, this);
        banwVar.f(azqxVar);
        do {
            azqxVarArr = (azqx[]) this.d.get();
            if (azqxVarArr == b) {
                Throwable th = this.e;
                if (th != null) {
                    banwVar.b(th);
                    return;
                } else {
                    banwVar.sh();
                    return;
                }
            }
            int length = azqxVarArr.length;
            azqxVarArr2 = new azqx[length + 1];
            System.arraycopy(azqxVarArr, 0, azqxVarArr2, 0, length);
            azqxVarArr2[length] = azqxVar;
        } while (!this.d.compareAndSet(azqxVarArr, azqxVarArr2));
        if (azqxVar.get() == Long.MIN_VALUE) {
            aq(azqxVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aq(azqx azqxVar) {
        azqx[] azqxVarArr;
        azqx[] azqxVarArr2;
        do {
            azqxVarArr = (azqx[]) this.d.get();
            if (azqxVarArr == b || azqxVarArr == c) {
                return;
            }
            int length = azqxVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azqxVarArr[i] == azqxVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azqxVarArr2 = c;
            } else {
                azqx[] azqxVarArr3 = new azqx[length - 1];
                System.arraycopy(azqxVarArr, 0, azqxVarArr3, 0, i);
                System.arraycopy(azqxVarArr, i + 1, azqxVarArr3, i, (length - i) - 1);
                azqxVarArr2 = azqxVarArr3;
            }
        } while (!this.d.compareAndSet(azqxVarArr, azqxVarArr2));
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        aysw.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.d.get();
        Object obj2 = b;
        if (obj == obj2) {
            aynu.j(th);
            return;
        }
        this.e = th;
        for (azqx azqxVar : (azqx[]) this.d.getAndSet(obj2)) {
            if (azqxVar.get() != Long.MIN_VALUE) {
                azqxVar.a.b(th);
            } else {
                aynu.j(th);
            }
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        aysw.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (azqx azqxVar : (azqx[]) this.d.get()) {
            long j = azqxVar.get();
            if (j != Long.MIN_VALUE) {
                if (j == 0) {
                    azqxVar.sd();
                    azqxVar.a.b(new ayrg("Could not emit value due to lack of requests"));
                } else {
                    azqxVar.a.c(obj);
                    ayeq.o(azqxVar, 1L);
                }
            }
        }
    }

    @Override // defpackage.banw
    public final void f(banx banxVar) {
        if (this.d.get() == b) {
            banxVar.sd();
        } else {
            banxVar.sj(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.banw
    public final void sh() {
        Object obj = this.d.get();
        Object obj2 = b;
        if (obj == obj2) {
            return;
        }
        for (azqx azqxVar : (azqx[]) this.d.getAndSet(obj2)) {
            if (azqxVar.get() != Long.MIN_VALUE) {
                azqxVar.a.sh();
            }
        }
    }
}
