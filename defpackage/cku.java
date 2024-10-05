package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cku {
    private static final clg a = clg.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static cjf a(clh clhVar, cfj cfjVar) {
        boolean z = false;
        String str = null;
        cil cilVar = null;
        ciw ciwVar = null;
        cil cilVar2 = null;
        cil cilVar3 = null;
        cil cilVar4 = null;
        cil cilVar5 = null;
        cil cilVar6 = null;
        int i = 0;
        boolean z2 = false;
        while (clhVar.p()) {
            switch (clhVar.c(a)) {
                case 0:
                    str = clhVar.h();
                    z = false;
                case 1:
                    int b = clhVar.b();
                    char c = 2;
                    int[] iArr = {1, 2};
                    for (?? r2 = z; r2 < c; r2++) {
                        i = iArr[r2];
                        if (i == 0) {
                            throw null;
                        }
                        if (i == b) {
                            z = false;
                        } else {
                            c = 2;
                        }
                    }
                    z = false;
                    i = 0;
                case 2:
                    cilVar = abt.f(clhVar, cfjVar, z);
                case 3:
                    ciwVar = ckc.b(clhVar, cfjVar);
                case 4:
                    cilVar2 = abt.f(clhVar, cfjVar, z);
                case 5:
                    cilVar4 = abt.e(clhVar, cfjVar);
                case 6:
                    cilVar6 = abt.f(clhVar, cfjVar, z);
                case 7:
                    cilVar3 = abt.e(clhVar, cfjVar);
                case 8:
                    cilVar5 = abt.f(clhVar, cfjVar, z);
                case 9:
                    z2 = clhVar.q();
                default:
                    clhVar.n();
                    clhVar.o();
                    z = false;
            }
        }
        return new cjf(str, i, cilVar, ciwVar, cilVar2, cilVar3, cilVar4, cilVar5, cilVar6, z2);
    }
}
