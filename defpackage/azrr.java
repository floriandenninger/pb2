package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azrr extends ayqj implements ayqk {
    static final azrq[] a = new azrq[0];
    static final azrq[] b = new azrq[0];
    Object e;
    Throwable f;
    final AtomicBoolean d = new AtomicBoolean();
    final AtomicReference c = new AtomicReference(a);

    public static azrr ab() {
        return new azrr();
    }

    @Override // defpackage.ayqj
    protected final void aa(ayqk ayqkVar) {
        azrq[] azrqVarArr;
        azrq[] azrqVarArr2;
        azrq azrqVar = new azrq(ayqkVar, this);
        ayqkVar.se(azrqVar);
        do {
            azrqVarArr = (azrq[]) this.c.get();
            if (azrqVarArr == b) {
                Throwable th = this.f;
                if (th != null) {
                    ayqkVar.b(th);
                    return;
                } else {
                    ayqkVar.sc(this.e);
                    return;
                }
            }
            int length = azrqVarArr.length;
            azrqVarArr2 = new azrq[length + 1];
            System.arraycopy(azrqVarArr, 0, azrqVarArr2, 0, length);
            azrqVarArr2[length] = azrqVar;
        } while (!this.c.compareAndSet(azrqVarArr, azrqVarArr2));
        if (azrqVar.e()) {
            ad(azrqVar);
        }
    }

    public final Object ac() {
        if (this.c.get() == b) {
            return this.e;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ad(azrq azrqVar) {
        azrq[] azrqVarArr;
        azrq[] azrqVarArr2;
        do {
            azrqVarArr = (azrq[]) this.c.get();
            int length = azrqVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azrqVarArr[i] == azrqVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azrqVarArr2 = a;
            } else {
                azrq[] azrqVarArr3 = new azrq[length - 1];
                System.arraycopy(azrqVarArr, 0, azrqVarArr3, 0, i);
                System.arraycopy(azrqVarArr, i + 1, azrqVarArr3, i, (length - i) - 1);
                azrqVarArr2 = azrqVarArr3;
            }
        } while (!this.c.compareAndSet(azrqVarArr, azrqVarArr2));
    }

    public final boolean ae() {
        return this.c.get() == b && this.f != null;
    }

    public final boolean af() {
        return this.c.get() == b && this.e != null;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        aysw.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d.compareAndSet(false, true)) {
            this.f = th;
            for (azrq azrqVar : (azrq[]) this.c.getAndSet(b)) {
                azrqVar.a.b(th);
            }
            return;
        }
        aynu.j(th);
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        aysw.b(obj, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.d.compareAndSet(false, true)) {
            this.e = obj;
            for (azrq azrqVar : (azrq[]) this.c.getAndSet(b)) {
                azrqVar.a.sc(obj);
            }
        }
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        if (this.c.get() == b) {
            ayqxVar.qc();
        }
    }
}
