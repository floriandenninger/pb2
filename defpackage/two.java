package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class two {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final boolean l;
    public final int m;

    public two() {
    }

    public two(Integer num, Integer num2, Integer num3, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, int i, int i2, boolean z5) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.m = i;
        this.k = i2;
        this.l = z5;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof two) {
            two twoVar = (two) obj;
            if (this.a.equals(twoVar.a) && this.b.equals(twoVar.b) && ((num = this.c) != null ? num.equals(twoVar.c) : twoVar.c == null) && this.d == twoVar.d && this.e == twoVar.e && this.f == twoVar.f && this.g == twoVar.g && ((str = this.h) != null ? str.equals(twoVar.h) : twoVar.h == null) && ((str2 = this.i) != null ? str2.equals(twoVar.i) : twoVar.i == null) && ((str3 = this.j) != null ? str3.equals(twoVar.j) : twoVar.j == null)) {
                int i = this.m;
                int i2 = twoVar.m;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.k == twoVar.k && this.l == twoVar.l) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Integer num = this.c;
        int hashCode2 = (((((((((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * (-721379959)) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * (-721379959)) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        String str = this.h;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.i;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.j;
        int hashCode5 = (hashCode4 ^ (str3 != null ? str3.hashCode() : 0)) * 1000003;
        int i = this.m;
        if (i != 0) {
            return ((((hashCode5 ^ i) * 1000003) ^ this.k) * 1000003) ^ (true == this.l ? 1231 : 1237);
        }
        throw null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        boolean z4 = this.g;
        String str = this.h;
        String str2 = this.i;
        String str3 = this.j;
        int i = this.m;
        String str4 = i != 1 ? i != 2 ? "null" : "RESHOW_FROM_LOCAL_STORAGE" : "CLEAR_SYSTEM_TRAY";
        int i2 = this.k;
        boolean z5 = this.l;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = "null".length();
        int length5 = "null".length();
        StringBuilder sb = new StringBuilder(length + 367 + length2 + length3 + length4 + length5 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + str4.length());
        sb.append("SystemTrayNotificationConfig{iconResourceId=");
        sb.append(valueOf);
        sb.append(", appNameResourceId=");
        sb.append(valueOf2);
        sb.append(", colorResourceId=");
        sb.append(valueOf3);
        sb.append(", soundEnabled=");
        sb.append(z);
        sb.append(", ringtone=");
        sb.append("null");
        sb.append(", vibrationEnabled=");
        sb.append(z2);
        sb.append(", lightsEnabled=");
        sb.append(z3);
        sb.append(", ledColor=");
        sb.append("null");
        sb.append(", displayRecipientAccountName=");
        sb.append(z4);
        sb.append(", notificationClickedActivity=");
        sb.append(str);
        sb.append(", notificationRemovedReceiver=");
        sb.append(str2);
        sb.append(", defaultChannelId=");
        sb.append(str3);
        sb.append(", restartBehavior=");
        sb.append(str4);
        sb.append(", defaultGroupThreshold=");
        sb.append(i2);
        sb.append(", shouldFilterOldThreads=");
        sb.append(z5);
        sb.append("}");
        return sb.toString();
    }
}
