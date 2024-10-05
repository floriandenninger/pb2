package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acwy implements admf {
    public static final String a = zga.a("MDX.CastShortLivedLoungeTokenRefresher");
    public final adfu b;
    public ScheduledFuture c;
    final acwx d;
    public admc e;
    private final acwt f;
    private final int g;
    private final ScheduledExecutorService h;

    public acwy(adfu adfuVar, acwt acwtVar, int i, ScheduledExecutorService scheduledExecutorService) {
        acwx acwxVar = new acwx(this);
        this.d = acwxVar;
        this.b = adfuVar;
        this.f = acwtVar;
        this.g = i;
        this.h = scheduledExecutorService;
        ((admr) acwtVar).a.l.add(acwxVar);
    }

    @Override // defpackage.admf
    public final void a(final admc admcVar) {
        zga.h(a, String.format("Attempting to get a new lounge token for Cast screen %s", this.b.c()));
        this.e = admcVar;
        ((admr) this.f).e("getLoungeToken");
        this.c = this.h.schedule(new Runnable() { // from class: acww
            @Override // java.lang.Runnable
            public final void run() {
                acwy acwyVar = acwy.this;
                admc admcVar2 = admcVar;
                zga.m(acwy.a, String.format("Never received LoungeToken message back from Cast SDK for screen %s.", acwyVar.b.c()));
                admcVar2.a(adme.NO_LOUNGE_TOKEN_RESPONSE);
                acwyVar.c = null;
            }
        }, this.g, TimeUnit.SECONDS);
    }
}
