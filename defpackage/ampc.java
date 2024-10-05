package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ampc implements amup {
    private transient Set a;
    private transient Collection b;
    private transient Map c;

    @Override // defpackage.amup
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amup) {
            return r().equals(((amup) obj).r());
        }
        return false;
    }

    public abstract Collection h();

    @Override // defpackage.amup
    public final int hashCode() {
        return r().hashCode();
    }

    public Iterator i() {
        throw null;
    }

    public abstract Map k();

    public abstract Set l();

    @Override // defpackage.amup
    public boolean p(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.amup
    public Collection q() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        Collection h = h();
        this.b = h;
        return h;
    }

    @Override // defpackage.amup
    public Map r() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        Map k = k();
        this.c = k;
        return k;
    }

    @Override // defpackage.amup
    public Set s() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set l = l();
        this.a = l;
        return l;
    }

    public boolean t(Object obj) {
        Iterator it = r().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return r().toString();
    }
}
