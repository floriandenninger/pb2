package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azrj extends ayph implements aypi {
    static final azri[] a = new azri[0];
    public static final azri[] b = new azri[0];
    public Throwable e;
    final AtomicBoolean d = new AtomicBoolean();
    public final AtomicReference c = new AtomicReference(a);

    public static azrj W() {
        return new azrj();
    }

    @Override // defpackage.ayph
    protected final void V(aypi aypiVar) {
        azri[] azriVarArr;
        azri[] azriVarArr2;
        azri azriVar = new azri(aypiVar, this);
        aypiVar.se(azriVar);
        do {
            azriVarArr = (azri[]) this.c.get();
            if (azriVarArr == b) {
                Throwable th = this.e;
                if (th != null) {
                    aypiVar.b(th);
                    return;
                } else {
                    aypiVar.sh();
                    return;
                }
            }
            int length = azriVarArr.length;
            azriVarArr2 = new azri[length + 1];
            System.arraycopy(azriVarArr, 0, azriVarArr2, 0, length);
            azriVarArr2[length] = azriVar;
        } while (!this.c.compareAndSet(azriVarArr, azriVarArr2));
        if (azriVar.e()) {
            X(azriVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void X(azri azriVar) {
        azri[] azriVarArr;
        azri[] azriVarArr2;
        do {
            azriVarArr = (azri[]) this.c.get();
            int length = azriVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azriVarArr[i] == azriVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azriVarArr2 = a;
            } else {
                azri[] azriVarArr3 = new azri[length - 1];
                System.arraycopy(azriVarArr, 0, azriVarArr3, 0, i);
                System.arraycopy(azriVarArr, i + 1, azriVarArr3, i, (length - i) - 1);
                azriVarArr2 = azriVarArr3;
            }
        } while (!this.c.compareAndSet(azriVarArr, azriVarArr2));
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        aysw.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d.compareAndSet(false, true)) {
            this.e = th;
            for (azri azriVar : (azri[]) this.c.getAndSet(b)) {
                azriVar.a.b(th);
            }
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (this.c.get() == b) {
            ayqxVar.qc();
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        if (this.d.compareAndSet(false, true)) {
            for (azri azriVar : (azri[]) this.c.getAndSet(b)) {
                azriVar.a.sh();
            }
        }
    }
}
