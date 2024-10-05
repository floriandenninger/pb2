package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qfh;
import defpackage.qia;
import defpackage.qib;
import defpackage.qip;
import defpackage.qkw;
import defpackage.qve;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CastMediaOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final NotificationOptions c;
    public final boolean d;
    public final boolean e;
    private final qib f;

    static {
        new qkw("CastMediaOptions");
        CREATOR = new qfh(11);
    }

    public CastMediaOptions(String str, String str2, IBinder iBinder, NotificationOptions notificationOptions, boolean z, boolean z2) {
        qib qiaVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            qiaVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof qib) {
                qiaVar = (qib) queryLocalInterface;
            } else {
                qiaVar = new qia(iBinder);
            }
        }
        this.f = qiaVar;
        this.c = notificationOptions;
        this.d = z;
        this.e = z2;
    }

    public final qip a() {
        qib qibVar = this.f;
        if (qibVar == null) {
            return null;
        }
        try {
            return (qip) qve.b(qibVar.a());
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qib qibVar = this.f;
        qip.y(parcel, 4, qibVar == null ? null : qibVar.asBinder());
        qip.E(parcel, 5, this.c, i);
        qip.o(parcel, 6, this.d);
        qip.o(parcel, 7, this.e);
        qip.n(parcel, m);
    }
}
