package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvr {
    public final String a;

    public cvr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cvr) {
            return this.a.equals(((cvr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
        sb.append("StringHeaderFactory{value='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
