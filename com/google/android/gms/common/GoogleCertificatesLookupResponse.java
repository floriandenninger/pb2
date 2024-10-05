package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pse;
import defpackage.qip;
import defpackage.qmu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qmu(4);
    public final boolean a;
    public final String b;
    public final int c;

    public GoogleCertificatesLookupResponse(boolean z, String str, int i) {
        this.a = z;
        this.b = str;
        this.c = pse.o(i) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.o(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.s(parcel, 3, this.c);
        qip.n(parcel, m);
    }
}
