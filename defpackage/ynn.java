package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ynn {
    void a(int i, Runnable runnable);

    ScheduledFuture b(Runnable runnable, long j, TimeUnit timeUnit);
}
