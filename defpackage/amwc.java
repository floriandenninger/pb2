package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amwc extends amwe {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;

    public amwc(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.amwe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final amxd iterator() {
        return new amwb(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj) && !this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.containsAll(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!this.b.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
