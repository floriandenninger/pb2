package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aomr extends aolr implements RandomAccess, aonp, aopg {
    public static final aomr b;
    private double[] c;
    private int d;

    static {
        aomr aomrVar = new aomr(new double[0], 0);
        b = aomrVar;
        aomrVar.b();
    }

    public aomr() {
        this(new double[10], 0);
    }

    private final String g(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    private final void h(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        sb();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        double[] dArr = this.c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.c, i, dArr2, i + 1, this.d - i);
            this.c = dArr2;
        }
        this.c[i] = doubleValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.aolr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        sb();
        aonz.h(collection);
        if (!(collection instanceof aomr)) {
            return super.addAll(collection);
        }
        aomr aomrVar = (aomr) collection;
        int i = aomrVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.c;
            if (i3 > dArr.length) {
                this.c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(aomrVar.c, 0, this.c, this.d, aomrVar.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.aony
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aonp e(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new aomr(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aomr)) {
            return super.equals(obj);
        }
        aomr aomrVar = (aomr) obj;
        if (this.d != aomrVar.d) {
            return false;
        }
        double[] dArr = aomrVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Double.doubleToLongBits(this.c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final void f(double d) {
        sb();
        int i = this.d;
        double[] dArr = this.c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.c = dArr2;
        }
        double[] dArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        h(i);
        return Double.valueOf(this.c[i]);
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + aonz.c(Double.doubleToLongBits(this.c[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        sb();
        h(i);
        double[] dArr = this.c;
        double d = dArr[i];
        if (i < this.d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        sb();
        if (i2 >= i) {
            double[] dArr = this.c;
            System.arraycopy(dArr, i2, dArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        sb();
        h(i);
        double[] dArr = this.c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public aomr(double[] dArr, int i) {
        this.c = dArr;
        this.d = i;
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Double) obj).doubleValue());
        return true;
    }
}
