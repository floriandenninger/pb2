package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rqx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BuyFlowConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new rqx(20);
    public String a;
    public ApplicationParameters b;
    public String c;
    public String d;
    String e;

    public BuyFlowConfig() {
    }

    public BuyFlowConfig(String str, ApplicationParameters applicationParameters, String str2, String str3, String str4) {
        this.a = str;
        this.b = applicationParameters;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.E(parcel, 3, this.b, i);
        qip.F(parcel, 4, this.c);
        qip.F(parcel, 5, this.d);
        qip.F(parcel, 6, this.e);
        qip.n(parcel, m);
    }
}
