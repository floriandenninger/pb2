package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azgq extends ayth implements ayqd {
    private static final long serialVersionUID = 4109457741734051389L;
    final ayqd a;
    final ayrm b;
    ayqx c;
    ayta d;
    boolean e;

    public azgq(ayqd ayqdVar, ayrm ayrmVar) {
        this.a = ayqdVar;
        this.b = ayrmVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        this.a.b(th);
        f();
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.aytf
    public final void d() {
        this.d.d();
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return this.c.e();
    }

    final void f() {
        if (compareAndSet(0, 1)) {
            try {
                this.b.a();
            } catch (Throwable th) {
                aynu.c(th);
                aynu.j(th);
            }
        }
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return this.d.j();
    }

    @Override // defpackage.ayqx
    public final void qc() {
        this.c.qc();
        f();
    }

    @Override // defpackage.ayqd
    public final void se(ayqx ayqxVar) {
        if (ayrz.h(this.c, ayqxVar)) {
            this.c = ayqxVar;
            if (ayqxVar instanceof ayta) {
                this.d = (ayta) ayqxVar;
            }
            this.a.se(this);
        }
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        ayta aytaVar = this.d;
        if (aytaVar == null || (i & 4) != 0) {
            return 0;
        }
        int sf = aytaVar.sf(i);
        if (sf != 0) {
            this.e = sf == 1;
        }
        return sf;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        Object sg = this.d.sg();
        if (sg != null || !this.e) {
            return sg;
        }
        f();
        return null;
    }

    @Override // defpackage.ayqd
    public final void sh() {
        this.a.sh();
        f();
    }
}
