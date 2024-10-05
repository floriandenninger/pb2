package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aynm {
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;

    public aynm(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = amsx.p(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aynm)) {
            return false;
        }
        aynm aynmVar = (aynm) obj;
        return this.a == aynmVar.a && this.b == aynmVar.b && this.c == aynmVar.c && Double.compare(this.d, aynmVar.d) == 0 && amkq.b(this.e, aynmVar.e) && amkq.b(this.f, aynmVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.e("maxAttempts", this.a);
        Y.f("initialBackoffNanos", this.b);
        Y.f("maxBackoffNanos", this.c);
        Y.c("backoffMultiplier", String.valueOf(this.d));
        Y.b("perAttemptRecvTimeoutNanos", this.e);
        Y.b("retryableStatusCodes", this.f);
        return Y.toString();
    }
}
