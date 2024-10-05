package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class amov extends ampc implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public amov(Map map) {
        amkq.E(map.isEmpty());
        this.a = map;
    }

    public abstract Collection a();

    public Collection b() {
        throw null;
    }

    public Collection c(Collection collection) {
        throw null;
    }

    public Collection d(Object obj, Collection collection) {
        throw null;
    }

    @Override // defpackage.amup
    public final int g() {
        return this.b;
    }

    @Override // defpackage.ampc
    public final Collection h() {
        return new ampb(this);
    }

    @Override // defpackage.ampc
    public final Iterator i() {
        return new amoj(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List j(Object obj, List list, amos amosVar) {
        if (list instanceof RandomAccess) {
            return new amoo(this, obj, list, amosVar);
        }
        return new amou(this, obj, list, amosVar);
    }

    @Override // defpackage.ampc
    public Map k() {
        return new amoi(this, this.a);
    }

    @Override // defpackage.ampc
    public Set l() {
        return new amol(this, this.a);
    }

    @Override // defpackage.amup
    public final void m() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.a.clear();
        this.b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(Map map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            amkq.E(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    @Override // defpackage.amup
    public final boolean o(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.ampc, defpackage.amup
    public final boolean p(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            Collection a = a();
            if (a.add(obj2)) {
                this.b++;
                this.a.put(obj, a);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (!collection.add(obj2)) {
            return false;
        }
        this.b++;
        return true;
    }
}
