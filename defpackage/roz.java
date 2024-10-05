package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class roz implements rpu {
    public final rox a;
    public final rpx b;
    private final Executor c;

    public roz(Executor executor, rox roxVar, rpx rpxVar) {
        this.c = executor;
        this.a = roxVar;
        this.b = rpxVar;
    }

    @Override // defpackage.rpu
    public final void a(rpt rptVar) {
        this.c.execute(new roy(this, rptVar));
    }
}
