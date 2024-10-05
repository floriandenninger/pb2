package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class amuo extends AbstractMap {
    private transient Set a;
    private transient Set b;
    private transient Collection c;

    public abstract Set b();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set b = b();
        this.a = b;
        return b;
    }

    public Set g() {
        return new amul(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set g = g();
        this.b = g;
        return g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        amun amunVar = new amun(this);
        this.c = amunVar;
        return amunVar;
    }
}
