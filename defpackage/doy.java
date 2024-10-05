package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class doy implements Set {
    private static final Integer a = 0;
    private static final Object[] b = new Object[0];
    private final aeg c = new aeg();

    public final Object a(int i) {
        return this.c.f(i);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.c.put(obj, a) == null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.c.j(size() + collection.size());
        boolean z = false;
        if (collection instanceof doy) {
            int size = size();
            this.c.k(((doy) collection).c);
            return size() != size;
        }
        if (!(collection instanceof List) || !(collection instanceof RandomAccess)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= add(it.next());
            }
            return z;
        }
        List list = (List) collection;
        int size2 = list.size();
        boolean z2 = false;
        for (int i = 0; i < size2; i++) {
            z2 |= add(list.get(i));
        }
        return z2;
    }

    public final void b(int i) {
        this.c.f(i);
        this.c.g(i);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.c.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (!(collection instanceof List) || !(collection instanceof RandomAccess)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }
        List list = (List) collection;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!contains(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            try {
                int size = size();
                for (int i = 0; i < size; i++) {
                    if (!set.contains(a(i))) {
                        return false;
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object a2 = a(i2);
            if (a2 != null) {
                i += a2.hashCode();
            }
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new dox(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int c = this.c.c(obj);
        if (c < 0) {
            return false;
        }
        b(c);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = 0;
        if (!(collection instanceof List) || !(collection instanceof RandomAccess)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                i |= remove(it.next()) ? 1 : 0;
            }
            return i;
        }
        List list = (List) collection;
        int size = list.size();
        boolean z = false;
        while (i < size) {
            z |= remove(list.get(i));
            i++;
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(a(size))) {
                b(size);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.c.j;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        int i = this.c.j;
        if (i == 0) {
            return b;
        }
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = this.c.f(i2);
        }
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        int size = size();
        StringBuilder sb = new StringBuilder(size * 14);
        sb.append('{');
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object a2 = a(i);
            if (a2 != this) {
                sb.append(a2);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            objArr[i] = a(i);
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }
}
