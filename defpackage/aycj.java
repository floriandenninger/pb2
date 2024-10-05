package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aycj {
    public final int a;
    public final aycx b;
    public final aydh c;
    public final aycp d;
    public final Executor e;
    private final ScheduledExecutorService f;
    private final axzq g;

    public aycj(Integer num, aycx aycxVar, aydh aydhVar, aycp aycpVar, ScheduledExecutorService scheduledExecutorService, axzq axzqVar, Executor executor) {
        num.getClass();
        this.a = num.intValue();
        aycxVar.getClass();
        this.b = aycxVar;
        aydhVar.getClass();
        this.c = aydhVar;
        aycpVar.getClass();
        this.d = aycpVar;
        this.f = scheduledExecutorService;
        this.g = axzqVar;
        this.e = executor;
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.e("defaultPort", this.a);
        Y.b("proxyDetector", this.b);
        Y.b("syncContext", this.c);
        Y.b("serviceConfigParser", this.d);
        Y.b("scheduledExecutorService", this.f);
        Y.b("channelLogger", this.g);
        Y.b("executor", this.e);
        return Y.toString();
    }
}
