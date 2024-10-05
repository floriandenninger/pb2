package com.google.android.gms.mdisync;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rbg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SyncOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rbg(9);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qip.n(parcel, qip.m(parcel));
    }
}
