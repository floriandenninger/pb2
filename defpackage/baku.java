package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class baku extends balu {
    private final bakp b;

    public baku(bakp bakpVar, bajp bajpVar) {
        super(bajj.m, bajpVar);
        this.b = bakpVar;
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int a(long j) {
        return this.b.V(j);
    }

    @Override // defpackage.balk, defpackage.bajh
    public final int c() {
        return 53;
    }

    @Override // defpackage.balu, defpackage.bajh
    public final int d() {
        return 1;
    }

    @Override // defpackage.balu, defpackage.balk, defpackage.bajh
    public final long f(long j) {
        return super.f(j + 259200000);
    }

    @Override // defpackage.balu, defpackage.balk, defpackage.bajh
    public final long g(long j) {
        return super.g(j + 259200000) - 259200000;
    }

    @Override // defpackage.bajh
    public final bajp r() {
        return this.b.e;
    }

    @Override // defpackage.balk
    public final int u(long j) {
        return this.b.X(this.b.Y(j));
    }

    @Override // defpackage.balu
    protected final int v(long j, int i) {
        if (i > 52) {
            return u(j);
        }
        return 52;
    }
}
