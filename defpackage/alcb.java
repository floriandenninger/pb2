package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alcb {
    public final Uri a;
    public final String b;
    public final avtn c;
    public final boolean d;
    public final Uri e;
    public final akzw f;
    public final arvt g;
    public final alcy h;
    public final Bitmap i;
    public final awaf j;
    public final akzt k;
    public final amru l;
    public final int m;
    private final String n;
    private final String o;
    private final akzl p;

    public alcb() {
    }

    public alcb(Uri uri, String str, avtn avtnVar, int i, boolean z, Uri uri2, akzw akzwVar, arvt arvtVar, alcy alcyVar, String str2, Bitmap bitmap, String str3, awaf awafVar, akzt akztVar, akzl akzlVar, amru amruVar) {
        this.a = uri;
        this.b = str;
        this.c = avtnVar;
        this.m = i;
        this.d = z;
        this.e = uri2;
        this.f = akzwVar;
        this.g = arvtVar;
        this.h = alcyVar;
        this.n = str2;
        this.i = bitmap;
        this.o = str3;
        this.j = awafVar;
        this.k = akztVar;
        this.p = akzlVar;
        this.l = amruVar;
    }

    public final boolean equals(Object obj) {
        arvt arvtVar;
        alcy alcyVar;
        String str;
        Bitmap bitmap;
        String str2;
        awaf awafVar;
        akzt akztVar;
        akzl akzlVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof alcb) {
            alcb alcbVar = (alcb) obj;
            if (this.a.equals(alcbVar.a) && this.b.equals(alcbVar.b) && this.c.equals(alcbVar.c)) {
                int i = this.m;
                int i2 = alcbVar.m;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.d == alcbVar.d && this.e.equals(alcbVar.e) && this.f.equals(alcbVar.f) && ((arvtVar = this.g) != null ? arvtVar.equals(alcbVar.g) : alcbVar.g == null) && ((alcyVar = this.h) != null ? alcyVar.equals(alcbVar.h) : alcbVar.h == null) && ((str = this.n) != null ? str.equals(alcbVar.n) : alcbVar.n == null) && ((bitmap = this.i) != null ? bitmap.equals(alcbVar.i) : alcbVar.i == null) && ((str2 = this.o) != null ? str2.equals(alcbVar.o) : alcbVar.o == null) && ((awafVar = this.j) != null ? awafVar.equals(alcbVar.j) : alcbVar.j == null) && ((akztVar = this.k) != null ? akztVar.equals(alcbVar.k) : alcbVar.k == null) && ((akzlVar = this.p) != null ? akzlVar.equals(alcbVar.p) : alcbVar.p == null)) {
                    amru amruVar = this.l;
                    amru amruVar2 = alcbVar.l;
                    if (amruVar != null ? amkq.aV(amruVar, amruVar2) : amruVar2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int i = this.m;
        awxr.ai(i);
        int hashCode4 = (((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        arvt arvtVar = this.g;
        int hashCode5 = (hashCode4 ^ (arvtVar == null ? 0 : arvtVar.hashCode())) * 1000003;
        alcy alcyVar = this.h;
        int hashCode6 = (hashCode5 ^ (alcyVar == null ? 0 : alcyVar.hashCode())) * 1000003;
        String str = this.n;
        int hashCode7 = (hashCode6 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Bitmap bitmap = this.i;
        int hashCode8 = (hashCode7 ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003;
        String str2 = this.o;
        int hashCode9 = (hashCode8 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        awaf awafVar = this.j;
        int hashCode10 = (hashCode9 ^ (awafVar == null ? 0 : awafVar.hashCode())) * 1000003;
        akzt akztVar = this.k;
        int hashCode11 = (hashCode10 ^ (akztVar == null ? 0 : akztVar.hashCode())) * 1000003;
        akzl akzlVar = this.p;
        int hashCode12 = (hashCode11 ^ (akzlVar == null ? 0 : akzlVar.hashCode())) * 1000003;
        amru amruVar = this.l;
        return hashCode12 ^ (amruVar != null ? amruVar.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        int i = this.m;
        String ah = i != 0 ? awxr.ah(i) : "null";
        boolean z = this.d;
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String str2 = this.n;
        String valueOf7 = String.valueOf(this.i);
        String str3 = this.o;
        String valueOf8 = String.valueOf(this.j);
        String valueOf9 = String.valueOf(this.k);
        String valueOf10 = String.valueOf(this.p);
        String valueOf11 = String.valueOf(this.l);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = ah.length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(str2).length();
        int length10 = String.valueOf(valueOf7).length();
        int length11 = String.valueOf(str3).length();
        int length12 = String.valueOf(valueOf8).length();
        StringBuilder sb = new StringBuilder(length + 333 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length() + String.valueOf(valueOf11).length());
        sb.append("PendingUpload{sourceUri=");
        sb.append(valueOf);
        sb.append(", frontendUploadId=");
        sb.append(str);
        sb.append(", uploadFlowSource=");
        sb.append(valueOf2);
        sb.append(", uploadFlowFlavor=");
        sb.append(ah);
        sb.append(", isShortsEligible=");
        sb.append(z);
        sb.append(", uploadUri=");
        sb.append(valueOf3);
        sb.append(", uploadMetadataProto=");
        sb.append(valueOf4);
        sb.append(", metadataUpdateRequest=");
        sb.append(valueOf5);
        sb.append(", uploadComponent=");
        sb.append(valueOf6);
        sb.append(", filename=");
        sb.append(str2);
        sb.append(", videoFileThumbnail=");
        sb.append(valueOf7);
        sb.append(", videoFileThumbnailPath=");
        sb.append(str3);
        sb.append(", videoShortsCreation=");
        sb.append(valueOf8);
        sb.append(", mediaStorageInfo=");
        sb.append(valueOf9);
        sb.append(", mediaStoreVideoMetadata=");
        sb.append(valueOf10);
        sb.append(", filesToDeleteAfterUpload=");
        sb.append(valueOf11);
        sb.append("}");
        return sb.toString();
    }
}
