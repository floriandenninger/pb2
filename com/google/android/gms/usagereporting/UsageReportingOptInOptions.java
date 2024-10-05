package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rot;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UsageReportingOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rot(6);
    public int a;
    public boolean b;
    public final List c;
    public int d;
    public String e;
    public boolean f;

    public UsageReportingOptInOptions(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 2, this.a);
        qip.o(parcel, 3, this.b);
        qip.H(parcel, 4, this.c);
        qip.s(parcel, 5, this.d);
        qip.F(parcel, 6, this.e);
        qip.o(parcel, 7, this.f);
        qip.n(parcel, m);
    }
}
