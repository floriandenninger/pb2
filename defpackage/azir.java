package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azir extends aytg {
    final ayrv f;

    public azir(ayqd ayqdVar, ayrv ayrvVar) {
        super(ayqdVar);
        this.f = ayrvVar;
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.d) {
            return;
        }
        if (this.e != 0) {
            this.a.c(null);
            return;
        }
        try {
            Object a = this.f.a(obj);
            aysw.b(a, "The mapper function returned a null value.");
            this.a.c(a);
        } catch (Throwable th) {
            g(th);
        }
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        return f(i);
    }

    @Override // defpackage.aytf
    public final Object sg() {
        Object sg = this.c.sg();
        if (sg == null) {
            return null;
        }
        Object a = this.f.a(sg);
        aysw.b(a, "The mapper function returned a null value.");
        return a;
    }
}
