package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wpl {
    public aahd a = null;
    private final aahd b;

    public wpl(aahd aahdVar) {
        this.b = aahdVar;
    }

    private static final void d(aahd aahdVar, apxf apxfVar, Map map) {
        if (aahdVar == null) {
            whu.l(null, "Unable to resolve endpoint because commandRouter inaccessible");
        } else {
            aahdVar.c(apxfVar, map);
        }
    }

    public final void a(List list, Map map) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d(this.a, (apxf) it.next(), map);
        }
    }

    public final void b(apxf apxfVar, Map map) {
        d(this.b, apxfVar, map);
    }

    public final void c(apxf apxfVar, Map map) {
        d(this.a, apxfVar, map);
    }
}
