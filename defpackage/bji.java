package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bji implements bhz {
    private final bip a;
    private final int b;
    private final tfq c = new tfq(null, null, null);

    public bji(bip bipVar, int i) {
        this.a = bipVar;
        this.b = i;
    }

    private final long c(bii biiVar) {
        bid bidVar;
        while (true) {
            bidVar = (bid) biiVar;
            if (biiVar.d() >= bidVar.b - 6) {
                break;
            }
            bip bipVar = this.a;
            int i = this.b;
            tfq tfqVar = this.c;
            long d = biiVar.d();
            byte[] bArr = new byte[2];
            biiVar.j(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                biiVar.l();
                biiVar.f((int) (d - bidVar.c));
            } else {
                pth pthVar = new pth(16);
                System.arraycopy(bArr, 0, pthVar.a, 0, 2);
                pthVar.F(bfa.b(biiVar, pthVar.a, 2, 14));
                biiVar.l();
                biiVar.f((int) (d - bidVar.c));
                if (bfn.d(pthVar, bipVar, i, tfqVar)) {
                    break;
                }
            }
            biiVar.f(1);
        }
        long d2 = biiVar.d();
        long j = bidVar.b;
        if (d2 < (-6) + j) {
            return this.c.a;
        }
        biiVar.f((int) (j - biiVar.d()));
        return this.a.j;
    }

    @Override // defpackage.bhz
    public final bhy a(bii biiVar, long j) {
        long j2 = ((bid) biiVar).c;
        long c = c(biiVar);
        long d = biiVar.d();
        biiVar.f(Math.max(6, this.a.c));
        long c2 = c(biiVar);
        return (c > j || c2 <= j) ? c2 <= j ? bhy.c(c2, biiVar.d()) : bhy.a(c, j2) : bhy.b(d);
    }

    @Override // defpackage.bhz
    public final /* synthetic */ void b() {
    }
}
