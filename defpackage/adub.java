package defpackage;

import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adub {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final adtx f;
    public final WatchNextResponseModel g;
    public final aigk h;
    public final aign i;
    public final int j;
    public final adtz k;
    public final String l;

    public adub() {
    }

    public adub(int i, String str, String str2, int i2, int i3, adtx adtxVar, WatchNextResponseModel watchNextResponseModel, aigk aigkVar, aign aignVar, int i4, adtz adtzVar, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = adtxVar;
        this.g = watchNextResponseModel;
        this.h = aigkVar;
        this.i = aignVar;
        this.j = i4;
        this.k = adtzVar;
        this.l = str3;
    }

    public static adua a() {
        adua aduaVar = new adua();
        aduaVar.e(0);
        aduaVar.g(0);
        aduaVar.c(0);
        aduaVar.b("");
        aduaVar.f(aigk.NEW);
        aduaVar.h(aign.NEW);
        aduaVar.d(2);
        aduaVar.c = adtx.a().a();
        adty adtyVar = new adty();
        adtyVar.b(1);
        aduaVar.e = adtyVar.a();
        return aduaVar;
    }

    public final adua b() {
        return new adua(this);
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        WatchNextResponseModel watchNextResponseModel;
        if (obj == this) {
            return true;
        }
        if (obj instanceof adub) {
            adub adubVar = (adub) obj;
            if (this.a == adubVar.a && ((str = this.b) != null ? str.equals(adubVar.b) : adubVar.b == null) && ((str2 = this.c) != null ? str2.equals(adubVar.c) : adubVar.c == null) && this.d == adubVar.d && this.e == adubVar.e && this.f.equals(adubVar.f) && ((watchNextResponseModel = this.g) != null ? watchNextResponseModel.equals(adubVar.g) : adubVar.g == null) && this.h.equals(adubVar.h) && this.i.equals(adubVar.i) && this.j == adubVar.j && this.k.equals(adubVar.k) && this.l.equals(adubVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        int i2 = this.d;
        int i3 = this.e;
        String valueOf = String.valueOf(this.f);
        String valueOf2 = String.valueOf(this.g);
        String valueOf3 = String.valueOf(this.h);
        String valueOf4 = String.valueOf(this.i);
        int i4 = this.j;
        String valueOf5 = String.valueOf(this.k);
        String str3 = this.l;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 263 + length2 + length3 + length4 + length5 + length6 + String.valueOf(valueOf5).length() + String.valueOf(str3).length());
        sb.append("MdxWatchState{playbackState=");
        sb.append(i);
        sb.append(", videoTitle=");
        sb.append(str);
        sb.append(", screenName=");
        sb.append(str2);
        sb.append(", totalVideosInQueue=");
        sb.append(i2);
        sb.append(", currentVideoIndexInQueue=");
        sb.append(i3);
        sb.append(", mdxAdState=");
        sb.append(valueOf);
        sb.append(", watchNextResponse=");
        sb.append(valueOf2);
        sb.append(", sequencerStage=");
        sb.append(valueOf3);
        sb.append(", videoStage=");
        sb.append(valueOf4);
        sb.append(", mdxConnectionState=");
        sb.append(i4);
        sb.append(", autonavState=");
        sb.append(valueOf5);
        sb.append(", currentVideoId=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode2 = (((((((hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003;
        WatchNextResponseModel watchNextResponseModel = this.g;
        return ((((((((((hashCode2 ^ (watchNextResponseModel != null ? watchNextResponseModel.hashCode() : 0)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }
}
