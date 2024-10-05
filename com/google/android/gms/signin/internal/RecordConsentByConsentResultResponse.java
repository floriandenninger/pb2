package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qom;
import defpackage.rot;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RecordConsentByConsentResultResponse extends AbstractSafeParcelable implements qom {
    public static final Parcelable.Creator CREATOR = new rot(0);
    public final List a;
    public final String b;

    public RecordConsentByConsentResultResponse(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.qom
    public final Status a() {
        return this.b != null ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.H(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.n(parcel, m);
    }
}
