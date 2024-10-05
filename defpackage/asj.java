package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asj implements plg {
    public static final asj a = new asj(new asi[0]);
    public final int b;
    private final asi[] c;
    private int d;

    public asj(asi... asiVarArr) {
        this.c = asiVarArr;
        this.b = asiVarArr.length;
    }

    public final int a(asi asiVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.c[i] == asiVar) {
                return i;
            }
        }
        return -1;
    }

    public final asi b(int i) {
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            asj asjVar = (asj) obj;
            if (this.b == asjVar.b && Arrays.equals(this.c, asjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c);
        this.d = hashCode;
        return hashCode;
    }
}
