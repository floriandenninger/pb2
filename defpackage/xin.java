package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xin implements xhx {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    public xin(xhx... xhxVarArr) {
    }

    public final void c(xhx xhxVar) {
        this.a.add(xhxVar);
    }

    @Override // defpackage.xhx
    public final void nM(xla xlaVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xhx) it.next()).nM(xlaVar);
        }
    }

    @Override // defpackage.xhx
    public final void qH(xjq xjqVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xhx) it.next()).qH(xjqVar);
        }
    }
}
