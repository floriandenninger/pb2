package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlw implements adlr {
    public final zbw a;
    private final ScheduledExecutorService b;
    private ScheduledFuture c;

    public adlw(zbw zbwVar, ScheduledExecutorService scheduledExecutorService) {
        zbwVar.getClass();
        this.a = zbwVar;
        scheduledExecutorService.getClass();
        this.b = scheduledExecutorService;
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.c = null;
        }
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
        this.c = this.b.scheduleAtFixedRate(new adlv(this, adlmVar), 300000L, 300000L, TimeUnit.MILLISECONDS);
    }
}
