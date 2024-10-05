package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azca extends ayps implements aypt {
    static final azbz[] a = new azbz[0];
    static final azbz[] b = new azbz[0];
    final AtomicReference c;
    final AtomicReference d = new AtomicReference(a);
    Object e;
    Throwable f;

    public azca(aypv aypvVar) {
        this.c = new AtomicReference(aypvVar);
    }

    @Override // defpackage.ayps
    protected final void Z(aypt ayptVar) {
        azbz[] azbzVarArr;
        azbz[] azbzVarArr2;
        azbz azbzVar = new azbz(ayptVar, this);
        ayptVar.se(azbzVar);
        do {
            azbzVarArr = (azbz[]) this.d.get();
            if (azbzVarArr != b) {
                int length = azbzVarArr.length;
                azbzVarArr2 = new azbz[length + 1];
                System.arraycopy(azbzVarArr, 0, azbzVarArr2, 0, length);
                azbzVarArr2[length] = azbzVar;
            } else {
                if (azbzVar.e()) {
                    return;
                }
                Throwable th = this.f;
                if (th != null) {
                    ayptVar.b(th);
                    return;
                }
                Object obj = this.e;
                if (obj != null) {
                    ayptVar.sc(obj);
                    return;
                } else {
                    ayptVar.sh();
                    return;
                }
            }
        } while (!this.d.compareAndSet(azbzVarArr, azbzVarArr2));
        if (azbzVar.e()) {
            aa(azbzVar);
            return;
        }
        aypv aypvVar = (aypv) this.c.getAndSet(null);
        if (aypvVar != null) {
            aypvVar.Y(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aa(azbz azbzVar) {
        azbz[] azbzVarArr;
        azbz[] azbzVarArr2;
        do {
            azbzVarArr = (azbz[]) this.d.get();
            int length = azbzVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azbzVarArr[i] == azbzVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azbzVarArr2 = a;
            } else {
                azbz[] azbzVarArr3 = new azbz[length - 1];
                System.arraycopy(azbzVarArr, 0, azbzVarArr3, 0, i);
                System.arraycopy(azbzVarArr, i + 1, azbzVarArr3, i, (length - i) - 1);
                azbzVarArr2 = azbzVarArr3;
            }
        } while (!this.d.compareAndSet(azbzVarArr, azbzVarArr2));
    }

    @Override // defpackage.aypt
    public final void b(Throwable th) {
        this.f = th;
        for (azbz azbzVar : (azbz[]) this.d.getAndSet(b)) {
            if (!azbzVar.e()) {
                azbzVar.a.b(th);
            }
        }
    }

    @Override // defpackage.aypt
    public final void sc(Object obj) {
        this.e = obj;
        for (azbz azbzVar : (azbz[]) this.d.getAndSet(b)) {
            if (!azbzVar.e()) {
                azbzVar.a.sc(obj);
            }
        }
    }

    @Override // defpackage.aypt
    public final void se(ayqx ayqxVar) {
    }

    @Override // defpackage.aypt
    public final void sh() {
        for (azbz azbzVar : (azbz[]) this.d.getAndSet(b)) {
            if (!azbzVar.e()) {
                azbzVar.a.sh();
            }
        }
    }
}
