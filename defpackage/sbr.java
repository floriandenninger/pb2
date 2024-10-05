package defpackage;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sbr extends AbstractList implements List, RandomAccess {
    private final List a;
    private final sbo b;

    public sbr(List list, sbo sboVar) {
        sbt.h(list);
        this.a = list;
        sbt.h(sboVar);
        this.b = sboVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.a(this.a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
