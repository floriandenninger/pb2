package com.google.android.libraries.youtube.innertube.model.media;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import defpackage.aamk;
import defpackage.aanc;
import defpackage.aane;
import defpackage.aaoq;
import defpackage.aaov;
import defpackage.amkq;
import defpackage.amru;
import defpackage.aocz;
import defpackage.aone;
import defpackage.aonm;
import defpackage.aonw;
import defpackage.aony;
import defpackage.apgn;
import defpackage.apnq;
import defpackage.aqxy;
import defpackage.aqxz;
import defpackage.aqya;
import defpackage.asnb;
import defpackage.axbh;
import defpackage.axbi;
import defpackage.axi;
import defpackage.axk;
import defpackage.axl;
import defpackage.axm;
import defpackage.ozv;
import defpackage.pmr;
import defpackage.pms;
import defpackage.psz;
import defpackage.wbs;
import defpackage.yny;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FormatStreamModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aamk(11);
    public final aqxz a;
    public final String b;
    public final long c;
    public final Uri d;
    public final String e;
    public final int f;
    public final String g;
    private final boolean h;

    public FormatStreamModel(aqxz aqxzVar, String str, long j) {
        this(aqxzVar, str, j, false);
    }

    public static boolean D(int i) {
        return i == -2 || i == -1;
    }

    public static boolean I(aqxz aqxzVar) {
        return aaoq.r().contains(Integer.valueOf(aqxzVar.d)) || aqxzVar.k > 32;
    }

    public static boolean O(int i) {
        return i >= 0;
    }

    public static int g(int i, int i2) {
        if (i < i2) {
            return aanc.a(i2, i);
        }
        return aanc.a(i, i2);
    }

    public static String o(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        aone createBuilder = axbi.a.createBuilder();
        for (String str2 : str.split(":", -1)) {
            String[] split = str2.split("=", -1);
            int length = split.length;
            String str3 = length > 0 ? split[0] : "";
            String str4 = length > 1 ? split[1] : "";
            aone createBuilder2 = axbh.a.createBuilder();
            createBuilder2.copyOnWrite();
            axbh axbhVar = (axbh) createBuilder2.instance;
            str3.getClass();
            axbhVar.b = 1 | axbhVar.b;
            axbhVar.c = str3;
            createBuilder2.copyOnWrite();
            axbh axbhVar2 = (axbh) createBuilder2.instance;
            str4.getClass();
            axbhVar2.b |= 2;
            axbhVar2.d = str4;
            createBuilder.copyOnWrite();
            axbi axbiVar = (axbi) createBuilder.instance;
            axbh axbhVar3 = (axbh) createBuilder2.build();
            axbhVar3.getClass();
            aony aonyVar = axbiVar.b;
            if (!aonyVar.c()) {
                axbiVar.b = aonm.mutableCopy(aonyVar);
            }
            axbiVar.b.add(axbhVar3);
        }
        return Base64.encodeToString(((axbi) createBuilder.build()).toByteArray(), 11);
    }

    public final boolean A() {
        return aaoq.c().contains(Integer.valueOf(e()));
    }

    public final boolean B() {
        return aaoq.y().contains(Integer.valueOf(e()));
    }

    public final boolean C() {
        return aaov.c(t());
    }

    public final boolean E() {
        apgn apgnVar = this.a.v;
        if (apgnVar == null) {
            apgnVar = apgn.a;
        }
        return apgnVar.e;
    }

    public final boolean F() {
        aqxz aqxzVar = this.a;
        if ((aqxzVar.c & 524288) == 0) {
            return false;
        }
        aqxy aqxyVar = aqxzVar.w;
        if (aqxyVar == null) {
            aqxyVar = aqxy.a;
        }
        int aT = aocz.aT(aqxyVar.d);
        return aT != 0 && aT == 2;
    }

    public final boolean G() {
        return ((Set) aaoq.bw.get()).contains(Integer.valueOf(e()));
    }

    public final boolean H() {
        return I(this.a);
    }

    public final boolean J() {
        return wbs.an(this.d);
    }

    public final boolean K() {
        return aaoq.t().contains(Integer.valueOf(e()));
    }

    public final boolean L() {
        int aS = aocz.aS(this.a.A);
        return aS != 0 && aS == 4;
    }

    public final boolean M() {
        return aaoq.v().contains(Integer.valueOf(e()));
    }

    public final boolean N() {
        int i = this.a.c;
        return ((i & 256) == 0 || (i & 512) == 0) ? false : true;
    }

    public final boolean P() {
        return aaov.d(t());
    }

    public final boolean Q() {
        Iterator<E> it = new aonw(this.a.r, aqxz.a).iterator();
        while (it.hasNext()) {
            if (((asnb) it.next()) == asnb.WIDEVINE) {
                return true;
            }
        }
        return false;
    }

    public final axl R(String str) {
        pms m = m();
        long j = this.a.o;
        String uri = l(str).toString();
        aqya aqyaVar = this.a.m;
        if (aqyaVar == null) {
            aqyaVar = aqya.a;
        }
        long j2 = aqyaVar.c;
        aqya aqyaVar2 = this.a.m;
        if (aqyaVar2 == null) {
            aqyaVar2 = aqya.a;
        }
        long j3 = aqyaVar2.d;
        aqya aqyaVar3 = this.a.n;
        if (aqyaVar3 == null) {
            aqyaVar3 = aqya.a;
        }
        long j4 = aqyaVar3.c;
        aqya aqyaVar4 = this.a.n;
        if (aqyaVar4 == null) {
            aqyaVar4 = aqya.a;
        }
        long j5 = aqyaVar4.d;
        amru q = amru.q();
        String str2 = this.g;
        long j6 = j();
        return new axl(m, amru.r(new axi(uri)), new axm(new axk(null, j2, (j3 - j2) + 1), j4, (j5 - j4) + 1), q, str2, j6);
    }

    public final long S() {
        String queryParameter = this.d.getQueryParameter("maxdsq");
        if (queryParameter == null) {
            queryParameter = this.d.getQueryParameter("max_sq");
        }
        if (queryParameter == null) {
            return -1L;
        }
        try {
            return Long.parseLong(queryParameter);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final long T() {
        String queryParameter = this.d.getQueryParameter("mindsq");
        if (queryParameter == null) {
            queryParameter = this.d.getQueryParameter("min_sq");
        }
        if (queryParameter == null) {
            return -1L;
        }
        try {
            return Long.parseLong(queryParameter);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int U() {
        aqxz aqxzVar = this.a;
        if ((aqxzVar.c & 524288) == 0) {
            return 3;
        }
        aqxy aqxyVar = aqxzVar.w;
        if (aqxyVar == null) {
            aqxyVar = aqxy.a;
        }
        int aR = aocz.aR(aqxyVar.c);
        if (aR == 0) {
            return 1;
        }
        return aR;
    }

    public final int V() {
        int aQ = aocz.aQ(this.a.t);
        if (aQ == 0) {
            return 1;
        }
        return aQ;
    }

    public final double a() {
        return this.a.z;
    }

    public final float b() {
        return this.a.C;
    }

    public final int c() {
        return this.a.k;
    }

    public final int d() {
        return this.a.j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.a.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormatStreamModel)) {
            return false;
        }
        FormatStreamModel formatStreamModel = (FormatStreamModel) obj;
        return this.c == formatStreamModel.c && amkq.b(this.b, formatStreamModel.b) && this.a.equals(formatStreamModel.a);
    }

    public final int f() {
        if (P()) {
            return g(i(), d());
        }
        if (!C() || !aaoq.b().contains(Integer.valueOf(e()))) {
            return -1;
        }
        if (((Set) aaoq.br.get()).contains(Integer.valueOf(e()))) {
            return 1;
        }
        if (((Set) aaoq.bs.get()).contains(Integer.valueOf(e()))) {
            return 2;
        }
        return ((Set) aaoq.bt.get()).contains(Integer.valueOf(e())) ? 4 : 3;
    }

    public final int h() {
        return (int) (this.a.y * 1000.0d);
    }

    public final int i() {
        return this.a.i;
    }

    public final long j() {
        return this.a.p;
    }

    public final long k() {
        return this.a.o;
    }

    public final Uri l(String str) {
        aane n = n();
        n.c(str);
        return n.a();
    }

    public final pms m() {
        pmr pmrVar = new pmr();
        pmrVar.a = this.e;
        pmrVar.j = v();
        String a = aaov.a(t());
        pmrVar.h = a;
        int i = this.f;
        pmrVar.f = i;
        pmrVar.g = i;
        if (P()) {
            pmrVar.k = psz.g(a);
            pmrVar.p = i();
            pmrVar.q = d();
            int c = c();
            pmrVar.r = c > 0 ? c : -1.0f;
            pmrVar.d = 4;
        } else {
            pmrVar.k = psz.d(a);
            pmrVar.d = true == E() ? 1 : 4;
            pmrVar.c = q();
        }
        return pmrVar.a();
    }

    public final aane n() {
        return aane.b(this.d);
    }

    public final String p() {
        apgn apgnVar = this.a.v;
        if (apgnVar == null) {
            apgnVar = apgn.a;
        }
        return apgnVar.c;
    }

    public final String q() {
        apgn apgnVar = this.a.v;
        if (apgnVar == null) {
            apgnVar = apgn.a;
        }
        return apgnVar.d;
    }

    public final String r() {
        apnq apnqVar = this.a.B;
        if (apnqVar == null) {
            apnqVar = apnq.a;
        }
        return apnqVar.b;
    }

    public final String s() {
        apnq apnqVar = this.a.B;
        if (apnqVar == null) {
            apnqVar = apnq.a;
        }
        return apnqVar.d;
    }

    public final String t() {
        return this.a.f;
    }

    public final String toString() {
        String str;
        int e = e();
        String w = w();
        String str2 = "";
        if (C()) {
            boolean E = E();
            String q = q();
            String p = p();
            StringBuilder sb = new StringBuilder(String.valueOf(q).length() + 63 + String.valueOf(p).length());
            sb.append(" isDefaultAudioTrack=");
            sb.append(E);
            sb.append(" audioTrackId=");
            sb.append(q);
            sb.append(" audioTrackDisplayName=");
            sb.append(p);
            str = sb.toString();
        } else {
            str = "";
        }
        if (P()) {
            int i = i();
            int d = d();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append(" width=");
            sb2.append(i);
            sb2.append(" height=");
            sb2.append(d);
            str2 = sb2.toString();
        }
        String t = t();
        String obj = new aonw(this.a.r, aqxz.a).toString();
        String valueOf = String.valueOf(this.d);
        int length = String.valueOf(w).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(t).length();
        StringBuilder sb3 = new StringBuilder(length + 65 + length2 + length3 + length4 + String.valueOf(obj).length() + String.valueOf(valueOf).length());
        sb3.append("FormatStream(itag=");
        sb3.append(e);
        sb3.append(" xtags=");
        sb3.append(w);
        sb3.append(str);
        sb3.append(str2);
        sb3.append(" mimeType=");
        sb3.append(t);
        sb3.append(" drmFamilies=");
        sb3.append(obj);
        sb3.append(" uri=");
        sb3.append(valueOf);
        sb3.append(")");
        return sb3.toString();
    }

    public final String u() {
        int i;
        if (!TextUtils.isEmpty(this.a.s)) {
            return this.a.s;
        }
        if (P()) {
            int i2 = i();
            int d = d();
            int[] iArr = aanc.a;
            if (i2 < 0 || d < 0 || (i2 == 0 && d == 0)) {
                i = -1;
            } else {
                int[] iArr2 = aanc.b;
                int min = Math.min(i2, d);
                int max = Math.max(i2, d);
                int i3 = 0;
                while (i3 < 10 && max < aanc.a[i3] * 1.3f && min < aanc.b[i3] * 1.3f) {
                    i3++;
                }
                i = iArr2[Math.max(0, i3 - 1)];
            }
            if (i != -1) {
                int c = c();
                String str = c >= 55 ? "60" : c >= 49 ? "50" : c >= 39 ? "48" : "";
                String str2 = true == G() ? " HDR" : "";
                StringBuilder sb = new StringBuilder(str.length() + 12 + str2.length());
                sb.append(i);
                sb.append("p");
                sb.append(str);
                sb.append(str2);
                return sb.toString();
            }
        }
        return "";
    }

    public final String v() {
        return aaov.b(t());
    }

    public final String w() {
        return this.a.q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yny.I(this.a, parcel);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.h ? 1 : 0);
    }

    public final boolean x() {
        return (this.a.c & CellularSignalStrengthError.ERROR_NOT_SUPPORTED) != 0;
    }

    public final boolean y() {
        return aaoq.d().contains(Integer.valueOf(e()));
    }

    public final boolean z() {
        return aaoq.p().contains(Integer.valueOf(e()));
    }

    public FormatStreamModel(aqxz aqxzVar, String str, long j, boolean z) {
        String sb;
        this.a = aqxzVar;
        this.b = str;
        this.c = j;
        this.d = Uri.parse(aqxzVar.e);
        String b = ozv.b(aqxzVar.d, aqxzVar.q);
        this.e = b;
        int i = aqxzVar.h;
        this.f = z ? i <= 0 ? (int) (aqxzVar.g * 0.8f) : i : aqxzVar.g;
        this.h = z;
        if (str == null) {
            sb = null;
        } else {
            long j2 = aqxzVar.o;
            StringBuilder sb2 = new StringBuilder(str.length() + 22 + String.valueOf(b).length());
            sb2.append(str);
            sb2.append(".");
            sb2.append(b);
            sb2.append(".");
            sb2.append(j2);
            sb = sb2.toString();
        }
        this.g = sb;
    }

    public final int hashCode() {
        long j = this.c;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        String str = this.b;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.a.hashCode();
    }
}
