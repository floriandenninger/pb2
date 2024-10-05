package com.google.android.libraries.youtube.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import defpackage.afrd;
import defpackage.amkq;
import defpackage.aqxo;
import defpackage.xep;
import defpackage.xes;
import defpackage.xfx;
import defpackage.yny;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ForecastingAd extends PlayerAd {
    public static final Parcelable.Creator CREATOR = new xes(1);
    public static final xfx a = new xep();
    public final aqxo b;

    public ForecastingAd(InstreamAdBreak instreamAdBreak, PlayerConfigModel playerConfigModel, String str, long j, aqxo aqxoVar) {
        this(instreamAdBreak.f, instreamAdBreak.i, instreamAdBreak.h, instreamAdBreak.g, instreamAdBreak.e, playerConfigModel, str, j, aqxoVar);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        return 0;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean equals(Object obj) {
        if (!(obj instanceof ForecastingAd)) {
            return false;
        }
        ForecastingAd forecastingAd = (ForecastingAd) obj;
        return super.equals(forecastingAd) && amkq.b(this.b, forecastingAd.b);
    }

    @Override // defpackage.afre
    public final /* bridge */ /* synthetic */ afrd h() {
        return new xep(this);
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        yny.I(this.b, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ForecastingAd(java.lang.String r13, byte[] r14, java.lang.String r15, java.lang.String r16, boolean r17, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r18, java.lang.String r19, long r20, defpackage.aqxo r22) {
        /*
            r12 = this;
            r11 = r22
            if (r17 == 0) goto L9
            long r0 = com.google.android.libraries.youtube.ads.model.ForecastingAd.e
            long r0 = r20 + r0
            goto Le
        L9:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Le:
            r8 = r0
            com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel r10 = new com.google.android.libraries.youtube.ads.model.VideoAdTrackingModel
            aoyi r0 = defpackage.aoyi.a
            aone r0 = r0.createBuilder()
            aony r1 = r11.b
            r0.copyOnWrite()
            aonm r2 = r0.instance
            aoyi r2 = (defpackage.aoyi) r2
            aony r3 = r2.b
            boolean r4 = r3.c()
            if (r4 != 0) goto L2e
            aony r3 = defpackage.aonm.mutableCopy(r3)
            r2.b = r3
        L2e:
            aony r2 = r2.b
            defpackage.aolo.addAll(r1, r2)
            aonm r0 = r0.build()
            aoyi r0 = (defpackage.aoyi) r0
            r10.<init>(r0)
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10)
            r22.getClass()
            r0.b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.ads.model.ForecastingAd.<init>(java.lang.String, byte[], java.lang.String, java.lang.String, boolean, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, java.lang.String, long, aqxo):void");
    }
}
