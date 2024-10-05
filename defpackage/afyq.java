package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afyq {
    public final Intent a;
    public final Intent b;
    public final Intent c;
    public final int d;
    public final int e;
    public final int f;
    private final String g;

    public afyq() {
    }

    public afyq(Intent intent, Intent intent2, Intent intent3, int i, int i2, int i3, String str) {
        this.a = intent;
        this.b = intent2;
        this.c = intent3;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afyq) {
            afyq afyqVar = (afyq) obj;
            Intent intent = this.a;
            if (intent != null ? intent.equals(afyqVar.a) : afyqVar.a == null) {
                Intent intent2 = this.b;
                if (intent2 != null ? intent2.equals(afyqVar.b) : afyqVar.b == null) {
                    Intent intent3 = this.c;
                    if (intent3 != null ? intent3.equals(afyqVar.c) : afyqVar.c == null) {
                        if (this.d == afyqVar.d && this.e == afyqVar.e && this.f == afyqVar.f) {
                            String str = this.g;
                            String str2 = afyqVar.g;
                            if (str != null ? str.equals(str2) : str2 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        String str = this.g;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 170 + length2 + String.valueOf(valueOf3).length() + String.valueOf(str).length());
        sb.append("NotificationModuleConfig{serviceIntent=");
        sb.append(valueOf);
        sb.append(", mainActivityIntent=");
        sb.append(valueOf2);
        sb.append(", dialogActivityIntent=");
        sb.append(valueOf3);
        sb.append(", smallIcon=");
        sb.append(i);
        sb.append(", largeIcon=");
        sb.append(i2);
        sb.append(", appLabel=");
        sb.append(i3);
        sb.append(", apiaryProjectId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        Intent intent = this.a;
        int hashCode = ((intent == null ? 0 : intent.hashCode()) ^ 1000003) * 1000003;
        Intent intent2 = this.b;
        int hashCode2 = (hashCode ^ (intent2 == null ? 0 : intent2.hashCode())) * 1000003;
        Intent intent3 = this.c;
        int hashCode3 = (((((((hashCode2 ^ (intent3 == null ? 0 : intent3.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003;
        String str = this.g;
        return hashCode3 ^ (str != null ? str.hashCode() : 0);
    }
}
