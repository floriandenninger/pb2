package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ampw extends AbstractCollection {
    final /* synthetic */ ampx a;

    public ampw(ampx ampxVar) {
        this.a = ampxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ampx ampxVar = this.a;
        Map l = ampxVar.l();
        if (l != null) {
            return l.values().iterator();
        }
        return new ampr(ampxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
