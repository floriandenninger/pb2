package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azmh extends ayqj implements ayqk {
    static final azmg[] a = new azmg[0];
    static final azmg[] b = new azmg[0];
    final ayqm c;
    final AtomicInteger d = new AtomicInteger();
    final AtomicReference e = new AtomicReference(a);
    Object f;
    Throwable g;

    public azmh(ayqm ayqmVar) {
        this.c = ayqmVar;
    }

    @Override // defpackage.ayqj
    protected final void aa(ayqk ayqkVar) {
        azmg[] azmgVarArr;
        azmg[] azmgVarArr2;
        azmg azmgVar = new azmg(ayqkVar, this);
        ayqkVar.se(azmgVar);
        do {
            azmgVarArr = (azmg[]) this.e.get();
            if (azmgVarArr == b) {
                Throwable th = this.g;
                if (th != null) {
                    ayqkVar.b(th);
                    return;
                } else {
                    ayqkVar.sc(this.f);
                    return;
                }
            }
            int length = azmgVarArr.length;
            azmgVarArr2 = new azmg[length + 1];
            System.arraycopy(azmgVarArr, 0, azmgVarArr2, 0, length);
            azmgVarArr2[length] = azmgVar;
        } while (!this.e.compareAndSet(azmgVarArr, azmgVarArr2));
        if (azmgVar.get()) {
            ab(azmgVar);
        }
        if (this.d.getAndIncrement() == 0) {
            this.c.Z(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ab(azmg azmgVar) {
        azmg[] azmgVarArr;
        azmg[] azmgVarArr2;
        do {
            azmgVarArr = (azmg[]) this.e.get();
            int length = azmgVarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (azmgVarArr[i] == azmgVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                azmgVarArr2 = a;
            } else {
                azmg[] azmgVarArr3 = new azmg[length - 1];
                System.arraycopy(azmgVarArr, 0, azmgVarArr3, 0, i);
                System.arraycopy(azmgVarArr, i + 1, azmgVarArr3, i, (length - i) - 1);
                azmgVarArr2 = azmgVarArr3;
            }
        } while (!this.e.compareAndSet(azmgVarArr, azmgVarArr2));
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.g = th;
        for (azmg azmgVar : (azmg[]) this.e.getAndSet(b)) {
            if (!azmgVar.get()) {
                azmgVar.a.b(th);
            }
        }
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        this.f = obj;
        for (azmg azmgVar : (azmg[]) this.e.getAndSet(b)) {
            if (!azmgVar.get()) {
                azmgVar.a.sc(obj);
            }
        }
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
    }
}
