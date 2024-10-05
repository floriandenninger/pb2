package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yow implements Iterable {
    public final Map a;

    public yow() {
        this.a = new TreeMap();
    }

    public final void a(Object obj, Object obj2) {
        LinkedList linkedList = (LinkedList) this.a.get(obj);
        if (linkedList == null) {
            linkedList = new LinkedList();
            this.a.put(obj, linkedList);
        }
        linkedList.addLast(obj2);
    }

    public final void b(Object obj) {
        amxd listIterator = amsx.p(this.a.entrySet()).listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            LinkedList linkedList = (LinkedList) entry.getValue();
            if (linkedList.remove(obj)) {
                if (linkedList.isEmpty()) {
                    this.a.remove(entry.getKey());
                    return;
                }
                return;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new yov(this);
    }

    public yow(Comparator comparator) {
        this.a = new TreeMap(comparator);
    }
}
