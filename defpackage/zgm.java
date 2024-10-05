package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zgm extends AbstractSet {
    final /* synthetic */ zgt a;

    public zgm(zgt zgtVar) {
        this.a = zgtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zgr b;
        if (!(obj instanceof Map.Entry) || (b = this.a.b(((Map.Entry) obj).getKey())) == null) {
            return false;
        }
        if (b.get() != null || b.b) {
            return obj.equals(b);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zgs(this.a, new zgl());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.a.remove(((Map.Entry) obj).getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
