package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.oba;
import defpackage.qip;
import defpackage.rrw;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rrw(0);

    @Deprecated
    String a;

    @Deprecated
    String b;
    ArrayList c;

    LabelValueRow() {
        this.c = oba.ah();
    }

    public LabelValueRow(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.F(parcel, 3, this.b);
        qip.J(parcel, 4, this.c);
        qip.n(parcel, m);
    }
}
