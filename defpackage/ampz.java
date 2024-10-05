package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ampz extends AbstractSet implements Serializable {
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;

    public ampz() {
        f(3);
    }

    private final int h() {
        return (1 << (this.b & 31)) - 1;
    }

    private final int i(int i, int i2, int i3, int i4) {
        Object bB = amkq.bB(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            amkq.bD(bB, i3 & i5, i4 + 1);
        }
        Object j = j();
        int[] l = l();
        for (int i6 = 0; i6 <= i; i6++) {
            int bz = amkq.bz(j, i6);
            while (bz != 0) {
                int i7 = bz - 1;
                int i8 = l[i7];
                int bv = amkq.bv(i8, i) | i6;
                int i9 = bv & i5;
                int bz2 = amkq.bz(bB, i9);
                amkq.bD(bB, i9, bz);
                l[i7] = amkq.bw(bv, bz2, i5);
                bz = i8 & i;
            }
        }
        this.c = bB;
        k(i5);
        return i5;
    }

    private final Object j() {
        Object obj = this.c;
        obj.getClass();
        return obj;
    }

    private final void k(int i) {
        this.b = amkq.bw(this.b, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private final int[] l() {
        int[] iArr = this.d;
        iArr.getClass();
        return iArr;
    }

    private final Object[] m() {
        Object[] objArr = this.a;
        objArr.getClass();
        return objArr;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid size: ");
            sb.append(readInt);
            throw new InvalidObjectException(sb.toString());
        }
        f(readInt);
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int min;
        if (g()) {
            amkq.O(g(), "Arrays already allocated");
            int i = this.b;
            int bA = amkq.bA(i);
            this.c = amkq.bB(bA);
            k(bA - 1);
            this.d = new int[i];
            this.a = new Object[i];
        }
        Set d = d();
        if (d != null) {
            return d.add(obj);
        }
        int[] l = l();
        Object[] m = m();
        int i2 = this.e;
        int i3 = i2 + 1;
        int bt = amkq.bt(obj);
        int h = h();
        int i4 = bt & h;
        int bz = amkq.bz(j(), i4);
        if (bz != 0) {
            int bv = amkq.bv(bt, h);
            int i5 = 0;
            while (true) {
                int i6 = bz - 1;
                int i7 = l[i6];
                if (amkq.bv(i7, h) == bv && amkq.b(obj, m[i6])) {
                    return false;
                }
                int i8 = i7 & h;
                i5++;
                if (i8 != 0) {
                    bz = i8;
                } else {
                    if (i5 >= 9) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet(h() + 1, 1.0f);
                        int a = a();
                        while (a >= 0) {
                            linkedHashSet.add(c(a));
                            a = b(a);
                        }
                        this.c = linkedHashSet;
                        this.d = null;
                        this.a = null;
                        e();
                        return linkedHashSet.add(obj);
                    }
                    if (i3 > h) {
                        h = i(h, amkq.bx(h), bt, i2);
                    } else {
                        l[i6] = amkq.bw(i7, i3, h);
                    }
                }
            }
        } else if (i3 > h) {
            h = i(h, amkq.bx(h), bt, i2);
        } else {
            amkq.bD(j(), i4, i3);
        }
        int length = l().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.d = Arrays.copyOf(l(), min);
            this.a = Arrays.copyOf(m(), min);
        }
        l()[i2] = amkq.bw(bt, 0, h);
        m()[i2] = obj;
        this.e = i3;
        e();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.e) {
            return i2;
        }
        return -1;
    }

    public final Object c(int i) {
        return m()[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (g()) {
            return;
        }
        e();
        Set d = d();
        if (d != null) {
            this.b = anaf.ak(size(), 3);
            d.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        Arrays.fill(m(), 0, this.e, (Object) null);
        amkq.bC(j());
        Arrays.fill(l(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (g()) {
            return false;
        }
        Set d = d();
        if (d != null) {
            return d.contains(obj);
        }
        int bt = amkq.bt(obj);
        int h = h();
        int bz = amkq.bz(j(), bt & h);
        if (bz == 0) {
            return false;
        }
        int bv = amkq.bv(bt, h);
        do {
            int i = bz - 1;
            int i2 = l()[i];
            if (amkq.bv(i2, h) == bv && amkq.b(obj, c(i))) {
                return true;
            }
            bz = i2 & h;
        } while (bz != 0);
        return false;
    }

    final Set d() {
        Object obj = this.c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    final void e() {
        this.b += 32;
    }

    final void f(int i) {
        amkq.F(true, "Expected size must be >= 0");
        this.b = anaf.ak(i, 1);
    }

    final boolean g() {
        return this.c == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set d = d();
        if (d != null) {
            return d.iterator();
        }
        return new ampy(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        int i2;
        if (g()) {
            return false;
        }
        Set d = d();
        if (d != null) {
            return d.remove(obj);
        }
        int h = h();
        int by = amkq.by(obj, null, h, j(), l(), m(), null);
        if (by == -1) {
            return false;
        }
        Object j = j();
        int[] l = l();
        Object[] m = m();
        int size = size() - 1;
        if (by < size) {
            Object obj2 = m[size];
            m[by] = obj2;
            m[size] = null;
            l[by] = l[size];
            l[size] = 0;
            int bt = amkq.bt(obj2) & h;
            int bz = amkq.bz(j, bt);
            int i3 = size + 1;
            if (bz != i3) {
                while (true) {
                    i = bz - 1;
                    i2 = l[i];
                    int i4 = i2 & h;
                    if (i4 == i3) {
                        break;
                    }
                    bz = i4;
                }
                l[i] = amkq.bw(i2, by + 1, h);
            } else {
                amkq.bD(j, bt, by + 1);
            }
        } else {
            m[by] = null;
            l[by] = 0;
        }
        this.e--;
        e();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set d = d();
        return d != null ? d.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        if (g()) {
            return new Object[0];
        }
        Set d = d();
        return d != null ? d.toArray() : Arrays.copyOf(m(), this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (g()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set d = d();
        if (d != null) {
            return d.toArray(objArr);
        }
        Object[] m = m();
        int i = this.e;
        amkq.M(0, i, m.length);
        int length = objArr.length;
        if (length < i) {
            objArr = amkq.ay(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(m, 0, objArr, 0, i);
        return objArr;
    }
}
