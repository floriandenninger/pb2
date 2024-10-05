package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.puc;
import defpackage.pum;
import defpackage.puo;
import defpackage.pvl;
import defpackage.pxk;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdErrorParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pvl(2);
    public final int a;
    public final String b;
    public final String c;
    public AdErrorParcel d;
    public IBinder e;

    public AdErrorParcel(int i, String str, String str2, AdErrorParcel adErrorParcel, IBinder iBinder) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = adErrorParcel;
        this.e = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.F(parcel, 3, this.c);
        qip.E(parcel, 4, this.d, i);
        qip.y(parcel, 5, this.e);
        qip.n(parcel, m);
    }

    public final puc a() {
        AdErrorParcel adErrorParcel = this.d;
        return new puc(this.a, this.b, this.c, adErrorParcel == null ? null : new puc(adErrorParcel.a, adErrorParcel.b, adErrorParcel.c));
    }

    public final pum b() {
        pxk pxkVar;
        AdErrorParcel adErrorParcel = this.d;
        puc pucVar = adErrorParcel == null ? null : new puc(adErrorParcel.a, adErrorParcel.b, adErrorParcel.c);
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        IBinder iBinder = this.e;
        if (iBinder == null) {
            pxkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof pxk) {
                pxkVar = (pxk) queryLocalInterface;
            } else {
                pxkVar = new pxk(iBinder);
            }
        }
        return new pum(i, str, str2, pucVar, pxkVar != null ? new puo(pxkVar) : null);
    }
}
