package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dmr extends dmh {
    public final ArrayList a = new ArrayList();

    public dmr(List list) {
        for (int i = 0; i < list.size(); i++) {
            dmh dmhVar = (dmh) list.get(i);
            if (dmhVar instanceof dmb) {
                ArrayList a = ((dmb) dmhVar).a();
                if (a.size() > 1) {
                    this.a.add(new dmr(a));
                } else {
                    this.a.add((dmh) a.get(0));
                }
            } else if (dmhVar != null) {
                this.a.add(dmhVar);
            } else {
                throw new IllegalStateException("Null element is not allowed in transition set");
            }
        }
    }
}
