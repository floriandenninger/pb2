package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class anht extends anfm {
    public static anht q(anhy anhyVar) {
        if (anhyVar instanceof anht) {
            return (anht) anhyVar;
        }
        return new anhd(anhyVar);
    }

    public final anht r(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (anht) anaf.V(this, j, timeUnit, scheduledExecutorService);
    }
}
