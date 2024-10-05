package defpackage;

import android.content.Intent;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tyb implements tya {
    private final twx a;
    private final tzd b;
    private final ucn c;
    private final udg d;
    private final tzh e;

    public tyb(twx twxVar, tzd tzdVar, ucn ucnVar, udg udgVar, tzh tzhVar) {
        this.a = twxVar;
        this.b = tzdVar;
        this.c = ucnVar;
        this.d = udgVar;
        this.e = tzhVar;
    }

    @Override // defpackage.tya
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    @Override // defpackage.tya
    public final void b(Intent intent, twd twdVar, long j) {
        tzk.e("AccountChangedIntentHandler", "Account changed event received.", new Object[0]);
        this.e.b(aohx.LOGIN_ACCOUNTS_CHANGED).i();
        try {
            Set a = this.c.a();
            for (twu twuVar : this.a.c()) {
                if (!a.contains(twuVar.b)) {
                    this.b.a(twuVar, true);
                }
            }
        } catch (ucm e) {
            this.e.c(37).i();
            tzk.c("AccountChangedIntentHandler", e, "Account cleanup skipped due to error getting device accounts", new Object[0]);
        }
        if (axsd.a.get().b()) {
            return;
        }
        this.d.a(aokm.ACCOUNT_CHANGED);
    }

    @Override // defpackage.tya
    public final boolean c(Intent intent) {
        return "android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction());
    }
}
