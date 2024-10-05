package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qui;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ProgramResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qui(9);
    public final int a;
    public final byte[] b;
    public final int c;

    public ProgramResponse(int i, byte[] bArr, int i2) {
        this.a = i;
        this.b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.w(parcel, 2, this.b);
        qip.s(parcel, 3, this.c);
        qip.n(parcel, m);
    }
}
