package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zgp extends AbstractCollection {
    final /* synthetic */ zgt a;

    public zgp(zgt zgtVar) {
        this.a = zgtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new zgs(this.a, new zgo(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
