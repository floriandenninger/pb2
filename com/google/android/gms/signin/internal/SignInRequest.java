package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rot;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rot(2);
    final int a;
    final ResolveAccountRequest b;

    public SignInRequest(int i, ResolveAccountRequest resolveAccountRequest) {
        this.a = i;
        this.b = resolveAccountRequest;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.E(parcel, 2, this.b, i);
        qip.n(parcel, m);
    }
}
