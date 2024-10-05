package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dym extends dyh implements dyj {
    protected final List a;
    protected final List b;
    protected dxk c;

    private dym(dym dymVar) {
        super(dymVar.d);
        ArrayList arrayList = new ArrayList(dymVar.a.size());
        this.a = arrayList;
        arrayList.addAll(dymVar.a);
        ArrayList arrayList2 = new ArrayList(dymVar.b.size());
        this.b = arrayList2;
        arrayList2.addAll(dymVar.b);
        this.c = dymVar.c;
    }

    @Override // defpackage.dyh
    public final dyn a(dxk dxkVar, List list) {
        dxk a = this.c.a();
        for (int i = 0; i < this.a.size(); i++) {
            if (i < list.size()) {
                a.e((String) this.a.get(i), dxkVar.b((dyn) list.get(i)));
            } else {
                a.e((String) this.a.get(i), f);
            }
        }
        for (dyn dynVar : this.b) {
            dyn b = a.b(dynVar);
            if (b instanceof dyo) {
                b = a.b(dynVar);
            }
            if (b instanceof dyf) {
                return ((dyf) b).a;
            }
        }
        return dyn.f;
    }

    @Override // defpackage.dyh, defpackage.dyn
    public final dyn d() {
        return new dym(this);
    }

    public dym(String str, List list, List list2, dxk dxkVar) {
        super(str);
        this.a = new ArrayList();
        this.c = dxkVar;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.a.add(((dyn) it.next()).i());
            }
        }
        this.b = new ArrayList(list2);
    }
}
