package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rbt implements qnr {
    private final Account a;

    public rbt(Account account) {
        if (account == null) {
            throw new NullPointerException("Null account");
        }
        this.a = account;
    }

    @Override // defpackage.qnr
    public final Account a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rbt) {
            return this.a.equals(((rbt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("MdiSyncClientOptions{account=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public rbt() {
    }
}
