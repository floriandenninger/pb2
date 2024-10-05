package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zcr implements zcp {
    public final int a;

    public zcr() {
    }

    public zcr(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zcr) && this.a == ((zcr) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(36);
        sb.append("BookState{foldPositionX=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
