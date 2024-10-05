package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckn {
    private static final clg a = clg.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final clg b = clg.a("p", "k");
    private static final clg c = clg.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cjc a(clh clhVar, cfj cfjVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        int i = 0;
        cim cimVar = null;
        cip cipVar = null;
        cip cipVar2 = null;
        cil cilVar = null;
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        cil cilVar2 = null;
        boolean z = false;
        cin cinVar = null;
        while (clhVar.p()) {
            switch (clhVar.c(a)) {
                case 0:
                    str = clhVar.h();
                    break;
                case 1:
                    clhVar.j();
                    int i4 = -1;
                    while (clhVar.p()) {
                        int c2 = clhVar.c(b);
                        if (c2 == 0) {
                            i4 = clhVar.b();
                        } else if (c2 == 1) {
                            cimVar = abt.g(clhVar, cfjVar, i4);
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
                    cilVar = abt.e(clhVar, cfjVar);
                    break;
                case 7:
                    i2 = abp.g()[clhVar.b() - 1];
                    break;
                case 8:
                    i3 = abp.e()[clhVar.b() - 1];
                    break;
                case 9:
                    f = (float) clhVar.a();
                    break;
                case 10:
                    z = clhVar.q();
                    break;
                case 11:
                    clhVar.i();
                    while (clhVar.p()) {
                        clhVar.j();
                        String str2 = null;
                        cil cilVar3 = null;
                        while (clhVar.p()) {
                            int c3 = clhVar.c(c);
                            if (c3 != 0) {
                                cil cilVar4 = cilVar2;
                                if (c3 == 1) {
                                    cilVar3 = abt.e(clhVar, cfjVar);
                                } else {
                                    clhVar.n();
                                    clhVar.o();
                                }
                                cilVar2 = cilVar4;
                            } else {
                                str2 = clhVar.h();
                            }
                        }
                        cil cilVar5 = cilVar2;
                        clhVar.l();
                        if (str2.equals("o")) {
                            cilVar2 = cilVar3;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                cfjVar.f();
                                arrayList.add(cilVar3);
                            }
                            cilVar2 = cilVar5;
                        }
                    }
                    cil cilVar6 = cilVar2;
                    clhVar.k();
                    if (arrayList.size() == 1) {
                        arrayList.add((cil) arrayList.get(0));
                    }
                    cilVar2 = cilVar6;
                    break;
                default:
                    clhVar.n();
                    clhVar.o();
                    break;
            }
        }
        if (cinVar == null) {
            cinVar = new cin(Collections.singletonList(new clt(100)));
        }
        return new cjc(str, i, cimVar, cinVar, cipVar, cipVar2, cilVar, i2, i3, f, arrayList, cilVar2, z);
    }
}
