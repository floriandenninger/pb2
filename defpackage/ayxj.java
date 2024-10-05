package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayxj extends azpq implements aysx {
    final ayrw a;

    public ayxj(banw banwVar, ayrw ayrwVar) {
        super(banwVar);
        this.a = ayrwVar;
    }

    @Override // defpackage.banw
    public final void c(Object obj) {
        if (e(obj)) {
            return;
        }
        this.e.sj(1L);
    }

    @Override // defpackage.aysx
    public final boolean e(Object obj) {
        if (this.g) {
            return false;
        }
        if (this.h != 0) {
            this.d.c(null);
            return true;
        }
        try {
            boolean a = this.a.a(obj);
            if (a) {
                this.d.c(obj);
            }
            return a;
        } catch (Throwable th) {
            h(th);
            return true;
        }
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return g(i);
    }

    @Override // defpackage.aytf
    public final Object sg() {
        aytc aytcVar = this.f;
        ayrw ayrwVar = this.a;
        while (true) {
            Object sg = aytcVar.sg();
            if (sg == null) {
                return null;
            }
            if (ayrwVar.a(sg)) {
                return sg;
            }
            if (this.h == 2) {
                aytcVar.sj(1L);
            }
        }
    }
}
