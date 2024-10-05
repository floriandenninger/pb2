package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afef implements ozx, oxi {
    public final afcr a;
    private final afdp b;

    public afef(afcr afcrVar, afdp afdpVar) {
        this.a = afcrVar;
        this.b = afdpVar;
    }

    private static long b(ozz ozzVar) {
        if (ozzVar instanceof aeta) {
            return ((aeta) ozzVar).n();
        }
        return ozzVar.h;
    }

    @Override // defpackage.ozx
    public final void a(List list, long j, ozv[] ozvVarArr, ozw ozwVar) {
        long j2;
        int i = ozwVar.a;
        int i2 = ozwVar.b;
        ozv ozvVar = ozwVar.c;
        afco afcoVar = new afco(i, i2, ozvVar == null ? null : new afee(ozvVar));
        long b = list.isEmpty() ? 0L : b((ozz) list.get(list.size() - 1)) - j;
        afcr afcrVar = this.a;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ozz ozzVar = (ozz) it.next();
            ozv ozvVar2 = ozzVar.c;
            afee afeeVar = ozvVar2 == null ? null : new afee(ozvVar2);
            if (ozzVar instanceof aeta) {
                j2 = ((aeta) ozzVar).o();
            } else {
                j2 = ozzVar.g;
            }
            long b2 = b(ozzVar);
            pfs pfsVar = ozzVar.d;
            ozzVar.m();
            arrayList.add(new afcq(afeeVar, j2, b2));
        }
        afee[] afeeVarArr = new afee[ozvVarArr.length];
        for (int i3 = 0; i3 < ozvVarArr.length; i3++) {
            ozv ozvVar3 = ozvVarArr[i3];
            if (ozvVar3 != null) {
                afeeVarArr[i3] = new afee(ozvVar3);
            }
        }
        afcrVar.a(arrayList, j, b, afeeVarArr, afcoVar);
        ozwVar.a = afcoVar.a;
        ozwVar.b = afcoVar.b;
        afcp afcpVar = afcoVar.c;
        ozwVar.c = afcpVar instanceof afee ? ((afee) afcpVar).a : null;
        afdp afdpVar = this.b;
        int i4 = afcoVar.a;
        aenk aenkVar = afcoVar.d;
        if (aenkVar == null) {
            aenkVar = aenk.a;
        }
        aeex aeexVar = afcoVar.e;
        if (aeexVar == null) {
            aeexVar = aeex.a;
        }
        afdpVar.a(list, i4, aenkVar, aeexVar);
    }

    @Override // defpackage.oxi
    public final void k(int i, Object obj) {
        if (i == 0) {
            if (obj instanceof afkm) {
                this.a.g((afkm) obj);
                return;
            }
            i = 0;
        }
        if (i == 1) {
            if (obj instanceof aeex) {
                this.a.f((aeex) obj);
                return;
            }
            i = 1;
        }
        if (i == 4) {
            this.a.d(((Float) obj).floatValue());
        } else if (i == 2) {
            this.a.e();
        } else if (i == 3) {
            this.a.b(((Boolean) obj).booleanValue());
        }
    }
}
