package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajad {
    public final String a;
    public final byte[] b;
    public final aryi c;
    public final VideoStreamingData d;
    public final aryb e;
    public final aomf f;
    public final atxz g;
    public final boolean h;
    public final String i;

    public ajad() {
    }

    public ajad(String str, byte[] bArr, aryi aryiVar, VideoStreamingData videoStreamingData, aryb arybVar, aomf aomfVar, atxz atxzVar, boolean z, String str2) {
        this.a = str;
        this.b = bArr;
        this.c = aryiVar;
        this.d = videoStreamingData;
        this.e = arybVar;
        this.f = aomfVar;
        this.g = atxzVar;
        this.h = z;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        VideoStreamingData videoStreamingData;
        aryb arybVar;
        aomf aomfVar;
        atxz atxzVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajad) {
            ajad ajadVar = (ajad) obj;
            if (this.a.equals(ajadVar.a)) {
                if (Arrays.equals(this.b, ajadVar instanceof ajad ? ajadVar.b : ajadVar.b) && this.c.equals(ajadVar.c) && ((videoStreamingData = this.d) != null ? videoStreamingData.equals(ajadVar.d) : ajadVar.d == null) && ((arybVar = this.e) != null ? arybVar.equals(ajadVar.e) : ajadVar.e == null) && ((aomfVar = this.f) != null ? aomfVar.equals(ajadVar.f) : ajadVar.f == null) && ((atxzVar = this.g) != null ? atxzVar.equals(ajadVar.g) : ajadVar.g == null) && this.h == ajadVar.h) {
                    String str = this.i;
                    String str2 = ajadVar.i;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode()) * 1000003;
        VideoStreamingData videoStreamingData = this.d;
        int hashCode2 = (hashCode ^ (videoStreamingData == null ? 0 : videoStreamingData.hashCode())) * 1000003;
        aryb arybVar = this.e;
        int hashCode3 = (hashCode2 ^ (arybVar == null ? 0 : arybVar.hashCode())) * 1000003;
        aomf aomfVar = this.f;
        int hashCode4 = (hashCode3 ^ (aomfVar == null ? 0 : aomfVar.hashCode())) * 1000003;
        atxz atxzVar = this.g;
        int hashCode5 = (((hashCode4 ^ (atxzVar == null ? 0 : atxzVar.hashCode())) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003;
        String str = this.i;
        return hashCode5 ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String arrays = Arrays.toString(this.b);
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        boolean z = this.h;
        String str2 = this.i;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(arrays).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 212 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf5).length() + String.valueOf(str2).length());
        sb.append("PlayerResponseHeartbeatInfo{currentVideoId=");
        sb.append(str);
        sb.append(", trackingParams=");
        sb.append(arrays);
        sb.append(", initialPlayabilityStatus=");
        sb.append(valueOf);
        sb.append(", videoStreamingData=");
        sb.append(valueOf2);
        sb.append(", heartbeatParams=");
        sb.append(valueOf3);
        sb.append(", heartbeatServerData=");
        sb.append(valueOf4);
        sb.append(", playerAttestation=");
        sb.append(valueOf5);
        sb.append(", enablePremiereTrailerCodepath=");
        sb.append(z);
        sb.append(", cpn=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
