package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amog extends amui {
    final /* synthetic */ amoi a;

    public amog(amoi amoiVar) {
        this.a = amoiVar;
    }

    @Override // defpackage.amui
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.amui, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return amkq.bH(this.a.a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new amoh(this.a);
    }

    @Override // defpackage.amui, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        amov amovVar = this.a.b;
        Object key = entry.getKey();
        Map map = amovVar.a;
        map.getClass();
        try {
            obj2 = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        amovVar.b -= size;
        return true;
    }
}
