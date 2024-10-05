package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ampd extends AbstractCollection implements amuw {
    private transient Set a;
    private transient Set b;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        f(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection instanceof amuw) {
            amuw amuwVar = (amuw) collection;
            if (amuwVar instanceof amoz) {
                amoz amozVar = (amoz) amuwVar;
                if (!amozVar.isEmpty()) {
                    for (int a = amozVar.a.a(); a >= 0; a = amozVar.a.e(a)) {
                        f(amozVar.a.g(a), amozVar.a.c(a));
                    }
                    return true;
                }
            } else if (!amuwVar.isEmpty()) {
                for (amux amuxVar : amuwVar.j()) {
                    f(amuxVar.a, amuxVar.a());
                }
                return true;
            }
        } else if (!collection.isEmpty()) {
            return amkq.bd(this, collection.iterator());
        }
        return false;
    }

    public abstract int b();

    public int c(Object obj, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.amuw
    public final boolean contains(Object obj) {
        return a(obj) > 0;
    }

    public abstract Iterator d();

    public abstract Iterator e();

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return amkq.aE(this, obj);
    }

    public void f(Object obj, int i) {
        throw null;
    }

    public boolean h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return j().hashCode();
    }

    @Override // defpackage.amuw
    public final Set i() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        amuy amuyVar = new amuy(this);
        this.a = amuyVar;
        return amuyVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return j().isEmpty();
    }

    @Override // defpackage.amuw
    public final Set j() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        amuz amuzVar = new amuz(this);
        this.b = amuzVar;
        return amuzVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.amuw
    public final boolean remove(Object obj) {
        return c(obj, 1) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof amuw) {
            collection = ((amuw) collection).i();
        }
        return i().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof amuw) {
            collection = ((amuw) collection).i();
        }
        return i().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }
}
