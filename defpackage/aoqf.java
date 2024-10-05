package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoqf extends AbstractList implements RandomAccess, aooj {
    public final aooj a;

    public aoqf(aooj aoojVar) {
        this.a = aoojVar;
    }

    @Override // defpackage.aooj
    public final aooj d() {
        return this;
    }

    @Override // defpackage.aooj
    public final Object f(int i) {
        return this.a.f(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((aooi) this.a).get(i);
    }

    @Override // defpackage.aooj
    public final List h() {
        return this.a.h();
    }

    @Override // defpackage.aooj
    public final void i(aomf aomfVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new aoqe(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new aoqd(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
