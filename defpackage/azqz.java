package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azqz extends azqw {
    final azqw b;
    boolean c;
    azqd d;
    volatile boolean e;

    public azqz(azqw azqwVar) {
        this.b = azqwVar;
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        this.b.ab(banwVar);
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
                this.e = true;
                if (this.c) {
                    azqd azqdVar = this.d;
                    if (azqdVar == null) {
                        azqdVar = new azqd();
                        this.d = azqdVar;
                    }
                    azqdVar.c(azqm.b(th));
                    return;
                }
                this.c = true;
                z = false;
            }
            if (z) {
                aynu.j(th);
            } else {
                this.b.b(th);
            }
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
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
                azqm azqmVar = azqm.a;
                azqdVar.a(obj);
                return;
            }
            this.c = true;
            this.b.c(obj);
            ap();
        }
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
            this.e = true;
            if (this.c) {
                azqd azqdVar = this.d;
                if (azqdVar == null) {
                    azqdVar = new azqd();
                    this.d = azqdVar;
                }
                azqdVar.a(azqm.a);
                return;
            }
            this.c = true;
            this.b.sh();
        }
    }

    final void ap() {
        azqd azqdVar;
        while (true) {
            synchronized (this) {
                azqdVar = this.d;
                if (azqdVar == null) {
                    this.c = false;
                    return;
                }
                this.d = null;
            }
            azqdVar.d(this.b);
        }
    }

    @Override // defpackage.banw
    public final void f(banx banxVar) {
        boolean z = true;
        if (!this.e) {
            synchronized (this) {
                if (!this.e) {
                    if (this.c) {
                        azqd azqdVar = this.d;
                        if (azqdVar == null) {
                            azqdVar = new azqd();
                            this.d = azqdVar;
                        }
                        azqdVar.a(azqm.c(banxVar));
                        return;
                    }
                    this.c = true;
                    z = false;
                }
            }
        }
        if (z) {
            banxVar.sd();
        } else {
            this.b.f(banxVar);
            ap();
        }
    }
}
