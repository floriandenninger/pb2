package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rpq implements rpu, rpo, rpl, rpf {
    public final rps a;
    private final Executor b;
    private final rpx c;

    public rpq(Executor executor, rps rpsVar, rpx rpxVar) {
        this.b = executor;
        this.a = rpsVar;
        this.c = rpxVar;
    }

    @Override // defpackage.rpu
    public final void a(rpt rptVar) {
        this.b.execute(new rpp(this, rptVar));
    }

    @Override // defpackage.rpf
    public final void b() {
        this.c.u();
    }

    @Override // defpackage.rpl
    public final void c(Exception exc) {
        this.c.s(exc);
    }

    @Override // defpackage.rpo
    public final void d(Object obj) {
        this.c.t(obj);
    }
}
