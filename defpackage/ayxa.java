package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayxa implements aypq, banx {
    final banw a;
    final ayrs b;
    final ayrm c;
    banx d;

    public ayxa(banw banwVar, ayrs ayrsVar, ayrm ayrmVar) {
        this.a = banwVar;
        this.b = ayrsVar;
        this.c = ayrmVar;
    }

    @Override // defpackage.banw
    public final void b(Throwable th) {
        if (this.d != azqb.a) {
            this.a.b(th);
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.aypq, defpackage.banw
    public final void f(banx banxVar) {
        try {
            this.b.a(banxVar);
            if (azqb.i(this.d, banxVar)) {
                this.d = banxVar;
                this.a.f(this);
            }
        } catch (Throwable th) {
            aynu.c(th);
            banxVar.sd();
            this.d = azqb.a;
            azpy.f(th, this.a);
        }
    }

    @Override // defpackage.banx
    public final void sd() {
        banx banxVar = this.d;
        if (banxVar != azqb.a) {
            this.d = azqb.a;
            try {
                this.c.a();
            } catch (Throwable th) {
                aynu.c(th);
                aynu.j(th);
            }
            banxVar.sd();
        }
    }

    @Override // defpackage.banw
    public final void sh() {
        if (this.d != azqb.a) {
            this.a.sh();
        }
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        this.d.sj(j);
    }
}
