package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sjp {
    private static final amxj c = amxj.l("com/google/android/libraries/concurrent/monitoring/ThreadMonitoring");
    public final ammv a;
    public final sjr b;
    private final boolean d;
    private final anic e;

    public sjp(ammv ammvVar, sjr sjrVar, ammv ammvVar2, anic anicVar) {
        this.a = ammvVar;
        this.b = sjrVar;
        this.d = ((Boolean) ammvVar2.e(false)).booleanValue();
        this.e = anicVar;
    }

    public static void b(sjq sjqVar, ArrayList arrayList, final RuntimeException runtimeException) {
        if (arrayList.size() > 20) {
            for (int i = 0; i < 20; i++) {
                Collections.swap(arrayList, i, ThreadLocalRandom.current().nextInt(arrayList.size() - i) + i);
            }
        }
        int min = Math.min(arrayList.size(), 20);
        for (int i2 = 0; i2 < min; i2++) {
            Thread thread = (Thread) arrayList.get(i2);
            sis sisVar = new sis(thread);
            RuntimeException b = amjq.b(thread);
            if (b.getStackTrace().length > 0) {
                sisVar.initCause(b);
            }
        }
        sjq sjqVar2 = sjq.LOG_ERROR;
        int ordinal = sjqVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            uqq.l(new Runnable() { // from class: sje
                @Override // java.lang.Runnable
                public final void run() {
                    throw runtimeException;
                }
            });
        } else {
            ((amxh) ((amxh) ((amxh) c.f()).h(runtimeException)).i("com/google/android/libraries/concurrent/monitoring/ThreadMonitoring", "reportUnhealthyThreadPool", 424, "ThreadMonitoring.java")).o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean c() {
        return ThreadLocalRandom.current().nextInt(1000) <= 0;
    }

    public final ExecutorService a(sjo sjoVar, ExecutorService executorService, sjj sjjVar) {
        return new sjh((sjq) this.a.c(), this.b, this.d, this.e, sjoVar, executorService, sjjVar);
    }
}
