package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pdu {
    public long d;
    public final pdx a = new pdx();
    public final pgx b = new pgx(282);
    private final pdw e = new pdw();
    public int c = -1;

    public final boolean a(pbw pbwVar, pgx pgxVar) {
        opn.k(true);
        boolean z = false;
        while (!z) {
            int i = this.c;
            if (i < 0) {
                if (!pdy.c(pbwVar, this.a, this.b, true)) {
                    return false;
                }
                pdx pdxVar = this.a;
                int i2 = pdxVar.d;
                if ((pdxVar.a & 1) == 1 && pgxVar.c == 0) {
                    pdy.a(pdxVar, 0, this.e);
                    pdw pdwVar = this.e;
                    int i3 = pdwVar.b;
                    i2 += pdwVar.a;
                    i = i3;
                } else {
                    i = 0;
                }
                pbwVar.j(i2);
                this.c = i;
            }
            pdy.a(this.a, i, this.e);
            int i4 = this.c;
            pdw pdwVar2 = this.e;
            int i5 = i4 + pdwVar2.b;
            int i6 = pdwVar2.a;
            if (i6 > 0) {
                pbwVar.h(pgxVar.a, pgxVar.c, i6);
                pgxVar.y(pgxVar.c + this.e.a);
                z = this.a.f[i5 + (-1)] != 255;
            }
            if (i5 == this.a.c) {
                i5 = -1;
            }
            this.c = i5;
        }
        return true;
    }
}
