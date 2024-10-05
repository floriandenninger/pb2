package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tzp implements tzo, udr {
    static final long a = TimeUnit.HOURS.toMillis(24);
    private final uds b;
    private final twx c;
    private final ucb d;
    private final Set e;
    private final txo f;
    private final tzh g;

    public tzp(uds udsVar, twx twxVar, txo txoVar, ucb ucbVar, tzh tzhVar, Set set) {
        this.b = udsVar;
        this.c = twxVar;
        this.f = txoVar;
        this.d = ucbVar;
        this.g = tzhVar;
        this.e = set;
    }

    private final void c(twu twuVar) {
        tzf a2 = this.g.a(aoic.PERIODIC_LOG);
        if (twuVar != null) {
            a2.d(twuVar);
        }
        a2.i();
    }

    @Override // defpackage.tzo
    public final void a() {
        if (this.b.d()) {
            tzk.e("ChimePeriodicTaskManager", "Periodic Task already scheduled.", new Object[0]);
            return;
        }
        try {
            this.b.a(null, 7, this, new Bundle());
        } catch (udq unused) {
            tzk.g("ChimePeriodicTaskManager", "Unable to schedule periodic task.", new Object[0]);
        }
    }

    @Override // defpackage.udr
    public final long d() {
        return a;
    }

    @Override // defpackage.udr
    public final twc e(Bundle bundle) {
        List<twu> c = this.c.c();
        if (!c.isEmpty()) {
            for (twu twuVar : c) {
                c(twuVar);
                b(twuVar);
            }
        } else {
            c(null);
        }
        b(null);
        return twc.a;
    }

    @Override // defpackage.udr
    public final String f() {
        return "PERIODIC_TASK";
    }

    @Override // defpackage.udr
    public final boolean g() {
        return true;
    }

    @Override // defpackage.udr
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.udr
    public final /* synthetic */ void i() {
    }

    private final void b(twu twuVar) {
        String str = twuVar == null ? null : twuVar.b;
        long b = axsa.a.get().b();
        if (axsa.a.get().c() && b > 0) {
            txo txoVar = this.f;
            uzi b2 = uzi.b();
            b2.c("thread_stored_timestamp");
            b2.d("<= ?", Long.valueOf(txoVar.b.c() - b));
            txoVar.a.e(str, amru.r(b2.a()));
            amxd listIterator = ((amvs) this.e).listIterator();
            while (listIterator.hasNext()) {
                ((ucp) listIterator.next()).c();
            }
        }
        long a2 = axsa.a.get().a();
        if (a2 > 0) {
            txo txoVar2 = this.f;
            uzi b3 = uzi.b();
            b3.c("_id");
            b3.c(" NOT IN (SELECT ");
            b3.c("_id");
            b3.c(" FROM ");
            b3.c("threads");
            b3.c(" ORDER BY ");
            b3.c("last_notification_version");
            b3.c(" DESC");
            b3.d(" LIMIT ?)", Long.valueOf(a2));
            txoVar2.a.e(str, amru.r(b3.a()));
        }
        if (axxd.b()) {
            ((txd) this.d.a(str)).b(axxg.a.get().a());
        }
    }
}
