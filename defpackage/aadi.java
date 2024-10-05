package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aadi implements aadf {
    public static final Comparator a = unt.h;
    private final Set b;
    private final Executor c;

    public aadi(Set set, Executor executor) {
        amkq.N(!set.isEmpty());
        this.b = set;
        this.c = executor;
    }

    @Override // defpackage.aadf
    public final aade a(cnc cncVar) {
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        amxd listIterator = ((amwf) this.b).listIterator();
        while (listIterator.hasNext()) {
            aade a2 = ((aadf) listIterator.next()).a(cncVar);
            arrayList.add(a2.b());
            arrayList2.add(a2.a());
        }
        return new aadh(anfq.h(anaf.U(arrayList), new yml(12), this.c), (aadj) Collections.max(arrayList2, a));
    }
}
