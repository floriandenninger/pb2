package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agnm {
    public static final int[] a = {0, 1, 2, 3, 4};
    public final FormatStreamModel b;
    public final boolean c;
    public final long d;
    public final int e;
    public final long f;
    public final byte[] g;
    public final byte[] h;
    public final awyz i;
    public final String j;
    public final int k;
    public final String l;
    public final boolean m;
    public final Uri n;
    public final int o;

    public agnm() {
    }

    public agnm(FormatStreamModel formatStreamModel, boolean z, long j, int i, long j2, int i2, byte[] bArr, byte[] bArr2, awyz awyzVar, String str, int i3, String str2, boolean z2, Uri uri) {
        this.b = formatStreamModel;
        this.c = z;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.o = i2;
        this.g = bArr;
        this.h = bArr2;
        this.i = awyzVar;
        this.j = str;
        this.k = i3;
        this.l = str2;
        this.m = z2;
        this.n = uri;
    }

    public static agnl e() {
        agnl agnlVar = new agnl();
        agnlVar.g(0);
        agnlVar.h(0L);
        agnlVar.i(1);
        agnlVar.e(0);
        agnlVar.f(false);
        return agnlVar;
    }

    public final int a() {
        return this.b.e();
    }

    public final long b() {
        return this.b.j();
    }

    public final agna c(List list) {
        String f;
        String str;
        if (!i() || (f = f()) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            agna agnaVar = (agna) it.next();
            if (agnaVar != null && ((str = this.l) == null || str.equals(agnaVar.a))) {
                if (agnaVar.g().contains(f) && agnaVar.l(f, 0L, b())) {
                    return agnaVar;
                }
            }
        }
        return null;
    }

    public final agnl d() {
        agnl e = e();
        e.d(this.b);
        e.b(this.c);
        e.c(this.d);
        e.g(this.e);
        e.h(this.f);
        e.i(this.o);
        e.a = this.g;
        e.b = this.h;
        e.c = this.i;
        e.d = this.j;
        e.e(this.k);
        e.e = this.l;
        e.f(this.m);
        e.f = this.n;
        return e;
    }

    public final boolean equals(Object obj) {
        awyz awyzVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof agnm) {
            agnm agnmVar = (agnm) obj;
            if (this.b.equals(agnmVar.b) && this.c == agnmVar.c && this.d == agnmVar.d && this.e == agnmVar.e && this.f == agnmVar.f) {
                int i = this.o;
                int i2 = agnmVar.o;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    boolean z = agnmVar instanceof agnm;
                    if (Arrays.equals(this.g, z ? agnmVar.g : agnmVar.g)) {
                        if (Arrays.equals(this.h, z ? agnmVar.h : agnmVar.h) && ((awyzVar = this.i) != null ? awyzVar.equals(agnmVar.i) : agnmVar.i == null) && ((str = this.j) != null ? str.equals(agnmVar.j) : agnmVar.j == null) && this.k == agnmVar.k && ((str2 = this.l) != null ? str2.equals(agnmVar.l) : agnmVar.l == null) && this.m == agnmVar.m) {
                            Uri uri = this.n;
                            Uri uri2 = agnmVar.n;
                            if (uri != null ? uri.equals(uri2) : uri2 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String f() {
        return adyu.r(g(), a(), h(), this.b.k());
    }

    public final String g() {
        return ammx.d(this.b.b);
    }

    public final String h() {
        return this.b.w();
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        int i = true != this.c ? 1237 : 1231;
        long j = this.d;
        int i2 = this.e;
        long j2 = this.f;
        int i3 = (((((((hashCode ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i2) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        int i4 = this.o;
        if (i4 == 0) {
            throw null;
        }
        int hashCode2 = (((((i3 ^ i4) * 1000003) ^ Arrays.hashCode(this.g)) * 1000003) ^ Arrays.hashCode(this.h)) * 1000003;
        awyz awyzVar = this.i;
        int hashCode3 = (hashCode2 ^ (awyzVar == null ? 0 : awyzVar.hashCode())) * 1000003;
        String str = this.j;
        int hashCode4 = (((hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.k) * 1000003;
        String str2 = this.l;
        int hashCode5 = (((hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (true == this.m ? 1231 : 1237)) * 1000003;
        Uri uri = this.n;
        return hashCode5 ^ (uri != null ? uri.hashCode() : 0);
    }

    public final boolean i() {
        return this.d == b();
    }

    public final boolean j(List list) {
        return c(list) != null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        boolean z = this.c;
        long j = this.d;
        int i = this.e;
        long j2 = this.f;
        int i2 = this.o;
        String num = i2 != 0 ? Integer.toString(i2 - 1) : "null";
        String arrays = Arrays.toString(this.g);
        String arrays2 = Arrays.toString(this.h);
        String valueOf2 = String.valueOf(this.i);
        String str = this.j;
        int i3 = this.k;
        String str2 = this.l;
        boolean z2 = this.m;
        String valueOf3 = String.valueOf(this.n);
        int length = String.valueOf(valueOf).length();
        int length2 = num.length();
        int length3 = String.valueOf(arrays).length();
        int length4 = String.valueOf(arrays2).length();
        StringBuilder sb = new StringBuilder(length + 306 + length2 + length3 + length4 + String.valueOf(valueOf2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(valueOf3).length());
        sb.append("OfflineStream{formatStream=");
        sb.append(valueOf);
        sb.append(", audioOnly=");
        sb.append(z);
        sb.append(", bytesTransferred=");
        sb.append(j);
        sb.append(", streamStatus=");
        sb.append(i);
        sb.append(", streamStatusTimestamp=");
        sb.append(j2);
        sb.append(", offlineStorageFormat=");
        sb.append(num);
        sb.append(", wrappedKey=");
        sb.append(arrays);
        sb.append(", discoKeyIv=");
        sb.append(arrays2);
        sb.append(", discoKey=");
        sb.append(valueOf2);
        sb.append(", discoNonce=");
        sb.append(str);
        sb.append(", streamEncryptionKeyType=");
        sb.append(i3);
        sb.append(", storageId=");
        sb.append(str2);
        sb.append(", streamExpired=");
        sb.append(z2);
        sb.append(", ytbUri=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
