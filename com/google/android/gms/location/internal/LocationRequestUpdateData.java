package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rax;
import defpackage.raz;
import defpackage.rba;
import defpackage.rbc;
import defpackage.rbg;
import defpackage.rbj;
import defpackage.rbl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rbg(6);
    public final int a;
    public final LocationRequestInternal b;
    public final PendingIntent c;
    public final String d;
    private final rbc e;
    private final raz f;
    private final rbl g;

    public LocationRequestUpdateData(int i, LocationRequestInternal locationRequestInternal, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        rbc rbcVar;
        raz razVar;
        this.a = i;
        this.b = locationRequestInternal;
        rbl rblVar = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof rbc) {
                rbcVar = (rbc) queryLocalInterface;
            } else {
                rbcVar = new rba(iBinder);
            }
        } else {
            rbcVar = null;
        }
        this.e = rbcVar;
        this.c = pendingIntent;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof raz) {
                razVar = (raz) queryLocalInterface2;
            } else {
                razVar = new rax(iBinder2);
            }
        } else {
            razVar = null;
        }
        this.f = razVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof rbl) {
                rblVar = (rbl) queryLocalInterface3;
            } else {
                rblVar = new rbj(iBinder3);
            }
        }
        this.g = rblVar;
        this.d = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r9v0, types: [raz, android.os.IBinder] */
    public static LocationRequestUpdateData a(raz razVar, rbl rblVar) {
        if (rblVar == null) {
            rblVar = null;
        }
        return new LocationRequestUpdateData(2, null, null, razVar, null, rblVar, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.E(parcel, 2, this.b, i);
        rbc rbcVar = this.e;
        qip.y(parcel, 3, rbcVar == null ? null : rbcVar.asBinder());
        qip.E(parcel, 4, this.c, i);
        raz razVar = this.f;
        qip.y(parcel, 5, razVar == null ? null : razVar.asBinder());
        rbl rblVar = this.g;
        qip.y(parcel, 6, rblVar != null ? rblVar.asBinder() : null);
        qip.F(parcel, 8, this.d);
        qip.n(parcel, m);
    }
}
