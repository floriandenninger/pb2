package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ryi implements rxu {
    private final SortedMap a;

    public ryi(SortedMap sortedMap) {
        this.a = sortedMap;
    }

    @Override // defpackage.rxu
    public final List a(List list) {
        long j;
        ArrayList z = rwh.z(list.size());
        if (!list.isEmpty()) {
            if (list.size() < 2) {
                j = 0;
            } else {
                j = Long.MAX_VALUE;
                int i = 0;
                while (i <= list.size() - 2) {
                    long longValue = ((Double) list.get(i)).longValue();
                    i++;
                    j = Math.min(j, ((Double) list.get(i)).longValue() - longValue);
                }
            }
            SortedMap sortedMap = this.a;
            ryq ryqVar = (ryq) sortedMap.get(sortedMap.firstKey());
            for (Map.Entry entry : this.a.entrySet()) {
                if (((Long) entry.getKey()).longValue() > j) {
                    break;
                }
                ryqVar = (ryq) entry.getValue();
            }
            Iterator it = list.iterator();
            Date date = new Date(((Double) it.next()).longValue());
            z.add(ryqVar.a.format(date));
            while (it.hasNext()) {
                Date date2 = new Date(((Double) it.next()).longValue());
                ryqVar.c.setTime(date);
                int i2 = ryqVar.c.get(ryqVar.b);
                ryqVar.c.setTime(date2);
                if (ryqVar.c.get(ryqVar.b) != i2) {
                    z.add(ryqVar.a.format(date2));
                } else {
                    z.add(ryqVar.a(date2));
                }
                date = date2;
            }
        }
        return z;
    }
}
