package defpackage;

import android.accounts.Account;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wiu implements wiv {
    public final wkk a;
    public final wcm b;
    public final afwx c;
    public final long d;
    public final ylf e;
    private final Executor f;

    public wiu(afsy afsyVar, Executor executor, wkk wkkVar, aahd aahdVar, wiz wizVar, wcm wcmVar, ylf ylfVar, wiw wiwVar, aadw aadwVar, ci ciVar) {
        this.a = wkkVar;
        this.f = executor;
        this.b = wcmVar;
        this.e = ylfVar;
        this.c = new wit(afsyVar, wizVar, aahdVar, ciVar);
        wiwVar.a.add(this);
        aotz aotzVar = aadwVar.b().i;
        if (((aotzVar == null ? aotz.a : aotzVar).b & 16) == 0) {
            this.d = TimeUnit.MINUTES.toSeconds(60L);
        } else {
            this.d = TimeUnit.MINUTES.toSeconds(r1.c);
        }
    }

    public final void a() {
        this.f.execute(new Runnable() { // from class: wis
            @Override // java.lang.Runnable
            public final void run() {
                Account[] h;
                int length;
                int i;
                wiu wiuVar = wiu.this;
                wkk wkkVar = wiuVar.a;
                try {
                    h = wkkVar.h();
                    length = h.length;
                } catch (Exception unused) {
                }
                while (i < length) {
                    Account account = h[i];
                    i = (wkkVar.g(account) || wkkVar.f(account)) ? 0 : i + 1;
                    if (wiuVar.d > 0) {
                        wiuVar.b.b(null, wiuVar.c);
                        wiuVar.e.e("modular_onboarding_check", wiuVar.d, true, 1, null, null, false);
                        return;
                    }
                    return;
                }
            }
        });
    }

    @Override // defpackage.wiv
    public final void b() {
        a();
    }
}
