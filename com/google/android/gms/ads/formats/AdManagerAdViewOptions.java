package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pph;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pph(20);
    public final boolean a;
    public final IBinder b;

    public AdManagerAdViewOptions(boolean z, IBinder iBinder) {
        this.a = z;
        this.b = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.o(parcel, 1, this.a);
        qip.y(parcel, 2, this.b);
        qip.n(parcel, m);
    }
}
