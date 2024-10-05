package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amtd extends amte implements NavigableSet, amwg {
    final transient Comparator a;
    transient amtd b;

    public amtd(Comparator comparator) {
        this.a = comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amvt F(Comparator comparator) {
        if (amvb.a.equals(comparator)) {
            return amvt.c;
        }
        return new amvt(amru.q(), comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract amtd A(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final amtd subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        amkq.E(this.a.compare(obj, obj2) <= 0);
        return C(obj, z, obj2, z2);
    }

    public abstract amtd C(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final amtd tailSet(Object obj, boolean z) {
        obj.getClass();
        return E(obj, z);
    }

    public abstract amtd E(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public abstract amxd descendingIterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return amkq.bi(tailSet(obj, true), null);
    }

    @Override // java.util.SortedSet, defpackage.amwg
    public final Comparator comparator() {
        return this.a;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        amtd amtdVar = this.b;
        if (amtdVar != null) {
            return amtdVar;
        }
        amtd y = y();
        this.b = y;
        y.b = this;
        return y;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return listIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return amkq.aZ(headSet(obj, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return amkq.bi(tailSet(obj, false), null);
    }

    @Override // defpackage.amsx, defpackage.amrl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k */
    public abstract amxd listIterator();

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return amkq.aZ(headSet(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // defpackage.amsx, defpackage.amrl
    Object writeReplace() {
        return new amtc(this.a, toArray());
    }

    public abstract amtd y();

    @Override // java.util.NavigableSet
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final amtd headSet(Object obj, boolean z) {
        obj.getClass();
        return A(obj, z);
    }
}
