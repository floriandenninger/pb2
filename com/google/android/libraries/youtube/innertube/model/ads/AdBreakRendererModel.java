package com.google.android.libraries.youtube.innertube.model.ads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aamk;
import defpackage.aaml;
import defpackage.afrd;
import defpackage.afre;
import defpackage.amkq;
import defpackage.aowc;
import defpackage.yny;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AdBreakRendererModel implements Parcelable, afre {
    public static final Parcelable.Creator CREATOR = new aamk(0);
    public static final aaml a = new aaml();
    public aowc b;

    public AdBreakRendererModel(aowc aowcVar) {
        aowcVar.getClass();
        this.b = aowcVar;
    }

    public final String a() {
        return this.b.e;
    }

    public final List b() {
        return this.b.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return amkq.b(this.b, ((AdBreakRendererModel) obj).b);
    }

    @Override // defpackage.afre
    public final /* bridge */ /* synthetic */ afrd h() {
        return new aaml(this);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yny.I(this.b, parcel);
    }
}
