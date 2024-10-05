package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amcr {
    public final long a;
    public final TimeUnit b;

    public amcr(long j, TimeUnit timeUnit) {
        this.a = j;
        if (timeUnit == null) {
            throw new NullPointerException("Null timeUnit");
        }
        this.b = timeUnit;
    }

    public static amcr a(long j, TimeUnit timeUnit) {
        return new amcr(j, timeUnit);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amcr) {
            amcr amcrVar = (amcr) obj;
            if (this.a == amcrVar.a && this.b.equals(amcrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
        sb.append("TimeUnitPair{duration=");
        sb.append(j);
        sb.append(", timeUnit=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public amcr() {
    }
}
