package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class balb extends balm {
    private final bakp a;

    public balb(bajh bajhVar, bakp bakpVar) {
        super(bajhVar, bajj.d);
        this.a = bakpVar;
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final int a(long j) {
        int a = this.b.a(j);
        return a <= 0 ? 1 - a : a;
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.balm, defpackage.bajh
    public final int d() {
        return 1;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long e(long j, int i) {
        return this.b.e(j, i);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.balm, defpackage.balk, defpackage.bajh
    public final long h(long j, int i) {
        aynu.A(this, i, 1, c());
        if (this.a.Z(j) <= 0) {
            i = 1 - i;
        }
        return super.h(j, i);
    }
}
