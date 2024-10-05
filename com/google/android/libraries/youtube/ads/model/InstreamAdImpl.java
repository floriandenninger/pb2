package com.google.android.libraries.youtube.ads.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.innertube.model.ads.InstreamAd;
import defpackage.aamn;
import defpackage.afre;
import defpackage.shf;
import defpackage.xes;
import defpackage.xeu;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class InstreamAdImpl implements InstreamAd, afre {
    public static final Parcelable.Creator CREATOR = new xes(2);
    public static final xeu a = new xeu();
    public final PlayerAd b;

    public InstreamAdImpl(PlayerAd playerAd) {
        this.b = playerAd;
    }

    @Override // defpackage.aamp
    public final long a() {
        return this.b.n;
    }

    @Override // defpackage.aamp
    @Deprecated
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final int c() {
        return this.b.q();
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final Uri d() {
        return this.b.d();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.afre
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final xeu h() {
        return new xeu(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InstreamAdImpl) {
            return this.b.equals(((InstreamAdImpl) obj).b);
        }
        return false;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final aamn f() {
        return this.b.F();
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final String g() {
        return this.b.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final String i() {
        return this.b.n();
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final String j() {
        return this.b.g;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final boolean k(shf shfVar) {
        return this.b.ad(shfVar);
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final boolean l() {
        return this.b instanceof ForecastingAd;
    }

    @Override // com.google.android.libraries.youtube.innertube.model.ads.InstreamAd
    public final boolean m() {
        return this.b.ae();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
    }
}
