package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahyc {
    public final Set a = new HashSet();
    public boolean b = false;
    public ahyb c;

    private static final boolean c(int i) {
        return i == 1 || i == 2;
    }

    public final void a(int i, long j) {
        b(c(i), i, j);
    }

    public final void b(boolean z, int i, long j) {
        if (z != c(i)) {
            return;
        }
        if (this.b != z) {
            this.b = z;
            ahyb ahybVar = this.c;
            if (ahybVar != null) {
                ahyf ahyfVar = ahybVar.a;
                if (ahyfVar.getParent() != null) {
                    ahyfVar.getParent().requestDisallowInterceptTouchEvent(z);
                }
                ahyfVar.B();
            }
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahyl) it.next()).h(i, j);
        }
    }
}
