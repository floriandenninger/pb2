package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckw {
    private static final clg a = clg.a("nm", "c", "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cjh a(clh clhVar, cfj cfjVar) {
        String str = null;
        cil cilVar = null;
        cil cilVar2 = null;
        civ civVar = null;
        boolean z = false;
        while (clhVar.p()) {
            int c = clhVar.c(a);
            if (c == 0) {
                str = clhVar.h();
            } else if (c == 1) {
                cilVar = abt.f(clhVar, cfjVar, false);
            } else if (c == 2) {
                cilVar2 = abt.f(clhVar, cfjVar, false);
            } else if (c == 3) {
                civVar = cke.a(clhVar, cfjVar);
            } else if (c == 4) {
                z = clhVar.q();
            } else {
                clhVar.o();
            }
        }
        return new cjh(str, cilVar, cilVar2, civVar, z);
    }
}
