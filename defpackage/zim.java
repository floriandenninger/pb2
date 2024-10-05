package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zim {
    public final int a;

    public zim() {
    }

    public zim(int i) {
        this.a = i;
    }

    public static zim a(int i) {
        amkq.F(true, "Invalid resource identifier: 0");
        return new zim(i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zim) && this.a == ((zim) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(29);
        sb.append("StyleResource{id=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
