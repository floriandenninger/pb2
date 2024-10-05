package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayiv {
    final int a;
    final long b;
    final Set c;

    public ayiv(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = amsx.p(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ayiv ayivVar = (ayiv) obj;
            if (this.a == ayivVar.a && this.b == ayivVar.b && amkq.b(this.c, ayivVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.e("maxAttempts", this.a);
        Y.f("hedgingDelayNanos", this.b);
        Y.b("nonFatalStatusCodes", this.c);
        return Y.toString();
    }
}
