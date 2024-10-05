package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qcp;
import defpackage.qip;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qcp(2);
    final int a;
    final long b;
    final String c;
    final int d;
    final int e;
    final String f;

    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.a = i;
        this.b = j;
        qip.an(str);
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = str2;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.a == accountChangeEvent.a && this.b == accountChangeEvent.b && qar.j(this.c, accountChangeEvent.c) && this.d == accountChangeEvent.d && this.e == accountChangeEvent.e && qar.j(this.f, accountChangeEvent.f);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f});
    }

    public String toString() {
        int i = this.d;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.c;
        String str3 = this.f;
        int i2 = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.t(parcel, 2, this.b);
        qip.F(parcel, 3, this.c);
        qip.s(parcel, 4, this.d);
        qip.s(parcel, 5, this.e);
        qip.F(parcel, 6, this.f);
        qip.n(parcel, m);
    }
}
