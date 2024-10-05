package com.google.android.libraries.youtube.ads.model;

import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import defpackage.afrd;
import defpackage.aoyi;
import defpackage.xes;
import defpackage.xgr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ThrottledAd extends PlayerAd {
    public static final ThrottledAd a = new ThrottledAd("throttled", new byte[0], "", "throttled", false, PlayerConfigModel.b, "", Long.MAX_VALUE);
    public static final Parcelable.Creator CREATOR = new xes(7);

    static {
        new xgr();
    }

    public ThrottledAd(String str, byte[] bArr, String str2, String str3, boolean z, PlayerConfigModel playerConfigModel, String str4, long j) {
        super(str, bArr, str2, str3, z, playerConfigModel, str4, j, new VideoAdTrackingModel(aoyi.a));
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final int c() {
        return 0;
    }

    @Override // com.google.android.libraries.youtube.ads.model.PlayerAd
    public final boolean equals(Object obj) {
        if (obj instanceof ThrottledAd) {
            return super.equals((ThrottledAd) obj);
        }
        return false;
    }

    @Override // defpackage.afre
    public final /* bridge */ /* synthetic */ afrd h() {
        return new xgr(this);
    }
}
