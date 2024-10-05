package defpackage;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cky {
    private static final clg a = clg.a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cjj a(clh clhVar, cfj cfjVar) {
        cin cinVar = null;
        String str = null;
        cik cikVar = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (clhVar.p()) {
            int c = clhVar.c(a);
            if (c == 0) {
                str = clhVar.h();
            } else if (c == 1) {
                cikVar = abt.d(clhVar, cfjVar);
            } else if (c == 2) {
                cinVar = abt.h(clhVar, cfjVar);
            } else if (c == 3) {
                z = clhVar.q();
            } else if (c == 4) {
                i = clhVar.b();
            } else if (c == 5) {
                z2 = clhVar.q();
            } else {
                clhVar.n();
                clhVar.o();
            }
        }
        return new cjj(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, cikVar, cinVar == null ? new cin(Collections.singletonList(new clt(100))) : cinVar, z2);
    }
}
