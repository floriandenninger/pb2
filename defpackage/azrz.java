package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azrz implements Serializable {
    public final Object a;
    public final Object b;

    public azrz(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azrz)) {
            return false;
        }
        azrz azrzVar = (azrz) obj;
        return azul.c(this.a, azrzVar.a) && azul.c(this.b, azrzVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return '(' + this.a + ", " + this.b + ')';
    }
}
