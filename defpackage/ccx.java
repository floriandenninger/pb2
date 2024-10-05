package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ccx implements abb {
    @Override // defpackage.abb
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        byr byrVar;
        List<ccz> list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ccz cczVar : list) {
            List list2 = cczVar.e;
            if (list2 == null || list2.isEmpty()) {
                byrVar = byr.a;
            } else {
                byrVar = (byr) cczVar.e.get(0);
            }
            arrayList.add(new bzg(UUID.fromString(cczVar.a), cczVar.f, cczVar.b, cczVar.d, byrVar, cczVar.c));
        }
        return arrayList;
    }
}
