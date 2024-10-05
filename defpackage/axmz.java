package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axmz extends AbstractList {
    private static final axna c = axna.d(axmz.class);
    final List a;
    final Iterator b;

    public axmz(List list, Iterator it) {
        this.a = list;
        this.b = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (this.a.size() > i) {
            return this.a.get(i);
        }
        if (this.b.hasNext()) {
            this.a.add(this.b.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new axmy(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        axna axnaVar = c;
        axnaVar.a("potentially expensive size() call");
        axnaVar.a("blowup running");
        while (this.b.hasNext()) {
            this.a.add(this.b.next());
        }
        return this.a.size();
    }
}
