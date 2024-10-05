package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amzd {
    private static final amyz a = new amzb();
    private static final amyy b = new amzc();

    public static amza a(Set set) {
        amyw amywVar = new amyw(a);
        amywVar.f = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            amyc amycVar = (amyc) it.next();
            anaf.d(amycVar, "key");
            if (amycVar.b) {
                amyy amyyVar = amyw.b;
                anaf.d(amycVar, "key");
                anaf.e(amycVar.b, "key must be repeating");
                amywVar.c.remove(amycVar);
                amywVar.d.put(amycVar, amyyVar);
            } else {
                amyz amyzVar = amyw.a;
                anaf.d(amycVar, "key");
                amywVar.d.remove(amycVar);
                amywVar.c.put(amycVar, amyzVar);
            }
        }
        return new amyx(amywVar);
    }
}
