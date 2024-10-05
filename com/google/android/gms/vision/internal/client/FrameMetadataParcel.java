package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rot;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FrameMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rot(20);
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public FrameMetadataParcel() {
    }

    public FrameMetadataParcel(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 2, this.a);
        qip.s(parcel, 3, this.b);
        qip.s(parcel, 4, this.c);
        qip.t(parcel, 5, this.d);
        qip.s(parcel, 6, this.e);
        qip.n(parcel, m);
    }
}
