package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qcp;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ClearTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qcp(10);
    final int a;
    public String b;

    public ClearTokenRequest() {
        this.a = 1;
    }

    public ClearTokenRequest(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.n(parcel, m);
    }
}
