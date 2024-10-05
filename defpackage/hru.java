package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hru {
    public final avtn a;
    public final Uri b;
    public final Uri c;
    public final atmc d;
    public final String e;
    public final Long f;
    public final String g;
    public final String h;
    public final amru i;
    public final awaf j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final String n;
    public final int o;

    public hru() {
    }

    public hru(avtn avtnVar, int i, Uri uri, Uri uri2, atmc atmcVar, String str, Long l, String str2, String str3, amru amruVar, awaf awafVar, boolean z, boolean z2, String str4, String str5) {
        this.a = avtnVar;
        this.o = i;
        this.b = uri;
        this.c = uri2;
        this.d = atmcVar;
        this.e = str;
        this.f = l;
        this.g = str2;
        this.h = str3;
        this.i = amruVar;
        this.j = awafVar;
        this.k = z;
        this.l = z2;
        this.m = str4;
        this.n = str5;
    }

    public static hrt a() {
        hrt hrtVar = new hrt();
        hrtVar.d(false);
        hrtVar.b(false);
        return hrtVar;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        atmc atmcVar;
        String str;
        Long l;
        String str2;
        String str3;
        amru amruVar;
        awaf awafVar;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hru) {
            hru hruVar = (hru) obj;
            if (this.a.equals(hruVar.a)) {
                int i = this.o;
                int i2 = hruVar.o;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(hruVar.b) && ((uri = this.c) != null ? uri.equals(hruVar.c) : hruVar.c == null) && ((atmcVar = this.d) != null ? atmcVar.equals(hruVar.d) : hruVar.d == null) && ((str = this.e) != null ? str.equals(hruVar.e) : hruVar.e == null) && ((l = this.f) != null ? l.equals(hruVar.f) : hruVar.f == null) && ((str2 = this.g) != null ? str2.equals(hruVar.g) : hruVar.g == null) && ((str3 = this.h) != null ? str3.equals(hruVar.h) : hruVar.h == null) && ((amruVar = this.i) != null ? amkq.aV(amruVar, hruVar.i) : hruVar.i == null) && ((awafVar = this.j) != null ? awafVar.equals(hruVar.j) : hruVar.j == null) && this.k == hruVar.k && this.l == hruVar.l && ((str4 = this.m) != null ? str4.equals(hruVar.m) : hruVar.m == null)) {
                    String str5 = this.n;
                    String str6 = hruVar.n;
                    if (str5 != null ? str5.equals(str6) : str6 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int i = this.o;
        awxr.ai(i);
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.b.hashCode()) * 1000003;
        Uri uri = this.c;
        int hashCode3 = (hashCode2 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        atmc atmcVar = this.d;
        int hashCode4 = (hashCode3 ^ (atmcVar == null ? 0 : atmcVar.hashCode())) * 1000003;
        String str = this.e;
        int hashCode5 = (hashCode4 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Long l = this.f;
        int hashCode6 = (hashCode5 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode7 = (hashCode6 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode8 = (hashCode7 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        amru amruVar = this.i;
        int hashCode9 = (hashCode8 ^ (amruVar == null ? 0 : amruVar.hashCode())) * 1000003;
        awaf awafVar = this.j;
        int hashCode10 = (((((hashCode9 ^ (awafVar == null ? 0 : awafVar.hashCode())) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true == this.l ? 1231 : 1237)) * 1000003;
        String str4 = this.m;
        int hashCode11 = (hashCode10 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.n;
        return hashCode11 ^ (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.o;
        String ah = i != 0 ? awxr.ah(i) : "null";
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String str = this.e;
        String valueOf5 = String.valueOf(this.f);
        String str2 = this.g;
        String str3 = this.h;
        String valueOf6 = String.valueOf(this.i);
        String valueOf7 = String.valueOf(this.j);
        boolean z = this.k;
        boolean z2 = this.l;
        String str4 = this.m;
        String str5 = this.n;
        int length = String.valueOf(valueOf).length();
        int length2 = ah.length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(valueOf4).length();
        int length6 = String.valueOf(str).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(str2).length();
        int length9 = String.valueOf(str3).length();
        int length10 = String.valueOf(valueOf6).length();
        StringBuilder sb = new StringBuilder(length + 294 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf7).length() + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("ShortsUploadInfo{uploadFlowSource=");
        sb.append(valueOf);
        sb.append(", uploadFlowFlavor=");
        sb.append(ah);
        sb.append(", sourceUri=");
        sb.append(valueOf2);
        sb.append(", editedVideoUri=");
        sb.append(valueOf3);
        sb.append(", interactionLoggingExtension=");
        sb.append(valueOf4);
        sb.append(", shortsProjectDir=");
        sb.append(str);
        sb.append(", videoDuration=");
        sb.append(valueOf5);
        sb.append(", flowLoggingNonce=");
        sb.append(str2);
        sb.append(", thumbnailPath=");
        sb.append(str3);
        sb.append(", creationSurfaces=");
        sb.append(valueOf6);
        sb.append(", videoShortsCreation=");
        sb.append(valueOf7);
        sb.append(", usesYTAudioSource=");
        sb.append(z);
        sb.append(", isShortsEligible=");
        sb.append(z2);
        sb.append(", frontendId=");
        sb.append(str4);
        sb.append(", title=");
        sb.append(str5);
        sb.append("}");
        return sb.toString();
    }
}
