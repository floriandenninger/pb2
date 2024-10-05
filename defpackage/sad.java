package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class sad extends rwh {
    final /* synthetic */ sae a;

    public sad(sae saeVar) {
        this.a = saeVar;
    }

    @Override // defpackage.rwh
    public final void d(Map map, rzk rzkVar) {
        sae saeVar = this.a;
        ArrayList x = rwh.x();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            x.addAll((List) it.next());
        }
        saeVar.e(x, rzkVar);
    }
}
