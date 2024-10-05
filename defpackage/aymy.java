package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aymy implements Runnable {
    final /* synthetic */ aymz a;

    public aymy(aymz aymzVar) {
        this.a = aymzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aymx aymxVar;
        aynk aynkVar;
        aynl aynlVar = this.a.b;
        boolean z = false;
        aynj p = aynlVar.p(aynlVar.r.e, false);
        synchronized (this.a.b.l) {
            aymz aymzVar = this.a;
            aymxVar = null;
            if (aymzVar.a.c) {
                z = true;
            } else {
                aynl aynlVar2 = aymzVar.b;
                aynlVar2.r = aynlVar2.r.a(p);
                aynl aynlVar3 = this.a.b;
                if (!aynlVar3.v(aynlVar3.r) || ((aynkVar = this.a.b.p) != null && !aynkVar.a())) {
                    aynl aynlVar4 = this.a.b;
                    aynlVar4.r = aynlVar4.r.b();
                    this.a.b.w = null;
                } else {
                    aynl aynlVar5 = this.a.b;
                    aymxVar = new aymx(aynlVar5.l);
                    aynlVar5.w = aymxVar;
                }
            }
        }
        if (z) {
            p.a.c(Status.c.withDescription("Unneeded hedging"));
            return;
        }
        if (aymxVar != null) {
            aynl aynlVar6 = this.a.b;
            aymxVar.b(aynlVar6.h.schedule(new aymz(aynlVar6, aymxVar), this.a.b.j.b, TimeUnit.NANOSECONDS));
        }
        this.a.b.t(p);
    }
}
