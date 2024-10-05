package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aycd {
    static final anbp b;
    public Object[] c;
    public int d;
    public static final ayaw e = new ayaw();
    public static final ayby a = new ayit(1);

    static {
        anbp anbpVar = anbp.d;
        anbo anboVar = (anbo) anbpVar;
        if (anboVar.c != null) {
            anbpVar = anboVar.b(anboVar.b, null);
        }
        b = anbpVar;
    }

    public aycd() {
    }

    public aycd(int i, Object[] objArr) {
        this.d = i;
        this.c = objArr;
    }

    private final int i() {
        Object[] objArr = this.c;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final void j(int i) {
        Object[] objArr = new Object[i];
        if (!l()) {
            System.arraycopy(this.c, 0, objArr, 0, a());
        }
        this.c = objArr;
    }

    private final void k(int i, byte[] bArr) {
        this.c[i + i] = bArr;
    }

    private final boolean l() {
        return this.d == 0;
    }

    public final int a() {
        int i = this.d;
        return i + i;
    }

    public final Object b(ayca aycaVar) {
        int i = this.d;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!Arrays.equals(aycaVar.b, g(i)));
        Object c = c(i);
        if (c instanceof byte[]) {
            return aycaVar.a((byte[]) c);
        }
        throw null;
    }

    public final Object c(int i) {
        return this.c[i + i + 1];
    }

    public final void d(ayca aycaVar) {
        if (l()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.d; i2++) {
            if (!Arrays.equals(aycaVar.b, g(i2))) {
                k(i, g(i2));
                Object c = c(i2);
                if (this.c instanceof byte[][]) {
                    j(i());
                }
                this.c[i + i + 1] = c;
                i++;
            }
        }
        Arrays.fill(this.c, i + i, a(), (Object) null);
        this.d = i;
    }

    public final void e(aycd aycdVar) {
        if (aycdVar.l()) {
            return;
        }
        int i = i() - a();
        if (l() || i < aycdVar.a()) {
            j(a() + aycdVar.a());
        }
        System.arraycopy(aycdVar.c, 0, this.c, a(), aycdVar.a());
        this.d += aycdVar.d;
    }

    public final void f(ayca aycaVar, Object obj) {
        aycaVar.getClass();
        obj.getClass();
        if (a() == 0 || a() == i()) {
            int a2 = a();
            j(Math.max(a2 + a2, 8));
        }
        k(this.d, aycaVar.b);
        int i = this.d;
        this.c[i + i + 1] = aycaVar.b(obj);
        this.d++;
    }

    public final byte[] g(int i) {
        return (byte[]) this.c[i + i];
    }

    public final byte[] h(int i) {
        Object c = c(i);
        if (c instanceof byte[]) {
            return (byte[]) c;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.d; i++) {
            if (i != 0) {
                sb.append(',');
            }
            String str = new String(g(i), amme.a);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(b.i(h(i)));
            } else {
                sb.append(new String(h(i), amme.a));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
