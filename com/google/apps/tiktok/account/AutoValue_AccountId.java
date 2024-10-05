package com.google.apps.tiktok.account;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AutoValue_AccountId extends AccountId {
    public final int a;

    public AutoValue_AccountId(int i) {
        this.a = i;
    }

    @Override // com.google.apps.tiktok.account.AccountId
    @Deprecated
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AccountId) && this.a == ((AccountId) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(25);
        sb.append("AccountId{id=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
