package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bin implements biz {
    private final bip a;
    private final long b;

    public bin(bip bipVar, long j) {
        this.a = bipVar;
        this.b = j;
    }

    private final bja d(long j, long j2) {
        return new bja((j * 1000000) / this.a.e, this.b + j2);
    }

    @Override // defpackage.biz
    public final long a() {
        return this.a.a();
    }

    @Override // defpackage.biz
    public final bix b(long j) {
        pse.d(this.a.k);
        bip bipVar = this.a;
        bio bioVar = bipVar.k;
        long[] jArr = bioVar.a;
        long[] jArr2 = bioVar.b;
        int an = pts.an(jArr, bipVar.b(j), false);
        bja d = d(an == -1 ? 0L : jArr[an], an != -1 ? jArr2[an] : 0L);
        if (d.b == j || an == jArr.length - 1) {
            return new bix(d, d);
        }
        int i = an + 1;
        return new bix(d, d(jArr[i], jArr2[i]));
    }

    @Override // defpackage.biz
    public final boolean c() {
        return true;
    }
}
