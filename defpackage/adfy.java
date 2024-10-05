package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.youtube.mdx.model.AppStatus;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfy extends adfz {
    private static final AppStatus o = AppStatus.d(-2);
    public AppStatus a;
    public final Uri b;
    public final Uri c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final long k;
    public final int l;
    public final int m;
    public adgn n;

    public adfy() {
    }

    public adfy(Uri uri, Uri uri2, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, int i, int i2) {
        this.b = uri;
        this.c = uri2;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = j;
        this.l = i;
        this.m = i2;
    }

    public static adfx i() {
        adfx adfxVar = new adfx();
        adfxVar.a = o;
        adfxVar.d(-1L);
        adfxVar.e(0);
        adfxVar.i = 1;
        adfxVar.c("");
        return adfxVar;
    }

    @Override // defpackage.adgb
    public final ScreenId b() {
        AppStatus appStatus = this.a;
        if (appStatus != null) {
            return appStatus.f();
        }
        return null;
    }

    @Override // defpackage.adgb
    public final String c() {
        return this.d;
    }

    @Override // defpackage.adgb
    public final String d() {
        String str = this.f;
        String str2 = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Override // defpackage.adgb
    public final int e() {
        return 3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof adfy) {
            adfy adfyVar = (adfy) obj;
            Uri uri = this.b;
            if (uri != null ? uri.equals(adfyVar.b) : adfyVar.b == null) {
                Uri uri2 = this.c;
                if (uri2 != null ? uri2.equals(adfyVar.c) : adfyVar.c == null) {
                    if (this.d.equals(adfyVar.d) && this.e.equals(adfyVar.e) && ((str = this.f) != null ? str.equals(adfyVar.f) : adfyVar.f == null) && ((str2 = this.g) != null ? str2.equals(adfyVar.g) : adfyVar.g == null) && ((str3 = this.h) != null ? str3.equals(adfyVar.h) : adfyVar.h == null) && ((str4 = this.i) != null ? str4.equals(adfyVar.i) : adfyVar.i == null) && ((str5 = this.j) != null ? str5.equals(adfyVar.j) : adfyVar.j == null) && this.k == adfyVar.k && this.l == adfyVar.l) {
                        int i = this.m;
                        int i2 = adfyVar.m;
                        if (i == 0) {
                            throw null;
                        }
                        if (i == i2) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.adfz
    public final adgn f() {
        return this.n;
    }

    public final adfs g() {
        AppStatus appStatus = this.a;
        if (appStatus != null) {
            return appStatus.e();
        }
        return null;
    }

    @Override // defpackage.adfz, defpackage.adgb
    public final boolean j(adgb adgbVar) {
        if (adgbVar.e() != 3) {
            return false;
        }
        return this.n.equals(((adfy) adgbVar).n);
    }

    public final adfx k() {
        adfx adfxVar = new adfx(this);
        adfxVar.a = this.a;
        adfxVar.j = this.n;
        return adfxVar;
    }

    public final adfy l(AppStatus appStatus) {
        adfx k = k();
        k.a = appStatus;
        return k.a();
    }

    public final Map m() {
        AppStatus appStatus = this.a;
        if (appStatus != null) {
            return appStatus.i();
        }
        return null;
    }

    public final boolean n() {
        String str = this.i;
        return str != null && str.contains("Cobalt");
    }

    public final boolean o() {
        return p() && this.b == null;
    }

    public final boolean p() {
        return this.j != null;
    }

    @Override // defpackage.adfz, defpackage.adgb
    public final Bundle s() {
        Bundle s = super.s();
        Uri uri = this.b;
        s.putString("dial.dial_app_uri", uri == null ? "" : uri.toString());
        return s;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f;
        String str4 = this.g;
        String str5 = this.h;
        String str6 = this.i;
        String str7 = this.j;
        long j = this.k;
        int i = this.l;
        int i2 = this.m;
        String num = i2 != 0 ? Integer.toString(i2 - 1) : "null";
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(str2).length();
        int length5 = String.valueOf(str3).length();
        int length6 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 228 + length2 + length3 + length4 + length5 + length6 + String.valueOf(str5).length() + String.valueOf(str6).length() + String.valueOf(str7).length() + num.length());
        sb.append("MdxDialScreen{dialAppUri=");
        sb.append(valueOf);
        sb.append(", dialBaseUri=");
        sb.append(valueOf2);
        sb.append(", deviceName=");
        sb.append(str);
        sb.append(", networkId=");
        sb.append(str2);
        sb.append(", manufacturer=");
        sb.append(str3);
        sb.append(", modelName=");
        sb.append(str4);
        sb.append(", modelNumber=");
        sb.append(str5);
        sb.append(", deviceVersion=");
        sb.append(str6);
        sb.append(", wakeOnLanMac=");
        sb.append(str7);
        sb.append(", wakeOnLanTimeout=");
        sb.append(j);
        sb.append(", wakeOnLanStatusOnStarted=");
        sb.append(i);
        sb.append(", cacheMethod=");
        sb.append(num);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        Uri uri = this.b;
        int hashCode = ((uri == null ? 0 : uri.hashCode()) ^ 1000003) * 1000003;
        Uri uri2 = this.c;
        int hashCode2 = (((((hashCode ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.i;
        int hashCode6 = (hashCode5 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.j;
        int hashCode7 = str5 != null ? str5.hashCode() : 0;
        long j = this.k;
        int i = (((((hashCode6 ^ hashCode7) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.l) * 1000003;
        int i2 = this.m;
        if (i2 != 0) {
            return i ^ i2;
        }
        throw null;
    }
}
