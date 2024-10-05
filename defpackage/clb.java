package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class clb {
    private static final clg a = clg.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");
    private static final clg b = clg.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cjm a(clh clhVar, cfj cfjVar) {
        char c;
        ArrayList arrayList = new ArrayList();
        String str = null;
        cil cilVar = null;
        cik cikVar = null;
        cil cilVar2 = null;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        boolean z = false;
        cin cinVar = null;
        while (true) {
            int i3 = 100;
            if (clhVar.p()) {
                switch (clhVar.c(a)) {
                    case 0:
                        str = clhVar.h();
                        break;
                    case 1:
                        cikVar = abt.d(clhVar, cfjVar);
                        break;
                    case 2:
                        cilVar2 = abt.e(clhVar, cfjVar);
                        break;
                    case 3:
                        cinVar = abt.h(clhVar, cfjVar);
                        break;
                    case 4:
                        i = abp.g()[clhVar.b() - 1];
                        break;
                    case 5:
                        i2 = abp.e()[clhVar.b() - 1];
                        break;
                    case 6:
                        f = (float) clhVar.a();
                        break;
                    case 7:
                        z = clhVar.q();
                        break;
                    case 8:
                        clhVar.i();
                        while (clhVar.p()) {
                            clhVar.j();
                            cil cilVar3 = null;
                            String str2 = null;
                            while (clhVar.p()) {
                                int c2 = clhVar.c(b);
                                if (c2 == 0) {
                                    str2 = clhVar.h();
                                } else if (c2 == 1) {
                                    cilVar3 = abt.e(clhVar, cfjVar);
                                } else {
                                    clhVar.n();
                                    clhVar.o();
                                }
                            }
                            clhVar.l();
                            int hashCode = str2.hashCode();
                            if (hashCode == i3) {
                                if (str2.equals("d")) {
                                    c = 1;
                                }
                                c = 65535;
                            } else if (hashCode != 103) {
                                if (hashCode == 111 && str2.equals("o")) {
                                    c = 0;
                                }
                                c = 65535;
                            } else {
                                if (str2.equals("g")) {
                                    c = 2;
                                }
                                c = 65535;
                            }
                            if (c == 0) {
                                cilVar = cilVar3;
                            } else if (c == 1 || c == 2) {
                                cfjVar.f();
                                arrayList.add(cilVar3);
                            }
                            i3 = 100;
                        }
                        clhVar.k();
                        if (arrayList.size() != 1) {
                            break;
                        } else {
                            arrayList.add((cil) arrayList.get(0));
                            break;
                        }
                    default:
                        clhVar.o();
                        break;
                }
            } else {
                if (cinVar == null) {
                    cinVar = new cin(Collections.singletonList(new clt(100)));
                }
                return new cjm(str, cilVar, arrayList, cikVar, cinVar, cilVar2, i, i2, f, z);
            }
        }
    }
}
