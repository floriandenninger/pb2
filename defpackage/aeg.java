package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aeg {
    static Object[] d;
    static int e;
    static Object[] f;
    static int g;
    int[] h;
    Object[] i;
    public int j;

    public aeg() {
        this.h = aec.a;
        this.i = aec.c;
        this.j = 0;
    }

    public aeg(int i) {
        if (i == 0) {
            this.h = aec.a;
            this.i = aec.c;
        } else {
            l(i);
        }
        this.j = 0;
    }

    private static int a(int[] iArr, int i, int i2) {
        try {
            return aec.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private final void l(int i) {
        if (i == 8) {
            synchronized (aeg.class) {
                Object[] objArr = f;
                if (objArr != null) {
                    this.i = objArr;
                    f = (Object[]) objArr[0];
                    this.h = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (aeg.class) {
                Object[] objArr2 = d;
                if (objArr2 != null) {
                    this.i = objArr2;
                    d = (Object[]) objArr2[0];
                    this.h = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    e--;
                    return;
                }
                i = 4;
            }
        }
        this.h = new int[i];
        this.i = new Object[i + i];
    }

    private static void m(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (aeg.class) {
                if (g < 10) {
                    objArr[0] = f;
                    objArr[1] = iArr;
                    int i2 = i + i;
                    while (true) {
                        i2--;
                        if (i2 < 2) {
                            break;
                        } else {
                            objArr[i2] = null;
                        }
                    }
                    f = objArr;
                    g++;
                }
            }
            return;
        }
        if (length == 4) {
            synchronized (aeg.class) {
                if (e < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    int i3 = i + i;
                    while (true) {
                        i3--;
                        if (i3 < 2) {
                            break;
                        } else {
                            objArr[i3] = null;
                        }
                    }
                    d = objArr;
                    e++;
                }
            }
        }
    }

    final int b(Object obj, int i) {
        int i2 = this.j;
        if (i2 == 0) {
            return -1;
        }
        int a = a(this.h, i2, i);
        if (a < 0 || obj.equals(this.i[a + a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.h[i3] == i) {
            if (obj.equals(this.i[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.h[i4] == i; i4--) {
            if (obj.equals(this.i[i4 + i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj, obj.hashCode());
    }

    public void clear() {
        int i = this.j;
        if (i > 0) {
            int[] iArr = this.h;
            Object[] objArr = this.i;
            this.h = aec.a;
            this.i = aec.c;
            this.j = 0;
            m(iArr, objArr, i);
        }
        if (this.j > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return e(obj) >= 0;
    }

    final int d() {
        int i = this.j;
        if (i == 0) {
            return -1;
        }
        int a = a(this.h, i, 0);
        if (a < 0 || this.i[a + a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.h[i2] == 0) {
            if (this.i[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.h[i3] == 0; i3--) {
            if (this.i[i3 + i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aeg) {
            aeg aegVar = (aeg) obj;
            if (this.j != aegVar.j) {
                return false;
            }
            for (int i = 0; i < this.j; i++) {
                Object f2 = f(i);
                Object i2 = i(i);
                Object obj2 = aegVar.get(f2);
                if (i2 == null) {
                    if (obj2 != null || !aegVar.containsKey(f2)) {
                        return false;
                    }
                } else if (!i2.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.j == map.size()) {
                for (int i3 = 0; i3 < this.j; i3++) {
                    Object f3 = f(i3);
                    Object i4 = i(i3);
                    Object obj3 = map.get(f3);
                    if (i4 == null) {
                        if (obj3 != null || !map.containsKey(f3)) {
                            return false;
                        }
                    } else if (!i4.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Object f(int i) {
        return this.i[i + i];
    }

    public Object g(int i) {
        Object[] objArr = this.i;
        int i2 = i + i;
        Object obj = objArr[i2 + 1];
        int i3 = this.j;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.h;
            int length = iArr.length;
            if (length <= 8 || i3 >= length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    int i6 = i4 - i;
                    System.arraycopy(iArr, i5, iArr, i, i6);
                    Object[] objArr2 = this.i;
                    System.arraycopy(objArr2, i5 + i5, objArr2, i2, i6 + i6);
                }
                Object[] objArr3 = this.i;
                int i7 = i4 + i4;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                l(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.j) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.h, 0, i);
                    System.arraycopy(objArr, 0, this.i, 0, i2);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    int i9 = i4 - i;
                    System.arraycopy(iArr, i8, this.h, i, i9);
                    System.arraycopy(objArr, i8 + i8, this.i, i2, i9 + i9);
                }
            }
            if (i3 == this.j) {
                this.j = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int c = c(obj);
        return c >= 0 ? this.i[c + c + 1] : obj2;
    }

    public Object h(int i, Object obj) {
        int i2 = i + i + 1;
        Object[] objArr = this.i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public int hashCode() {
        int[] iArr = this.h;
        Object[] objArr = this.i;
        int i = this.j;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final Object i(int i) {
        return this.i[i + i + 1];
    }

    public final boolean isEmpty() {
        return this.j <= 0;
    }

    public final void j(int i) {
        int i2 = this.j;
        int[] iArr = this.h;
        if (iArr.length < i) {
            Object[] objArr = this.i;
            l(i);
            if (this.j > 0) {
                System.arraycopy(iArr, 0, this.h, 0, i2);
                System.arraycopy(objArr, 0, this.i, 0, i2 + i2);
            }
            m(iArr, objArr, i2);
        }
        if (this.j != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void k(aeg aegVar) {
        int i = aegVar.j;
        j(this.j + i);
        if (this.j != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(aegVar.f(i2), aegVar.i(i2));
            }
        } else if (i > 0) {
            System.arraycopy(aegVar.h, 0, this.h, 0, i);
            System.arraycopy(aegVar.i, 0, this.i, 0, i + i);
            this.j = i;
        }
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int b;
        int i2 = this.j;
        if (obj == null) {
            b = d();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            b = b(obj, hashCode);
        }
        if (b >= 0) {
            int i3 = b + b + 1;
            Object[] objArr = this.i;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = b ^ (-1);
        int[] iArr = this.h;
        int length = iArr.length;
        if (i2 >= length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.i;
            l(i5);
            if (i2 == this.j) {
                int[] iArr2 = this.h;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    System.arraycopy(objArr2, 0, this.i, 0, objArr2.length);
                }
                m(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.h;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.i;
            int i7 = this.j - i4;
            System.arraycopy(objArr3, i4 + i4, objArr3, i6 + i6, i7 + i7);
        }
        int i8 = this.j;
        if (i2 == i8) {
            int[] iArr4 = this.h;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.i;
                int i9 = i4 + i4;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.j = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int c = c(obj);
        if (c >= 0) {
            return g(c);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int c = c(obj);
        if (c >= 0) {
            return h(c, obj2);
        }
        return null;
    }

    public final int size() {
        return this.j;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.j * 28);
        sb.append('{');
        for (int i = 0; i < this.j; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object f2 = f(i);
            if (f2 != this) {
                sb.append(f2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i2 = i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e(Object obj) {
        int i = this.j;
        int i2 = i + i;
        Object[] objArr = this.i;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj, Object obj2) {
        int c = c(obj);
        if (c < 0) {
            return false;
        }
        Object i = i(c);
        if (obj2 != i && (obj2 == null || !obj2.equals(i))) {
            return false;
        }
        g(c);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int c = c(obj);
        if (c < 0) {
            return false;
        }
        Object i = i(c);
        if (i != obj2 && (obj2 == null || !obj2.equals(i))) {
            return false;
        }
        h(c, obj3);
        return true;
    }
}
