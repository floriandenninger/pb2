package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dyu {
    final Map a = new HashMap();
    final dzd b = new dzd();

    public dyu() {
        b(new dys());
        b(new dyv());
        b(new dyw());
        b(new dyy());
        b(new dzb());
        b(new dzc());
        b(new dze());
    }

    public final dyn a(dxk dxkVar, dyn dynVar) {
        dyt dytVar;
        esv.H(dxkVar);
        if (!(dynVar instanceof dyo)) {
            return dynVar;
        }
        dyo dyoVar = (dyo) dynVar;
        ArrayList arrayList = dyoVar.b;
        String str = dyoVar.a;
        if (this.a.containsKey(str)) {
            dytVar = (dyt) this.a.get(str);
        } else {
            dytVar = this.b;
        }
        return dytVar.a(str, dxkVar, arrayList);
    }

    final void b(dyt dytVar) {
        Iterator it = dytVar.a.iterator();
        while (it.hasNext()) {
            this.a.put(((dzf) it.next()).toString(), dytVar);
        }
    }
}
