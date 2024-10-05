package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vir {
    static final Object[] a;
    static final vir b;
    public final Object[] c;
    private final int d;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        b = new vir(objArr);
    }

    public vir(Object... objArr) {
        this.c = objArr;
        this.d = Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vir)) {
            return false;
        }
        vir virVar = (vir) obj;
        return this.d == virVar.d && Arrays.equals(this.c, virVar.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return Arrays.toString(this.c);
    }
}
