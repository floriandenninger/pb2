package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qcp;
import defpackage.qip;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qcp(9);
    final int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Uri f;
    public String g;
    public long h;
    public String i;
    List j;
    public String k;
    public String l;
    private Set m = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.g = str5;
        this.h = j;
        this.i = str6;
        this.j = list;
        this.k = str7;
        this.l = str8;
    }

    public final Set a() {
        HashSet hashSet = new HashSet(this.j);
        hashSet.addAll(this.m);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.i.equals(this.i) && googleSignInAccount.a().equals(a());
    }

    public final int hashCode() {
        return ((this.i.hashCode() + 527) * 31) + a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.F(parcel, 3, this.c);
        qip.F(parcel, 4, this.d);
        qip.F(parcel, 5, this.e);
        qip.E(parcel, 6, this.f, i);
        qip.F(parcel, 7, this.g);
        qip.t(parcel, 8, this.h);
        qip.F(parcel, 9, this.i);
        qip.J(parcel, 10, this.j);
        qip.F(parcel, 11, this.k);
        qip.F(parcel, 12, this.l);
        qip.n(parcel, m);
    }
}
