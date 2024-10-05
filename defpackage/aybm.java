package defpackage;

import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aybm {
    public static final aybm a = new aybm(null, Status.b, false);
    public final aybq b;
    public final Status c;
    public final boolean d;
    private final axzx e = null;

    private aybm(aybq aybqVar, Status status, boolean z) {
        this.b = aybqVar;
        status.getClass();
        this.c = status;
        this.d = z;
    }

    public static aybm a(Status status) {
        amkq.F(!status.f(), "drop status shouldn't be OK");
        return new aybm(null, status, true);
    }

    public static aybm b(Status status) {
        amkq.F(!status.f(), "error status shouldn't be OK");
        return new aybm(null, status, false);
    }

    public static aybm c(aybq aybqVar) {
        return new aybm(aybqVar, Status.b, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aybm)) {
            return false;
        }
        aybm aybmVar = (aybm) obj;
        if (amkq.b(this.b, aybmVar.b) && amkq.b(this.c, aybmVar.c)) {
            axzx axzxVar = aybmVar.e;
            if (amkq.b(null, null) && this.d == aybmVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("subchannel", this.b);
        Y.b("streamTracerFactory", null);
        Y.b("status", this.c);
        Y.g("drop", this.d);
        return Y.toString();
    }
}
