package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ampu extends AbstractSet {
    final /* synthetic */ ampx a;

    public ampu(ampx ampxVar) {
        this.a = ampxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ampx ampxVar = this.a;
        Map l = ampxVar.l();
        if (l != null) {
            return l.keySet().iterator();
        }
        return new ampp(ampxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map l = this.a.l();
        if (l != null) {
            return l.keySet().remove(obj);
        }
        return this.a.h(obj) != ampx.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
