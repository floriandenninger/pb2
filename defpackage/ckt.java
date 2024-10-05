package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ckt {
    private static final clg a = clg.a("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cje a(clh clhVar) {
        int i = 0;
        boolean z = false;
        while (clhVar.p()) {
            int c = clhVar.c(a);
            if (c == 0) {
                clhVar.h();
            } else if (c == 1) {
                int b = clhVar.b();
                if (b != 1) {
                    if (b == 2) {
                        i = 2;
                    } else if (b == 3) {
                        i = 3;
                    } else if (b == 4) {
                        i = 4;
                    } else if (b == 5) {
                        i = 5;
                    }
                }
                i = 1;
            } else if (c == 2) {
                z = clhVar.q();
            } else {
                clhVar.n();
                clhVar.o();
            }
        }
        return new cje(i, z);
    }
}
