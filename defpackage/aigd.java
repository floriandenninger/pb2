package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aigd {
    public static final aigd a = a().a();
    public final acsx b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final afkm h;
    public final avzr i;
    public final int j;

    public aigd() {
    }

    public aigd(acsx acsxVar, boolean z, int i, int i2, boolean z2, boolean z3, afkm afkmVar, avzr avzrVar, int i3) {
        this.b = acsxVar;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = z2;
        this.g = z3;
        this.h = afkmVar;
        this.i = avzrVar;
        this.j = i3;
    }

    public static aigc a() {
        aigc aigcVar = new aigc();
        aigcVar.f(false);
        aigcVar.h(-1);
        aigcVar.g(-1);
        aigcVar.e(false);
        aigcVar.d(false);
        aigcVar.b(avzr.VIDEO_QUALITY_SETTING_UNKNOWN);
        aigcVar.c(-1);
        return aigcVar;
    }

    public final boolean equals(Object obj) {
        afkm afkmVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aigd) {
            aigd aigdVar = (aigd) obj;
            acsx acsxVar = this.b;
            if (acsxVar != null ? acsxVar.equals(aigdVar.b) : aigdVar.b == null) {
                if (this.c == aigdVar.c && this.d == aigdVar.d && this.e == aigdVar.e && this.f == aigdVar.f && this.g == aigdVar.g && ((afkmVar = this.h) != null ? afkmVar.equals(aigdVar.h) : aigdVar.h == null) && this.i.equals(aigdVar.i) && this.j == aigdVar.j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        int i = this.d;
        int i2 = this.e;
        boolean z2 = this.f;
        boolean z3 = this.g;
        String valueOf2 = String.valueOf(this.h);
        String valueOf3 = String.valueOf(this.i);
        int i3 = this.j;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 338 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("PlaybackStartParameters{latencyActionLogger=");
        sb.append(valueOf);
        sb.append(", shouldUseQueuedVideoForNavigation=");
        sb.append(z);
        sb.append(", watchNextResponseProcessingDelay=");
        sb.append(i);
        sb.append(", watchNextResponseParsingDelay=");
        sb.append(i2);
        sb.append(", shouldPauseOnLastFrame=");
        sb.append(z2);
        sb.append(", mediaSessionDisabled=");
        sb.append(z3);
        sb.append(", expectedViewport=");
        sb.append(valueOf2);
        sb.append(", initialPlaybackVideoQuality=");
        sb.append(valueOf3);
        sb.append(", initialPlaybackVideoQualityFixedResolution=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        acsx acsxVar = this.b;
        int hashCode = ((((((((((((acsxVar == null ? 0 : acsxVar.hashCode()) ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003;
        afkm afkmVar = this.h;
        return ((((hashCode ^ (afkmVar != null ? afkmVar.hashCode() : 0)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j;
    }
}
