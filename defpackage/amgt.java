package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amgt {
    public final Set a;
    public final long b;
    public final ammv c;

    public amgt(Set set, long j, ammv ammvVar) {
        this.a = set;
        this.b = j;
        if (ammvVar == null) {
            throw new NullPointerException("Null deadlineToIgnoreOptionalConstraints");
        }
        this.c = ammvVar;
    }

    public static final amgs a() {
        return new amgs();
    }

    public static amgt b(amgt amgtVar, amgt amgtVar2) {
        amkq.N(amgtVar.a.equals(amgtVar2.a));
        amgs a = a();
        a.b(amgtVar.a);
        a.a = Math.min(amgtVar.b, amgtVar2.b);
        ammv ammvVar = amgtVar.c;
        ammv ammvVar2 = amgtVar2.c;
        if (ammvVar.h() && ammvVar2.h()) {
            a.b = ammv.j(Long.valueOf(Math.min(((Long) ammvVar.c()).longValue(), ((Long) ammvVar2.c()).longValue())));
        } else if (ammvVar.h()) {
            a.b = ammvVar;
        } else if (ammvVar2.h()) {
            a.b = ammvVar2;
        }
        return a.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amgt) {
            amgt amgtVar = (amgt) obj;
            if (this.a.equals(amgtVar.a) && this.b == amgtVar.b && this.c.equals(amgtVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 122 + String.valueOf(valueOf2).length());
        sb.append("SyncSchedule{constraints=");
        sb.append(valueOf);
        sb.append(", minLatencyBeforeCheckingConstraints=");
        sb.append(j);
        sb.append(", deadlineToIgnoreOptionalConstraints=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public amgt() {
    }
}
