package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amum extends amuk {
    final Map a;
    final amuh b;

    public amum(Map map, amuh amuhVar) {
        map.getClass();
        this.a = map;
        this.b = amuhVar;
    }

    @Override // defpackage.amuk
    public final Iterator a() {
        Iterator it = this.a.entrySet().iterator();
        amuh amuhVar = this.b;
        amuhVar.getClass();
        return amkq.bb(it, new amuc(amuhVar));
    }

    @Override // defpackage.amuk, java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 != null || this.a.containsKey(obj)) {
            return this.b.a(obj2);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.a.containsKey(obj)) {
            return this.b.a(this.a.remove(obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new amun(this);
    }
}
