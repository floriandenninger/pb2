package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class blc implements bli {
    public final long a;
    public final long b;
    public final blm c;
    public long d;
    private final blh e;
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public blc(blm blmVar, long j, long j2, long j3, long j4, boolean z) {
        pse.e(j >= 0 && j2 > j);
        this.c = blmVar;
        this.a = j;
        this.b = j2;
        if (j3 == j2 - j || z) {
            this.d = j4;
            this.f = 4;
        } else {
            this.f = 0;
        }
        this.e = new blh();
    }

    @Override // defpackage.bli
    public final /* bridge */ /* synthetic */ biz b() {
        if (this.d != 0) {
            return new blb(this);
        }
        return null;
    }

    @Override // defpackage.bli
    public final void c(long j) {
        this.h = pts.m(j, 0L, this.d - 1);
        this.f = 2;
        this.i = this.a;
        this.j = this.b;
        this.k = 0L;
        this.l = this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    @Override // defpackage.bli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(defpackage.bii r25) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blc.a(bii):long");
    }
}
