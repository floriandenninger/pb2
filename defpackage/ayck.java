package defpackage;

import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayck {
    public final Status a;
    public final Object b;

    private ayck(Status status) {
        this.b = null;
        this.a = status;
        amkq.J(!status.f(), "cannot use OK status: %s", status);
    }

    private ayck(Object obj) {
        this.b = obj;
        this.a = null;
    }

    public static ayck a(Object obj) {
        return new ayck(obj);
    }

    public static ayck b(Status status) {
        return new ayck(status);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ayck ayckVar = (ayck) obj;
            if (amkq.b(this.a, ayckVar.a) && amkq.b(this.b, ayckVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        if (this.b != null) {
            ammu Y = amkq.Y(this);
            Y.b("config", this.b);
            return Y.toString();
        }
        ammu Y2 = amkq.Y(this);
        Y2.b("error", this.a);
        return Y2.toString();
    }
}
