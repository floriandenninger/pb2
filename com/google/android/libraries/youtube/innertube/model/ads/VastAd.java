package com.google.android.libraries.youtube.innertube.model.ads;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import defpackage.aamk;
import defpackage.aamn;
import defpackage.aamo;
import defpackage.aamp;
import defpackage.aamv;
import defpackage.aamw;
import defpackage.afrd;
import defpackage.afre;
import defpackage.amkq;
import defpackage.amru;
import defpackage.apfc;
import defpackage.argu;
import defpackage.atxz;
import defpackage.shf;
import defpackage.yny;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VastAd implements Parcelable, InstreamAd, afre, aamp {
    public static final Parcelable.Creator CREATOR;
    public static final String a;
    public final amru A;
    public final amru B;
    public final amru C;
    public final amru D;
    public final amru E;
    public final amru F;
    public final amru G;
    public final amru H;
    public final amru I;

    /* renamed from: J, reason: collision with root package name */
    public final amru f175J;
    public final amru K;
    public final amru L;
    public final amru M;
    public final amru N;
    public final Uri O;
    public final Uri P;
    public final boolean Q;
    public final long R;
    public final int S;
    public final boolean T;
    public final apfc U;
    public final argu V;
    public final Uri W;
    public final VastAd X;
    public final VastAd Y;
    public final long Z;
    public final boolean aa;
    public final boolean ab;
    public final amru ac;
    public final Survey ad;
    public final boolean ae;
    public final amru af;
    public final amru ag;
    public final amru ah;
    public final Pattern ai;
    public final byte[] aj;
    private final String ak;
    private final VideoStreamingData al;
    private final boolean am;
    private final amru an;
    public final amru b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final byte[] h;
    public final String i;
    public final String j;
    public final String k;
    public final aamn l;
    public final String m;
    public final int n;
    public final PlayerResponseModel o;
    public final PlaybackTrackingModel p;
    public final PlayerConfigModel q;
    public final atxz r;
    public final Uri s;
    public final amru t;
    public final amru u;
    public final amru v;
    public final amru w;
    public final amru x;
    public final amru y;
    public final amru z;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class ProgressPing implements Parcelable, afre {
        public static final Parcelable.Creator CREATOR = new aamk(6);
        public static final aamw a = new aamw();
        public final int b;
        public final boolean c;
        public final Uri d;

        public ProgressPing(int i, boolean z, Uri uri) {
            this.b = i;
            this.c = z;
            this.d = uri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ProgressPing)) {
                return false;
            }
            ProgressPing progressPing = (ProgressPing) obj;
            return this.b == progressPing.b && amkq.b(Boolean.valueOf(this.c), Boolean.valueOf(progressPing.c)) && amkq.b(this.d, progressPing.d);
        }

        @Override // defpackage.afre
        public final /* bridge */ /* synthetic */ afrd h() {
            return new aamw(this);
        }

        public final int hashCode() {
            return ((((((getClass().hashCode() + 527) * 31) + this.b) * 31) + (this.c ? 1 : 0)) * 31) + this.d.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeParcelable(this.d, 0);
        }
    }

    static {
        new VastAd();
        String num = Integer.toString(2);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 5);
        sb.append(num);
        sb.append("_2_15");
        a = sb.toString();
        CREATOR = new aamk(5);
    }

    private VastAd() {
        this.b = amru.q();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.ak = null;
        this.j = null;
        this.k = null;
        this.l = aamn.UNKNOWN;
        this.m = null;
        this.n = 0;
        this.o = null;
        this.al = null;
        this.p = new PlaybackTrackingModel();
        this.q = PlayerConfigModel.b;
        this.r = null;
        this.s = null;
        this.t = amru.q();
        this.u = amru.q();
        this.v = amru.q();
        this.w = amru.q();
        this.x = amru.q();
        this.y = amru.q();
        this.z = amru.q();
        this.A = amru.q();
        this.B = amru.q();
        this.C = amru.q();
        this.D = amru.q();
        this.E = amru.q();
        this.F = amru.q();
        this.G = amru.q();
        this.H = amru.q();
        this.I = amru.q();
        this.f175J = amru.q();
        this.K = amru.q();
        this.L = amru.q();
        this.M = amru.q();
        this.N = amru.q();
        this.O = null;
        this.P = null;
        this.Q = true;
        this.R = 0L;
        this.S = -1;
        this.T = false;
        this.U = null;
        this.V = null;
        this.Z = 0L;
        this.aa = false;
        this.ab = false;
        this.W = null;
        this.am = false;
        this.X = null;
        this.Y = null;
        p();
        o();
        n();
        this.an = amru.q();
        this.ac = amru.q();
        this.ad = null;
        this.af = amru.q();
        this.ag = amru.q();
        this.ah = amru.q();
        this.ae = false;
        this.ai = null;
        this.aj = null;
    }

    public static List e(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, Uri.CREATOR);
        return Collections.unmodifiableList(arrayList);
    }

    private static amru q(List list) {
        return list == null ? amru.q() : amru.o(list);
    }

    @Override // defpackage.aamp
    public final long a() {
        return this.R;
    }

    @Override // defpackage.aamp
    public final boolean b() {
        return this.ab;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final int c() {
        throw null;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final Uri d() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VastAd)) {
            return false;
        }
        VastAd vastAd = (VastAd) obj;
        return amkq.b(this.c, vastAd.c) && amkq.b(this.d, vastAd.d) && amkq.b(this.e, vastAd.e) && amkq.b(this.f, vastAd.f) && amkq.b(this.g, vastAd.g) && Arrays.equals(this.h, vastAd.h) && amkq.b(this.i, vastAd.i) && amkq.b(this.ak, vastAd.ak) && amkq.b(this.j, vastAd.j) && amkq.b(this.k, vastAd.k) && amkq.b(this.l, vastAd.l) && amkq.b(this.m, vastAd.m) && amkq.b(this.o, vastAd.o) && amkq.b(this.al, vastAd.al) && amkq.b(this.p, vastAd.p) && amkq.b(this.q, vastAd.q) && amkq.b(this.s, vastAd.s) && this.n == vastAd.n && this.Q == vastAd.Q && this.R == vastAd.R && this.S == vastAd.S && amkq.b(this.b, vastAd.b) && amkq.b(this.t, vastAd.t) && amkq.b(this.u, vastAd.u) && amkq.b(this.v, vastAd.v) && amkq.b(this.w, vastAd.w) && amkq.b(this.x, vastAd.x) && amkq.b(this.y, vastAd.y) && amkq.b(this.z, vastAd.z) && amkq.b(this.A, vastAd.A) && amkq.b(this.B, vastAd.B) && amkq.b(this.C, vastAd.C) && amkq.b(this.D, vastAd.D) && amkq.b(this.E, vastAd.E) && amkq.b(this.F, vastAd.F) && amkq.b(this.G, vastAd.G) && amkq.b(this.H, vastAd.H) && amkq.b(this.I, vastAd.I) && amkq.b(this.f175J, vastAd.f175J) && amkq.b(this.K, vastAd.K) && amkq.b(this.L, vastAd.L) && amkq.b(this.M, vastAd.M) && amkq.b(this.N, vastAd.N) && amkq.b(this.O, vastAd.O) && amkq.b(this.P, vastAd.P) && amkq.b(this.W, vastAd.W) && amkq.b(this.X, vastAd.X) && amkq.b(this.Y, vastAd.Y) && this.aa == vastAd.aa && this.ab == vastAd.ab && amkq.b(this.an, vastAd.an) && amkq.b(this.ac, vastAd.ac) && amkq.b(this.ad, vastAd.ad) && amkq.b(this.r, vastAd.r) && amkq.b(this.af, vastAd.af) && amkq.b(this.ag, vastAd.ag) && amkq.b(this.ah, vastAd.ah) && this.ae == vastAd.ae && amkq.b(this.ai, vastAd.ai) && Arrays.equals(this.aj, vastAd.aj);
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final aamn f() {
        throw null;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final String g() {
        throw null;
    }

    @Override // defpackage.afre
    public final /* bridge */ /* synthetic */ afrd h() {
        return new aamv(this);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final String i() {
        throw null;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final String j() {
        throw null;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final boolean k(shf shfVar) {
        throw null;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final boolean l() {
        throw null;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final boolean m() {
        throw null;
    }

    public final void n() {
        LinkedList linkedList = new LinkedList();
        for (VastAd vastAd = this; vastAd != null; vastAd = vastAd.Y) {
            String str = vastAd.j;
            if (str == null) {
                str = "";
            }
            linkedList.offerFirst(str);
        }
        TextUtils.join(",", linkedList);
    }

    public final void o() {
        LinkedList linkedList = new LinkedList();
        for (VastAd vastAd = this; vastAd != null; vastAd = vastAd.Y) {
            String str = vastAd.k;
            if (str == null) {
                str = "";
            }
            linkedList.offerFirst(str);
        }
        TextUtils.join(",", linkedList);
    }

    public final void p() {
        LinkedList linkedList = new LinkedList();
        for (VastAd vastAd = this; vastAd != null; vastAd = vastAd.Y) {
            linkedList.offerFirst(Long.valueOf(vastAd.Z));
        }
        TextUtils.join(",", linkedList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeByteArray(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.ak);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l.toString());
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeParcelable(this.o, 0);
        parcel.writeParcelable(this.al, 0);
        parcel.writeParcelable(this.p, 0);
        parcel.writeParcelable(this.q, 0);
        parcel.writeParcelable(new ParcelableMessageLite(this.r), 0);
        parcel.writeParcelable(this.s, 0);
        parcel.writeTypedList(this.t);
        parcel.writeTypedList(this.u);
        parcel.writeTypedList(this.v);
        parcel.writeTypedList(this.w);
        parcel.writeTypedList(this.x);
        parcel.writeTypedList(this.y);
        parcel.writeTypedList(this.z);
        parcel.writeTypedList(this.A);
        parcel.writeTypedList(this.B);
        parcel.writeTypedList(this.D);
        parcel.writeTypedList(this.E);
        parcel.writeTypedList(this.F);
        parcel.writeTypedList(this.G);
        parcel.writeTypedList(this.H);
        parcel.writeTypedList(this.I);
        parcel.writeTypedList(this.f175J);
        parcel.writeTypedList(this.K);
        parcel.writeTypedList(this.L);
        parcel.writeTypedList(this.M);
        parcel.writeTypedList(this.N);
        parcel.writeTypedList(this.C);
        parcel.writeParcelable(this.O, 0);
        parcel.writeParcelable(this.P, 0);
        parcel.writeInt(this.Q ? 1 : 0);
        parcel.writeLong(this.R);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T ? 1 : 0);
        apfc apfcVar = this.U;
        if (apfcVar == null) {
            apfcVar = apfc.a;
        }
        yny.I(apfcVar, parcel);
        argu arguVar = this.V;
        if (arguVar == null) {
            arguVar = argu.a;
        }
        yny.I(arguVar, parcel);
        parcel.writeLong(this.Z);
        parcel.writeInt(this.aa ? 1 : 0);
        parcel.writeInt(this.ab ? 1 : 0);
        parcel.writeParcelable(this.W, 0);
        parcel.writeParcelable(this.X, 0);
        parcel.writeParcelable(this.Y, 0);
        amru amruVar = this.an;
        ArrayList arrayList = new ArrayList();
        Iterator it = amruVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((aamo) it.next()).name());
        }
        parcel.writeStringList(arrayList);
        parcel.writeTypedList(this.ac);
        parcel.writeParcelable(this.ad, 0);
        parcel.writeTypedList(this.af);
        parcel.writeTypedList(this.ag);
        parcel.writeTypedList(this.ah);
        parcel.writeInt(this.ae ? 1 : 0);
        Pattern pattern = this.ai;
        parcel.writeString(pattern == null ? "" : pattern.pattern());
        parcel.writeByteArray(this.aj);
    }

    public final String toString() {
        if (this.am) {
            String valueOf = String.valueOf(this.W);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("VastAd Wrapper: [wrapperUri=");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        String str = this.j;
        String str2 = this.c;
        String str3 = this.k;
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 48 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append("VastAd: [vastAdId=");
        sb2.append(str);
        sb2.append(", adVideoId=");
        sb2.append(str2);
        sb2.append(", vastAdSystem = ");
        sb2.append(str3);
        sb2.append("]");
        return sb2.toString();
    }

    public VastAd(List list, String str, String str2, String str3, String str4, String str5, byte[] bArr, String str6, String str7, String str8, String str9, aamn aamnVar, String str10, int i, PlayerResponseModel playerResponseModel, VideoStreamingData videoStreamingData, PlaybackTrackingModel playbackTrackingModel, PlayerConfigModel playerConfigModel, atxz atxzVar, Uri uri, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, List list16, List list17, List list18, List list19, List list20, List list21, List list22, Uri uri2, Uri uri3, boolean z, long j, int i2, boolean z2, apfc apfcVar, argu arguVar, long j2, boolean z3, boolean z4, Uri uri4, VastAd vastAd, VastAd vastAd2, List list23, List list24, Survey survey, List list25, List list26, List list27, boolean z5, Pattern pattern, byte[] bArr2) {
        this.b = q(list);
        this.c = str;
        this.d = str2;
        this.e = str3 != null ? str3 : vastAd2 != null ? vastAd2.e : null;
        this.f = str4 != null ? str4 : vastAd2 != null ? vastAd2.f : null;
        this.g = str5 != null ? str5 : vastAd2 != null ? vastAd2.g : null;
        this.h = bArr;
        this.i = str6;
        this.ak = str7;
        this.j = str8;
        this.k = str9;
        this.l = aamnVar;
        this.m = str10;
        this.n = i;
        this.o = playerResponseModel;
        this.al = videoStreamingData;
        playbackTrackingModel.getClass();
        this.p = playbackTrackingModel;
        playerConfigModel.getClass();
        this.q = playerConfigModel;
        this.r = atxzVar;
        this.s = uri;
        this.t = q(list2);
        this.u = q(list3);
        this.v = q(list4);
        this.w = q(list5);
        this.x = q(list6);
        this.y = q(list7);
        this.z = q(list8);
        this.A = q(list9);
        this.B = q(list10);
        this.C = q(list22);
        this.D = q(list11);
        this.E = q(list12);
        this.F = q(list13);
        this.G = q(list14);
        this.H = q(list15);
        this.I = q(list16);
        this.f175J = q(list17);
        this.K = q(list18);
        this.L = q(list19);
        this.M = q(list20);
        this.N = q(list21);
        this.O = uri2;
        this.P = uri3;
        this.Q = z;
        this.R = j;
        this.S = i2;
        this.T = z2;
        apfc apfcVar2 = apfcVar;
        this.U = true == apfc.a.equals(apfcVar2) ? null : apfcVar2;
        this.V = true != argu.a.equals(arguVar) ? arguVar : null;
        this.Z = j2;
        this.aa = z3;
        this.ab = z4;
        this.W = uri4;
        this.am = uri4 != null;
        this.X = vastAd;
        this.Y = vastAd2;
        p();
        o();
        n();
        this.an = q(list23);
        this.ac = q(list24);
        this.ad = survey;
        this.af = q(list25);
        this.ag = q(list26);
        this.ah = q(list27);
        this.ae = z5;
        this.ai = pattern;
        this.aj = bArr2;
    }
}
