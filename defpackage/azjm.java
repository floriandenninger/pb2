package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azjm extends aypy {
    final azqo a;
    azjk b;

    public azjm(azqo azqoVar) {
        this.a = azqoVar;
    }

    final void a(azjk azjkVar) {
        ayqb ayqbVar = this.a;
        if (ayqbVar instanceof ayqx) {
            ((ayqx) ayqbVar).qc();
        } else if (ayqbVar instanceof aysc) {
            ((aysc) ayqbVar).sl((ayqx) azjkVar.get());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(azjk azjkVar) {
        synchronized (this) {
            if (this.a instanceof azjd) {
                azjk azjkVar2 = this.b;
                if (azjkVar2 != null && azjkVar2 == azjkVar) {
                    this.b = null;
                    ayqx ayqxVar = azjkVar.b;
                }
                long j = azjkVar.c - 1;
                azjkVar.c = j;
                if (j == 0) {
                    a(azjkVar);
                }
            } else {
                azjk azjkVar3 = this.b;
                if (azjkVar3 != null && azjkVar3 == azjkVar) {
                    ayqx ayqxVar2 = azjkVar.b;
                    long j2 = azjkVar.c - 1;
                    azjkVar.c = j2;
                    if (j2 == 0) {
                        this.b = null;
                        a(azjkVar);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(azjk azjkVar) {
        synchronized (this) {
            if (azjkVar.c == 0 && azjkVar == this.b) {
                this.b = null;
                ayqx ayqxVar = (ayqx) azjkVar.get();
                ayrz.c(azjkVar);
                ayqb ayqbVar = this.a;
                if (!(ayqbVar instanceof ayqx)) {
                    if (ayqbVar instanceof aysc) {
                        if (ayqxVar != null) {
                            ((aysc) ayqbVar).sl(ayqxVar);
                        } else {
                            azjkVar.e = true;
                        }
                    }
                } else {
                    ((ayqx) ayqbVar).qc();
                }
            }
        }
    }

    @Override // defpackage.aypy
    protected final void f(ayqd ayqdVar) {
        azjk azjkVar;
        boolean z;
        synchronized (this) {
            azjkVar = this.b;
            if (azjkVar == null) {
                azjkVar = new azjk(this);
                this.b = azjkVar;
            }
            long j = azjkVar.c + 1;
            azjkVar.c = j;
            z = true;
            if (azjkVar.d || j != 1) {
                z = false;
            } else {
                azjkVar.d = true;
            }
        }
        this.a.aE(new azjl(ayqdVar, this, azjkVar));
        if (z) {
            this.a.a(azjkVar);
        }
    }
}
