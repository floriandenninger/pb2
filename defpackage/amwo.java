package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amwo extends amwn implements List {
    private static final long serialVersionUID = 0;

    public amwo(List list, Object obj) {
        super(list, obj);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        synchronized (this.g) {
            a().add(i, obj);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        boolean addAll;
        synchronized (this.g) {
            addAll = a().addAll(i, collection);
        }
        return addAll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.amwn
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List a() {
        return (List) super.a();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj == this) {
            return true;
        }
        synchronized (this.g) {
            equals = a().equals(obj);
        }
        return equals;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object obj;
        synchronized (this.g) {
            obj = a().get(i);
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int hashCode;
        synchronized (this.g) {
            hashCode = a().hashCode();
        }
        return hashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int indexOf;
        synchronized (this.g) {
            indexOf = a().indexOf(obj);
        }
        return indexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int lastIndexOf;
        synchronized (this.g) {
            lastIndexOf = a().lastIndexOf(obj);
        }
        return lastIndexOf;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return a().listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        Object remove;
        synchronized (this.g) {
            remove = a().remove(i);
        }
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        Object obj2;
        synchronized (this.g) {
            obj2 = a().set(i, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        List ag;
        synchronized (this.g) {
            ag = amkq.ag(a().subList(i, i2), this.g);
        }
        return ag;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return a().listIterator(i);
    }
}
