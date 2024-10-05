package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asl {
    private final ask[] a;
    private int b;

    public asl(ask... askVarArr) {
        this.a = askVarArr;
        int length = askVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((asl) obj).a);
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.a) + 527;
        this.b = hashCode;
        return hashCode;
    }
}
