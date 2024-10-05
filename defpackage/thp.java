package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class thp {
    private final Map a;
    private final aomw b = aomw.b();

    public thp(Map map) {
        this.a = map;
    }

    public final void a(aonh aonhVar, List list, aoox aooxVar, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            azrw azrwVar = (azrw) this.a.get(Integer.valueOf(num.intValue()));
            tho thoVar = azrwVar == null ? null : (tho) azrwVar.get();
            if (thoVar != null) {
                anhy a = thoVar.a((aooy) aonhVar.pX(this.b.d((aonh) aonhVar.getDefaultInstanceForType(), num.intValue())));
                a.getClass();
                if (tho.a.equals(a)) {
                    continue;
                } else if (aooxVar != null) {
                    try {
                        ((thn) anaf.W(a)).a(aooxVar);
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    list2.add(a);
                }
            }
        }
    }
}
