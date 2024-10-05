package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pcp implements pbz, pcm {
    private static final int d = pgz.c("FLV");
    public int a;
    public int b;
    public long c;
    private pca j;
    private int l;
    private pco m;
    private pct n;
    private pcq o;
    private final pgx e = new pgx(4);
    private final pgx g = new pgx(9);
    private final pgx h = new pgx(11);
    private final pgx i = new pgx();
    private int k = 1;

    private final pgx g(pbw pbwVar) {
        if (this.b > this.i.b()) {
            pgx pgxVar = this.i;
            int b = pgxVar.b();
            pgxVar.x(new byte[Math.max(b + b, this.b)], 0);
        } else {
            this.i.z(0);
        }
        this.i.y(this.b);
        pbwVar.h(this.i.a, 0, this.b);
        return this.i;
    }

    @Override // defpackage.pbz
    public final void a(pca pcaVar) {
        this.j = pcaVar;
    }

    @Override // defpackage.pcm
    public final long b(long j) {
        return 0L;
    }

    @Override // defpackage.pcm
    public final boolean c() {
        return false;
    }

    @Override // defpackage.pbz
    public final void d() {
        this.k = 1;
        this.l = 0;
    }

    @Override // defpackage.pbz
    public final boolean e(pbw pbwVar) {
        pbwVar.g(this.e.a, 0, 3);
        this.e.z(0);
        if (this.e.i() != d) {
            return false;
        }
        pbwVar.g(this.e.a, 0, 2);
        this.e.z(0);
        if ((this.e.k() & 250) != 0) {
            return false;
        }
        pbwVar.g(this.e.a, 0, 4);
        this.e.z(0);
        int c = this.e.c();
        pbwVar.i();
        pbwVar.e(c);
        pbwVar.g(this.e.a, 0, 4);
        this.e.z(0);
        return this.e.c() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0000 A[SYNTHETIC] */
    @Override // defpackage.pbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.pbw r10, defpackage.tfq r11) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcp.f(pbw, tfq):int");
    }
}
