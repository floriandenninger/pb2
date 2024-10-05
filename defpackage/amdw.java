package defpackage;

import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amdw {
    public final amea a;
    public final ames b;

    public amdw(amea ameaVar, ammv ammvVar, ames amesVar) {
        this.a = ameaVar;
        if (ammvVar.h()) {
            amkq.N(ammvVar.c() instanceof zv);
        }
        this.b = amesVar;
    }

    public final amdv a(AccountId accountId) {
        aps apsVar = new aps(this.b, new amdu(this, accountId));
        String valueOf = String.valueOf(accountId == null ? "null" : Integer.valueOf(accountId.a()));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("tt_activity_account_retained:");
        sb.append(valueOf);
        return (amdv) apsVar.b(sb.toString(), amdv.class);
    }

    public final Object b(AccountId accountId) {
        Object obj;
        amdv a = a(accountId);
        synchronized (a.d) {
            if (a.e == null) {
                eea b = ((amdt) axfq.n(a.b.a(a.c), amdt.class)).b();
                a.e = new ehs(b.a, b.b);
            }
            obj = a.e;
        }
        return obj;
    }
}
