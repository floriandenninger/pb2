package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aydg {
    public final aydf a;
    private final ScheduledFuture b;

    public aydg(aydf aydfVar, ScheduledFuture scheduledFuture) {
        this.a = aydfVar;
        scheduledFuture.getClass();
        this.b = scheduledFuture;
    }

    public final void a() {
        this.a.b = true;
        this.b.cancel(false);
    }
}
