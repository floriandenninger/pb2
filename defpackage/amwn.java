package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amwn extends amws implements Collection {
    private static final long serialVersionUID = 0;

    public amwn(Collection collection, Object obj) {
        super(collection, obj);
    }

    public Collection a() {
        return (Collection) this.f;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean add;
        synchronized (this.g) {
            add = a().add(obj);
        }
        return add;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.g) {
            addAll = a().addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.g) {
            a().clear();
        }
    }

    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.g) {
            contains = a().contains(obj);
        }
        return contains;
    }

    public boolean containsAll(Collection collection) {
        boolean containsAll;
        synchronized (this.g) {
            containsAll = a().containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.g) {
            isEmpty = a().isEmpty();
        }
        return isEmpty;
    }

    public Iterator iterator() {
        return a().iterator();
    }

    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.g) {
            remove = a().remove(obj);
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        boolean removeAll;
        synchronized (this.g) {
            removeAll = a().removeAll(collection);
        }
        return removeAll;
    }

    public boolean retainAll(Collection collection) {
        boolean retainAll;
        synchronized (this.g) {
            retainAll = a().retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.g) {
            size = a().size();
        }
        return size;
    }

    public Object[] toArray() {
        Object[] array;
        synchronized (this.g) {
            array = a().toArray();
        }
        return array;
    }

    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.g) {
            array = a().toArray(objArr);
        }
        return array;
    }
}
