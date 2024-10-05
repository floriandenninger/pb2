package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bajy implements Serializable {
    public static bajy a = null;
    private static bajy c = null;
    private static bajy d = null;
    private static final long serialVersionUID = 2274324892792009998L;
    public final bajr[] b;
    private final String e;

    static {
        new HashMap(32);
    }

    public bajy(String str, bajr[] bajrVarArr) {
        this.e = str;
        this.b = bajrVarArr;
    }

    public static bajy c() {
        bajy bajyVar = d;
        if (bajyVar != null) {
            return bajyVar;
        }
        bajy bajyVar2 = new bajy("Seconds", new bajr[]{bajr.k});
        d = bajyVar2;
        return bajyVar2;
    }

    public static bajy d() {
        bajy bajyVar = c;
        if (bajyVar != null) {
            return bajyVar;
        }
        bajy bajyVar2 = new bajy("Standard", new bajr[]{bajr.d, bajr.e, bajr.f, bajr.g, bajr.i, bajr.j, bajr.k, bajr.l});
        c = bajyVar2;
        return bajyVar2;
    }

    public final int a(bajr bajrVar) {
        int b = b();
        for (int i = 0; i < b; i++) {
            if (this.b[i] == bajrVar) {
                return i;
            }
        }
        return -1;
    }

    public final int b() {
        return this.b.length;
    }

    public final boolean e(bajr bajrVar) {
        return a(bajrVar) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bajy) {
            return Arrays.equals(this.b, ((bajy) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            bajr[] bajrVarArr = this.b;
            if (i >= bajrVarArr.length) {
                return i2;
            }
            i2 += bajrVarArr[i].hashCode();
            i++;
        }
    }

    public final String toString() {
        String str = this.e;
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append("PeriodType[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
