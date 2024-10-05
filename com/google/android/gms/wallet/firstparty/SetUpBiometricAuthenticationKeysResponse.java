package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rqx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SetUpBiometricAuthenticationKeysResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rqx(15);
    byte[] a;

    public SetUpBiometricAuthenticationKeysResponse(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.w(parcel, 1, this.a);
        qip.n(parcel, m);
    }
}
