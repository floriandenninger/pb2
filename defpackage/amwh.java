package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amwh extends amwq {
    private static final long serialVersionUID = 0;
    transient Set a;
    transient Collection b;

    public amwh(Map map, Object obj) {
        super(map, obj);
    }

    @Override // defpackage.amwq, java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // defpackage.amwq, java.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.g) {
            if (this.a == null) {
                this.a = new amwk(a().entrySet(), this.g);
            }
            set = this.a;
        }
        return set;
    }

    @Override // defpackage.amwq, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection af;
        synchronized (this.g) {
            Collection collection = (Collection) super.get(obj);
            af = collection == null ? null : amkq.af(collection, this.g);
        }
        return af;
    }

    @Override // defpackage.amwq, java.util.Map
    public final Collection values() {
        Collection collection;
        synchronized (this.g) {
            if (this.b == null) {
                this.b = new amwm(a().values(), this.g);
            }
            collection = this.b;
        }
        return collection;
    }
}
