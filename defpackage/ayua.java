package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayua extends ayph implements aypi {
    static final aytz[] a = new aytz[0];
    static final aytz[] b = new aytz[0];
    final aypk c;
    final AtomicReference d = new AtomicReference(a);
    final AtomicBoolean e = new AtomicBoolean();
    Throwable f;

    public ayua(aypk aypkVar) {
        this.c = aypkVar;
    }

    @Override // defpackage.ayph
    protected final void V(aypi aypiVar) {
        aytz[] aytzVarArr;
        aytz[] aytzVarArr2;
        aytz aytzVar = new aytz(this, aypiVar);
        aypiVar.se(aytzVar);
        do {
            aytzVarArr = (aytz[]) this.d.get();
            if (aytzVarArr == b) {
                Throwable th = this.f;
                if (th != null) {
                    aypiVar.b(th);
                    return;
                } else {
                    aypiVar.sh();
                    return;
                }
            }
            int length = aytzVarArr.length;
            aytzVarArr2 = new aytz[length + 1];
            System.arraycopy(aytzVarArr, 0, aytzVarArr2, 0, length);
            aytzVarArr2[length] = aytzVar;
        } while (!this.d.compareAndSet(aytzVarArr, aytzVarArr2));
        if (aytzVar.get()) {
            W(aytzVar);
        }
        if (this.e.compareAndSet(false, true)) {
            this.c.U(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void W(aytz aytzVar) {
        aytz[] aytzVarArr;
        aytz[] aytzVarArr2;
        do {
            aytzVarArr = (aytz[]) this.d.get();
            int length = aytzVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (aytzVarArr[i] == aytzVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                aytzVarArr2 = a;
            } else {
                aytz[] aytzVarArr3 = new aytz[length - 1];
                System.arraycopy(aytzVarArr, 0, aytzVarArr3, 0, i);
                System.arraycopy(aytzVarArr, i + 1, aytzVarArr3, i, (length - i) - 1);
                aytzVarArr2 = aytzVarArr3;
            }
        } while (!this.d.compareAndSet(aytzVarArr, aytzVarArr2));
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.f = th;
        for (aytz aytzVar : (aytz[]) this.d.getAndSet(b)) {
            if (!aytzVar.get()) {
                aytzVar.a.b(th);
            }
        }
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        for (aytz aytzVar : (aytz[]) this.d.getAndSet(b)) {
            if (!aytzVar.get()) {
                aytzVar.a.sh();
            }
        }
    }
}
