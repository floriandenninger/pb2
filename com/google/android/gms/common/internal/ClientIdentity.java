package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qip;
import defpackage.qmu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qmu(12);
    public final int a;
    public final String b;

    public ClientIdentity(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.a == this.a && qar.j(clientIdentity.b, this.b);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.n(parcel, m);
    }
}
