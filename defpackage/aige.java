package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aige {
    public final int a;

    public aige() {
        this.a = ahbl.h(1);
    }

    public aige(int i) {
        this.a = i;
    }

    public aige(int... iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            i |= ahbl.h(iArr[i2]);
        }
        this.a = i;
    }

    public static aige a() {
        return new aige();
    }

    public final boolean b() {
        return (this.a & ahbl.h(2)) != 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof aige) && this.a == ((aige) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }
}
