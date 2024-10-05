package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azrf {
    public final Object a;
    public final long b;
    final TimeUnit c;

    public azrf(Object obj, long j, TimeUnit timeUnit) {
        this.a = obj;
        this.b = j;
        aysw.b(timeUnit, "unit is null");
        this.c = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azrf) {
            azrf azrfVar = (azrf) obj;
            if (aysw.a(this.a, azrfVar.a) && this.b == azrfVar.b && aysw.a(this.c, azrfVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj != null ? obj.hashCode() : 0;
        long j = this.b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        long j = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
        sb.append("Timed[time=");
        sb.append(j);
        sb.append(", unit=");
        sb.append(valueOf);
        sb.append(", value=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
