package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayny {
    private static final ayny c = new ayny();
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;

    public static Object a(aynx aynxVar) {
        return c.b(aynxVar);
    }

    public static void d(aynx aynxVar, Object obj) {
        c.e(aynxVar, obj);
    }

    final synchronized Object b(aynx aynxVar) {
        aynw aynwVar;
        aynwVar = (aynw) this.a.get(aynxVar);
        if (aynwVar == null) {
            aynwVar = new aynw(aynxVar.a());
            this.a.put(aynxVar, aynwVar);
        }
        ScheduledFuture scheduledFuture = aynwVar.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            aynwVar.c = null;
        }
        aynwVar.b++;
        return aynwVar.a;
    }

    final synchronized void e(aynx aynxVar, Object obj) {
        aynw aynwVar = (aynw) this.a.get(aynxVar);
        if (aynwVar == null) {
            String valueOf = String.valueOf(aynxVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("No cached instance found for ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        boolean z = true;
        amkq.F(obj == aynwVar.a, "Releasing the wrong instance");
        amkq.O(aynwVar.b > 0, "Refcount has already reached zero");
        int i = aynwVar.b - 1;
        aynwVar.b = i;
        if (i == 0) {
            if (aynwVar.c != null) {
                z = false;
            }
            amkq.O(z, "Destroy task already scheduled");
            if (this.b == null) {
                this.b = Executors.newSingleThreadScheduledExecutor(ayiu.j("grpc-shared-destroyer-%d"));
            }
            aynwVar.c = this.b.schedule(new ayjs(new aynv(this, aynwVar, aynxVar, obj)), 1L, TimeUnit.SECONDS);
        }
    }
}
