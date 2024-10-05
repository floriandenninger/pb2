package defpackage;

import android.graphics.Path;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckm {
    private static final clg a = clg.a("nm", "g", "o", "t", "s", "e", "r", "hd");
    private static final clg b = clg.a("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cjb a(clh clhVar, cfj cfjVar) {
        cin cinVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        cim cimVar = null;
        cip cipVar = null;
        cip cipVar2 = null;
        int i = 0;
        boolean z = false;
        while (clhVar.p()) {
            switch (clhVar.c(a)) {
                case 0:
                    str = clhVar.h();
                    break;
                case 1:
                    clhVar.j();
                    int i2 = -1;
                    while (clhVar.p()) {
                        int c = clhVar.c(b);
                        if (c == 0) {
                            i2 = clhVar.b();
                        } else if (c == 1) {
                            cimVar = abt.g(clhVar, cfjVar, i2);
                        } else {
                            clhVar.n();
                            clhVar.o();
                        }
                    }
                    clhVar.l();
                    break;
                case 2:
                    cinVar = abt.h(clhVar, cfjVar);
                    break;
                case 3:
                    if (clhVar.b() != 1) {
                        i = 2;
                        break;
                    } else {
                        i = 1;
                        break;
                    }
                case 4:
                    cipVar = abt.i(clhVar, cfjVar);
                    break;
                case 5:
                    cipVar2 = abt.i(clhVar, cfjVar);
                    break;
                case 6:
                    if (clhVar.b() != 1) {
                        fillType = Path.FillType.EVEN_ODD;
                        break;
                    } else {
                        fillType = Path.FillType.WINDING;
                        break;
                    }
                case 7:
                    z = clhVar.q();
                    break;
                default:
                    clhVar.n();
                    clhVar.o();
                    break;
            }
        }
        return new cjb(str, i, fillType, cimVar, cinVar == null ? new cin(Collections.singletonList(new clt(100))) : cinVar, cipVar, cipVar2, z);
    }
}
