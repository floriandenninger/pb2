package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dxs extends dyh {
    public final rgk a;

    public dxs(rgk rgkVar) {
        super("internal.logger");
        this.a = rgkVar;
        this.e.put("log", new dxr(this, false, true));
        this.e.put("silent", new dxp());
        ((dyh) this.e.get("silent")).r("log", new dxr(this, true, true));
        this.e.put("unmonitored", new dxq());
        ((dyh) this.e.get("unmonitored")).r("log", new dxr(this, false, false));
    }

    @Override // defpackage.dyh
    public final dyn a(dxk dxkVar, List list) {
        return dyn.f;
    }
}
