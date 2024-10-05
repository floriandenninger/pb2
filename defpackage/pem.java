package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pem extends pei {
    private boolean a;
    private final pev c;
    private final boolean[] d;
    private final pel e;
    private final per f;
    private final per g;
    private final per h;
    private long i;
    private long j;
    private final pgx k;

    public pem(pcn pcnVar, pev pevVar) {
        super(pcnVar);
        this.c = pevVar;
        this.d = new boolean[3];
        this.e = new pel(pcnVar);
        this.f = new per(7);
        this.g = new per(8);
        this.h = new per(6);
        this.k = new pgx();
    }

    private static pgw e(per perVar) {
        pgw pgwVar = new pgw(perVar.b, pgv.b(perVar.b, perVar.c));
        pgwVar.e(32);
        return pgwVar;
    }

    private final void f(byte[] bArr, int i, int i2) {
        if (!this.a) {
            this.f.a(bArr, i, i2);
            this.g.a(bArr, i, i2);
        }
        this.h.a(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014d  */
    @Override // defpackage.pei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.pgx r26) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pem.a(pgx):void");
    }

    @Override // defpackage.pei
    public final void b() {
    }

    @Override // defpackage.pei
    public final void c(long j, boolean z) {
        this.j = j;
    }

    @Override // defpackage.pei
    public final void d() {
        pgv.d(this.d);
        this.f.b();
        this.g.b();
        this.h.b();
        this.e.b();
        this.i = 0L;
    }
}
