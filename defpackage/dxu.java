package defpackage;

import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dxu extends dyh {
    private final dxy a;

    public dxu(dxy dxyVar) {
        super("internal.registerCallback");
        this.a = dxyVar;
    }

    @Override // defpackage.dyh
    public final dyn a(dxk dxkVar, List list) {
        TreeMap treeMap;
        esv.B(this.d, 3, list);
        dxkVar.b((dyn) list.get(0)).i();
        dyn b = dxkVar.b((dyn) list.get(1));
        if (!(b instanceof dym)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        dyn b2 = dxkVar.b((dyn) list.get(2));
        if (!(b2 instanceof dyk)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        dyk dykVar = (dyk) b2;
        if (!dykVar.t("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        String i = dykVar.f("type").i();
        int v = dykVar.t("priority") ? esv.v(dykVar.f("priority").h().doubleValue()) : 1000;
        dxy dxyVar = this.a;
        dym dymVar = (dym) b;
        if ("create".equals(i)) {
            treeMap = dxyVar.b;
        } else {
            if (!"edit".equals(i)) {
                String valueOf = String.valueOf(i);
                throw new IllegalStateException(valueOf.length() != 0 ? "Unknown callback type: ".concat(valueOf) : new String("Unknown callback type: "));
            }
            treeMap = dxyVar.a;
        }
        if (treeMap.containsKey(Integer.valueOf(v))) {
            v = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(v), dymVar);
        return dyn.f;
    }
}
