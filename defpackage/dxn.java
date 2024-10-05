package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dxn extends dyh {
    final /* synthetic */ rgl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxn(rgl rglVar) {
        super("getValue");
        this.a = rglVar;
    }

    @Override // defpackage.dyh
    public final dyn a(dxk dxkVar, List list) {
        esv.B("getValue", 2, list);
        dyn b = dxkVar.b((dyn) list.get(0));
        dyn b2 = dxkVar.b((dyn) list.get(1));
        String i = b.i();
        rgl rglVar = this.a;
        Map map = (Map) rglVar.b.a.get(rglVar.a);
        String str = null;
        if (map != null && map.containsKey(i)) {
            str = (String) map.get(i);
        }
        return str != null ? new dyq(str) : b2;
    }
}
