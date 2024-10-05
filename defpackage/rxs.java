package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxs implements rxw {
    private final List a;
    private final /* synthetic */ int b;

    public rxs(int i) {
        this.b = i;
        this.a = rwh.x();
    }

    public rxs(List list, int i) {
        this.b = i;
        this.a = rwh.y(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [rze] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [rza] */
    @Override // defpackage.rxw
    public final List b(List list, ryv ryvVar, int i, rwl rwlVar, rxu rxuVar, rxl rxlVar, rze rzeVar, boolean z) {
        Collection linkedHashSet;
        if (this.b == 0) {
            List a = rxuVar.a(this.a);
            if (z) {
                rzeVar = rzeVar.h();
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    rzeVar.j(it.next());
                }
            }
            return rxlVar.e(this.a, a, i, rzeVar, false).b;
        }
        if (rzeVar instanceof rzf) {
            linkedHashSet = ((rzf) rzeVar).a.b;
        } else {
            linkedHashSet = new LinkedHashSet(list);
        }
        this.a.clear();
        this.a.addAll(linkedHashSet);
        return rxlVar.e(this.a, rxuVar.a(this.a), i, rzeVar, false).b;
    }
}
