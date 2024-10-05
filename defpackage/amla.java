package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amla implements Serializable {
    private static final long serialVersionUID = -8514239465808977353L;
    public final String a;
    public final Long b = null;

    public amla(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amla)) {
            return false;
        }
        amla amlaVar = (amla) obj;
        if (Objects.equals(this.a, amlaVar.a)) {
            Long l = amlaVar.b;
            if (Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, null);
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("tokenValue", this.a);
        Y.b("expirationTimeMillis", null);
        return Y.toString();
    }
}
