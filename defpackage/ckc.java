package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckc {
    private static final clg a = clg.a("k", "x", "y");

    public static cio a(clh clhVar, cfj cfjVar) {
        ArrayList arrayList = new ArrayList();
        if (clhVar.r() == 1) {
            clhVar.i();
            while (clhVar.p()) {
                arrayList.add(new chr(cfjVar, ckp.a(clhVar, cfjVar, cls.a(), cki.d, clhVar.r() == 3, false)));
            }
            clhVar.k();
            ckq.b(arrayList);
        } else {
            arrayList.add(new clt(cko.c(clhVar, cls.a())));
        }
        return new cio(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ciw b(clh clhVar, cfj cfjVar) {
        clhVar.j();
        cio cioVar = null;
        cil cilVar = null;
        cil cilVar2 = null;
        boolean z = false;
        while (clhVar.r() != 4) {
            int c = clhVar.c(a);
            if (c == 0) {
                cioVar = a(clhVar, cfjVar);
            } else if (c != 1) {
                if (c == 2) {
                    if (clhVar.r() == 6) {
                        clhVar.o();
                        z = true;
                    } else {
                        cilVar2 = abt.e(clhVar, cfjVar);
                    }
                } else {
                    clhVar.n();
                    clhVar.o();
                }
            } else if (clhVar.r() == 6) {
                clhVar.o();
                z = true;
            } else {
                cilVar = abt.e(clhVar, cfjVar);
            }
        }
        clhVar.l();
        if (z) {
            cfjVar.d("Lottie doesn't support expressions.");
        }
        return cioVar != null ? cioVar : new cis(cilVar, cilVar2);
    }
}
