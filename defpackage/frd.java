package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class frd {
    public final int a;
    public final int b;

    private frd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static frd a(int i) {
        return new frd(i, 0);
    }

    public static frd b() {
        return new frd(8, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof frd)) {
            return false;
        }
        frd frdVar = (frd) obj;
        return this.a == frdVar.a && this.b == frdVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }
}
