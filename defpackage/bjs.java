package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bjs extends biq {
    private final long a;

    public bjs(bii biiVar, long j) {
        super(biiVar);
        pse.e(((bid) biiVar).c >= j);
        this.a = j;
    }

    @Override // defpackage.biq, defpackage.bii
    public final long c() {
        return super.c() - this.a;
    }

    @Override // defpackage.biq, defpackage.bii
    public final long d() {
        return super.d() - this.a;
    }

    @Override // defpackage.biq, defpackage.bii
    public final long e() {
        return super.e() - this.a;
    }
}
