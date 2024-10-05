package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dxl extends dyh {
    private final dya a;

    public dxl(dya dyaVar) {
        super("internal.eventLogger");
        this.a = dyaVar;
    }

    @Override // defpackage.dyh
    public final dyn a(dxk dxkVar, List list) {
        Map hashMap;
        esv.B(this.d, 3, list);
        String i = dxkVar.b((dyn) list.get(0)).i();
        long u = (long) esv.u(dxkVar.b((dyn) list.get(1)).h().doubleValue());
        dyn b = dxkVar.b((dyn) list.get(2));
        if (b instanceof dyk) {
            hashMap = esv.z((dyk) b);
        } else {
            hashMap = new HashMap();
        }
        this.a.c.add(new dxz(i, u, hashMap));
        return dyn.f;
    }
}
