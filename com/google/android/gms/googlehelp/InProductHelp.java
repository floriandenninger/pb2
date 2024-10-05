package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qui;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InProductHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qui(11);
    public GoogleHelp a;
    public String b;
    public String c;
    public int d;
    public String e;
    public int f;

    public InProductHelp(GoogleHelp googleHelp, String str, String str2, int i, String str3, int i2) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qui.b(this, parcel, i);
    }
}
