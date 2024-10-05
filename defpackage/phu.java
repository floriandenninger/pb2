package defpackage;

import java.util.Comparator;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class phu implements Comparator, phk {
    private final long a;
    private final TreeSet b = new TreeSet(this);
    private long c;

    public phu(long j) {
        this.a = j;
    }

    private final void i(phg phgVar, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            try {
                phgVar.k((phl) this.b.first());
            } catch (phe unused) {
            }
        }
    }

    @Override // defpackage.phf
    public final void a(phg phgVar, phl phlVar) {
        this.b.add(phlVar);
        this.c += phlVar.c;
        i(phgVar, 0L);
    }

    @Override // defpackage.phf
    public final void b(phg phgVar, phl phlVar, phl phlVar2) {
        c(phlVar);
        a(phgVar, phlVar2);
    }

    @Override // defpackage.phf
    public final void c(phl phlVar) {
        this.b.remove(phlVar);
        this.c -= phlVar.c;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        phl phlVar = (phl) obj;
        phl phlVar2 = (phl) obj2;
        long j = phlVar.f;
        long j2 = phlVar2.f;
        if (j - j2 == 0) {
            return phlVar.compareTo(phlVar2);
        }
        return j >= j2 ? 1 : -1;
    }

    @Override // defpackage.phk
    public final long d() {
        return this.c;
    }

    @Override // defpackage.phk
    public final long e() {
        return this.a;
    }

    @Override // defpackage.phk
    public final void f() {
    }

    @Override // defpackage.phk
    public final boolean g() {
        return true;
    }

    @Override // defpackage.phk
    public final void h(phg phgVar, long j) {
        if (j != -1) {
            i(phgVar, j);
        }
    }
}
