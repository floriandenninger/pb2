package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckq {
    static final clg a = clg.a("k");

    public static List a(clh clhVar, cfj cfjVar, float f, cld cldVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (clhVar.r() == 6) {
            cfjVar.d("Lottie doesn't support expressions.");
            return arrayList;
        }
        clhVar.j();
        while (clhVar.p()) {
            if (clhVar.c(a) == 0) {
                if (clhVar.r() == 1) {
                    clhVar.i();
                    if (clhVar.r() != 7) {
                        while (clhVar.p()) {
                            arrayList.add(ckp.a(clhVar, cfjVar, f, cldVar, true, z));
                        }
                    } else {
                        arrayList.add(ckp.a(clhVar, cfjVar, f, cldVar, false, z));
                    }
                    clhVar.k();
                } else {
                    arrayList.add(ckp.a(clhVar, cfjVar, f, cldVar, false, z));
                }
            } else {
                clhVar.o();
            }
        }
        clhVar.l();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            clt cltVar = (clt) list.get(i2);
            i2++;
            clt cltVar2 = (clt) list.get(i2);
            cltVar.h = Float.valueOf(cltVar2.g);
            if (cltVar.c == null && (obj = cltVar2.b) != null) {
                cltVar.c = obj;
                if (cltVar instanceof chr) {
                    ((chr) cltVar).a();
                }
            }
        }
        clt cltVar3 = (clt) list.get(i);
        if ((cltVar3.b == null || cltVar3.c == null) && list.size() > 1) {
            list.remove(cltVar3);
        }
    }
}
