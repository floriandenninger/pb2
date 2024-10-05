package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgl implements bfe {
    private final bfe a;
    private final byte[] b;
    private final byte[] c;
    private bgn d;

    public bgl(byte[] bArr, bfe bfeVar, byte[] bArr2) {
        this.a = bfeVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.bfe
    public final void a() {
        this.d = null;
        this.a.a();
    }

    @Override // defpackage.bfe
    public final void b(ath athVar) {
        this.a.b(athVar);
        long b = ayu.b(athVar.i);
        this.d = new bgn(1, this.b, b, athVar.g + athVar.b);
    }

    @Override // defpackage.bfe
    public final void c(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int min = Math.min(i2 - i3, 4096);
            bgn bgnVar = this.d;
            int i4 = pts.a;
            bgnVar.a(bArr, i + i3, min, this.c, 0);
            this.a.c(this.c, 0, min);
            i3 += min;
        }
    }
}
