package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akve {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final akzw d;
    public final avtn e;
    public final arvt f;
    public final String g;
    public final Bitmap h;
    public final awaf i;
    public final akzt j;
    public final akzl k;
    public final amru l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final int p;

    public akve() {
    }

    public akve(String str, Uri uri, Uri uri2, int i, akzw akzwVar, avtn avtnVar, arvt arvtVar, String str2, Bitmap bitmap, awaf awafVar, akzt akztVar, akzl akzlVar, amru amruVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.p = i;
        this.d = akzwVar;
        this.e = avtnVar;
        this.f = arvtVar;
        this.g = str2;
        this.h = bitmap;
        this.i = awafVar;
        this.j = akztVar;
        this.k = akzlVar;
        this.l = amruVar;
        this.m = z;
        this.n = z2;
        this.o = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static akvd a() {
        akvd akvdVar = new akvd();
        akvdVar.b(false);
        akvdVar.c(false);
        akvdVar.d(false);
        return akvdVar;
    }

    public final akvd b() {
        return new akvd(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akve) {
            akve akveVar = (akve) obj;
            String str = this.a;
            if (str != null ? str.equals(akveVar.a) : akveVar.a == null) {
                Uri uri = this.b;
                if (uri != null ? uri.equals(akveVar.b) : akveVar.b == null) {
                    Uri uri2 = this.c;
                    if (uri2 != null ? uri2.equals(akveVar.c) : akveVar.c == null) {
                        int i = this.p;
                        if (i != 0 ? i == akveVar.p : akveVar.p == 0) {
                            akzw akzwVar = this.d;
                            if (akzwVar != null ? akzwVar.equals(akveVar.d) : akveVar.d == null) {
                                avtn avtnVar = this.e;
                                if (avtnVar != null ? avtnVar.equals(akveVar.e) : akveVar.e == null) {
                                    arvt arvtVar = this.f;
                                    if (arvtVar != null ? arvtVar.equals(akveVar.f) : akveVar.f == null) {
                                        String str2 = this.g;
                                        if (str2 != null ? str2.equals(akveVar.g) : akveVar.g == null) {
                                            Bitmap bitmap = this.h;
                                            if (bitmap != null ? bitmap.equals(akveVar.h) : akveVar.h == null) {
                                                awaf awafVar = this.i;
                                                if (awafVar != null ? awafVar.equals(akveVar.i) : akveVar.i == null) {
                                                    akzt akztVar = this.j;
                                                    if (akztVar != null ? akztVar.equals(akveVar.j) : akveVar.j == null) {
                                                        akzl akzlVar = this.k;
                                                        if (akzlVar != null ? akzlVar.equals(akveVar.k) : akveVar.k == null) {
                                                            amru amruVar = this.l;
                                                            if (amruVar != null ? amkq.aV(amruVar, akveVar.l) : akveVar.l == null) {
                                                                if (this.m == akveVar.m && this.n == akveVar.n && this.o == akveVar.o) {
                                                                    return true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i = this.p;
        String ah = i != 0 ? awxr.ah(i) : "null";
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String str2 = this.g;
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        String valueOf9 = String.valueOf(this.k);
        String valueOf10 = String.valueOf(this.l);
        boolean z = this.m;
        boolean z2 = this.n;
        boolean z3 = this.o;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = ah.length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(str2).length();
        int length9 = String.valueOf(valueOf6).length();
        int length10 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 327 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length() + String.valueOf(valueOf10).length());
        sb.append("Upload{frontendUploadId=");
        sb.append(str);
        sb.append(", sourceUri=");
        sb.append(valueOf);
        sb.append(", uploadUri=");
        sb.append(valueOf2);
        sb.append(", uploadFlowFlavor=");
        sb.append(ah);
        sb.append(", uploadMetadataProto=");
        sb.append(valueOf3);
        sb.append(", uploadFlowSource=");
        sb.append(valueOf4);
        sb.append(", metadataUpdateRequest=");
        sb.append(valueOf5);
        sb.append(", filename=");
        sb.append(str2);
        sb.append(", videoFileThumbnail=");
        sb.append(valueOf6);
        sb.append(", videoShortsCreation=");
        sb.append(valueOf7);
        sb.append(", mediaStorageInfo=");
        sb.append(valueOf8);
        sb.append(", mediaStoreVideoMetadata=");
        sb.append(valueOf9);
        sb.append(", filesToDeleteAfterUpload=");
        sb.append(valueOf10);
        sb.append(", confirmed=");
        sb.append(z);
        sb.append(", creationFailed=");
        sb.append(z2);
        sb.append(", unconfirmedFlowFailed=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        Uri uri = this.b;
        int hashCode2 = (hashCode ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        Uri uri2 = this.c;
        int hashCode3 = (hashCode2 ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003;
        int i = this.p;
        if (i == 0) {
            i = 0;
        } else {
            awxr.ai(i);
        }
        int i2 = (hashCode3 ^ i) * 1000003;
        akzw akzwVar = this.d;
        int hashCode4 = (i2 ^ (akzwVar == null ? 0 : akzwVar.hashCode())) * 1000003;
        avtn avtnVar = this.e;
        int hashCode5 = (hashCode4 ^ (avtnVar == null ? 0 : avtnVar.hashCode())) * 1000003;
        arvt arvtVar = this.f;
        int hashCode6 = (hashCode5 ^ (arvtVar == null ? 0 : arvtVar.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode7 = (hashCode6 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Bitmap bitmap = this.h;
        int hashCode8 = (hashCode7 ^ (bitmap == null ? 0 : bitmap.hashCode())) * 1000003;
        awaf awafVar = this.i;
        int hashCode9 = (hashCode8 ^ (awafVar == null ? 0 : awafVar.hashCode())) * 1000003;
        akzt akztVar = this.j;
        int hashCode10 = (hashCode9 ^ (akztVar == null ? 0 : akztVar.hashCode())) * 1000003;
        akzl akzlVar = this.k;
        int hashCode11 = (hashCode10 ^ (akzlVar == null ? 0 : akzlVar.hashCode())) * 1000003;
        amru amruVar = this.l;
        return ((((((hashCode11 ^ (amruVar != null ? amruVar.hashCode() : 0)) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ (true == this.o ? 1231 : 1237);
    }
}
