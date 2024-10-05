package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rqx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GetSaveInstrumentDetailsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rqx(18);
    String[] a;
    int[] b;
    RemoteViews c;
    byte[] d;

    private GetSaveInstrumentDetailsResponse() {
    }

    public GetSaveInstrumentDetailsResponse(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.a = strArr;
        this.b = iArr;
        this.c = remoteViews;
        this.d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.G(parcel, 1, this.a);
        qip.z(parcel, 2, this.b);
        qip.E(parcel, 3, this.c, i);
        qip.w(parcel, 4, this.d);
        qip.n(parcel, m);
    }
}
