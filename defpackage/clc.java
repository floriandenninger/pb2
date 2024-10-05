package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class clc {
    private static final clg a = clg.a("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cjn a(clh clhVar, cfj cfjVar) {
        cil cilVar = null;
        cil cilVar2 = null;
        cil cilVar3 = null;
        int i = 0;
        boolean z = false;
        while (clhVar.p()) {
            int c = clhVar.c(a);
            if (c == 0) {
                cilVar = abt.f(clhVar, cfjVar, false);
            } else if (c == 1) {
                cilVar2 = abt.f(clhVar, cfjVar, false);
            } else if (c == 2) {
                cilVar3 = abt.f(clhVar, cfjVar, false);
            } else if (c == 3) {
                clhVar.h();
            } else if (c == 4) {
                int b = clhVar.b();
                if (b == 1) {
                    i = 1;
                } else {
                    if (b != 2) {
                        StringBuilder sb = new StringBuilder(34);
                        sb.append("Unknown trim path type ");
                        sb.append(b);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    i = 2;
                }
            } else if (c == 5) {
                z = clhVar.q();
            } else {
                clhVar.o();
            }
        }
        return new cjn(i, cilVar, cilVar2, cilVar3, z);
    }
}
