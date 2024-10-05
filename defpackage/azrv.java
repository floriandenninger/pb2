package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azrv implements aypq, banx {
    final banw a;
    banx b;
    boolean c;
    azqd d;
    volatile boolean e;

    public azrv(banw banwVar) {
        this.a = banwVar;
    }

    @Override // defpackage.banw
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

    @Override // defpackage.banw
    public final void c(Object obj) {
        azqd azqdVar;
        if (this.e) {
            return;
        }
        if (obj == null) {
            this.b.sd();
            b(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            if (this.c) {
                azqd azqdVar2 = this.d;
                if (azqdVar2 == null) {
                    azqdVar2 = new azqd();
                    this.d = azqdVar2;
                }
                azqm azqmVar = azqm.a;
                azqdVar2.a(obj);
                return;
            }
            this.c = true;
            this.a.c(obj);
            do {
                synchronized (this) {
                    azqdVar = this.d;
                    if (azqdVar == null) {
                        this.c = false;
                        return;
                    }
                    this.d = null;
                }
            } while (!azqdVar.d(this.a));
        }
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        if (azqb.i(this.b, banxVar)) {
            this.b = banxVar;
            this.a.f(this);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        this.b.sd();
    }

    @Override // defpackage.banw
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

    @Override // defpackage.banx
    public final void sj(long j) {
        this.b.sj(j);
    }
}
