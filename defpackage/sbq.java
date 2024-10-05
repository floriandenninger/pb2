package defpackage;

import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sbq extends AbstractSequentialList implements List {
    public final sbo a;
    private final List b;

    public sbq(List list, sbo sboVar) {
        sbt.h(list);
        this.b = list;
        sbt.h(sboVar);
        this.a = sboVar;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new sbp(this, this.b.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
