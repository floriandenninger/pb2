package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amwk extends amwu {
    private static final long serialVersionUID = 0;

    public amwk(Set set, Object obj) {
        super(set, obj);
    }

    @Override // defpackage.amwn, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean contains;
        synchronized (this.g) {
            contains = !(obj instanceof Map.Entry) ? false : a().contains(amkq.aL((Map.Entry) obj));
        }
        return contains;
    }

    @Override // defpackage.amwn, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        boolean bG;
        synchronized (this.g) {
            bG = amkq.bG(a(), collection);
        }
        return bG;
    }

    @Override // defpackage.amwu, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean at;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            at = amkq.at(a(), obj);
        }
        return at;
    }

    @Override // defpackage.amwn, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new amwj(this, super.iterator());
    }

    @Override // defpackage.amwn, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this.g) {
            remove = !(obj instanceof Map.Entry) ? false : a().remove(amkq.aL((Map.Entry) obj));
        }
        return remove;
    }

    @Override // defpackage.amwn, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean be;
        synchronized (this.g) {
            be = amkq.be(a().iterator(), collection);
        }
        return be;
    }

    @Override // defpackage.amwn, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z;
        synchronized (this.g) {
            Iterator it = a().iterator();
            collection.getClass();
            z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.amwn, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr;
        synchronized (this.g) {
            Set a = a();
            objArr = new Object[a.size()];
            amkq.aD(a, objArr);
        }
        return objArr;
    }

    @Override // defpackage.amwn, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        synchronized (this.g) {
            Set a = a();
            int size = a.size();
            if (objArr.length < size) {
                objArr = amkq.ay(objArr, size);
            }
            amkq.aD(a, objArr);
            if (objArr.length > size) {
                objArr[size] = null;
            }
        }
        return objArr;
    }
}
