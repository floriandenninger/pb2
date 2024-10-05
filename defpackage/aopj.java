package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aopj extends aolr implements RandomAccess {
    public static final aopj b;
    private Object[] c;
    private int d;

    static {
        aopj aopjVar = new aopj(new Object[0], 0);
        b = aopjVar;
        aopjVar.b();
    }

    public aopj() {
        this(new Object[10], 0);
    }

    private final String d(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    private final void f(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(d(i));
        }
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        sb();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(d(i));
        }
        Object[] objArr = this.c;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.c, i, objArr2, i + 1, this.d - i);
            this.c = objArr2;
        }
        this.c[i] = obj;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.aony
    public final /* bridge */ /* synthetic */ aony e(int i) {
        if (i < this.d) {
            throw new IllegalArgumentException();
        }
        return new aopj(Arrays.copyOf(this.c, i), this.d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f(i);
        return this.c[i];
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        sb();
        f(i);
        Object[] objArr = this.c;
        Object obj = objArr[i];
        if (i < this.d - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return obj;
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        sb();
        f(i);
        Object[] objArr = this.c;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private aopj(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.aolr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        sb();
        int i = this.d;
        Object[] objArr = this.c;
        if (i == objArr.length) {
            this.c = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
