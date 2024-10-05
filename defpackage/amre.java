package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amre extends AbstractMap implements Serializable, amph {
    transient Object[] a;
    transient Object[] b;
    transient int c;
    transient int d;
    public transient int e;
    public transient int[] f;
    public transient amph g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int[] k;
    private transient int l;
    private transient int[] m;
    private transient Set n;
    private transient Set o;
    private transient Set p;

    private amre(int i) {
        i(i);
    }

    public static amre g(int i) {
        return new amre(i);
    }

    private final int o(int i) {
        return i & (this.h.length - 1);
    }

    private final void p(int i, int i2) {
        amkq.E(i != -1);
        int o = o(i2);
        int[] iArr = this.h;
        int i3 = iArr[o];
        if (i3 == i) {
            int[] iArr2 = this.j;
            iArr[o] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.j[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                String valueOf = String.valueOf(this.a[i]);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            }
            if (i3 != i) {
                i4 = this.j[i3];
            } else {
                int[] iArr3 = this.j;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
        }
    }

    private final void q(int i, int i2) {
        amkq.E(i != -1);
        int o = o(i2);
        int[] iArr = this.i;
        int i3 = iArr[o];
        if (i3 == i) {
            int[] iArr2 = this.k;
            iArr[o] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.k[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                String valueOf = String.valueOf(this.b[i]);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Expected to find entry with value ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            }
            if (i3 != i) {
                i4 = this.k[i3];
            } else {
                int[] iArr3 = this.k;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
        }
    }

    private final void r(int i) {
        int length = this.j.length;
        if (length < i) {
            int f = amrk.f(length, i);
            this.a = Arrays.copyOf(this.a, f);
            this.b = Arrays.copyOf(this.b, f);
            this.j = x(this.j, f);
            this.k = x(this.k, f);
            this.m = x(this.m, f);
            this.f = x(this.f, f);
        }
        if (this.h.length < i) {
            int bu = amkq.bu(i);
            this.h = w(bu);
            this.i = w(bu);
            for (int i2 = 0; i2 < this.c; i2++) {
                int o = o(amkq.bt(this.a[i2]));
                int[] iArr = this.j;
                int[] iArr2 = this.h;
                iArr[i2] = iArr2[o];
                iArr2[o] = i2;
                int o2 = o(amkq.bt(this.b[i2]));
                int[] iArr3 = this.k;
                int[] iArr4 = this.i;
                iArr3[i2] = iArr4[o2];
                iArr4[o2] = i2;
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        i(16);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final void s(int i, int i2) {
        amkq.E(i != -1);
        int o = o(i2);
        int[] iArr = this.j;
        int[] iArr2 = this.h;
        iArr[i] = iArr2[o];
        iArr2[o] = i;
    }

    private final void t(int i, int i2) {
        amkq.E(i != -1);
        int o = o(i2);
        int[] iArr = this.k;
        int[] iArr2 = this.i;
        iArr[i] = iArr2[o];
        iArr2[o] = i;
    }

    private final void u(int i, int i2, int i3) {
        int i4;
        int i5;
        amkq.E(i != -1);
        p(i, i2);
        q(i, i3);
        v(this.m[i], this.f[i]);
        int i6 = this.c - 1;
        if (i6 != i) {
            int i7 = this.m[i6];
            int i8 = this.f[i6];
            v(i7, i);
            v(i, i8);
            Object[] objArr = this.a;
            Object obj = objArr[i6];
            Object[] objArr2 = this.b;
            Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int o = o(amkq.bt(obj));
            int[] iArr = this.h;
            int i9 = iArr[o];
            if (i9 == i6) {
                iArr[o] = i;
            } else {
                int i10 = this.j[i9];
                while (true) {
                    i4 = i9;
                    i9 = i10;
                    if (i9 == i6) {
                        break;
                    } else {
                        i10 = this.j[i9];
                    }
                }
                this.j[i4] = i;
            }
            int[] iArr2 = this.j;
            iArr2[i] = iArr2[i6];
            iArr2[i6] = -1;
            int o2 = o(amkq.bt(obj2));
            int[] iArr3 = this.i;
            int i11 = iArr3[o2];
            if (i11 == i6) {
                iArr3[o2] = i;
            } else {
                int i12 = this.k[i11];
                while (true) {
                    i5 = i11;
                    i11 = i12;
                    if (i11 == i6) {
                        break;
                    } else {
                        i12 = this.k[i11];
                    }
                }
                this.k[i5] = i;
            }
            int[] iArr4 = this.k;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
        }
        Object[] objArr3 = this.a;
        int i13 = this.c - 1;
        objArr3[i13] = null;
        this.b[i13] = null;
        this.c = i13;
        this.d++;
    }

    private static int[] w(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.c);
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private static int[] x(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    @Override // defpackage.amph
    public final amph a() {
        amph amphVar = this.g;
        if (amphVar != null) {
            return amphVar;
        }
        amqy amqyVar = new amqy(this);
        this.g = amqyVar;
        return amqyVar;
    }

    final int b(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[o(i)];
        while (i2 != -1) {
            if (amkq.b(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(Object obj) {
        return d(obj, amkq.bt(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, (Object) null);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, -1);
        Arrays.fill(this.j, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.m, 0, this.c, -1);
        Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.l = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return c(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return e(obj) != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(Object obj, int i) {
        return b(obj, i, this.h, this.j, this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e(Object obj) {
        return f(obj, amkq.bt(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.p;
        if (set != null) {
            return set;
        }
        amqx amqxVar = new amqx(this);
        this.p = amqxVar;
        return amqxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int f(Object obj, int i) {
        return b(obj, i, this.i, this.k, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int c = c(obj);
        if (c == -1) {
            return null;
        }
        return this.b[c];
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Set values() {
        Set set = this.o;
        if (set != null) {
            return set;
        }
        amrb amrbVar = new amrb(this);
        this.o = amrbVar;
        return amrbVar;
    }

    final void i(int i) {
        amkq.t(i, "expectedSize");
        int bu = amkq.bu(i);
        this.c = 0;
        this.a = new Object[i];
        this.b = new Object[i];
        this.h = w(bu);
        this.i = w(bu);
        this.j = w(i);
        this.k = w(i);
        this.e = -2;
        this.l = -2;
        this.m = w(i);
        this.f = w(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i, int i2) {
        u(i, i2, amkq.bt(this.b[i]));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(int i, int i2) {
        u(i, amkq.bt(this.a[i]), i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.n;
        if (set != null) {
            return set;
        }
        amra amraVar = new amra(this);
        this.n = amraVar;
        return amraVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object l(Object obj, Object obj2) {
        int bt = amkq.bt(obj);
        int f = f(obj, bt);
        if (f != -1) {
            Object obj3 = this.a[f];
            if (amkq.b(obj3, obj2)) {
                return obj2;
            }
            m(f, obj2);
            return obj3;
        }
        int i = this.l;
        int bt2 = amkq.bt(obj2);
        amkq.J(d(obj2, bt2) == -1, "Key already present: %s", obj2);
        r(this.c + 1);
        Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = obj2;
        this.b[i2] = obj;
        s(i2, bt2);
        t(this.c, bt);
        int i3 = i == -2 ? this.e : this.f[i];
        v(i, this.c);
        v(this.c, i3);
        this.c++;
        this.d++;
        return null;
    }

    public final void m(int i, Object obj) {
        amkq.E(i != -1);
        int d = d(obj, amkq.bt(obj));
        int i2 = this.l;
        if (d == -1) {
            if (i2 == i) {
                i2 = this.m[i];
            } else if (i2 == this.c) {
                i2 = d;
            }
            if (i == -2) {
                d = this.f[-2];
            } else if (this.c != -2) {
                d = -2;
            }
            v(this.m[i], this.f[i]);
            p(i, amkq.bt(this.a[i]));
            this.a[i] = obj;
            s(i, amkq.bt(obj));
            v(i2, i);
            v(i, d);
            return;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("Key already present in map: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void n(int i, Object obj) {
        amkq.E(i != -1);
        int bt = amkq.bt(obj);
        if (f(obj, bt) == -1) {
            q(i, amkq.bt(this.b[i]));
            this.b[i] = obj;
            t(i, bt);
        } else {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Value already present in map: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, defpackage.amph
    public final Object put(Object obj, Object obj2) {
        int bt = amkq.bt(obj);
        int d = d(obj, bt);
        if (d != -1) {
            Object obj3 = this.b[d];
            if (amkq.b(obj3, obj2)) {
                return obj2;
            }
            n(d, obj2);
            return obj3;
        }
        int bt2 = amkq.bt(obj2);
        amkq.J(f(obj2, bt2) == -1, "Value already present: %s", obj2);
        r(this.c + 1);
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        this.b[i] = obj2;
        s(i, bt);
        t(this.c, bt2);
        v(this.l, this.c);
        v(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int bt = amkq.bt(obj);
        int d = d(obj, bt);
        if (d == -1) {
            return null;
        }
        Object obj2 = this.b[d];
        j(d, bt);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    private final void v(int i, int i2) {
        if (i != -2) {
            this.f[i] = i2;
        } else {
            this.e = i2;
        }
        if (i2 == -2) {
            this.l = i;
        } else {
            this.m[i2] = i;
        }
    }
}
