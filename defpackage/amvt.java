package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amvt extends amtd {
    static final amvt c = new amvt(amru.q(), amvb.a);
    final transient amru d;

    public amvt(amru amruVar, Comparator comparator) {
        super(comparator);
        this.d = amruVar;
    }

    @Override // defpackage.amtd
    public final amtd A(Object obj, boolean z) {
        return J(0, H(obj, z));
    }

    @Override // defpackage.amtd
    public final amtd C(Object obj, boolean z, Object obj2, boolean z2) {
        return E(obj, z).A(obj2, z2);
    }

    @Override // defpackage.amtd
    public final amtd E(Object obj, boolean z) {
        return J(I(obj, z), size());
    }

    @Override // defpackage.amtd, java.util.NavigableSet
    /* renamed from: G */
    public final amxd descendingIterator() {
        return this.d.a().iterator();
    }

    final int H(Object obj, boolean z) {
        amru amruVar = this.d;
        obj.getClass();
        int binarySearch = Collections.binarySearch(amruVar, obj, ((amtd) this).a);
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : binarySearch ^ (-1);
    }

    final int I(Object obj, boolean z) {
        amru amruVar = this.d;
        obj.getClass();
        int binarySearch = Collections.binarySearch(amruVar, obj, ((amtd) this).a);
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : binarySearch ^ (-1);
    }

    final amvt J(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i < i2) {
            return new amvt(this.d.subList(i, i2), this.a);
        }
        return F(this.a);
    }

    @Override // defpackage.amrl
    public final int b(Object[] objArr, int i) {
        return this.d.b(objArr, i);
    }

    @Override // defpackage.amtd, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int I = I(obj, true);
        if (I == size()) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.d, obj, this.a) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof amuw) {
            collection = ((amuw) collection).i();
        }
        if (!amkq.aj(((amtd) this).a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        amxd listIterator = listIterator();
        Iterator it = collection.iterator();
        if (!listIterator.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = listIterator.next();
        while (true) {
            try {
                int c2 = c(next2, next);
                if (c2 >= 0) {
                    if (c2 != 0) {
                        break;
                    }
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else {
                    if (!listIterator.hasNext()) {
                        return false;
                    }
                    next2 = listIterator.next();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.amrl
    public final int d() {
        return this.d.d();
    }

    @Override // defpackage.amrl
    public final int e() {
        return this.d.e();
    }

    @Override // defpackage.amsx, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (amkq.aj(this.a, set)) {
            Iterator it = set.iterator();
            try {
                amxd listIterator = listIterator();
                while (listIterator.hasNext()) {
                    Object next = listIterator.next();
                    Object next2 = it.next();
                    if (next2 == null || c(next, next2) != 0) {
                        return false;
                    }
                }
                return true;
            } catch (ClassCastException | NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // defpackage.amtd, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.amtd, java.util.NavigableSet
    public final Object floor(Object obj) {
        int H = H(obj, true) - 1;
        if (H == -1) {
            return null;
        }
        return this.d.get(H);
    }

    @Override // defpackage.amsx, defpackage.amrl
    public final amru g() {
        return this.d;
    }

    @Override // defpackage.amtd, java.util.NavigableSet
    public final Object higher(Object obj) {
        int I = I(obj, false);
        if (I == size()) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.amtd, defpackage.amsx, defpackage.amrl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public final amxd listIterator() {
        return this.d.iterator();
    }

    @Override // defpackage.amrl
    public final boolean l() {
        return this.d.l();
    }

    @Override // defpackage.amtd, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.amtd, java.util.NavigableSet
    public final Object lower(Object obj) {
        int H = H(obj, false) - 1;
        if (H == -1) {
            return null;
        }
        return this.d.get(H);
    }

    @Override // defpackage.amrl
    public final Object[] m() {
        return this.d.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.amtd
    public final amtd y() {
        Comparator reverseOrder = Collections.reverseOrder(this.a);
        if (isEmpty()) {
            return F(reverseOrder);
        }
        return new amvt(this.d.a(), reverseOrder);
    }
}
