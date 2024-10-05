package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class angl extends anft {
    private List c;

    public angl(amrl amrlVar, boolean z) {
        super(amrlVar, z, true);
        List aS;
        if (amrlVar.isEmpty()) {
            aS = Collections.emptyList();
        } else {
            aS = amkq.aS(amrlVar.size());
        }
        for (int i = 0; i < amrlVar.size(); i++) {
            aS.add(null);
        }
        this.c = aS;
        r();
    }

    @Override // defpackage.anft
    public final void g(int i, Object obj) {
        List list = this.c;
        if (list != null) {
            list.set(i, new xcy(obj));
        }
    }

    @Override // defpackage.anft
    public final void q() {
        List<xcy> list = this.c;
        if (list != null) {
            ArrayList aS = amkq.aS(list.size());
            for (xcy xcyVar : list) {
                aS.add(xcyVar != null ? xcyVar.a : null);
            }
            o(Collections.unmodifiableList(aS));
        }
    }

    @Override // defpackage.anft
    public final void s(int i) {
        super.s(i);
        this.c = null;
    }
}
