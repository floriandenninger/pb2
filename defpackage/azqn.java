package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azqn {
    public int a;
    public int b;
    int c;
    public Object[] d;

    public azqn() {
        this(16, null);
    }

    public static int a(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public final void b(Object obj) {
        Object obj2;
        Object obj3;
        Object[] objArr = this.d;
        int i = this.a;
        int a = a(obj.hashCode()) & i;
        Object obj4 = objArr[a];
        if (obj4 != null) {
            if (obj4.equals(obj)) {
                return;
            }
            do {
                a = (a + 1) & i;
                obj3 = objArr[a];
                if (obj3 != null) {
                }
            } while (!obj3.equals(obj));
            return;
        }
        objArr[a] = obj;
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 < this.c) {
            return;
        }
        Object[] objArr2 = this.d;
        int length = objArr2.length;
        int i3 = length + length;
        int i4 = i3 - 1;
        Object[] objArr3 = new Object[i3];
        while (true) {
            int i5 = i2 - 1;
            if (i2 == 0) {
                this.a = i4;
                this.c = (int) (i3 * 0.75f);
                this.d = objArr3;
                return;
            }
            do {
                length--;
                obj2 = objArr2[length];
            } while (obj2 == null);
            int a2 = a(obj2.hashCode()) & i4;
            if (objArr3[a2] == null) {
                objArr3[a2] = objArr2[length];
                i2 = i5;
            }
            do {
                a2 = (a2 + 1) & i4;
            } while (objArr3[a2] != null);
            objArr3[a2] = objArr2[length];
            i2 = i5;
        }
    }

    public final void c(int i, Object[] objArr, int i2) {
        int i3;
        Object obj;
        this.b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj != null) {
                    int a = a(obj.hashCode()) & i2;
                    if (i > i3) {
                        if (i >= a && a > i3) {
                            break;
                        }
                        i4 = i3 + 1;
                    } else if (i < a && a <= i3) {
                        i4 = i3 + 1;
                    }
                } else {
                    objArr[i] = null;
                    return;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }

    public azqn(int i) {
        this(i, null);
    }

    public azqn(int i, byte[] bArr) {
        int n = aynu.n(i);
        this.a = n - 1;
        this.c = (int) (n * 0.75f);
        this.d = new Object[n];
    }
}
