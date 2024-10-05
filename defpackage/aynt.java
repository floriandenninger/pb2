package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aynt {
    final aybt a;
    final Object b;

    public aynt(aybt aybtVar, Object obj) {
        this.a = aybtVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aynt ayntVar = (aynt) obj;
            if (amkq.b(this.a, ayntVar.a) && amkq.b(this.b, ayntVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("provider", this.a);
        Y.b("config", this.b);
        return Y.toString();
    }
}
