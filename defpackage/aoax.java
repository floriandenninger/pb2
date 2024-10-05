package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoax implements amzs {
    private static final amyp a = new aoaw("", amru.q());
    private final azrw b;

    public aoax(azrw azrwVar) {
        this.b = azrwVar;
    }

    @Override // defpackage.amzs
    public final amyp a(String str) {
        Set set = (Set) ((axqs) this.b).a;
        int size = set.size();
        if (size == 0) {
            return a;
        }
        if (size == 1) {
            return ((amzs) set.iterator().next()).a(str);
        }
        amrp h = amru.h(size);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            h.h(((amzs) it.next()).a(str));
        }
        return new aoaw(str, h.g());
    }
}
