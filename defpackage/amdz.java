package defpackage;

import android.app.Activity;
import com.google.apps.tiktok.account.AccountId;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amdz {
    public final Object a = new Object();
    public final Map b = new HashMap();
    public final amdy c;
    private final boolean d;
    private final ames e;

    public amdz(ames amesVar, amdy amdyVar) {
        this.e = amesVar;
        this.c = amdyVar;
        boolean z = false;
        if (amdyVar.a.h() && (amdyVar.a.c() instanceof amdm)) {
            z = true;
        }
        this.d = z;
    }

    public final Object a(AccountId accountId) {
        Set b = b();
        boolean z = false;
        if (this.d || b.isEmpty() || (b.size() == 1 && b.contains(accountId))) {
            z = true;
        }
        amkq.T(z, "There is already an account id in use! TikTok does not support multiple accounts yet.\n\tCurrent AccountId: %s\n\tNew AccountId: %s", b, accountId);
        amkq.Q(this.e.a().getApplicationContext() instanceof axqk, "Sting Activity must be attached to an @Sting Application. Found: %s", this.e.a().getApplicationContext());
        amdy amdyVar = this.c;
        if (amdyVar.a.h()) {
            edy a = ((amdx) axfq.n(amdyVar.b.b(accountId), amdx.class)).a();
            a.a = (Activity) amdyVar.a.c();
            return a.a();
        }
        edy a2 = ((amdx) axfq.n(amdyVar.b.b(accountId), amdx.class)).a();
        a2.b = amdyVar.c;
        return a2.a();
    }

    public final Set b() {
        Set unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.b.keySet());
        }
        return unmodifiableSet;
    }
}
