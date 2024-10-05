package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayjl implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ ayjn b;

    public ayjl(ayjn ayjnVar, Status status) {
        this.b = ayjnVar;
        this.a = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.c.p.a == ayae.SHUTDOWN) {
            return;
        }
        ayli ayliVar = this.b.c.o;
        ayjn ayjnVar = this.b;
        aygo aygoVar = ayjnVar.a;
        if (ayliVar == aygoVar) {
            ayjnVar.c.o = null;
            this.b.c.f.b();
            this.b.c.b(ayae.IDLE);
            return;
        }
        ayjp ayjpVar = ayjnVar.c;
        if (ayjpVar.n == aygoVar) {
            amkq.Q(ayjpVar.p.a == ayae.CONNECTING, "Expected state is CONNECTING, actual state is %s", this.b.c.p.a);
            ayjk ayjkVar = this.b.c.f;
            ayan ayanVar = (ayan) ayjkVar.a.get(ayjkVar.b);
            int i = ayjkVar.c + 1;
            ayjkVar.c = i;
            if (i >= ayanVar.b.size()) {
                ayjkVar.b++;
                ayjkVar.c = 0;
            }
            ayjk ayjkVar2 = this.b.c.f;
            if (ayjkVar2.b >= ayjkVar2.a.size()) {
                this.b.c.n = null;
                this.b.c.f.b();
                ayjp ayjpVar2 = this.b.c;
                Status status = this.a;
                ayjpVar2.e.d();
                amkq.F(!status.f(), "The error status must not be OK");
                ayjpVar2.d(new ayaf(ayae.TRANSIENT_FAILURE, status));
                if (ayjpVar2.r == null) {
                    ayjpVar2.r = ayep.d();
                }
                long a = ayjpVar2.r.a() - ayjpVar2.h.a(TimeUnit.NANOSECONDS);
                ayjpVar2.d.b(2, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", ayjp.k(status), Long.valueOf(a));
                amkq.O(ayjpVar2.i == null, "previous reconnectTask is not done");
                ayjpVar2.i = ayjpVar2.e.a(new ayjb(ayjpVar2, 1), a, TimeUnit.NANOSECONDS, ayjpVar2.b);
                return;
            }
            this.b.c.h();
        }
    }
}
