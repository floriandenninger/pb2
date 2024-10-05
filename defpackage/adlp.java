package defpackage;

import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlp {
    public final Optional a;
    public final long b;
    public final adks c;
    public final String d;
    public final String e;
    public final Optional f;
    public final String g;
    public final int h;
    public final int i;
    public final adgn j;

    public adlp() {
    }

    public adlp(int i, Optional optional, long j, adks adksVar, String str, String str2, Optional optional2, adgn adgnVar, String str3, int i2) {
        this.i = i;
        this.a = optional;
        this.b = j;
        this.c = adksVar;
        this.d = str;
        this.e = str2;
        this.f = optional2;
        this.j = adgnVar;
        this.g = str3;
        this.h = i2;
    }

    public static adlo a() {
        adlo adloVar = new adlo((byte[]) null);
        adloVar.h(0L);
        adloVar.d("");
        adloVar.e("");
        adloVar.g(UUID.randomUUID().toString());
        adloVar.f(0);
        return adloVar;
    }

    public final adlo b() {
        return new adlo(this);
    }

    public final boolean equals(Object obj) {
        adks adksVar;
        adgn adgnVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adlp)) {
            return false;
        }
        adlp adlpVar = (adlp) obj;
        int i = this.i;
        int i2 = adlpVar.i;
        if (i != 0) {
            return i == i2 && this.a.equals(adlpVar.a) && this.b == adlpVar.b && ((adksVar = this.c) != null ? adksVar.equals(adlpVar.c) : adlpVar.c == null) && this.d.equals(adlpVar.d) && this.e.equals(adlpVar.e) && this.f.equals(adlpVar.f) && ((adgnVar = this.j) != null ? adgnVar.equals(adlpVar.j) : adlpVar.j == null) && this.g.equals(adlpVar.g) && this.h == adlpVar.h;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.i;
        amkq.cU(i);
        int hashCode = this.a.hashCode();
        long j = this.b;
        int i2 = (((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        adks adksVar = this.c;
        int hashCode2 = (((((((i2 ^ (adksVar == null ? 0 : adksVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        adgn adgnVar = this.j;
        return ((((hashCode2 ^ (adgnVar != null ? adgnVar.hashCode() : 0)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h;
    }

    public final String toString() {
        int i = this.i;
        String cT = i != 0 ? amkq.cT(i) : "null";
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        String str = this.d;
        String str2 = this.e;
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.j);
        String str3 = this.g;
        int i2 = this.h;
        int length = cT.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(str).length();
        int length5 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 206 + length2 + length3 + length4 + length5 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(str3).length());
        sb.append("MdxSessionInfo{sessionType=");
        sb.append(cT);
        sb.append(", connectedInfo=");
        sb.append(valueOf);
        sb.append(", startedTimeMs=");
        sb.append(j);
        sb.append(", dialSessionInfo=");
        sb.append(valueOf2);
        sb.append(", mediaRouteId=");
        sb.append(str);
        sb.append(", screenName=");
        sb.append(str2);
        sb.append(", loggedDisconnectReason=");
        sb.append(valueOf3);
        sb.append(", pairingCode=");
        sb.append(valueOf4);
        sb.append(", sessionNonce=");
        sb.append(str3);
        sb.append(", sessionIndex=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
