package com.google.android.gms.potokens;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rnq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PoToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rnq(20);
    public final byte[] a;

    public PoToken(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.w(parcel, 1, this.a);
        qip.n(parcel, m);
    }
}
