package com.google.android.libraries.youtube.ads.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import defpackage.aamn;
import defpackage.afrd;
import defpackage.apxf;
import defpackage.asgk;
import defpackage.xes;
import defpackage.xgd;
import defpackage.yny;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RemoteVideoAd extends VideoAd {
    public static final Parcelable.Creator CREATOR = new xes(4);
    public final boolean a;
    public final int b;
    public final String c;
    public final aamn d;
    public final Uri q;
    public final PlayerResponseModel r;
    public final apxf s;
    private final String t;
    private final asgk u;

    public RemoteVideoAd(boolean z, int i, long j, String str, String str2, String str3, String str4, byte[] bArr, aamn aamnVar, Uri uri, PlayerResponseModel playerResponseModel, apxf apxfVar, asgk asgkVar) {
        super(str3, bArr, "", "", false, PlayerConfigModel.b, str, j, VideoAdTrackingModel.a);
        this.a = z;
        this.b = i;
        this.c = str2;
        this.t = str4;
        this.d = aamnVar;
        this.q = uri;
        this.r = playerResponseModel;
        this.s = apxfVar;
        this.u = asgkVar;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aamn F() {
        return this.d;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean ae() {
        return this.a;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        return this.b;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final PlayerResponseModel g() {
        return this.r;
    }

    @Override // defpackage.afre
    public final afrd h() {
        throw new UnsupportedOperationException("RemoteVideoAd should not be used for Jsonable converter.");
    }

    @Override // com.google.android.libraries.youtube.ads.model.MediaAd
    public final asgk k() {
        return this.u;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String n() {
        return this.c;
    }

    public final xgd s() {
        xgd xgdVar = new xgd();
        xgdVar.a = this.a;
        xgdVar.b = this.b;
        xgdVar.c = this.n;
        xgdVar.d = this.m;
        xgdVar.e = this.c;
        xgdVar.f = this.g;
        xgdVar.g = this.t;
        xgdVar.h = this.h;
        xgdVar.i = this.d;
        xgdVar.j = this.q;
        xgdVar.k = this.r;
        xgdVar.l = this.s;
        xgdVar.m = this.u;
        return xgdVar;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final Uri t() {
        return this.q;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.t);
        parcel.writeString(this.d.toString());
        parcel.writeParcelable(this.q, 0);
        parcel.writeParcelable(this.r, 0);
        apxf apxfVar = this.s;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        yny.I(apxfVar, parcel);
        asgk asgkVar = this.u;
        if (asgkVar != null) {
            yny.I(asgkVar, parcel);
        }
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String z() {
        return this.t;
    }
}
