package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ampb extends AbstractCollection {
    final /* synthetic */ ampc a;

    public ampb(ampc ampcVar) {
        this.a = ampcVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.t(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.a.i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.g();
    }
}
