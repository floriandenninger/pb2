package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rlt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RenameRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(15);
    public final Uri a;
    public final Uri b;

    public RenameRequest(Uri uri, Uri uri2) {
        this.a = uri;
        this.b = uri2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 1, this.a, i);
        qip.E(parcel, 2, this.b, i);
        qip.n(parcel, m);
    }
}
