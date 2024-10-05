package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckf {
    private static final clg a = clg.a("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ciy a(clh clhVar, cfj cfjVar, int i) {
        boolean z = i == 3;
        String str = null;
        ciw ciwVar = null;
        cip cipVar = null;
        boolean z2 = false;
        while (clhVar.p()) {
            int c = clhVar.c(a);
            if (c == 0) {
                str = clhVar.h();
            } else if (c == 1) {
                ciwVar = ckc.b(clhVar, cfjVar);
            } else if (c == 2) {
                cipVar = abt.i(clhVar, cfjVar);
            } else if (c == 3) {
                z2 = clhVar.q();
            } else if (c == 4) {
                z = clhVar.b() == 3;
            } else {
                clhVar.n();
                clhVar.o();
            }
        }
        return new ciy(str, ciwVar, cipVar, z, z2);
    }
}
