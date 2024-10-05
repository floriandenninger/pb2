package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pvl;
import defpackage.pww;
import defpackage.pwy;
import defpackage.qip;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pvl(1);
    public final boolean a;
    public final IBinder b;
    private final pwy c;

    public PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        pwy pwyVar;
        this.a = z;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            if (queryLocalInterface instanceof pwy) {
                pwyVar = (pwy) queryLocalInterface;
            } else {
                pwyVar = new pww(iBinder);
            }
        } else {
            pwyVar = null;
        }
        this.c = pwyVar;
        this.b = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.o(parcel, 1, this.a);
        pwy pwyVar = this.c;
        qip.y(parcel, 2, pwyVar == null ? null : pwyVar.asBinder());
        qip.y(parcel, 3, this.b);
        qip.n(parcel, m);
    }
}
