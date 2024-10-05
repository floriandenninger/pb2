package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eul {
    public static final String a = String.valueOf(eul.class.getName()).concat(".csn");
    private static final String d = "eul";
    public final Map b = new HashMap();
    public final aahd c;
    private final acqz e;

    public eul(fxj fxjVar, aahd aahdVar, acqz acqzVar) {
        aahdVar.getClass();
        this.c = aahdVar;
        this.e = acqzVar;
        fxjVar.g(new eui(this));
    }

    public final void a(euj eujVar, List list, Map map) {
        eujVar.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        List list2 = (List) this.b.get(eujVar);
        if (list2 == null) {
            list2 = new ArrayList();
            this.b.put(eujVar, list2);
        }
        map.put(a, this.e.mM().k());
        list2.add(new euk(list, map));
    }
}
