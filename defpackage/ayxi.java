package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayxi extends azpp {
    final ayrw a;

    public ayxi(aysx aysxVar, ayrw ayrwVar) {
        super(aysxVar);
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
            return this.d.e(null);
        }
        try {
            return this.a.a(obj) && this.d.e(obj);
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
