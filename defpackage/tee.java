package defpackage;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tee {
    public final EnumSet a = EnumSet.noneOf(ted.class);
    public final EnumMap b = new EnumMap(ted.class);

    public final int a() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((ted) it.next()).n;
        }
        return i;
    }

    public final void b(ted tedVar) {
        this.a.add(tedVar);
        if (this.b.containsKey(tedVar)) {
            return;
        }
        this.b.put((EnumMap) tedVar, (ted) false);
    }
}
