package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akih extends ajsu implements akii {
    public final ajoc a;
    private final List b;

    public akih(avmg avmgVar, Context context, aahd aahdVar) {
        avml avmlVar;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ajoc ajocVar = new ajoc();
        this.a = ajocVar;
        avmm avmmVar = avmgVar.c;
        if ((avmmVar == null ? avmm.a : avmmVar).b == 92759253) {
            avmm avmmVar2 = avmgVar.c;
            avmmVar2 = avmmVar2 == null ? avmm.a : avmmVar2;
            if (avmmVar2.b == 92759253) {
                avmlVar = (avml) avmmVar2.c;
            } else {
                avmlVar = avml.a;
            }
        } else {
            avmlVar = null;
        }
        if (avmlVar != null) {
            akij akijVar = new akij(avmlVar, context, aahdVar);
            arrayList.add(akijVar);
            ajocVar.m(akijVar.c);
        }
    }

    @Override // defpackage.akii
    public final void b(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.b);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((akii) it.next()).b(arrayList);
        }
    }

    @Override // defpackage.akii
    public final void c(ajos ajosVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((akii) it.next()).c(ajosVar);
        }
    }

    @Override // defpackage.ajvc
    public final ajng lC() {
        return this.a;
    }
}
