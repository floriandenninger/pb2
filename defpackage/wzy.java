package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wzy implements tea {
    private final sww a;
    private final aovz b;
    private final Map c;

    public wzy(sww swwVar, aovz aovzVar) {
        HashMap aJ;
        this.a = swwVar;
        this.b = aovzVar;
        aoyh aoyhVar = aovzVar.e;
        aoyhVar = aoyhVar == null ? aoyh.a : aoyhVar;
        if (aoyhVar == null) {
            aJ = null;
        } else {
            aJ = amkq.aJ(aoyhVar.b.size());
            for (Map.Entry entry : Collections.unmodifiableMap(aoyhVar.b).entrySet()) {
                aJ.put((String) entry.getKey(), ((aoyg) entry.getValue()).b);
            }
        }
        this.c = aJ != null ? afxf.c(aJ) : null;
    }

    private final void c(awnw awnwVar, tdt tdtVar, View view) {
        xbp c = xbp.c(tdtVar, this.c);
        ajgb a = ajgc.a();
        a.a = null;
        a.e = Arrays.asList(c);
        sws a2 = swu.a();
        if (view != null) {
            a2.a = view;
        }
        a2.d = a.a();
        this.a.b(awnwVar, a2.a()).Q();
    }

    @Override // defpackage.tea
    public final void a(tdt tdtVar, View view) {
        awnw awnwVar = this.b.c;
        if (awnwVar == null) {
            awnwVar = awnw.a;
        }
        c(awnwVar, tdtVar, view);
    }

    @Override // defpackage.tea
    public final void b(tdt tdtVar, View view) {
        awnw awnwVar = this.b.d;
        if (awnwVar == null) {
            awnwVar = awnw.a;
        }
        c(awnwVar, tdtVar, view);
    }
}
