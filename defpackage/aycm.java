package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aycm {
    public final aykk a;
    public final aycq b;
    public final /* synthetic */ aykx c;

    public aycm() {
    }

    public final void a(Status status) {
        aykx.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{this.c.i, status});
        aykt ayktVar = this.c.I;
        if (ayktVar.a.get() == aykx.g) {
            ayktVar.d(null);
        }
        aykx aykxVar = this.c;
        if (aykxVar.S != 3) {
            aykxVar.G.b(3, "Failed to resolve name: {0}", status);
            this.c.S = 3;
        }
        aykk aykkVar = this.a;
        if (aykkVar != this.c.s) {
            return;
        }
        aykkVar.a.b.a(status);
        aykx aykxVar2 = this.c;
        aydg aydgVar = aykxVar2.R;
        if (aydgVar != null) {
            aydf aydfVar = aydgVar.a;
            if (!aydfVar.c && !aydfVar.b) {
                return;
            }
        }
        if (aykxVar2.T == null) {
            aykxVar2.T = ayep.d();
        }
        long a = this.c.T.a();
        this.c.G.b(1, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a));
        aykx aykxVar3 = this.c;
        aykxVar3.R = aykxVar3.o.a(new ayjx(aykxVar3, 3), a, TimeUnit.NANOSECONDS, this.c.j.b());
    }

    public final void b(Status status) {
        amkq.F(!status.f(), "the error status must not be OK");
        this.c.o.execute(new aykl(this, status));
    }

    public final void c(ayco aycoVar) {
        this.c.o.execute(new aykm(this, aycoVar));
    }

    public aycm(aykx aykxVar, aykk aykkVar, aycq aycqVar) {
        this.c = aykxVar;
        this.a = aykkVar;
        aycqVar.getClass();
        this.b = aycqVar;
    }
}
