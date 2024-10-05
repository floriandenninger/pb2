package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xhj implements afve {
    private final List a;

    public xhj(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.afve
    public final boolean a(asuq asuqVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            asuq b = asuq.b(((asur) it.next()).c);
            if (b == null) {
                b = asuq.UNKNOWN;
            }
            if (b == asuqVar) {
                return true;
            }
        }
        return false;
    }
}
