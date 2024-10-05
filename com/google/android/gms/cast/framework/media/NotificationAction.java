package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qfh;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NotificationAction extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qfh(13);
    public final String a;
    public final int b;
    public final String c;

    public NotificationAction(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.s(parcel, 3, this.b);
        qip.F(parcel, 4, this.c);
        qip.n(parcel, m);
    }
}
