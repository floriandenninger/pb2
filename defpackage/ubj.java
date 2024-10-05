package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubj implements uau {
    private final tzt a;
    private final twx b;
    private final shf c;
    private final tzh d;

    public ubj(tzt tztVar, twx twxVar, tzh tzhVar, shf shfVar) {
        this.a = tztVar;
        this.b = twxVar;
        this.d = tzhVar;
        this.c = shfVar;
    }

    @Override // defpackage.uau
    public final void a(String str, aooy aooyVar, Throwable th) {
        tzk.g("FetchUpdatedThreadsCallback", "Fetched updated threads for account: %s (FAILURE)", str);
    }

    @Override // defpackage.uau
    public final void b(String str, aooy aooyVar, aooy aooyVar2) {
        aojc aojcVar = (aojc) aooyVar2;
        tzk.e("FetchUpdatedThreadsCallback", "Fetched updated threads for account: %s [%d threads](SUCCESS)", str, Integer.valueOf(aojcVar.b.size()));
        try {
            twu b = this.b.b(str);
            if (aojcVar.c > b.d.longValue()) {
                twp b2 = b.b();
                b2.c = Long.valueOf(aojcVar.c);
                b = b2.a();
                this.b.e(b);
            }
            twu twuVar = b;
            if (aojcVar.b.size() > 0) {
                long micros = TimeUnit.MILLISECONDS.toMicros(this.c.c());
                tzf a = this.d.a(aoic.FETCHED_UPDATED_THREADS);
                a.d(twuVar);
                a.f(aojcVar.b);
                a.g(micros);
                a.i();
                this.a.a(twuVar, aojcVar.b, twd.b(), new tzg(Long.valueOf(micros), Long.valueOf(this.c.d()), aohm.FETCHED_UPDATED_THREADS), false);
            }
        } catch (tww e) {
            tzk.c("FetchUpdatedThreadsCallback", e, "Account not found in scheduled callback.", new Object[0]);
        }
    }
}
