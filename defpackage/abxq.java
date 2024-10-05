package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abxq {
    public static final abxq a = new abxq(null, 0);
    public static final abxq b = new abxq(null, 2);
    private final int c;
    private final Object d;

    private abxq(Object obj, int i) {
        this.d = obj;
        this.c = i;
    }

    public static abxq a(Object obj) {
        return new abxq(obj, 1);
    }

    public final Object b() {
        amkq.N(this.c == 1);
        return this.d;
    }

    public final boolean c() {
        return this.c == 0;
    }

    public final boolean d() {
        return this.c == 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            abxq abxqVar = (abxq) obj;
            if (this.c == abxqVar.c && amkq.b(this.d, abxqVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d});
    }
}
