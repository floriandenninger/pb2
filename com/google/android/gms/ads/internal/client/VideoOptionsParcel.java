package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aiqb;
import defpackage.pvl;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VideoOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pvl(9);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public VideoOptionsParcel(aiqb aiqbVar, byte[] bArr) {
        this(aiqbVar.a, aiqbVar.c, aiqbVar.b);
    }

    public VideoOptionsParcel(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.o(parcel, 2, this.a);
        qip.o(parcel, 3, this.b);
        qip.o(parcel, 4, this.c);
        qip.n(parcel, m);
    }
}
