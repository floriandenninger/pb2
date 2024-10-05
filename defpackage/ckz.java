package defpackage;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckz {
    private static final clg a = clg.a("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cjk a(clh clhVar, cfj cfjVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (clhVar.p()) {
            int c = clhVar.c(a);
            if (c == 0) {
                str = clhVar.h();
            } else if (c == 1) {
                z = clhVar.q();
            } else if (c == 2) {
                clhVar.i();
                while (clhVar.p()) {
                    ciz a2 = ckg.a(clhVar, cfjVar);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                clhVar.k();
            } else {
                clhVar.o();
            }
        }
        return new cjk(str, arrayList, z);
    }
}
