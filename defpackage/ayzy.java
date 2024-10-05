package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayzy extends aypn {
    final ayrk b;
    ayzw c;

    public ayzy(ayrk ayrkVar) {
        this.b = ayrkVar;
    }

    final void a(ayzw ayzwVar) {
        banv banvVar = this.b;
        if (banvVar instanceof ayqx) {
            ((ayqx) banvVar).qc();
        } else if (banvVar instanceof aysc) {
            ((aysc) banvVar).sl((ayqx) ayzwVar.get());
        }
    }

    @Override // defpackage.aypn
    protected final void ac(banw banwVar) {
        ayzw ayzwVar;
        boolean z;
        synchronized (this) {
            ayzwVar = this.c;
            if (ayzwVar == null) {
                ayzwVar = new ayzw(this);
                this.c = ayzwVar;
            }
            long j = ayzwVar.c + 1;
            ayzwVar.c = j;
            z = true;
            if (ayzwVar.d || j != 1) {
                z = false;
            } else {
                ayzwVar.d = true;
            }
        }
        this.b.aa(new ayzx(banwVar, this, ayzwVar));
        if (z) {
            this.b.ap(ayzwVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ayzw ayzwVar) {
        synchronized (this) {
            if (this.b instanceof ayzs) {
                ayzw ayzwVar2 = this.c;
                if (ayzwVar2 != null && ayzwVar2 == ayzwVar) {
                    this.c = null;
                    ayqx ayqxVar = ayzwVar.b;
                }
                long j = ayzwVar.c - 1;
                ayzwVar.c = j;
                if (j == 0) {
                    a(ayzwVar);
                }
            } else {
                ayzw ayzwVar3 = this.c;
                if (ayzwVar3 != null && ayzwVar3 == ayzwVar) {
                    ayqx ayqxVar2 = ayzwVar.b;
                    long j2 = ayzwVar.c - 1;
                    ayzwVar.c = j2;
                    if (j2 == 0) {
                        this.c = null;
                        a(ayzwVar);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(ayzw ayzwVar) {
        synchronized (this) {
            if (ayzwVar.c == 0 && ayzwVar == this.c) {
                this.c = null;
                ayqx ayqxVar = (ayqx) ayzwVar.get();
                ayrz.c(ayzwVar);
                banv banvVar = this.b;
                if (!(banvVar instanceof ayqx)) {
                    if (banvVar instanceof aysc) {
                        if (ayqxVar != null) {
                            ((aysc) banvVar).sl(ayqxVar);
                        } else {
                            ayzwVar.e = true;
                        }
                    }
                } else {
                    ((ayqx) banvVar).qc();
                }
            }
        }
    }
}
