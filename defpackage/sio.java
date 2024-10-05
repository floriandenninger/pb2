package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class sio extends anhg implements anic {
    protected abstract anic a();

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ania schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return a().schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ania schedule(Callable callable, long j, TimeUnit timeUnit) {
        return a().schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ania scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return a().scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ania scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return a().scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.anhg
    protected /* bridge */ /* synthetic */ anib f() {
        throw null;
    }
}
