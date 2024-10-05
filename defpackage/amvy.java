package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amvy extends amwe {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public amvy(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.amwe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final amxd iterator() {
        return new amvx(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) || this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int size = this.a.size();
        amxd listIterator = ((amwf) this.b).listIterator();
        while (listIterator.hasNext()) {
            if (!this.a.contains(listIterator.next())) {
                size++;
            }
        }
        return size;
    }
}
