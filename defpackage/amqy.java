package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amqy extends AbstractMap implements Serializable, amph {
    private final amre a;
    private transient Set b;

    public amqy(amre amreVar) {
        this.a = amreVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a.g = this;
    }

    @Override // defpackage.amph
    public final amph a() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        amqz amqzVar = new amqz(this.a);
        this.b = amqzVar;
        return amqzVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        amre amreVar = this.a;
        int e = amreVar.e(obj);
        if (e == -1) {
            return null;
        }
        return amreVar.a[e];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.values();
    }

    @Override // java.util.AbstractMap, java.util.Map, defpackage.amph
    public final Object put(Object obj, Object obj2) {
        return this.a.l(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        amre amreVar = this.a;
        int bt = amkq.bt(obj);
        int f = amreVar.f(obj, bt);
        if (f == -1) {
            return null;
        }
        Object obj2 = amreVar.a[f];
        amreVar.k(f, bt);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return this.a.keySet();
    }
}
