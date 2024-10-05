package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aght {
    public final boolean a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final boolean h;
    private final boolean i;

    public aght() {
    }

    public aght(boolean z, boolean z2, int i, int i2, long j, long j2, boolean z3, int i3, boolean z4) {
        this.a = z;
        this.i = z2;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z3;
        this.g = i3;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aght) {
            aght aghtVar = (aght) obj;
            if (this.a == aghtVar.a && this.i == aghtVar.i && this.b == aghtVar.b && this.c == aghtVar.c && this.d == aghtVar.d && this.e == aghtVar.e && this.f == aghtVar.f && this.g == aghtVar.g && this.h == aghtVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        int i2 = true != this.i ? 1237 : 1231;
        int i3 = this.b;
        int i4 = this.c;
        long j = this.d;
        long j2 = this.e;
        return ((((((((((((((i ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.i;
        int i = this.b;
        int i2 = this.c;
        long j = this.d;
        long j2 = this.e;
        boolean z3 = this.f;
        int i3 = this.g;
        boolean z4 = this.h;
        StringBuilder sb = new StringBuilder(362);
        sb.append("OfflineModuleConfig{enablePlaylistAutoSync=");
        sb.append(z);
        sb.append(", enableYouTubeBundles=");
        sb.append(z2);
        sb.append(", transferRetryStrategy=");
        sb.append(i);
        sb.append(", transferMaxRetries=");
        sb.append(i2);
        sb.append(", transferBaseRetryMilliSecs=");
        sb.append(j);
        sb.append(", transferMaxRetryMilliSecs=");
        sb.append(j2);
        sb.append(", disableOfflineWhenDatabaseOpenException=");
        sb.append(z3);
        sb.append(", databaseOpenRetries=");
        sb.append(i3);
        sb.append(", enableFallbackToAudioOnlyDownload=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}
