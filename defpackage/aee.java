package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aee implements Cloneable {
    private static final Object a = new Object();
    private boolean b;
    private long[] c;
    private Object[] d;
    private int e;

    public aee() {
        this(10);
    }

    private final void n() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final int a(long j) {
        if (this.b) {
            n();
        }
        return aec.b(this.c, this.e, j);
    }

    public final int b(Object obj) {
        if (this.b) {
            n();
        }
        for (int i = 0; i < this.e; i++) {
            if (this.d[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public final int c() {
        if (this.b) {
            n();
        }
        return this.e;
    }

    public final long d(int i) {
        if (this.b) {
            n();
        }
        return this.c[i];
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final aee clone() {
        try {
            aee aeeVar = (aee) super.clone();
            aeeVar.c = (long[]) this.c.clone();
            aeeVar.d = (Object[]) this.d.clone();
            return aeeVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object f(long j) {
        return g(j, null);
    }

    public final Object g(long j, Object obj) {
        int b = aec.b(this.c, this.e, j);
        if (b >= 0) {
            Object[] objArr = this.d;
            if (objArr[b] != a) {
                return objArr[b];
            }
        }
        return obj;
    }

    public final Object h(int i) {
        if (this.b) {
            n();
        }
        return this.d[i];
    }

    public final void i(long j, Object obj) {
        int i = this.e;
        if (i == 0 || j > this.c[i - 1]) {
            if (this.b && i >= this.c.length) {
                n();
            }
            int i2 = this.e;
            if (i2 >= this.c.length) {
                int e = aec.e(i2 + 1);
                long[] jArr = new long[e];
                Object[] objArr = new Object[e];
                long[] jArr2 = this.c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.c = jArr;
                this.d = objArr;
            }
            this.c[i2] = j;
            this.d[i2] = obj;
            this.e = i2 + 1;
            return;
        }
        k(j, obj);
    }

    public final void j() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public final void k(long j, Object obj) {
        int b = aec.b(this.c, this.e, j);
        if (b >= 0) {
            this.d[b] = obj;
            return;
        }
        int i = b ^ (-1);
        int i2 = this.e;
        if (i < i2) {
            Object[] objArr = this.d;
            if (objArr[i] == a) {
                this.c[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.b && i2 >= this.c.length) {
            n();
            i = aec.b(this.c, this.e, j) ^ (-1);
        }
        int i3 = this.e;
        if (i3 >= this.c.length) {
            int e = aec.e(i3 + 1);
            long[] jArr = new long[e];
            Object[] objArr2 = new Object[e];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.c = jArr;
            this.d = objArr2;
        }
        int i4 = this.e - i;
        if (i4 != 0) {
            long[] jArr3 = this.c;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i, objArr4, i5, this.e - i);
        }
        this.c[i] = j;
        this.d[i] = obj;
        this.e++;
    }

    public final void l(long j) {
        int b = aec.b(this.c, this.e, j);
        if (b >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[b];
            Object obj2 = a;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.b = true;
            }
        }
    }

    public final void m(int i) {
        Object[] objArr = this.d;
        Object obj = objArr[i];
        Object obj2 = a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.b = true;
        }
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(d(i));
            sb.append('=');
            Object h = h(i);
            if (h != this) {
                sb.append(h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public aee(int i) {
        this.b = false;
        if (i == 0) {
            this.c = aec.b;
            this.d = aec.c;
        } else {
            int e = aec.e(i);
            this.c = new long[e];
            this.d = new Object[e];
        }
    }
}
