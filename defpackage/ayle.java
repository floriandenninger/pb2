package defpackage;

import io.grpc.Status;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayle {
    static final axzn a = axzn.a("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final aynm f;
    final ayiv g;

    public ayle(Map map, boolean z, int i, int i2) {
        String str;
        aynm aynmVar;
        ayiv ayivVar;
        this.b = ayjr.c(map, "timeout");
        this.c = ayjr.j(map);
        Integer b = ayjr.b(map, "maxResponseMessageBytes");
        this.d = b;
        if (b != null) {
            amkq.J(b.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", b);
        }
        Integer b2 = ayjr.b(map, "maxRequestMessageBytes");
        this.e = b2;
        if (b2 != null) {
            amkq.J(b2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", b2);
        }
        Map h = z ? ayjr.h(map, "retryPolicy") : null;
        if (h == null) {
            str = "maxAttempts";
            aynmVar = null;
        } else {
            Integer b3 = ayjr.b(h, "maxAttempts");
            b3.getClass();
            int intValue = b3.intValue();
            amkq.H(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            Long c = ayjr.c(h, "initialBackoff");
            c.getClass();
            long longValue = c.longValue();
            amkq.I(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            Long c2 = ayjr.c(h, "maxBackoff");
            c2.getClass();
            str = "maxAttempts";
            long longValue2 = c2.longValue();
            amkq.I(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            Double a2 = ayjr.a(h, "backoffMultiplier");
            a2.getClass();
            double doubleValue = a2.doubleValue();
            amkq.J(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Long c3 = ayjr.c(h, "perAttemptRecvTimeout");
            amkq.J(c3 == null || c3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", c3);
            Set a3 = aynu.a(h, "retryableStatusCodes");
            amkq.w(a3 != null, "%s is required in retry policy", "retryableStatusCodes");
            amkq.w(!a3.contains(Status.Code.OK), "%s must not contain OK", "retryableStatusCodes");
            amkq.F((c3 == null && a3.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            aynmVar = new aynm(min, longValue, longValue2, doubleValue, c3, a3);
        }
        this.f = aynmVar;
        Map h2 = z ? ayjr.h(map, "hedgingPolicy") : null;
        if (h2 == null) {
            ayivVar = null;
        } else {
            Integer b4 = ayjr.b(h2, str);
            b4.getClass();
            int intValue2 = b4.intValue();
            amkq.H(intValue2 >= 2, "maxAttempts must be greater than 1: %s", intValue2);
            int min2 = Math.min(intValue2, i2);
            Long c4 = ayjr.c(h2, "hedgingDelay");
            c4.getClass();
            long longValue3 = c4.longValue();
            amkq.I(longValue3 >= 0, "hedgingDelay must not be negative: %s", longValue3);
            Set a4 = aynu.a(h2, "nonFatalStatusCodes");
            if (a4 == null) {
                a4 = Collections.unmodifiableSet(EnumSet.noneOf(Status.Code.class));
            } else {
                amkq.w(true ^ a4.contains(Status.Code.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            ayivVar = new ayiv(min2, longValue3, a4);
        }
        this.g = ayivVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ayle)) {
            return false;
        }
        ayle ayleVar = (ayle) obj;
        return amkq.b(this.b, ayleVar.b) && amkq.b(this.c, ayleVar.c) && amkq.b(this.d, ayleVar.d) && amkq.b(this.e, ayleVar.e) && amkq.b(this.f, ayleVar.f) && amkq.b(this.g, ayleVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("timeoutNanos", this.b);
        Y.b("waitForReady", this.c);
        Y.b("maxInboundMessageSize", this.d);
        Y.b("maxOutboundMessageSize", this.e);
        Y.b("retryPolicy", this.f);
        Y.b("hedgingPolicy", this.g);
        return Y.toString();
    }
}
