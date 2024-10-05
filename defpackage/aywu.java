package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aywu extends azpp {
    final ayrv a;
    Object b;
    boolean c;

    public aywu(aysx aysxVar, ayrv ayrvVar) {
        super(aysxVar);
        this.a = ayrvVar;
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
            return this.d.e(obj);
        }
        try {
            Object a = this.a.a(obj);
            if (this.c) {
                boolean a2 = aysw.a(this.b, a);
                this.b = a;
                if (a2) {
                    return false;
                }
            } else {
                this.c = true;
                this.b = a;
            }
            this.d.c(obj);
            return true;
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
        while (true) {
            Object sg = this.f.sg();
            if (sg == null) {
                return null;
            }
            Object a = this.a.a(sg);
            if (!this.c) {
                this.c = true;
                this.b = a;
                return sg;
            }
            boolean a2 = aysw.a(this.b, a);
            this.b = a;
            if (!a2) {
                return sg;
            }
            if (this.h != 1) {
                this.e.sj(1L);
            }
        }
    }
}
