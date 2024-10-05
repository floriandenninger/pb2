package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dlf {
    public final Object[] a;
    public short b;

    public dlf() {
        this.a = new Object[5];
        this.b = (short) 0;
    }

    public dlf(dlf dlfVar) {
        this.a = new Object[5];
        this.b = (short) 0;
        for (int i = 0; i < 5; i++) {
            this.a[i] = dlfVar.a[i];
        }
        this.b = dlfVar.b;
    }

    private static String g(int i) {
        if (i == 0) {
            return "CONTENT";
        }
        if (i == 1) {
            return "BACKGROUND";
        }
        if (i == 2) {
            return "FOREGROUND";
        }
        if (i == 3) {
            return "HOST";
        }
        if (i != 4) {
            return null;
        }
        return "BORDER";
    }

    public final int a(int i) {
        if (i < 0 || i >= this.b) {
            short s = this.b;
            StringBuilder sb = new StringBuilder(30);
            sb.append("index=");
            sb.append(i);
            sb.append(", size=");
            sb.append((int) s);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 <= i) {
            if (this.a[i3] != null) {
                i2++;
            }
            i3++;
        }
        return i3 - 1;
    }

    public final Object b(int i) {
        return this.a[i];
    }

    public final Object c(int i) {
        return b(a(i));
    }

    public final Object d() {
        Object[] objArr = this.a;
        if (objArr[3] != null) {
            return b(3);
        }
        if (objArr[0] != null) {
            return b(0);
        }
        if (objArr[1] != null) {
            return b(1);
        }
        if (objArr[2] != null) {
            return b(2);
        }
        return b(4);
    }

    public final void e(int i, Object obj) {
        if (obj != null) {
            Object[] objArr = this.a;
            if (objArr[i] != null) {
                String valueOf = String.valueOf(g(i));
                throw new RuntimeException(valueOf.length() != 0 ? "Already contains unit for type ".concat(valueOf) : new String("Already contains unit for type "));
            }
            if (objArr[3] == null) {
                if (i == 3) {
                    if (this.b <= 0) {
                        i = 3;
                    }
                }
                objArr[i] = obj;
                this.b = (short) (this.b + 1);
                return;
            }
            throw new RuntimeException("OutputUnitType.HOST unit should be the only member of an OutputUnitsAffinityGroup");
        }
        throw new IllegalArgumentException("value should not be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dlf dlfVar = (dlf) obj;
            if (this.b == dlfVar.b) {
                for (int i = 0; i < 5; i++) {
                    if (this.a[i] != dlfVar.a[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        if (obj != null) {
            Object[] objArr = this.a;
            if (objArr[i] != null) {
                objArr[i] = obj;
                return;
            }
        }
        if (obj != null && this.a[i] == null) {
            e(i, obj);
            return;
        }
        if (obj == null) {
            Object[] objArr2 = this.a;
            if (objArr2[i] != null) {
                objArr2[i] = null;
                this.b = (short) (this.b - 1);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        for (int i = 0; i < this.b; i++) {
            int a = a(i);
            Object c = c(i);
            sb.append("\n\t");
            sb.append(g(a));
            sb.append(": ");
            sb.append(c.toString());
        }
        return sb.toString();
    }
}
