package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aapp {
    private static final amnm a = amnm.b(',').e().a();
    private final List b;

    public aapp(List list) {
        this.b = list;
    }

    public amru a() {
        for (askp askpVar : this.b) {
            if ("e".equals(askpVar.e) && askpVar.c == 2) {
                List h = a.h(askpVar.c == 2 ? (String) askpVar.d : "");
                ArrayList arrayList = new ArrayList();
                Iterator it = h.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                }
                return amru.o(arrayList);
            }
        }
        return amru.q();
    }
}
