package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qcp;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HasCapabilitiesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qcp(6);
    public final Account a;
    public final String[] b;

    public HasCapabilitiesRequest(Account account, String[] strArr) {
        this.a = account;
        this.b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 1, this.a, i);
        qip.G(parcel, 2, this.b);
        qip.n(parcel, m);
    }
}
