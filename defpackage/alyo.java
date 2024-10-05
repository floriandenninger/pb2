package defpackage;

import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alyo {
    public final AccountId a;
    private final alym b;

    public alyo() {
    }

    public static alyo a(AccountId accountId, alym alymVar) {
        return new alyo(accountId, alymVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alyo) {
            alyo alyoVar = (alyo) obj;
            if (this.a.equals(alyoVar.a) && this.b.equals(alyoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(valueOf2).length());
        sb.append("AccountContext{id=");
        sb.append(valueOf);
        sb.append(", info=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public alyo(AccountId accountId, alym alymVar) {
        if (accountId == null) {
            throw new NullPointerException("Null id");
        }
        this.a = accountId;
        this.b = alymVar;
    }
}
