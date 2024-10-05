package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
class amoi extends amuo {
    final transient Map a;
    final /* synthetic */ amov b;

    public amoi(amov amovVar, Map map) {
        this.b = amovVar;
        this.a = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map.Entry a(Map.Entry entry) {
        Object key = entry.getKey();
        return amkq.aK(key, this.b.d(key, (Collection) entry.getValue()));
    }

    @Override // defpackage.amuo
    public final Set b() {
        return new amog(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.a;
        amov amovVar = this.b;
        if (map == amovVar.a) {
            amovVar.m();
        } else {
            amkq.bc(new amoh(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.a;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) amkq.aH(this.a, obj);
        if (collection == null) {
            return null;
        }
        return this.b.d(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.amuo, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.b.s();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection a = this.b.a();
        a.addAll(collection);
        this.b.b -= collection.size();
        collection.clear();
        return a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.a.toString();
    }
}
