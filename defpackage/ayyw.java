package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayyw extends azpp {
    final ayrv a;

    public ayyw(aysx aysxVar, ayrv ayrvVar) {
        super(aysxVar);
        this.a = ayrvVar;
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
            Object a = this.a.a(obj);
            aysw.b(a, "The mapper function returned a null value.");
            this.d.c(a);
        } catch (Throwable th) {
            h(th);
        }
    }

    @Override // defpackage.aysx
    public final boolean e(Object obj) {
        if (this.g) {
            return false;
        }
        try {
            Object a = this.a.a(obj);
            aysw.b(a, "The mapper function returned a null value.");
            return this.d.e(a);
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
        Object sg = this.f.sg();
        if (sg == null) {
            return null;
        }
        Object a = this.a.a(sg);
        aysw.b(a, "The mapper function returned a null value.");
        return a;
    }
}
