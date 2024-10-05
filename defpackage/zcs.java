package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zcs implements zcp {
    public final int a;

    public zcs() {
    }

    public zcs(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zcs) && this.a == ((zcs) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(41);
        sb.append("ClamshellState{foldPositionY=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
