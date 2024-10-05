package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckd {
    private static final clg a = clg.a("a");
    private static final clg b = clg.a("fc", "sc", "sw", "t");

    public static ciu a(clh clhVar, cfj cfjVar) {
        clhVar.j();
        ciu ciuVar = null;
        while (clhVar.p()) {
            if (clhVar.c(a) == 0) {
                clhVar.j();
                cik cikVar = null;
                cik cikVar2 = null;
                cil cilVar = null;
                cil cilVar2 = null;
                while (clhVar.p()) {
                    int c = clhVar.c(b);
                    if (c == 0) {
                        cikVar = abt.d(clhVar, cfjVar);
                    } else if (c == 1) {
                        cikVar2 = abt.d(clhVar, cfjVar);
                    } else if (c == 2) {
                        cilVar = abt.e(clhVar, cfjVar);
                    } else if (c == 3) {
                        cilVar2 = abt.e(clhVar, cfjVar);
                    } else {
                        clhVar.n();
                        clhVar.o();
                    }
                }
                clhVar.l();
                ciuVar = new ciu(cikVar, cikVar2, cilVar, cilVar2);
            } else {
                clhVar.n();
                clhVar.o();
            }
        }
        clhVar.l();
        return ciuVar == null ? new ciu(null, null, null, null) : ciuVar;
    }
}
