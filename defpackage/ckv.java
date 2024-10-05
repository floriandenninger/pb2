package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckv {
    private static final clg a = clg.a("nm", "p", "s", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cjg a(clh clhVar, cfj cfjVar) {
        String str = null;
        ciw ciwVar = null;
        cip cipVar = null;
        cil cilVar = null;
        boolean z = false;
        while (clhVar.p()) {
            int c = clhVar.c(a);
            if (c == 0) {
                str = clhVar.h();
            } else if (c == 1) {
                ciwVar = ckc.b(clhVar, cfjVar);
            } else if (c == 2) {
                cipVar = abt.i(clhVar, cfjVar);
            } else if (c == 3) {
                cilVar = abt.e(clhVar, cfjVar);
            } else if (c == 4) {
                z = clhVar.q();
            } else {
                clhVar.o();
            }
        }
        return new cjg(str, ciwVar, cipVar, cilVar, z);
    }
}
