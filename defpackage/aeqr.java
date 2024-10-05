package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeqr {
    public final long a;
    public final long b;
    public final long c;

    public aeqr(long j) {
        this(j, 0L, 0L);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aeqr)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        aeqr aeqrVar = (aeqr) obj;
        return this.a == aeqrVar.a && this.b == aeqrVar.b && this.c == aeqrVar.c;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        String str;
        long j = this.a;
        long j2 = this.b;
        String str2 = "";
        if (j2 != 0) {
            StringBuilder sb = new StringBuilder(57);
            sb.append(" snapToKeyframeToleranceBeforeMillis=");
            sb.append(j2);
            str = sb.toString();
        } else {
            str = "";
        }
        long j3 = this.c;
        if (j3 != 0) {
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append(" snapTokeyframeToleranceAfterMillis=");
            sb2.append(j3);
            str2 = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45 + String.valueOf(str2).length());
        sb3.append("Position(positionMillis=");
        sb3.append(j);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(")");
        return sb3.toString();
    }

    public aeqr(long j, long j2, long j3) {
        this.a = j;
        this.b = Math.max(0L, j2);
        this.c = Math.max(0L, j3);
    }
}
