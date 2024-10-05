package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ampx extends AbstractMap implements Serializable {
    public static final Object a = new Object();
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    public ampx() {
        n(3);
    }

    public static ampx e() {
        return new ampx();
    }

    public static ampx f(int i) {
        return new ampx(i);
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
        n(readInt);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final int u(int i, int i2, int i3, int i4) {
        Object bB = amkq.bB(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            amkq.bD(bB, i3 & i5, i4 + 1);
        }
        Object i6 = i();
        int[] r = r();
        for (int i7 = 0; i7 <= i; i7++) {
            int bz = amkq.bz(i6, i7);
            while (bz != 0) {
                int i8 = bz - 1;
                int i9 = r[i8];
                int bv = amkq.bv(i9, i) | i7;
                int i10 = bv & i5;
                int bz2 = amkq.bz(bB, i10);
                amkq.bD(bB, i10, bz);
                r[i8] = amkq.bw(bv, bz2, i5);
                bz = i9 & i;
            }
        }
        this.g = bB;
        v(i5);
        return i5;
    }

    private final void v(int i) {
        this.e = amkq.bw(this.e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator k = k();
        while (k.hasNext()) {
            Map.Entry entry = (Map.Entry) k.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    public final int c() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (q()) {
            return;
        }
        m();
        Map l = l();
        if (l != null) {
            this.e = anaf.ak(size(), 3);
            l.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(s(), 0, this.f, (Object) null);
        Arrays.fill(t(), 0, this.f, (Object) null);
        amkq.bC(i());
        Arrays.fill(r(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map l = l();
        if (l != null) {
            return l.containsKey(obj);
        }
        return d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map l = l();
        if (l != null) {
            return l.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (amkq.b(obj, j(i))) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (q()) {
            return -1;
        }
        int bt = amkq.bt(obj);
        int c = c();
        int bz = amkq.bz(i(), bt & c);
        if (bz == 0) {
            return -1;
        }
        int bv = amkq.bv(bt, c);
        do {
            int i = bz - 1;
            int i2 = r()[i];
            if (amkq.bv(i2, c) == bv && amkq.b(obj, g(i))) {
                return i;
            }
            bz = i2 & c;
        } while (bz != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.i;
        if (set != null) {
            return set;
        }
        amps ampsVar = new amps(this);
        this.i = ampsVar;
        return ampsVar;
    }

    public final Object g(int i) {
        return s()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map l = l();
        if (l != null) {
            return l.get(obj);
        }
        int d = d(obj);
        if (d == -1) {
            return null;
        }
        return j(d);
    }

    public final Object h(Object obj) {
        if (q()) {
            return a;
        }
        int c = c();
        int by = amkq.by(obj, null, c, i(), r(), s(), null);
        if (by == -1) {
            return a;
        }
        Object j = j(by);
        o(by, c);
        this.f--;
        m();
        return j;
    }

    public final Object i() {
        Object obj = this.g;
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(int i) {
        return t()[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator k() {
        Map l = l();
        if (l != null) {
            return l.entrySet().iterator();
        }
        return new ampq(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        ampu ampuVar = new ampu(this);
        this.h = ampuVar;
        return ampuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map l() {
        Object obj = this.g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        this.e += 32;
    }

    final void n(int i) {
        amkq.F(true, "Expected size must be >= 0");
        this.e = anaf.ak(i, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(int i, int i2) {
        Object i3 = i();
        int[] r = r();
        Object[] s = s();
        Object[] t = t();
        int size = size() - 1;
        if (i < size) {
            Object obj = s[size];
            s[i] = obj;
            t[i] = t[size];
            s[size] = null;
            t[size] = null;
            r[i] = r[size];
            r[size] = 0;
            int bt = amkq.bt(obj) & i2;
            int bz = amkq.bz(i3, bt);
            int i4 = size + 1;
            if (bz == i4) {
                amkq.bD(i3, bt, i + 1);
                return;
            }
            while (true) {
                int i5 = bz - 1;
                int i6 = r[i5];
                int i7 = i6 & i2;
                if (i7 == i4) {
                    r[i5] = amkq.bw(i6, i + 1, i2);
                    return;
                }
                bz = i7;
            }
        } else {
            s[i] = null;
            t[i] = null;
            r[i] = 0;
        }
    }

    public final void p(int i, Object obj) {
        t()[i] = obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (q()) {
            amkq.O(q(), "Arrays already allocated");
            int i = this.e;
            int bA = amkq.bA(i);
            this.g = amkq.bB(bA);
            v(bA - 1);
            this.b = new int[i];
            this.c = new Object[i];
            this.d = new Object[i];
        }
        Map l = l();
        if (l != null) {
            return l.put(obj, obj2);
        }
        int[] r = r();
        Object[] s = s();
        Object[] t = t();
        int i2 = this.f;
        int i3 = i2 + 1;
        int bt = amkq.bt(obj);
        int c = c();
        int i4 = bt & c;
        int bz = amkq.bz(i(), i4);
        if (bz != 0) {
            int bv = amkq.bv(bt, c);
            int i5 = 0;
            while (true) {
                int i6 = bz - 1;
                int i7 = r[i6];
                if (amkq.bv(i7, c) == bv && amkq.b(obj, s[i6])) {
                    Object obj3 = t[i6];
                    t[i6] = obj2;
                    return obj3;
                }
                int i8 = i7 & c;
                i5++;
                if (i8 != 0) {
                    bz = i8;
                } else {
                    if (i5 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(c() + 1, 1.0f);
                        int a2 = a();
                        while (a2 >= 0) {
                            linkedHashMap.put(g(a2), j(a2));
                            a2 = b(a2);
                        }
                        this.g = linkedHashMap;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        m();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i3 > c) {
                        c = u(c, amkq.bx(c), bt, i2);
                    } else {
                        r[i6] = amkq.bw(i7, i3, c);
                    }
                }
            }
        } else if (i3 > c) {
            c = u(c, amkq.bx(c), bt, i2);
        } else {
            amkq.bD(i(), i4, i3);
        }
        int length = r().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.b = Arrays.copyOf(r(), min);
            this.c = Arrays.copyOf(s(), min);
            this.d = Arrays.copyOf(t(), min);
        }
        r()[i2] = amkq.bw(bt, 0, c);
        s()[i2] = obj;
        p(i2, obj2);
        this.f = i3;
        m();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q() {
        return this.g == null;
    }

    public final int[] r() {
        int[] iArr = this.b;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map l = l();
        if (l != null) {
            return l.remove(obj);
        }
        Object h = h(obj);
        if (h == a) {
            return null;
        }
        return h;
    }

    public final Object[] s() {
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map l = l();
        return l != null ? l.size() : this.f;
    }

    public final Object[] t() {
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.j;
        if (collection != null) {
            return collection;
        }
        ampw ampwVar = new ampw(this);
        this.j = ampwVar;
        return ampwVar;
    }

    public ampx(int i) {
        n(i);
    }
}
