package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aktg {
    public final ScheduledExecutorService a;
    public final Context b;
    public final long c;
    public final shf d;
    public final yyy e;
    public final yxx f;
    public final yyf g;
    public final yyt h = new yyt();

    public aktg(Context context, shf shfVar, ScheduledExecutorService scheduledExecutorService, yyf yyfVar, yxx yxxVar, Optional optional) {
        this.b = context;
        this.d = shfVar;
        this.c = shfVar.c();
        this.a = scheduledExecutorService;
        this.f = yxxVar;
        this.g = yyfVar;
        this.e = new yyy(yxxVar.f(yxx.L));
    }
}
