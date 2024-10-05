package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class ambh {
    public static final anhy a(final ambg ambgVar, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        SettableFuture f = SettableFuture.f();
        anhy V = anaf.V(f, 24L, timeUnit, scheduledExecutorService);
        f.qK(aci.c(new aeu() { // from class: ambe
            @Override // defpackage.aeu
            public final Object a(aes aesVar) {
                return ambg.this.a(new ambf(aesVar));
            }
        }));
        return V;
    }

    public static int b(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }
}
