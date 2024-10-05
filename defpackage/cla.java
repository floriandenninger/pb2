package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cla {
    static final clg a = clg.a("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cjl a(clh clhVar, cfj cfjVar) {
        int i = 0;
        String str = null;
        cir cirVar = null;
        boolean z = false;
        while (clhVar.p()) {
            int c = clhVar.c(a);
            if (c == 0) {
                str = clhVar.h();
            } else if (c == 1) {
                i = clhVar.b();
            } else if (c == 2) {
                cirVar = abt.j(clhVar, cfjVar);
            } else if (c == 3) {
                z = clhVar.q();
            } else {
                clhVar.o();
            }
        }
        return new cjl(str, i, cirVar, z);
    }
}
