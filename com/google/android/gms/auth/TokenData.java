package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qcp;
import defpackage.qip;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qcp(7);
    final int a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.a = i;
        qip.ax(str);
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.b, tokenData.b) && qar.j(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && qar.j(this.f, tokenData.f) && qar.j(this.g, tokenData.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.D(parcel, 3, this.c);
        qip.o(parcel, 4, this.d);
        qip.o(parcel, 5, this.e);
        qip.H(parcel, 6, this.f);
        qip.F(parcel, 7, this.g);
        qip.n(parcel, m);
    }
}
