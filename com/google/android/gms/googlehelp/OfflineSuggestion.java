package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qui;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OfflineSuggestion extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qui(13);
    final String a;
    final String b;
    final String c;
    final String d;

    public OfflineSuggestion(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str4;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qip.F(parcel, 4, this.c);
        qip.F(parcel, 5, this.d);
        qip.n(parcel, m);
    }
}
