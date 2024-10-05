package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azqs implements ayqd, ayqx {
    final ayqd a;
    ayqx b;
    boolean c;
    azqd d;
    volatile boolean e;

    public azqs(ayqd ayqdVar) {
        this.a = ayqdVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.e) {
            aynu.j(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.e) {
                if (this.c) {
                    this.e = true;
                    azqd azqdVar = this.d;
                    if (azqdVar == null) {
                        azqdVar = new azqd();
                        this.d = azqdVar;
                    }
                    azqdVar.c(azqm.b(th));
                    return;
                }
                this.e = true;
                this.c = true;
                z = false;
            }
            if (z) {
                aynu.j(th);
            } else {
                this.a.b(th);
            }
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        Object[] objArr;
        if (this.e) {
            return;
        }
        if (obj == null) {
            this.b.qc();
            b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (this.c) {
                azqd azqdVar = this.d;
                if (azqdVar == null) {
                    azqdVar = new azqd();
                    this.d = azqdVar;
                }
                azqm azqmVar = azqm.a;
                azqdVar.a(obj);
                return;
            }
            this.c = true;
            this.a.c(obj);
            while (true) {
                synchronized (this) {
                    azqd azqdVar2 = this.d;
                    if (azqdVar2 == null) {
                        this.c = false;
                        return;
                    }
                    this.d = null;
                    ayqd ayqdVar = this.a;
                    for (Object[] objArr2 = azqdVar2.a; objArr2 != null; objArr2 = objArr2[4]) {
                        for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                            if (azqm.f(objArr, ayqdVar)) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.b.qc();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.b, ayqxVar)) {
            this.b = ayqxVar;
            this.a.se(this);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (this.c) {
                azqd azqdVar = this.d;
                if (azqdVar == null) {
                    azqdVar = new azqd();
                    this.d = azqdVar;
                }
                azqdVar.a(azqm.a);
                return;
            }
            this.e = true;
            this.c = true;
            this.a.sh();
        }
    }
}
