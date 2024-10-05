package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rpx extends rpt {
    public boolean b;
    public volatile boolean c;
    public Object d;
    public Exception e;
    public final Object a = new Object();
    public final alse f = new alse(null);

    private final void v() {
        qip.aw(this.b, "Task is not yet complete");
    }

    private final void w() {
        if (this.c) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void x() {
        String str;
        if (this.b) {
            if (j()) {
                Exception f = f();
                if (f != null) {
                    str = "failure";
                } else if (k()) {
                    String valueOf = String.valueOf(g());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
                    sb.append("result ");
                    sb.append(valueOf);
                    str = sb.toString();
                } else {
                    str = this.c ? "cancellation" : "unknown issue";
                }
                String valueOf2 = String.valueOf(str);
                throw new rpc(valueOf2.length() != 0 ? "Complete with: ".concat(valueOf2) : new String("Complete with: "), f);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    private final void y() {
        synchronized (this.a) {
            if (this.b) {
                this.f.d(this);
            }
        }
    }

    @Override // defpackage.rpt
    public final rpt a(rox roxVar) {
        return b(rpw.a, roxVar);
    }

    @Override // defpackage.rpt
    public final rpt b(Executor executor, rox roxVar) {
        rpx rpxVar = new rpx();
        this.f.c(new roz(executor, roxVar, rpxVar));
        y();
        return rpxVar;
    }

    @Override // defpackage.rpt
    public final rpt c(Executor executor, rox roxVar) {
        rpx rpxVar = new rpx();
        this.f.c(new rpb(executor, roxVar, rpxVar));
        y();
        return rpxVar;
    }

    @Override // defpackage.rpt
    public final rpt d(rps rpsVar) {
        return e(rpw.a, rpsVar);
    }

    @Override // defpackage.rpt
    public final rpt e(Executor executor, rps rpsVar) {
        rpx rpxVar = new rpx();
        this.f.c(new rpq(executor, rpsVar, rpxVar));
        y();
        return rpxVar;
    }

    @Override // defpackage.rpt
    public final Exception f() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // defpackage.rpt
    public final Object g() {
        Object obj;
        synchronized (this.a) {
            v();
            w();
            Exception exc = this.e;
            if (exc == null) {
                obj = this.d;
            } else {
                throw new rpr(exc);
            }
        }
        return obj;
    }

    @Override // defpackage.rpt
    public final Object h(Class cls) {
        Object obj;
        synchronized (this.a) {
            v();
            w();
            if (!cls.isInstance(this.e)) {
                Exception exc = this.e;
                if (exc == null) {
                    obj = this.d;
                } else {
                    throw new rpr(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.e));
            }
        }
        return obj;
    }

    @Override // defpackage.rpt
    public final boolean i() {
        return this.c;
    }

    @Override // defpackage.rpt
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.rpt
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b && !this.c && this.e == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.rpt
    public final void l(Executor executor, rpf rpfVar) {
        this.f.c(new rpe(executor, rpfVar));
        y();
    }

    @Override // defpackage.rpt
    public final void m(Executor executor, rpi rpiVar) {
        this.f.c(new rph(executor, rpiVar));
        y();
    }

    @Override // defpackage.rpt
    public final void n(rpl rplVar) {
        o(rpw.a, rplVar);
    }

    @Override // defpackage.rpt
    public final void o(Executor executor, rpl rplVar) {
        this.f.c(new rpk(executor, rplVar));
        y();
    }

    @Override // defpackage.rpt
    public final void p(Executor executor, rpo rpoVar) {
        this.f.c(new rpn(executor, rpoVar));
        y();
    }

    @Override // defpackage.rpt
    public final void q(rpi rpiVar) {
        m(rpw.a, rpiVar);
    }

    @Override // defpackage.rpt
    public final void r(rpo rpoVar) {
        p(rpw.a, rpoVar);
    }

    public final void s(Exception exc) {
        qip.az(exc, "Exception must not be null");
        synchronized (this.a) {
            x();
            this.b = true;
            this.e = exc;
        }
        this.f.d(this);
    }

    public final void t(Object obj) {
        synchronized (this.a) {
            x();
            this.b = true;
            this.d = obj;
        }
        this.f.d(this);
    }

    public final void u() {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c = true;
            this.f.d(this);
        }
    }
}
