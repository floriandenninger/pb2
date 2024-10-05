package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bdd implements bcy {
    private final long a;
    private boolean b;
    private long c;

    public bdd(long j) {
        this.a = bde.t(j);
        e(0L);
    }

    @Override // defpackage.bcy
    public final int a(pmt pmtVar, asw aswVar, int i) {
        if (!this.b || (i & 2) != 0) {
            pmtVar.b = bde.d;
            this.b = true;
            return -5;
        }
        long j = this.a;
        long j2 = this.c;
        long j3 = j - j2;
        if (j3 == 0) {
            aswVar.addFlag(4);
            return -4;
        }
        pms pmsVar = bde.d;
        aswVar.d = ((j2 / pts.j(2, 2)) * 1000000) / 44100;
        aswVar.addFlag(1);
        int min = (int) Math.min(bde.e.length, j3);
        if ((i & 4) == 0) {
            aswVar.b(min);
            aswVar.b.put(bde.e, 0, min);
        }
        if ((i & 1) == 0) {
            this.c += min;
        }
        return -4;
    }

    @Override // defpackage.bcy
    public final int b(long j) {
        long j2 = this.c;
        e(j);
        return (int) ((this.c - j2) / bde.e.length);
    }

    @Override // defpackage.bcy
    public final boolean d() {
        return true;
    }

    public final void e(long j) {
        this.c = pts.m(bde.t(j), 0L, this.a);
    }

    @Override // defpackage.bcy
    public final void jK() {
    }
}
