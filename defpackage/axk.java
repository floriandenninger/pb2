package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axk {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public axk(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final Uri a(String str) {
        return Uri.parse(pse.k(str, this.c));
    }

    public final axk b(axk axkVar, String str) {
        String c = c(str);
        if (axkVar != null && c.equals(axkVar.c(str))) {
            long j = this.b;
            if (j != -1) {
                long j2 = this.a;
                if (j2 + j == axkVar.a) {
                    long j3 = axkVar.b;
                    return new axk(c, j2, j3 != -1 ? j + j3 : -1L);
                }
            }
            long j4 = axkVar.b;
            if (j4 != -1) {
                long j5 = axkVar.a;
                if (j5 + j4 == this.a) {
                    return new axk(c, j5, j != -1 ? j4 + j : -1L);
                }
            }
        }
        return null;
    }

    public final String c(String str) {
        return pse.k(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            axk axkVar = (axk) obj;
            if (this.a == axkVar.a && this.b == axkVar.b && this.c.equals(axkVar.c)) {
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
        int hashCode = ((((((int) this.a) + 527) * 31) + ((int) this.b)) * 31) + this.c.hashCode();
        this.d = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str = this.c;
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 81);
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(j);
        sb.append(", length=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
