package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axh implements axg {
    private final bib a;
    private final long b;

    public axh(bib bibVar, long j) {
        this.a = bibVar;
        this.b = j;
    }

    @Override // defpackage.axg
    public final long a(long j, long j2) {
        return this.a.d[(int) j];
    }

    @Override // defpackage.axg
    public final long b(long j) {
        return this.a.e[(int) j] - this.b;
    }

    @Override // defpackage.axg
    public final axk c(long j) {
        return new axk(null, this.a.c[(int) j], r0.b[r9]);
    }

    @Override // defpackage.axg
    public final void d() {
    }

    @Override // defpackage.axg
    public final long e() {
        return this.a.a;
    }

    @Override // defpackage.axg
    public final long f(long j) {
        return this.a.d(j + this.b);
    }
}
