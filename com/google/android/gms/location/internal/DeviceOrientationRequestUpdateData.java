package com.google.android.gms.location.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rau;
import defpackage.raw;
import defpackage.rbg;
import defpackage.rbj;
import defpackage.rbl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DeviceOrientationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rbg(3);
    int a;
    DeviceOrientationRequestInternal b;
    raw c;
    rbl d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.E(parcel, 2, this.b, i);
        raw rawVar = this.c;
        qip.y(parcel, 3, rawVar == null ? null : rawVar.asBinder());
        rbl rblVar = this.d;
        qip.y(parcel, 4, rblVar != null ? rblVar.asBinder() : null);
        qip.n(parcel, m);
    }

    public DeviceOrientationRequestUpdateData(int i, DeviceOrientationRequestInternal deviceOrientationRequestInternal, IBinder iBinder, IBinder iBinder2) {
        raw rauVar;
        this.a = i;
        this.b = deviceOrientationRequestInternal;
        rbl rblVar = null;
        if (iBinder == null) {
            rauVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            if (queryLocalInterface instanceof raw) {
                rauVar = (raw) queryLocalInterface;
            } else {
                rauVar = new rau(iBinder);
            }
        }
        this.c = rauVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface2 instanceof rbl) {
                rblVar = (rbl) queryLocalInterface2;
            } else {
                rblVar = new rbj(iBinder2);
            }
        }
        this.d = rblVar;
    }
}
