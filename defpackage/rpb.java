package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rpb implements rpu, rpo, rpl, rpf {
    public final rox a;
    public final rpx b;
    private final Executor c;

    public rpb(Executor executor, rox roxVar, rpx rpxVar) {
        this.c = executor;
        this.a = roxVar;
        this.b = rpxVar;
    }

    @Override // defpackage.rpu
    public final void a(rpt rptVar) {
        this.c.execute(new rpa(this, rptVar));
    }

    @Override // defpackage.rpf
    public final void b() {
        this.b.u();
    }

    @Override // defpackage.rpl
    public final void c(Exception exc) {
        this.b.s(exc);
    }

    @Override // defpackage.rpo
    public final void d(Object obj) {
        this.b.t(obj);
    }
}
