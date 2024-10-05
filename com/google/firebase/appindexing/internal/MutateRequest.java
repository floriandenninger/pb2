package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.alsz;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MutateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new alsz(11);
    public final int a;
    public final Thing[] b;
    public final String[] c;
    public final String[] d;
    public final ActionImpl e;
    public final String f;
    public final String g;

    public MutateRequest(int i, Thing[] thingArr, String[] strArr, String[] strArr2, ActionImpl actionImpl, String str, String str2) {
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 6 && i != 7) {
            i = 0;
        }
        this.a = i;
        this.b = thingArr;
        this.c = strArr;
        this.d = strArr2;
        this.e = actionImpl;
        this.f = str;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.I(parcel, 2, this.b, i);
        qip.G(parcel, 3, this.c);
        qip.G(parcel, 5, this.d);
        qip.E(parcel, 6, this.e, i);
        qip.F(parcel, 7, this.f);
        qip.F(parcel, 8, this.g);
        qip.n(parcel, m);
    }
}
