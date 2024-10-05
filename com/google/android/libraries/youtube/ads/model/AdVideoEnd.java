package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import defpackage.afrd;
import defpackage.amkq;
import defpackage.aowz;
import defpackage.aoyi;
import defpackage.aoyx;
import defpackage.rrw;
import defpackage.xcj;
import defpackage.xfx;
import defpackage.yny;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AdVideoEnd extends MediaBreakAd {
    public static final Parcelable.Creator CREATOR = new rrw(20);
    public static final xfx a = new xcj();
    public final aoyx b;
    public final int c;
    public final PlayerAd d;

    public AdVideoEnd(PlayerAd playerAd, String str) {
        super(playerAd.g, playerAd.h, playerAd.i, playerAd.j, playerAd.k, playerAd.l, str, playerAd.o);
        aoyx i = playerAd.i();
        i.getClass();
        this.b = i;
        this.d = playerAd;
        this.c = playerAd instanceof LocalVideoAd ? ((LocalVideoAd) playerAd).qB() : 0;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        return 0;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean equals(Object obj) {
        if (!(obj instanceof AdVideoEnd)) {
            return false;
        }
        AdVideoEnd adVideoEnd = (AdVideoEnd) obj;
        return super.equals(adVideoEnd) && amkq.b(this.b, adVideoEnd.b) && this.c == adVideoEnd.c;
    }

    @Override // defpackage.afre
    public final /* bridge */ /* synthetic */ afrd h() {
        return new xcj(this);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aoyx i() {
        return this.b;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aowz o() {
        aoyx aoyxVar = this.b;
        if ((aoyxVar.b & 128) == 0) {
            return null;
        }
        aowz aowzVar = aoyxVar.i;
        return aowzVar == null ? aowz.a : aowzVar;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int qB() {
        return this.c;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        yny.I(this.b, parcel);
        parcel.writeParcelable(this.d, 0);
        parcel.writeInt(this.c);
    }

    public AdVideoEnd(String str, byte[] bArr, String str2, String str3, boolean z, PlayerConfigModel playerConfigModel, String str4, aoyx aoyxVar, PlayerAd playerAd, int i) {
        super(str, bArr, str2, str3, z, playerConfigModel, str4, new VideoAdTrackingModel(aoyi.a));
        aoyxVar.getClass();
        this.b = aoyxVar;
        playerAd.getClass();
        this.d = playerAd;
        this.c = i;
    }
}
