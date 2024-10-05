package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeh implements Cloneable {
    private static final Object d = new Object();
    public boolean a;
    public Object[] b;
    public int c;
    private int[] e;

    public aeh() {
        this(10);
    }

    public final int a(int i) {
        if (this.a) {
            j();
        }
        return aec.a(this.e, this.c, i);
    }

    public final int b(int i) {
        if (this.a) {
            j();
        }
        return this.e[i];
    }

    public final int c() {
        if (this.a) {
            j();
        }
        return this.c;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aeh clone() {
        try {
            aeh aehVar = (aeh) super.clone();
            aehVar.e = (int[]) this.e.clone();
            aehVar.b = (Object[]) this.b.clone();
            return aehVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object e(int i) {
        return f(i, null);
    }

    public final Object f(int i, Object obj) {
        int a = aec.a(this.e, this.c, i);
        if (a >= 0) {
            Object[] objArr = this.b;
            if (objArr[a] != d) {
                return objArr[a];
            }
        }
        return obj;
    }

    public final Object g(int i) {
        if (this.a) {
            j();
        }
        return this.b[i];
    }

    public final void h(int i, Object obj) {
        int i2 = this.c;
        if (i2 == 0 || i > this.e[i2 - 1]) {
            if (this.a && i2 >= this.e.length) {
                j();
            }
            int i3 = this.c;
            if (i3 >= this.e.length) {
                int d2 = aec.d(i3 + 1);
                int[] iArr = new int[d2];
                Object[] objArr = new Object[d2];
                int[] iArr2 = this.e;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.e = iArr;
                this.b = objArr;
            }
            this.e[i3] = i;
            this.b[i3] = obj;
            this.c = i3 + 1;
            return;
        }
        k(i, obj);
    }

    public final void i() {
        int i = this.c;
        Object[] objArr = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.c = 0;
        this.a = false;
    }

    public final void j() {
        int i = this.c;
        int[] iArr = this.e;
        Object[] objArr = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != d) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.c = i2;
    }

    public final void k(int i, Object obj) {
        int a = aec.a(this.e, this.c, i);
        if (a >= 0) {
            this.b[a] = obj;
            return;
        }
        int i2 = a ^ (-1);
        int i3 = this.c;
        if (i2 < i3) {
            Object[] objArr = this.b;
            if (objArr[i2] == d) {
                this.e[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.e.length) {
            j();
            i2 = aec.a(this.e, this.c, i) ^ (-1);
        }
        int i4 = this.c;
        if (i4 >= this.e.length) {
            int d2 = aec.d(i4 + 1);
            int[] iArr = new int[d2];
            Object[] objArr2 = new Object[d2];
            int[] iArr2 = this.e;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.e = iArr;
            this.b = objArr2;
        }
        int i5 = this.c - i2;
        if (i5 != 0) {
            int[] iArr3 = this.e;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5);
            Object[] objArr4 = this.b;
            System.arraycopy(objArr4, i2, objArr4, i6, this.c - i2);
        }
        this.e[i2] = i;
        this.b[i2] = obj;
        this.c++;
    }

    public final void l(int i) {
        int a = aec.a(this.e, this.c, i);
        if (a >= 0) {
            Object[] objArr = this.b;
            Object obj = objArr[a];
            Object obj2 = d;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.a = true;
            }
        }
    }

    public final void m(int i) {
        Object[] objArr = this.b;
        Object obj = objArr[i];
        Object obj2 = d;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.a = true;
        }
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 28);
        sb.append('{');
        for (int i = 0; i < this.c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(b(i));
            sb.append('=');
            Object g = g(i);
            if (g != this) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public aeh(int i) {
        this.a = false;
        int d2 = aec.d(i);
        this.e = new int[d2];
        this.b = new Object[d2];
    }
}
