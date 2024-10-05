package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rlt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OpenFileDescriptorRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(13);
    public final Uri a;
    public final int b;

    public OpenFileDescriptorRequest(Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 1, this.a, i);
        qip.s(parcel, 2, this.b);
        qip.n(parcel, m);
    }
}
