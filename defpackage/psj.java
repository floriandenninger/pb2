package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class psj implements Iterable {
    private final Object a = new Object();
    private final Map b = new HashMap();
    private Set c = Collections.emptySet();
    private List d = Collections.emptyList();

    public final int a(Object obj) {
        int intValue;
        synchronized (this.a) {
            intValue = this.b.containsKey(obj) ? ((Integer) this.b.get(obj)).intValue() : 0;
        }
        return intValue;
    }

    public final Set b() {
        Set set;
        synchronized (this.a) {
            set = this.c;
        }
        return set;
    }

    public final void c(Object obj) {
        synchronized (this.a) {
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.add(obj);
            this.d = Collections.unmodifiableList(arrayList);
            Integer num = (Integer) this.b.get(obj);
            if (num == null) {
                HashSet hashSet = new HashSet(this.c);
                hashSet.add(obj);
                this.c = Collections.unmodifiableSet(hashSet);
            }
            this.b.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public final void d(Object obj) {
        synchronized (this.a) {
            Integer num = (Integer) this.b.get(obj);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.remove(obj);
            this.d = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.b.remove(obj);
                HashSet hashSet = new HashSet(this.c);
                hashSet.remove(obj);
                this.c = Collections.unmodifiableSet(hashSet);
            } else {
                this.b.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }
}
