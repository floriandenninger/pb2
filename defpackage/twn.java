package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class twn {
    public final String a;
    public final String b;
    public final twm c;
    public final two d;
    public final String e;
    public final Long f;
    public final Integer g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    private final String k;

    public twn() {
    }

    public twn(String str, String str2, twm twmVar, two twoVar, String str3, Long l, String str4, Integer num, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = twmVar;
        this.d = twoVar;
        this.e = str3;
        this.f = l;
        this.k = str4;
        this.g = num;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        two twoVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof twn) {
            twn twnVar = (twn) obj;
            if (this.a.equals(twnVar.a) && this.b.equals(twnVar.b) && this.c.equals(twnVar.c) && ((twoVar = this.d) != null ? twoVar.equals(twnVar.d) : twnVar.d == null) && this.e.equals(twnVar.e) && this.f.equals(twnVar.f) && ((str = this.k) != null ? str.equals(twnVar.k) : twnVar.k == null) && this.g.equals(twnVar.g) && this.h == twnVar.h && this.i == twnVar.i && this.j == twnVar.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        two twoVar = this.d;
        int hashCode2 = (((((hashCode ^ (twoVar == null ? 0 : twoVar.hashCode())) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str = this.k;
        return ((((((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * (-721379959)) ^ this.g.hashCode()) * (-721379959)) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true == this.j ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String str3 = this.e;
        String valueOf3 = String.valueOf(this.f);
        String str4 = this.k;
        String valueOf4 = String.valueOf(this.g);
        boolean z = this.h;
        boolean z2 = this.i;
        boolean z3 = this.j;
        int length = String.valueOf(str).length();
        int length2 = "null".length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(valueOf).length();
        int length5 = String.valueOf(valueOf2).length();
        int length6 = String.valueOf(str3).length();
        int length7 = String.valueOf(valueOf3).length();
        int length8 = String.valueOf(str4).length();
        int length9 = "null".length();
        StringBuilder sb = new StringBuilder(length + 309 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(valueOf4).length() + "null".length());
        sb.append("ChimeConfig{clientId=");
        sb.append(str);
        sb.append(", selectionTokens=");
        sb.append("null");
        sb.append(", gcmSenderProjectId=");
        sb.append(str2);
        sb.append(", environment=");
        sb.append(valueOf);
        sb.append(", systemTrayNotificationConfig=");
        sb.append(valueOf2);
        sb.append(", deviceName=");
        sb.append(str3);
        sb.append(", registrationStalenessTimeMs=");
        sb.append(valueOf3);
        sb.append(", scheduledTaskService=");
        sb.append(str4);
        sb.append(", apiKey=null, jobSchedulerAllowedIDsRange=");
        sb.append(valueOf4);
        sb.append(", firebaseOptions=");
        sb.append("null");
        sb.append(", forceLogging=");
        sb.append(z);
        sb.append(", disableChimeEntrypoints=");
        sb.append(z2);
        sb.append(", useDefaultFirebaseApp=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
