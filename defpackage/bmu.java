package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmu implements bhz {
    private final ptq a;
    private final pth b = new pth();
    private final int c;

    public bmu(int i, ptq ptqVar) {
        this.c = i;
        this.a = ptqVar;
    }

    @Override // defpackage.bhz
    public final bhy a(bii biiVar, long j) {
        int p;
        int p2;
        long j2;
        bid bidVar = (bid) biiVar;
        long j3 = bidVar.c;
        int min = (int) Math.min(112800L, bidVar.b - j3);
        this.b.C(min);
        biiVar.j(this.b.a, 0, min);
        pth pthVar = this.b;
        int i = pthVar.c;
        long j4 = -1;
        long j5 = -1;
        long j6 = -9223372036854775807L;
        while (pthVar.a() >= 188 && (p2 = (p = jg.p(pthVar.a, pthVar.b, i)) + 188) <= i) {
            long q = jg.q(pthVar, p, this.c);
            if (q != -9223372036854775807L) {
                long b = this.a.b(q);
                if (b > j) {
                    if (j6 == -9223372036854775807L) {
                        return bhy.a(b, j3);
                    }
                    j2 = j3 + j5;
                } else if (100000 + b > j) {
                    j2 = j3 + p;
                } else {
                    j5 = p;
                    j6 = b;
                }
                return bhy.b(j2);
            }
            pthVar.G(p2);
            j4 = p2;
        }
        return j6 != -9223372036854775807L ? bhy.c(j6, j3 + j4) : bhy.a;
    }

    @Override // defpackage.bhz
    public final void b() {
        this.b.D(pts.f);
    }
}
