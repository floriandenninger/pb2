package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aytp implements ayqd, ayqx {
    final ayqd a;
    final ayrs b;
    final ayrm c;
    ayqx d;

    public aytp(ayqd ayqdVar, ayrs ayrsVar, ayrm ayrmVar) {
        this.a = ayqdVar;
        this.b = ayrsVar;
        this.c = ayrmVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.d != ayrz.a) {
            this.d = ayrz.a;
            this.a.b(th);
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.d.e();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayqx ayqxVar = this.d;
        if (ayqxVar != ayrz.a) {
            this.d = ayrz.a;
            try {
                this.c.a();
            } catch (Throwable th) {
                aynu.c(th);
                aynu.j(th);
            }
            ayqxVar.qc();
        }
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        try {
            this.b.a(ayqxVar);
            if (ayrz.h(this.d, ayqxVar)) {
                this.d = ayqxVar;
                this.a.se(this);
            }
        } catch (Throwable th) {
            aynu.c(th);
            ayqxVar.qc();
            this.d = ayrz.a;
            aysa.h(th, this.a);
        }
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.d != ayrz.a) {
            this.d = ayrz.a;
            this.a.sh();
        }
    }
}
