package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ywq extends ykv {
    private final Set a;

    public ywq(Set set) {
        this.a = set;
    }

    @Override // defpackage.ykv
    protected final void a() {
        if (this.a.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((ambx) it.next()).c());
        }
        anaf.X(anaf.J(arrayList).c(anij.a, angq.a));
    }
}
