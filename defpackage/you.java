package defpackage;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class you extends AbstractList implements yor {
    public final List b;
    public final yot c;

    /* JADX INFO: Access modifiers changed from: protected */
    public you(List list, yot yotVar) {
        this.b = list;
        this.c = yotVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        this.b.add(i, obj);
        Iterator it = this.c.a.iterator();
        while (it.hasNext()) {
            ((yoq) it.next()).pe(i, 1);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        collection.getClass();
        boolean addAll = this.b.addAll(i, collection);
        if (addAll) {
            this.c.b(i, collection.size());
        }
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.b.isEmpty()) {
            return;
        }
        int size = this.b.size();
        this.b.clear();
        this.c.c(0, size);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.b.indexOf(obj) >= 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.get(i);
    }

    public void h(int i, int i2) {
        throw null;
    }

    public final void i(yoq yoqVar) {
        this.c.e(yoqVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    public final void j(yoq yoqVar) {
        this.c.f(yoqVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        Object remove = this.b.remove(i);
        this.c.d(i);
        return remove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.b.set(i, obj);
        this.c.a(i, 1);
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        return this.b.subList(i, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
