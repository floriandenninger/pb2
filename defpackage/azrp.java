package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azrp extends azrs implements azqc {
    final azrs a;
    boolean b;
    azqd c;
    volatile boolean d;

    public azrp(azrs azrsVar) {
        this.a = azrsVar;
    }

    @Override // defpackage.azqc, defpackage.ayrw
    public final boolean a(Object obj) {
        return azqm.f(obj, this.a);
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.d) {
            aynu.j(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.d) {
                this.d = true;
                if (this.b) {
                    azqd azqdVar = this.c;
                    if (azqdVar == null) {
                        azqdVar = new azqd();
                        this.c = azqdVar;
                    }
                    azqdVar.c(azqm.b(th));
                    return;
                }
                this.b = true;
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
        if (this.d) {
            return;
        }
        synchronized (this) {
            if (this.d) {
                return;
            }
            if (this.b) {
                azqd azqdVar = this.c;
                if (azqdVar == null) {
                    azqdVar = new azqd();
                    this.c = azqdVar;
                }
                azqm azqmVar = azqm.a;
                azqdVar.a(obj);
                return;
            }
            this.b = true;
            this.a.c(obj);
            e();
        }
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        this.a.aE(ayqdVar);
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.d) {
            return;
        }
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            if (this.b) {
                azqd azqdVar = this.c;
                if (azqdVar == null) {
                    azqdVar = new azqd();
                    this.c = azqdVar;
                }
                azqdVar.a(azqm.a);
                return;
            }
            this.b = true;
            this.a.sh();
        }
    }

    final void e() {
        azqd azqdVar;
        while (true) {
            synchronized (this) {
                azqdVar = this.c;
                if (azqdVar == null) {
                    this.b = false;
                    return;
                }
                this.c = null;
            }
            azqdVar.b(this);
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        boolean z = true;
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    if (this.b) {
                        azqd azqdVar = this.c;
                        if (azqdVar == null) {
                            azqdVar = new azqd();
                            this.c = azqdVar;
                        }
                        azqdVar.a(azqm.a(ayqxVar));
                        return;
                    }
                    this.b = true;
                    z = false;
                }
            }
        }
        if (z) {
            ayqxVar.qc();
        } else {
            this.a.se(ayqxVar);
            e();
        }
    }
}
