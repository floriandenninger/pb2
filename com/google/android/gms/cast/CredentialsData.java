package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qcp;
import defpackage.qip;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CredentialsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qcp(15);
    public final String a;
    public final String b;

    public CredentialsData(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialsData)) {
            return false;
        }
        CredentialsData credentialsData = (CredentialsData) obj;
        return qar.j(this.a, credentialsData.a) && qar.j(this.b, credentialsData.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.n(parcel, m);
    }
}
