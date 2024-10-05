package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bcb implements bcy {
    public final bcy a;
    private final long b;

    public bcb(bcy bcyVar, long j) {
        this.a = bcyVar;
        this.b = j;
    }

    @Override // defpackage.bcy
    public final int a(pmt pmtVar, asw aswVar, int i) {
        int a = this.a.a(pmtVar, aswVar, i);
        if (a != -4) {
            return a;
        }
        aswVar.d = Math.max(0L, aswVar.d + this.b);
        return -4;
    }

    @Override // defpackage.bcy
    public final int b(long j) {
        return this.a.b(j - this.b);
    }

    @Override // defpackage.bcy
    public final boolean d() {
        return this.a.d();
    }

    @Override // defpackage.bcy
    public final void jK() {
        this.a.jK();
    }
}
