package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aywy extends azpq {
    final ayrs a;
    final ayrs b;
    final ayrm c;

    public aywy(banw banwVar, ayrs ayrsVar, ayrs ayrsVar2, ayrm ayrmVar) {
        super(banwVar);
        this.a = ayrsVar;
        this.b = ayrsVar2;
        this.c = ayrmVar;
    }

    @Override // defpackage.azpq, defpackage.banw
    public final void b(Throwable th) {
        if (this.g) {
            aynu.j(th);
            return;
        }
        this.g = true;
        try {
            this.b.a(th);
            this.d.b(th);
        } catch (Throwable th2) {
            aynu.c(th2);
            this.d.b(new ayrf(th, th2));
        }
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (this.g) {
            return;
        }
        if (this.h != 0) {
            this.d.c(null);
            return;
        }
        try {
            this.a.a(obj);
            this.d.c(obj);
        } catch (Throwable th) {
            h(th);
        }
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return g(i);
    }

    @Override // defpackage.aytf
    public final Object sg() {
        try {
            Object sg = this.f.sg();
            if (sg != null) {
                try {
                    this.a.a(sg);
                } catch (Throwable th) {
                    aynu.c(th);
                    try {
                        this.b.a(th);
                        throw azqi.a(th);
                    } catch (Throwable th2) {
                        throw new ayrf(th, th2);
                    }
                }
            } else if (this.h == 1) {
                this.c.a();
                return null;
            }
            return sg;
        } catch (Throwable th3) {
            aynu.c(th3);
            try {
                this.b.a(th3);
                throw azqi.a(th3);
            } catch (Throwable th4) {
                throw new ayrf(th3, th4);
            }
        }
    }

    @Override // defpackage.azpq, defpackage.banw
    public final void sh() {
        if (this.g) {
            return;
        }
        try {
            this.c.a();
            this.g = true;
            this.d.sh();
        } catch (Throwable th) {
            h(th);
        }
    }
}
