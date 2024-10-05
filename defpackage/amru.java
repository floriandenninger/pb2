package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amru extends amrl implements List, RandomAccess {
    private static final amxe a = new amrq(amvj.a, 0);

    @SafeVarargs
    public static amru A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        amkq.F(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        return F(objArr2);
    }

    public static amru B(Iterable iterable) {
        Comparable[] comparableArr = (Comparable[]) amkq.bp(iterable, new Comparable[0]);
        amkq.aB(comparableArr);
        Arrays.sort(comparableArr);
        return i(comparableArr);
    }

    public static amru C(Comparator comparator, Iterable iterable) {
        comparator.getClass();
        Object[] bn = amkq.bn(iterable);
        amkq.aB(bn);
        Arrays.sort(bn, comparator);
        return i(bn);
    }

    private static amru F(Object... objArr) {
        amkq.aB(objArr);
        return i(objArr);
    }

    public static amrp f() {
        return new amrp();
    }

    public static amrp h(int i) {
        amkq.t(i, "expectedSize");
        return new amrp(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amru i(Object[] objArr) {
        return j(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static amru j(Object[] objArr, int i) {
        if (i == 0) {
            return amvj.a;
        }
        return new amvj(objArr, i);
    }

    public static amru n(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return amvj.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return r(next);
        }
        amrp amrpVar = new amrp();
        amrpVar.h(next);
        amrpVar.k(it);
        return amrpVar.g();
    }

    public static amru o(Collection collection) {
        if (collection instanceof amrl) {
            amru g = ((amrl) collection).g();
            return g.l() ? i(g.toArray()) : g;
        }
        return F(collection.toArray());
    }

    public static amru p(Object[] objArr) {
        if (objArr.length == 0) {
            return amvj.a;
        }
        return F((Object[]) objArr.clone());
    }

    public static amru q() {
        return amvj.a;
    }

    public static amru r(Object obj) {
        return F(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static amru s(Object obj, Object obj2) {
        return F(obj, obj2);
    }

    public static amru t(Object obj, Object obj2, Object obj3) {
        return F(obj, obj2, obj3);
    }

    public static amru u(Object obj, Object obj2, Object obj3, Object obj4) {
        return F(obj, obj2, obj3, obj4);
    }

    public static amru v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return F(obj, obj2, obj3, obj4, obj5);
    }

    public static amru w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return F(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static amru x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return F(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static amru y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return F(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public static amru z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return F(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // java.util.List
    /* renamed from: D, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final amxe listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final amxe listIterator(int i) {
        amkq.W(i, size());
        return isEmpty() ? a : new amrq(this, i);
    }

    public amru a() {
        return size() <= 1 ? this : new amrr(this);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amrl
    public int b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public amru subList(int i, int i2) {
        amkq.M(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 != 0) {
            return new amrt(this, i, i3);
        }
        return amvj.a;
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return amkq.aV(this, obj);
    }

    @Override // defpackage.amrl
    @Deprecated
    public final amru g() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.amrl
    /* renamed from: k */
    public final amxd listIterator() {
        return iterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.amrl
    Object writeReplace() {
        return new amrs(toArray());
    }
}
