package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anbh extends anaf implements Serializable {
    public static final anaf b;
    private static final long serialVersionUID = 0;
    public final int a;
    private final boolean c;

    static {
        new anbh(0, false);
        new anbh(0, true);
        b = new anbh(anbf.a, true);
    }

    public anbh(int i, boolean z) {
        this.a = i;
        this.c = z;
    }

    public static int cp(int i) {
        return Integer.rotateLeft(i * (-862048943), 15) * 461845907;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anbh) {
            anbh anbhVar = (anbh) obj;
            if (this.a == anbhVar.a && this.c == anbhVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.a;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(31);
        sb.append("Hashing.murmur3_32(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
