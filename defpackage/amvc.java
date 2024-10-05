package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amvc {
    transient Object[] a;
    transient int[] b;
    public transient int c;
    transient int d;
    public transient int[] e;
    transient long[] f;
    private transient float g;
    private transient int h;

    public amvc() {
        k(3);
    }

    private static int n(long j) {
        return (int) (j >>> 32);
    }

    private final int o() {
        return this.e.length - 1;
    }

    private static long p(long j, int i) {
        return (j & (-4294967296L)) | (i & 4294967295L);
    }

    private final void q(int i) {
        if (this.e.length >= 1073741824) {
            this.h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.g)) + 1;
        int[] r = r(i);
        long[] jArr = this.f;
        int length = r.length - 1;
        for (int i3 = 0; i3 < this.c; i3++) {
            int n = n(jArr[i3]);
            int i4 = n & length;
            int i5 = r[i4];
            r[i4] = i3;
            jArr[i3] = (n << 32) | (i5 & 4294967295L);
        }
        this.h = i2;
        this.e = r;
    }

    private static int[] r(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final int a() {
        return this.c == 0 ? -1 : 0;
    }

    public final int b(Object obj) {
        int d = d(obj);
        if (d == -1) {
            return 0;
        }
        return this.b[d];
    }

    public final int c(int i) {
        amkq.V(i, this.c);
        return this.b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(Object obj) {
        int bt = amkq.bt(obj);
        int i = this.e[o() & bt];
        while (i != -1) {
            long j = this.f[i];
            if (n(j) == bt && amkq.b(obj, this.a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public final int e(int i) {
        int i2 = i + 1;
        if (i2 < this.c) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int f(int i) {
        long[] jArr;
        long j;
        Object obj = this.a[i];
        int n = n(this.f[i]);
        int o = o() & n;
        int i2 = this.e[o];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (n(this.f[i2]) != n || !amkq.b(obj, this.a[i2])) {
                int i4 = (int) this.f[i2];
                if (i4 == -1) {
                    return 0;
                }
                i3 = i2;
                i2 = i4;
            } else {
                int i5 = this.b[i2];
                if (i3 == -1) {
                    this.e[o] = (int) this.f[i2];
                } else {
                    long[] jArr2 = this.f;
                    jArr2[i3] = p(jArr2[i3], (int) jArr2[i2]);
                }
                int i6 = this.c - 1;
                if (i2 < i6) {
                    Object[] objArr = this.a;
                    objArr[i2] = objArr[i6];
                    int[] iArr = this.b;
                    iArr[i2] = iArr[i6];
                    objArr[i6] = null;
                    iArr[i6] = 0;
                    long[] jArr3 = this.f;
                    long j2 = jArr3[i6];
                    jArr3[i2] = j2;
                    jArr3[i6] = -1;
                    int n2 = n(j2) & o();
                    int[] iArr2 = this.e;
                    int i7 = iArr2[n2];
                    if (i7 != i6) {
                        while (true) {
                            jArr = this.f;
                            j = jArr[i7];
                            int i8 = (int) j;
                            if (i8 == i6) {
                                break;
                            }
                            i7 = i8;
                        }
                        jArr[i7] = p(j, i2);
                    } else {
                        iArr2[n2] = i2;
                    }
                } else {
                    this.a[i2] = null;
                    this.b[i2] = 0;
                    this.f[i2] = -1;
                }
                this.c--;
                this.d++;
                return i5;
            }
        }
    }

    public final Object g(int i) {
        amkq.V(i, this.c);
        return this.a[i];
    }

    public final void h(int i) {
        if (i > this.f.length) {
            i(i);
        }
        if (i >= this.h) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            q(Math.max(2, highestOneBit + highestOneBit));
        }
    }

    final void i(int i) {
        this.a = Arrays.copyOf(this.a, i);
        this.b = Arrays.copyOf(this.b, i);
        long[] jArr = this.f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.f = copyOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i, int i2) {
        amkq.V(i, this.c);
        this.b[i] = i2;
    }

    final void k(int i) {
        amkq.F(i >= 0, "Initial capacity must be non-negative");
        amkq.F(true, "Illegal load factor");
        int bu = amkq.bu(i);
        this.e = r(bu);
        this.g = 1.0f;
        this.a = new Object[i];
        this.b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.f = jArr;
        this.h = Math.max(1, bu);
    }

    public final void l(Object obj, int i) {
        if (i > 0) {
            long[] jArr = this.f;
            Object[] objArr = this.a;
            int[] iArr = this.b;
            int bt = amkq.bt(obj);
            int o = o() & bt;
            int i2 = this.c;
            int[] iArr2 = this.e;
            int i3 = iArr2[o];
            if (i3 == -1) {
                iArr2[o] = i2;
            } else {
                while (true) {
                    long j = jArr[i3];
                    if (n(j) == bt && amkq.b(obj, objArr[i3])) {
                        int i4 = iArr[i3];
                        iArr[i3] = i;
                        return;
                    } else {
                        int i5 = (int) j;
                        if (i5 == -1) {
                            jArr[i3] = p(j, i2);
                            break;
                        }
                        i3 = i5;
                    }
                }
            }
            if (i2 == Integer.MAX_VALUE) {
                throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
            }
            int i6 = i2 + 1;
            int length = this.f.length;
            if (i6 > length) {
                int max = Math.max(1, length >>> 1) + length;
                int i7 = max >= 0 ? max : Integer.MAX_VALUE;
                if (i7 != length) {
                    i(i7);
                }
            }
            this.f[i2] = (bt << 32) | 4294967295L;
            this.a[i2] = obj;
            this.b[i2] = i;
            this.c = i6;
            if (i2 >= this.h) {
                int length2 = this.e.length;
                q(length2 + length2);
            }
            this.d++;
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("count must be positive but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final amux m(int i) {
        amkq.V(i, this.c);
        return new amux(this, i);
    }

    public amvc(int i) {
        k(i);
    }

    public amvc(amvc amvcVar) {
        k(amvcVar.c);
        int a = amvcVar.a();
        while (a != -1) {
            l(amvcVar.g(a), amvcVar.c(a));
            a = amvcVar.e(a);
        }
    }
}
