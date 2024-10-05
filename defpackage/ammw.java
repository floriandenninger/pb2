package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ammw implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;
    public final Object a;
    public final Object b;

    protected ammw(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static ammw a(Object obj, Object obj2) {
        return new ammw(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ammw) {
            ammw ammwVar = (ammw) obj;
            if (amkq.b(this.a, ammwVar.a) && amkq.b(this.b, ammwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append("(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (hashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }
}
