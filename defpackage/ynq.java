package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ynq implements ynn {
    public static final ynn a = new ynq();

    @Override // defpackage.ynn
    public final void a(int i, Runnable runnable) {
    }

    @Override // defpackage.ynn
    public final ScheduledFuture b(Runnable runnable, long j, TimeUnit timeUnit) {
        return new ynp();
    }
}
