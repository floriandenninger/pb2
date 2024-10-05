package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zil {
    public final int a;

    public zil() {
    }

    public zil(int i) {
        this.a = i;
    }

    public static zil a(int i) {
        amkq.F(true, "Invalid resource identifier: 0");
        return new zil(i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zil) && this.a == ((zil) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(28);
        sb.append("AttrResource{id=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
