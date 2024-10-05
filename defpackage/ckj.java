package defpackage;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckj {
    private static final clg a = clg.a("ch", "size", "w", "style", "fFamily", "data");
    private static final clg b = clg.a("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cif a(clh clhVar, cfj cfjVar) {
        ArrayList arrayList = new ArrayList();
        clhVar.j();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        char c = 0;
        while (clhVar.p()) {
            int c2 = clhVar.c(a);
            if (c2 == 0) {
                c = clhVar.h().charAt(0);
            } else if (c2 == 1) {
                clhVar.a();
            } else if (c2 == 2) {
                d = clhVar.a();
            } else if (c2 == 3) {
                str = clhVar.h();
            } else if (c2 == 4) {
                str2 = clhVar.h();
            } else if (c2 == 5) {
                clhVar.j();
                while (clhVar.p()) {
                    if (clhVar.c(b) == 0) {
                        clhVar.i();
                        while (clhVar.p()) {
                            arrayList.add((cjk) ckg.a(clhVar, cfjVar));
                        }
                        clhVar.k();
                    } else {
                        clhVar.n();
                        clhVar.o();
                    }
                }
                clhVar.l();
            } else {
                clhVar.n();
                clhVar.o();
            }
        }
        clhVar.l();
        return new cif(arrayList, c, d, str, str2);
    }
}
