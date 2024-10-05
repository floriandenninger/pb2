package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class pls {
    public final /* synthetic */ pme a;

    public final void a(final pml pmlVar) {
        final pme pmeVar = this.a;
        pmeVar.d.e(new Runnable() { // from class: ply
            @Override // java.lang.Runnable
            public final void run() {
                long j;
                boolean z;
                long j2;
                pme pmeVar2 = pme.this;
                pml pmlVar2 = pmlVar;
                int i = pmeVar2.m - pmlVar2.c;
                pmeVar2.m = i;
                boolean z2 = true;
                if (pmlVar2.d) {
                    pmeVar2.n = pmlVar2.e;
                    pmeVar2.o = true;
                }
                if (pmlVar2.f) {
                    pmeVar2.p = pmlVar2.g;
                }
                if (i == 0) {
                    pou pouVar = pmlVar2.b.a;
                    if (!pmeVar2.u.a.z() && pouVar.z()) {
                        pmeVar2.v = -1;
                        pmeVar2.w = 0L;
                    }
                    if (!pouVar.z()) {
                        List asList = Arrays.asList(((pkx) pouVar).b);
                        pse.g(asList.size() == pmeVar2.h.size());
                        for (int i2 = 0; i2 < asList.size(); i2++) {
                            ((pmd) pmeVar2.h.get(i2)).a = (pou) asList.get(i2);
                        }
                    }
                    if (pmeVar2.o) {
                        if (pmlVar2.b.s.equals(pmeVar2.u.s) && pmlVar2.b.c == pmeVar2.u.q) {
                            z2 = false;
                        }
                        if (z2) {
                            if (pouVar.z() || pmlVar2.b.s.a()) {
                                j2 = pmlVar2.b.c;
                            } else {
                                pnt pntVar = pmlVar2.b;
                                j2 = pmeVar2.H(pouVar, pntVar.s, pntVar.c);
                            }
                            j = j2;
                        } else {
                            j = -9223372036854775807L;
                        }
                        z = z2;
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                    }
                    pmeVar2.o = false;
                    pmeVar2.D(pmlVar2.b, 1, pmeVar2.p, false, z, pmeVar2.n, j, -1);
                }
            }
        });
    }
}
