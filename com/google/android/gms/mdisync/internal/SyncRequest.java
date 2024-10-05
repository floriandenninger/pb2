package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdisync.SyncOptions;
import defpackage.qip;
import defpackage.rbg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rbg(10);
    public final byte[] a;
    public final SyncOptions b;
    public final int c;

    public SyncRequest(int i, byte[] bArr, SyncOptions syncOptions) {
        int i2 = 4;
        if (i == 0) {
            i2 = 1;
        } else if (i == 1) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 3;
        } else if (i != 3) {
            i2 = i != 4 ? 0 : 5;
        }
        this.c = i2 != 0 ? i2 : 1;
        this.a = bArr;
        this.b = syncOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.c - 1);
        qip.w(parcel, 2, this.a);
        qip.E(parcel, 3, this.b, i);
        qip.n(parcel, m);
    }
}
