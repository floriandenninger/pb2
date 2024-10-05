package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.afrd;
import defpackage.amkq;
import defpackage.aowz;
import defpackage.avwa;
import defpackage.xes;
import defpackage.xgz;
import defpackage.yny;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VideoTrackingAd extends PlayerAd {
    public static final Parcelable.Creator CREATOR = new xes(9);
    public final avwa a;
    public final int b;
    private final String c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoTrackingAd(java.lang.String r14, byte[] r15, java.lang.String r16, boolean r17, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r18, int r19, defpackage.avwa r20) {
        /*
            r13 = this;
            r11 = r13
            r12 = r20
            if (r12 != 0) goto L8
            r0 = 0
        L6:
            r10 = r0
            goto L14
        L8:
            com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel r0 = new com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel
            aoyi r1 = r12.c
            if (r1 != 0) goto L10
            aoyi r1 = defpackage.aoyi.a
        L10:
            r0.<init>(r1)
            goto L6
        L14:
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r4 = ""
            java.lang.String r7 = ""
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r17
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10)
            r0 = r19
            r11.b = r0
            r0 = r14
            r11.c = r0
            r20.getClass()
            r11.a = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.ads.model.VideoTrackingAd.<init>(java.lang.String, byte[], java.lang.String, boolean, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, int, avwa):void");
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        return this.b;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean equals(Object obj) {
        if (!(obj instanceof VideoTrackingAd)) {
            return false;
        }
        VideoTrackingAd videoTrackingAd = (VideoTrackingAd) obj;
        return super.equals(videoTrackingAd) && this.b == videoTrackingAd.b && this.c.equals(videoTrackingAd.c) && amkq.b(this.a, videoTrackingAd.a);
    }

    @Override // defpackage.afre
    public final /* bridge */ /* synthetic */ afrd h() {
        return new xgz(this);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final String n() {
        return this.c;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final aowz o() {
        avwa avwaVar = this.a;
        if ((avwaVar.b & 8) == 0) {
            return null;
        }
        aowz aowzVar = avwaVar.e;
        return aowzVar == null ? aowz.a : aowzVar;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        yny.I(this.a, parcel);
    }
}
