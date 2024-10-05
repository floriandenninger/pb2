package com.google.android.libraries.youtube.ads.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.ads.VastAd;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlaybackTrackingModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import defpackage.afrd;
import defpackage.afsi;
import defpackage.amkq;
import defpackage.aoyi;
import defpackage.aoyx;
import defpackage.argu;
import defpackage.arhb;
import defpackage.asgk;
import defpackage.rrw;
import defpackage.xcg;
import defpackage.xfx;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AdIntro extends MediaAd {
    public static final Parcelable.Creator CREATOR = new rrw(19);
    public static final xfx a = new xcg();
    public final PlayerResponseModel b;

    public AdIntro(String str, byte[] bArr, String str2, String str3, boolean z, String str4, long j, PlayerResponseModel playerResponseModel) {
        super(str, bArr, str2, str3, z, playerResponseModel.c(), str4, j, new VideoAdTrackingModel(aoyi.a));
        playerResponseModel.getClass();
        this.b = playerResponseModel;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        return this.b.a();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final Uri d() {
        List list;
        if (e() == null || (list = e().n) == null) {
            return null;
        }
        if (list.isEmpty()) {
            afsi.b(1, 1, "Received non-null videoStreamingData object with empty list of format streams");
            return null;
        }
        return ((FormatStreamModel) list.get(0)).d;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final VideoStreamingData e() {
        return this.b.c;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean equals(Object obj) {
        if (!(obj instanceof AdIntro)) {
            return false;
        }
        AdIntro adIntro = (AdIntro) obj;
        return super.equals(adIntro) && amkq.b(this.b, adIntro.b);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final PlaybackTrackingModel f() {
        return this.b.f();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final PlayerResponseModel g() {
        return this.b;
    }

    @Override // defpackage.afre
    public final /* bridge */ /* synthetic */ afrd h() {
        return new xcg(this);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aoyx i() {
        return this.b.n();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final argu j() {
        arhb arhbVar = this.b.a.r;
        if (arhbVar == null) {
            arhbVar = arhb.a;
        }
        if (arhbVar.b != 61737181) {
            return null;
        }
        arhb arhbVar2 = this.b.a.r;
        if (arhbVar2 == null) {
            arhbVar2 = arhb.a;
        }
        if (arhbVar2.b == 61737181) {
            return (argu) arhbVar2.c;
        }
        return argu.a;
    }

    @Override // com.google.android.libraries.youtube.ads.model.MediaAd
    public final asgk k() {
        return null;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String l() {
        return VastAd.a;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String m() {
        return this.b.u();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String n() {
        return this.b.y();
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.b, 0);
    }
}
