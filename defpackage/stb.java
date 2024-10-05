package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class stb {
    public static final amru a = amru.w(ssb.class, ssx.class, ssz.class, stc.class, std.class, ssu.class);

    public static Collection a(Map map) {
        return amkq.bE(((amrz) map).values(), mjw.u);
    }

    public static Collection b(Map map) {
        ArrayList arrayList = new ArrayList(amkq.bE(((amrz) map).values(), wgw.b));
        Collections.sort(arrayList, bea.p);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List c(Map map, Set set) {
        amrp amrpVar = new amrp();
        Iterator<E> it = ((amrz) map).values().iterator();
        while (it.hasNext()) {
            amrpVar.h((syl) ((Pair) it.next()).first);
        }
        amrpVar.j(set);
        return amrpVar.g();
    }
}
