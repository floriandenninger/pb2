package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anep implements Serializable {
    private static final anep b = new anep(new int[0]);
    public final int a;
    private final int[] c;

    public anep(int[] iArr) {
        int length = iArr.length;
        this.c = iArr;
        this.a = length;
    }

    public final int a(int i) {
        amkq.V(i, this.a);
        return this.c[i];
    }

    public final boolean b() {
        return this.a == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anep)) {
            return false;
        }
        anep anepVar = (anep) obj;
        if (this.a != anepVar.a) {
            return false;
        }
        for (int i = 0; i < this.a; i++) {
            if (a(i) != anepVar.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.a; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    Object readResolve() {
        return b() ? b : this;
    }

    public final String toString() {
        if (b()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(this.a * 5);
        sb.append('[');
        sb.append(this.c[0]);
        for (int i = 1; i < this.a; i++) {
            sb.append(", ");
            sb.append(this.c[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    Object writeReplace() {
        int i = this.a;
        int[] iArr = this.c;
        return i < iArr.length ? new anep(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
