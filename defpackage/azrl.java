package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azrl extends azrs {
    static final azrk[] a = new azrk[0];
    static final azrk[] b = new azrk[0];
    final AtomicReference c = new AtomicReference(b);
    Throwable d;

    public static azrl e() {
        return new azrl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aN(azrk azrkVar) {
        azrk[] azrkVarArr;
        azrk[] azrkVarArr2;
        do {
            azrkVarArr = (azrk[]) this.c.get();
            if (azrkVarArr == a || azrkVarArr == b) {
                return;
            }
            int length = azrkVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azrkVarArr[i] == azrkVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azrkVarArr2 = b;
            } else {
                azrk[] azrkVarArr3 = new azrk[length - 1];
                System.arraycopy(azrkVarArr, 0, azrkVarArr3, 0, i);
                System.arraycopy(azrkVarArr, i + 1, azrkVarArr3, i, (length - i) - 1);
                azrkVarArr2 = azrkVarArr3;
            }
        } while (!this.c.compareAndSet(azrkVarArr, azrkVarArr2));
    }

    public final boolean aO() {
        return ((azrk[]) this.c.get()).length != 0;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        aysw.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        Object obj = this.c.get();
        Object obj2 = a;
        if (obj == obj2) {
            aynu.j(th);
            return;
        }
        this.d = th;
        for (azrk azrkVar : (azrk[]) this.c.getAndSet(obj2)) {
            if (azrkVar.get()) {
                aynu.j(th);
            } else {
                azrkVar.a.b(th);
            }
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        aysw.b(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (azrk azrkVar : (azrk[]) this.c.get()) {
            if (!azrkVar.get()) {
                azrkVar.a.c(obj);
            }
        }
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        azrk[] azrkVarArr;
        azrk[] azrkVarArr2;
        azrk azrkVar = new azrk(ayqdVar, this);
        ayqdVar.se(azrkVar);
        do {
            azrkVarArr = (azrk[]) this.c.get();
            if (azrkVarArr == a) {
                Throwable th = this.d;
                if (th != null) {
                    ayqdVar.b(th);
                    return;
                } else {
                    ayqdVar.sh();
                    return;
                }
            }
            int length = azrkVarArr.length;
            azrkVarArr2 = new azrk[length + 1];
            System.arraycopy(azrkVarArr, 0, azrkVarArr2, 0, length);
            azrkVarArr2[length] = azrkVar;
        } while (!this.c.compareAndSet(azrkVarArr, azrkVarArr2));
        if (azrkVar.get()) {
            aN(azrkVar);
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (this.c.get() == a) {
            ayqxVar.qc();
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        Object obj = this.c.get();
        Object obj2 = a;
        if (obj == obj2) {
            return;
        }
        for (azrk azrkVar : (azrk[]) this.c.getAndSet(obj2)) {
            if (!azrkVar.get()) {
                azrkVar.a.sh();
            }
        }
    }
}
