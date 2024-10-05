package com.google.android.gms.ads.internal.initialization;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pvl;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediationConfigurationParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pvl(11);
    public final String a;
    public final Bundle b;

    public MediationConfigurationParcel(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.v(parcel, 2, this.b);
        qip.n(parcel, m);
    }
}
