package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hx {
    public final Object a;
    public final Object b;

    public hx(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hx)) {
            return false;
        }
        hx hxVar = (hx) obj;
        return Objects.equals(hxVar.a, this.a) && Objects.equals(hxVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
