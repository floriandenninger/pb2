package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cij {
    public Object a;
    public Object b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hx)) {
            return false;
        }
        hx hxVar = (hx) obj;
        return a(hxVar.a, this.a) && a(hxVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7 + String.valueOf(valueOf2).length());
        sb.append("Pair{");
        sb.append(valueOf);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
