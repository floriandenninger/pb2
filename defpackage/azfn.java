package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azfn extends azfc implements ayqd {
    static final azfl[] b = new azfl[0];
    static final azfl[] c = new azfl[0];
    final AtomicBoolean d;
    final AtomicReference e;
    volatile long f;
    final azfm g;
    azfm h;
    int i;
    Throwable j;
    volatile boolean k;

    public azfn(aypy aypyVar) {
        super(aypyVar);
        this.d = new AtomicBoolean();
        azfm azfmVar = new azfm();
        this.g = azfmVar;
        this.h = azfmVar;
        this.e = new AtomicReference(b);
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.j = th;
        this.k = true;
        for (azfl azflVar : (azfl[]) this.e.getAndSet(c)) {
            e(azflVar);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        int i = this.i;
        if (i == 16) {
            azfm azfmVar = new azfm();
            azfmVar.a[0] = obj;
            this.i = 1;
            this.h.b = azfmVar;
            this.h = azfmVar;
        } else {
            this.h.a[i] = obj;
            this.i = i + 1;
        }
        this.f++;
        for (azfl azflVar : (azfl[]) this.e.get()) {
            e(azflVar);
        }
    }

    final void e(azfl azflVar) {
        if (azflVar.getAndIncrement() != 0) {
            return;
        }
        long j = azflVar.e;
        int i = azflVar.d;
        azfm azfmVar = azflVar.c;
        ayqd ayqdVar = azflVar.a;
        int i2 = 1;
        while (!azflVar.f) {
            boolean z = this.k;
            long j2 = this.f;
            if (z) {
                if (j2 == j) {
                    azflVar.c = null;
                    Throwable th = this.j;
                    if (th != null) {
                        ayqdVar.b(th);
                        return;
                    } else {
                        ayqdVar.sh();
                        return;
                    }
                }
            } else if (j2 == j) {
                azflVar.e = j;
                azflVar.d = i;
                azflVar.c = azfmVar;
                i2 = azflVar.addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
            if (i == 16) {
                azfmVar = azfmVar.b;
                i = 0;
            }
            ayqdVar.c(azfmVar.a[i]);
            i++;
            j++;
        }
        azflVar.c = null;
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        azfl[] azflVarArr;
        azfl[] azflVarArr2;
        azfl azflVar = new azfl(ayqdVar, this);
        ayqdVar.se(azflVar);
        do {
            azflVarArr = (azfl[]) this.e.get();
            if (azflVarArr == c) {
                break;
            }
            int length = azflVarArr.length;
            azflVarArr2 = new azfl[length + 1];
            System.arraycopy(azflVarArr, 0, azflVarArr2, 0, length);
            azflVarArr2[length] = azflVar;
        } while (!this.e.compareAndSet(azflVarArr, azflVarArr2));
        if (this.d.get() || !this.d.compareAndSet(false, true)) {
            e(azflVar);
        } else {
            this.a.aE(this);
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.k = true;
        for (azfl azflVar : (azfl[]) this.e.getAndSet(c)) {
            e(azflVar);
        }
    }
}
