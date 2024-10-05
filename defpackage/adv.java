package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adv implements Set {
    final /* synthetic */ adz a;

    public adv(adz adzVar) {
        this.a = adzVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        adz adzVar = this.a;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!adzVar.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i = 0;
        for (int i2 = this.a.j - 1; i2 >= 0; i2--) {
            Object f = this.a.f(i2);
            i += f == null ? 0 : f.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new adu(this.a);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int c = this.a.c(obj);
        if (c < 0) {
            return false;
        }
        this.a.g(c);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        adz adzVar = this.a;
        int i = adzVar.j;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            adzVar.remove(it.next());
        }
        return i != adzVar.j;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        adz adzVar = this.a;
        int i = adzVar.j;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(adzVar.f(i2))) {
                adzVar.g(i2);
            }
        }
        return i != adzVar.j;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.j;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        int i = this.a.j;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = this.a.f(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.a.a(objArr, 0);
    }
}
