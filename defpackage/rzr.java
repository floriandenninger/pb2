package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rzr extends rwh {
    final /* synthetic */ rzs a;

    public rzr(rzs rzsVar) {
        this.a = rzsVar;
    }

    @Override // defpackage.rwh
    public final void d(Map map, rzk rzkVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll((List) it.next());
        }
        this.a.e(arrayList, rzkVar);
        this.a.d = true;
    }

    @Override // defpackage.rwh
    public final void i() {
        this.a.f().b();
    }

    @Override // defpackage.rwh
    public final void j(List list) {
        rzs rzsVar = this.a;
        rzsVar.d = false;
        rzsVar.f().b();
        this.a.f().a(this.a.a);
    }
}
