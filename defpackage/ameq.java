package defpackage;

import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ameq implements axqk {
    private volatile Object a;
    private final Object b = new Object();
    private final ce c;

    public ameq(ce ceVar) {
        this.c = ceVar;
    }

    public static final void a(ce ceVar, AccountId accountId) {
        int a = accountId.a();
        amkq.P(a >= 0, "AccountId is invalid: %s", a);
        ayaw.r(ceVar);
        if (ceVar.m == null) {
            ceVar.af(new Bundle());
        }
        ceVar.m.putInt("TIKTOK_FRAGMENT_ACCOUNT_ID", a);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        Object obj;
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.c.N().getClass();
                    amkq.Q(this.c.N() instanceof axqk, "Sting Fragments must be attached to an @Sting Activity. Found: %s", this.c.N().getClass());
                    if (this.c.m != null) {
                        amkq.F(!r1.getBoolean("TIKTOK_FRAGMENT_NO_ACCOUNT_ONLY"), "Account-scoped Fragment cannot be instantiated with an argument bundle marking it as no-Account only. If you are using NoAccountNavigation, you must switch to AccountNavigation to navigate to this fragment.");
                    }
                    Bundle bundle = this.c.m;
                    AccountId accountId = null;
                    if (bundle != null && bundle.containsKey("TIKTOK_FRAGMENT_ACCOUNT_ID")) {
                        accountId = AccountId.b(bundle.getInt("TIKTOK_FRAGMENT_ACCOUNT_ID"));
                    }
                    accountId.getClass();
                    if (((ameo) axfq.n(this.c.N(), ameo.class)).lj().a.h()) {
                        ammv ke = ((amep) axfq.n(this.c.N(), amep.class)).ke();
                        if (accountId == null) {
                            accountId = (AccountId) ((amna) ke).a;
                            if (accountId.a() != -1) {
                                a(this.c, accountId);
                            }
                        } else {
                            amkq.O(true, "There is no propagated account id. Did you forget to add one of the account modules:\n\t\"//java/com/google/apps/tiktok/account:module\",\n\t\"//java/com/google/apps/tiktok/account/testing:module\",");
                            if (((AccountId) ((amna) ke).a).a() != -1) {
                                amkq.T(((AccountId) ((amna) ke).a).equals(accountId), "The given account id does not match the propagated account id.\n\tPropagated AccountId: %s\n\tGiven AccountId: %s", ((amna) ke).a, accountId);
                            }
                        }
                    }
                    amdz ka = ((amem) axfq.n(this.c.N(), amem.class)).ka();
                    synchronized (ka.a) {
                        if (!ka.b.containsKey(accountId)) {
                            ka.b.put(accountId, ka.a(accountId));
                        }
                        obj = ka.b.get(accountId);
                    }
                    eel h = ((amen) axfq.n(obj, amen.class)).h();
                    h.b = this.c;
                    ayaw.j(h.b, ce.class);
                    this.a = new ehv(h.a, h.e);
                }
            }
        }
        return this.a;
    }
}
