package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoqc {
    public static final aoqc a = new aoqc(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    private aoqc() {
        this(0, new int[8], new Object[8], true);
    }

    private aoqc(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoqc b(aoqc aoqcVar, aoqc aoqcVar2) {
        int i = aoqcVar.b + aoqcVar2.b;
        int[] copyOf = Arrays.copyOf(aoqcVar.c, i);
        System.arraycopy(aoqcVar2.c, 0, copyOf, aoqcVar.b, aoqcVar2.b);
        Object[] copyOf2 = Arrays.copyOf(aoqcVar.d, i);
        System.arraycopy(aoqcVar2.d, 0, copyOf2, aoqcVar.b, aoqcVar2.b);
        return new aoqc(i, copyOf, copyOf2, true);
    }

    public static aoqc c() {
        return new aoqc();
    }

    public final int a() {
        int af;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int a2 = aoqp.a(i4);
            int b = aoqp.b(i4);
            if (b == 0) {
                af = aomp.af(a2, ((Long) this.d[i3]).longValue());
            } else if (b == 1) {
                ((Long) this.d[i3]).longValue();
                af = aomp.aB(a2);
            } else if (b == 2) {
                af = aomp.I(a2, (aomf) this.d[i3]);
            } else if (b == 3) {
                int ac = aomp.ac(a2);
                af = ac + ac + ((aoqc) this.d[i3]).a();
            } else if (b == 5) {
                ((Integer) this.d[i3]).intValue();
                af = aomp.aA(a2);
            } else {
                throw new IllegalStateException(aoob.a());
            }
            i2 += af;
        }
        this.e = i2;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (!this.f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e() {
        this.f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof aoqc)) {
            return false;
        }
        aoqc aoqcVar = (aoqc) obj;
        int i = this.b;
        if (i == aoqcVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = aoqcVar.c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.d;
                    Object[] objArr2 = aoqcVar.d;
                    int i3 = this.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        d();
        int i2 = this.b;
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.c = Arrays.copyOf(iArr, i3);
            this.d = Arrays.copyOf(this.d, i3);
        }
        int[] iArr2 = this.c;
        int i4 = this.b;
        iArr2[i4] = i;
        this.d[i4] = obj;
        this.b = i4 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(int i, aomk aomkVar) {
        int n;
        d();
        int a2 = aoqp.a(i);
        int b = aoqp.b(i);
        if (b == 0) {
            f(i, Long.valueOf(aomkVar.q()));
            return true;
        }
        if (b == 1) {
            f(i, Long.valueOf(aomkVar.p()));
            return true;
        }
        if (b == 2) {
            f(i, aomkVar.x());
            return true;
        }
        if (b != 3) {
            if (b == 4) {
                return false;
            }
            if (b == 5) {
                f(i, Integer.valueOf(aomkVar.h()));
                return true;
            }
            throw aoob.a();
        }
        aoqc aoqcVar = new aoqc();
        do {
            n = aomkVar.n();
            if (n == 0) {
                break;
            }
        } while (aoqcVar.g(n, aomkVar));
        aomkVar.B(aoqp.c(a2, 4));
        f(i, aoqcVar);
        return true;
    }

    public final void h(aomq aomqVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int a2 = aoqp.a(i2);
                int b = aoqp.b(i2);
                if (b == 0) {
                    aomqVar.j(a2, ((Long) obj).longValue());
                } else if (b == 1) {
                    aomqVar.f(a2, ((Long) obj).longValue());
                } else if (b == 2) {
                    aomqVar.b(a2, (aomf) obj);
                } else if (b == 3) {
                    aomqVar.a.B(a2, 3);
                    ((aoqc) obj).h(aomqVar);
                    aomqVar.a.B(a2, 4);
                } else if (b == 5) {
                    aomqVar.e(a2, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(aoob.a());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.d;
        int i7 = this.b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
