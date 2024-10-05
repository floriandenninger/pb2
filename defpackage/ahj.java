package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahj {
    public final hy a = new hz(10);
    public final aeg b = new aeg();
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();

    public final ArrayList a(Object obj) {
        return (ArrayList) this.b.get(obj);
    }

    public final void b(Object obj) {
        if (this.b.containsKey(obj)) {
            return;
        }
        this.b.put(obj, null);
    }

    public final void c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }
}
