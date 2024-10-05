package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pay extends paw {
    final pbc d;
    final pbc e;

    public pay(pas pasVar, long j, long j2, int i, long j3, List list, pbc pbcVar, pbc pbcVar2) {
        super(pasVar, j, j2, i, j3, list);
        this.d = pbcVar;
        this.e = pbcVar2;
    }

    @Override // defpackage.paw
    public final int a(long j) {
        if (this.c != null) {
            return (r0.size() + this.a) - 1;
        }
        if (j == -1) {
            return -1;
        }
        return (this.a + ((int) pgz.f(j, (this.b * 1000000) / this.g))) - 1;
    }

    @Override // defpackage.paw
    public final pas c(pav pavVar, int i) {
        List list = this.c;
        long j = list != null ? ((paz) list.get(i - this.a)).a : (i - this.a) * this.b;
        pbc pbcVar = this.e;
        ozv ozvVar = pavVar.e;
        return new pas(pbcVar.a(ozvVar.a, i, ozvVar.c, j), 0L, -1L);
    }

    @Override // defpackage.pbb
    public final pas e(pav pavVar) {
        pbc pbcVar = this.d;
        if (pbcVar == null) {
            return this.f;
        }
        ozv ozvVar = pavVar.e;
        return new pas(pbcVar.a(ozvVar.a, 0, ozvVar.c, 0L), 0L, -1L);
    }
}
