package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahbv {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final zih f;
    public final int g;
    public final boolean h;

    public ahbv() {
    }

    public ahbv(boolean z, boolean z2, boolean z3, boolean z4, int i, zih zihVar, int i2, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
        this.f = zihVar;
        this.g = i2;
        this.h = z5;
    }

    public static ahbu a() {
        ahbu ahbuVar = new ahbu();
        ahbuVar.d = Integer.valueOf(R.drawable.quantum_ic_video_youtube_white_24);
        ahbuVar.b = false;
        ahbuVar.c = true;
        ahbuVar.a = true;
        ahbuVar.c(false);
        ahbuVar.d(ahbt.a);
        ahbuVar.e = 10;
        ahbuVar.b();
        return ahbuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahbv) {
            ahbv ahbvVar = (ahbv) obj;
            if (this.a == ahbvVar.a && this.b == ahbvVar.b && this.c == ahbvVar.c && this.d == ahbvVar.d && this.e == ahbvVar.e && this.f.equals(ahbvVar.f) && this.g == ahbvVar.g && this.h == ahbvVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        int i = this.e;
        String valueOf = String.valueOf(this.f);
        int i2 = this.g;
        boolean z5 = this.h;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 295);
        sb.append("PlayerModuleConfig{onesieEnabled=");
        sb.append(z);
        sb.append(", enableVss2StatsTracking=");
        sb.append(z2);
        sb.append(", enableRawCcSupport=");
        sb.append(z3);
        sb.append(", enableLegacyHeartbeatFlow=");
        sb.append(z4);
        sb.append(", backgroundNotificationIconResourceId=");
        sb.append(i);
        sb.append(", referringAppProvider=");
        sb.append(valueOf);
        sb.append(", maximumConsecutiveSkippedUnplayableVideos=");
        sb.append(i2);
        sb.append(", enableVss2UserPresenceTracking=");
        sb.append(z5);
        sb.append("}");
        return sb.toString();
    }
}
