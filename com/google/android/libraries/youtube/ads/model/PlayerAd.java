package com.google.android.libraries.youtube.ads.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import defpackage.aamn;
import defpackage.aamp;
import defpackage.afre;
import defpackage.amkq;
import defpackage.aowz;
import defpackage.aoyj;
import defpackage.aoyx;
import defpackage.aplp;
import defpackage.apmg;
import defpackage.apxf;
import defpackage.argu;
import defpackage.asus;
import defpackage.auve;
import defpackage.shf;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class PlayerAd implements Parcelable, aamp, afre {
    protected static final long e = TimeUnit.DAYS.toMillis(3);
    public static final byte[] f = new byte[0];
    public static final /* synthetic */ int p = 0;
    public final String g;
    public final byte[] h;
    public final String i;
    public final String j;
    public final boolean k;
    public final PlayerConfigModel l;
    public final String m;
    public final long n;
    public final VideoAdTrackingModel o;

    /* JADX INFO: Access modifiers changed from: protected */
    public PlayerAd(String str, byte[] bArr, String str2, String str3, boolean z, PlayerConfigModel playerConfigModel, String str4, long j, VideoAdTrackingModel videoAdTrackingModel) {
        str.getClass();
        this.g = str;
        bArr.getClass();
        this.h = bArr;
        this.i = str2;
        str3.getClass();
        this.j = str3;
        this.k = z;
        playerConfigModel.getClass();
        this.l = playerConfigModel;
        this.m = str4;
        this.n = j;
        videoAdTrackingModel.getClass();
        this.o = videoAdTrackingModel;
    }

    public static boolean af(int i) {
        return i > 0;
    }

    public List A() {
        return Collections.emptyList();
    }

    public List B() {
        return Collections.emptyList();
    }

    public asus[] E() {
        return null;
    }

    public aamn F() {
        return null;
    }

    public apxf G() {
        return null;
    }

    public final List H() {
        return this.o.c;
    }

    public final List I() {
        return this.o.d;
    }

    public final List J() {
        return this.o.e;
    }

    public final List K() {
        return this.o.f;
    }

    public final List L() {
        return this.o.g;
    }

    public final List M() {
        return this.o.h;
    }

    public final List N() {
        return this.o.i;
    }

    public final List O() {
        return this.o.j;
    }

    public final List P() {
        return this.o.k;
    }

    public final List Q() {
        return this.o.l;
    }

    public final List R() {
        return this.o.m;
    }

    public final List S() {
        return this.o.n;
    }

    public final List T() {
        return this.o.o;
    }

    public final List U() {
        return this.o.s;
    }

    public final List V() {
        return this.o.p;
    }

    public final List W() {
        return this.o.q;
    }

    public final List X() {
        return this.o.r;
    }

    public final List Y() {
        return this.o.t;
    }

    public final List Z() {
        return this.o.u;
    }

    @Override // defpackage.aamp
    public final long a() {
        return this.n;
    }

    public final List aa() {
        return this.o.v;
    }

    public final List ab() {
        return this.o.y;
    }

    public final List ac() {
        return this.o.z;
    }

    public final boolean ad(shf shfVar) {
        return shfVar.c() >= this.n;
    }

    public boolean ae() {
        return r() > 0;
    }

    @Override // defpackage.aamp
    @Deprecated
    public final boolean b() {
        return false;
    }

    public abstract int c();

    public Uri d() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VideoStreamingData e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlayerAd)) {
            return false;
        }
        PlayerAd playerAd = (PlayerAd) obj;
        return amkq.b(this.g, playerAd.g) && Arrays.equals(this.h, playerAd.h) && amkq.b(this.i, playerAd.i) && amkq.b(this.j, playerAd.j) && this.k == playerAd.k && amkq.b(this.l, playerAd.l) && amkq.b(this.m, playerAd.m) && this.n == playerAd.n && amkq.b(this.o, playerAd.o);
    }

    public PlaybackTrackingModel f() {
        return null;
    }

    public PlayerResponseModel g() {
        return null;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("Ad should not be a key.");
    }

    public aoyx i() {
        return null;
    }

    public argu j() {
        return null;
    }

    public String l() {
        return "";
    }

    public String m() {
        return null;
    }

    public String n() {
        return null;
    }

    public aowz o() {
        return null;
    }

    public int p() {
        return 0;
    }

    public int q() {
        return 1;
    }

    public int qB() {
        return 0;
    }

    protected int r() {
        return 0;
    }

    public Uri t() {
        return null;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        String str = this.m;
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 1 + String.valueOf(str).length());
        sb.append(simpleName);
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }

    public aoyj u() {
        return null;
    }

    public aplp v() {
        return null;
    }

    public apmg w() {
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.g);
        parcel.writeByteArray(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.l, 0);
        parcel.writeString(this.m);
        parcel.writeLong(this.n);
    }

    public apxf x() {
        return null;
    }

    public auve y() {
        return null;
    }

    public String z() {
        return "";
    }
}
