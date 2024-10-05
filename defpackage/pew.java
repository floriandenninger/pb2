package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pew extends pez {
    final /* synthetic */ pfa a;
    private final pgx b = new pgx();
    private final pgw c = new pgw(new byte[4]);
    private int d;
    private int e;
    private int f;

    public pew(pfa pfaVar) {
        this.a = pfaVar;
    }

    @Override // defpackage.pez
    public final void a(pgx pgxVar, boolean z, pca pcaVar) {
        if (z) {
            pgxVar.A(pgxVar.h());
            pgxVar.t(this.c, 3);
            this.c.e(12);
            this.d = this.c.a(12);
            this.e = 0;
            this.f = pgz.t(this.c.a, 3, -1);
            this.b.w(this.d);
        }
        int min = Math.min(pgxVar.a(), this.d - this.e);
        pgxVar.u(this.b.a, this.e, min);
        int i = this.e + min;
        this.e = i;
        int i2 = this.d;
        if (i >= i2 && pgz.t(this.b.a, i2, this.f) == 0) {
            this.b.A(5);
            int i3 = (this.d - 9) / 4;
            for (int i4 = 0; i4 < i3; i4++) {
                this.b.t(this.c, 4);
                int a = this.c.a(16);
                this.c.e(3);
                if (a == 0) {
                    this.c.e(13);
                } else {
                    int a2 = this.c.a(13);
                    pfa pfaVar = this.a;
                    pfaVar.e.put(a2, new pey(pfaVar, a2));
                }
            }
        }
    }

    @Override // defpackage.pez
    public final void b() {
    }
}
