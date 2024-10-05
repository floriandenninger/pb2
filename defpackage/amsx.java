package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amsx extends amrl implements Set {
    private transient amru a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i) {
        double d;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
                d = highestOneBit;
                Double.isNaN(d);
            } while (d * 0.7d < max);
            return highestOneBit;
        }
        amkq.F(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static amsv i() {
        return new amsv();
    }

    public static amsv j(int i) {
        amkq.t(i, "expectedSize");
        return new amsv(i);
    }

    public static amsx o(Iterable iterable) {
        if (iterable instanceof Collection) {
            return p((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return amvs.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return r(next);
        }
        amsv amsvVar = new amsv();
        amsvVar.c(next);
        amsvVar.k(it);
        return amsvVar.g();
    }

    public static amsx p(Collection collection) {
        if ((collection instanceof amsx) && !(collection instanceof SortedSet)) {
            amsx amsxVar = (amsx) collection;
            if (!amsxVar.l()) {
                return amsxVar;
            }
        }
        Object[] array = collection.toArray();
        return n(array.length, array);
    }

    public static amsx q(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return amvs.a;
        }
        if (length == 1) {
            return r(objArr[0]);
        }
        return n(length, (Object[]) objArr.clone());
    }

    public static amsx r(Object obj) {
        return new amwf(obj);
    }

    public static amsx s(Object obj, Object obj2) {
        return n(2, obj, obj2);
    }

    public static amsx t(Object obj, Object obj2, Object obj3) {
        return n(3, obj, obj2, obj3);
    }

    public static amsx u(Object obj, Object obj2, Object obj3, Object obj4) {
        return n(4, obj, obj2, obj3, obj4);
    }

    public static amsx v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return n(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static amsx w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        amkq.F(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return n(i, objArr2);
    }

    public static boolean x(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public boolean a() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof amsx) && a() && ((amsx) obj).a() && hashCode() != obj.hashCode()) {
            return false;
        }
        return amkq.at(this, obj);
    }

    @Override // defpackage.amrl
    public amru g() {
        amru amruVar = this.a;
        if (amruVar != null) {
            return amruVar;
        }
        amru h = h();
        this.a = h;
        return h;
    }

    public amru h() {
        return amru.i(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return amkq.ak(this);
    }

    @Override // defpackage.amrl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract amxd listIterator();

    @Override // defpackage.amrl
    Object writeReplace() {
        return new amsw(toArray());
    }

    public static amsx n(int i, Object... objArr) {
        if (i == 0) {
            return amvs.a;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return r(obj);
        }
        int f = f(i);
        Object[] objArr2 = new Object[f];
        int i2 = f - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            amkq.aA(obj2, i5);
            int hashCode = obj2.hashCode();
            int bs = amkq.bs(hashCode);
            while (true) {
                int i6 = bs & i2;
                Object obj3 = objArr2[i6];
                if (obj3 != null) {
                    if (obj3.equals(obj2)) {
                        break;
                    }
                    bs++;
                } else {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new amwf(obj4, i3);
        }
        if (f(i4) < f / 2) {
            return n(i4, objArr);
        }
        if (x(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new amvs(objArr, i3, objArr2, i2, i4);
    }
}
