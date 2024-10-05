package defpackage;

import com.google.android.gms.auth.TokenData;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uck {
    public final String a;
    public final long b;

    public uck(TokenData tokenData) {
        String str = tokenData.b;
        str.getClass();
        Long l = tokenData.c;
        long longValue = (l == null ? Long.MAX_VALUE : l).longValue();
        this.a = str;
        this.b = longValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uck)) {
            return false;
        }
        uck uckVar = (uck) obj;
        return azul.c(this.a, uckVar.a) && this.b == uckVar.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "AuthTokenData(token=" + this.a + ", expirationTimeSecs=" + this.b + ')';
    }
}
