package defpackage;

import com.google.apps.tiktok.account.AccountId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alyk {
    public final AccountId a;
    public final alym b;
    public final int c;

    public alyk() {
    }

    public static alyk a(AccountId accountId, alym alymVar, int i) {
        return new alyk(accountId, alymVar, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alyk) {
            alyk alykVar = (alyk) obj;
            if (this.a.equals(alykVar.a) && this.b.equals(alykVar.b) && this.c == alykVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String num = Integer.toString(this.c - 1);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27 + String.valueOf(valueOf2).length() + num.length());
        sb.append("Account{id=");
        sb.append(valueOf);
        sb.append(", info=");
        sb.append(valueOf2);
        sb.append(", state=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }

    public alyk(AccountId accountId, alym alymVar, int i) {
        this.a = accountId;
        if (alymVar == null) {
            throw new NullPointerException("Null info");
        }
        this.b = alymVar;
        this.c = i;
    }
}
