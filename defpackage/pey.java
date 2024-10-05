package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pey extends pez {
    final /* synthetic */ pfa a;
    private final pgw b = new pgw(new byte[5]);
    private final pgx c = new pgx();
    private final int d;
    private int e;
    private int f;
    private int g;

    public pey(pfa pfaVar, int i) {
        this.a = pfaVar;
        this.d = i;
    }

    @Override // defpackage.pez
    public final void a(pgx pgxVar, boolean z, pca pcaVar) {
        pei pekVar;
        int i = 12;
        if (z) {
            pgxVar.A(pgxVar.h());
            pgxVar.t(this.b, 3);
            this.b.e(12);
            this.e = this.b.a(12);
            this.f = 0;
            this.g = pgz.t(this.b.a, 3, -1);
            this.c.w(this.e);
        }
        int min = Math.min(pgxVar.a(), this.e - this.f);
        pgxVar.u(this.c.a, this.f, min);
        int i2 = this.f + min;
        this.f = i2;
        int i3 = this.e;
        if (i2 >= i3 && pgz.t(this.c.a, i3, this.g) == 0) {
            this.c.A(7);
            this.c.t(this.b, 2);
            this.b.e(4);
            int a = this.b.a(12);
            this.c.A(a);
            int i4 = ((this.e - 9) - a) - 4;
            while (i4 > 0) {
                int i5 = 5;
                this.c.t(this.b, 5);
                int a2 = this.b.a(8);
                this.b.e(3);
                int a3 = this.b.a(13);
                this.b.e(4);
                int a4 = this.b.a(i);
                if (a2 == 6) {
                    pgx pgxVar2 = this.c;
                    int i6 = pgxVar2.b + a4;
                    int i7 = -1;
                    while (true) {
                        if (pgxVar2.b >= i6) {
                            break;
                        }
                        int h = pgxVar2.h();
                        int h2 = pgxVar2.h();
                        if (h != i5) {
                            if (h == 106) {
                                i7 = 129;
                            } else if (h == 122) {
                                i7 = 135;
                            } else if (h == 123) {
                                i7 = 138;
                            }
                            pgxVar2.A(h2);
                            i5 = 5;
                        } else {
                            long n = pgxVar2.n();
                            if (n == pfa.a) {
                                i7 = 129;
                            } else if (n == pfa.b) {
                                i7 = 135;
                            } else if (n == pfa.c) {
                                i7 = 36;
                            }
                        }
                    }
                    pgxVar2.z(i6);
                    a2 = i7;
                } else {
                    this.c.A(a4);
                }
                i4 -= a4 + 5;
                if (!this.a.f.get(a3)) {
                    if (a2 == 2) {
                        pekVar = new pek(pcaVar.pH(a3));
                    } else if (a2 == 3) {
                        pekVar = new peq(pcaVar.pH(a3));
                    } else if (a2 == 4) {
                        pekVar = new peq(pcaVar.pH(a3));
                    } else if (a2 == 15) {
                        pekVar = new peg(pcaVar.pH(a3), new pby());
                    } else if (a2 == 21) {
                        pfa pfaVar = this.a;
                        int i8 = pfaVar.g;
                        pfaVar.g = i8 + 1;
                        pekVar = new pep(pcaVar.pH(i8));
                    } else if (a2 == 27) {
                        pcn pH = pcaVar.pH(a3);
                        pfa pfaVar2 = this.a;
                        int i9 = pfaVar2.g;
                        pfaVar2.g = i9 + 1;
                        pekVar = new pem(pH, new pev(pcaVar.pH(i9)));
                    } else if (a2 == 36) {
                        pcn pH2 = pcaVar.pH(a3);
                        pfa pfaVar3 = this.a;
                        int i10 = pfaVar3.g;
                        pfaVar3.g = i10 + 1;
                        pekVar = new peo(pH2, new pev(pcaVar.pH(i10)));
                    } else if (a2 != 135) {
                        if (a2 != 138) {
                            if (a2 == 129) {
                                pekVar = new pee(pcaVar.pH(a3), false);
                            } else if (a2 != 130) {
                                pekVar = null;
                            }
                        }
                        pekVar = new peh(pcaVar.pH(a3));
                    } else {
                        pekVar = new pee(pcaVar.pH(a3), true);
                    }
                    if (pekVar != null) {
                        this.a.f.put(a3, true);
                        pfa pfaVar4 = this.a;
                        pfaVar4.e.put(a3, new pex(pekVar, pfaVar4.d));
                    }
                }
                i = 12;
            }
            this.a.e.remove(0);
            this.a.e.remove(this.d);
            pcaVar.pJ();
        }
    }

    @Override // defpackage.pez
    public final void b() {
    }
}
