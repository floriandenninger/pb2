package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sjs implements axqr {
    private final azrw a;

    public sjs(azrw azrwVar) {
        this.a = azrwVar;
    }

    public static sjr b(Map map) {
        sjr sjdVar;
        int size = map.size();
        if (size == 0) {
            sjdVar = new sjd();
        } else if (size == 1) {
            sjdVar = (sjr) amkq.bk(map.keySet());
        } else {
            throw new IllegalArgumentException("More than 1 ThreadMonitoringConfiguration");
        }
        sjdVar.d();
        sjdVar.d();
        sjdVar.d();
        amkq.R(true, "ThreadMonitoringConfiguration.threadCountSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        sjdVar.e();
        sjdVar.e();
        amkq.P(true, "ThreadMonitoringConfiguration.threadCountThreshold must be positive but found %s", 1000);
        sjdVar.a();
        sjdVar.a();
        sjdVar.a();
        amkq.R(true, "ThreadMonitoringConfiguration.queueSizeSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        sjdVar.b();
        sjdVar.b();
        amkq.P(true, "ThreadMonitoringConfiguration.queueSizeThreshold must be positive but found %s", 1000);
        sjdVar.c();
        sjdVar.c();
        sjdVar.c();
        amkq.R(true, "ThreadMonitoringConfiguration.taskTimeoutSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        sjdVar.f();
        sjdVar.f();
        ayaw.k(sjdVar);
        return sjdVar;
    }

    public static sjs c(azrw azrwVar) {
        return new sjs(azrwVar);
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sjr get() {
        return b((Map) ((axqs) this.a).a);
    }
}
