package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pdd {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final pgx f;
    private final pgx g;
    private int h;
    private int i;

    public pdd(pgx pgxVar, pgx pgxVar2, boolean z) {
        this.g = pgxVar;
        this.f = pgxVar2;
        this.e = z;
        pgxVar2.z(12);
        this.a = pgxVar2.j();
        pgxVar.z(12);
        this.i = pgxVar.j();
        opn.l(pgxVar.c() == 1, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        this.d = this.e ? this.f.o() : this.f.n();
        if (this.b == this.h) {
            this.c = this.g.j();
            this.g.A(4);
            int i2 = this.i - 1;
            this.i = i2;
            this.h = i2 > 0 ? (-1) + this.g.j() : -1;
        }
        return true;
    }
}
