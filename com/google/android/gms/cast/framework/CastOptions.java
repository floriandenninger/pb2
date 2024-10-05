package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qfh;
import defpackage.qip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CastOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qfh(10);
    public String a;
    public boolean b;
    public LaunchOptions c;
    public final boolean d;
    public final CastMediaOptions e;
    public final boolean f;
    public final double g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    private final List k;

    public CastOptions(String str, List list, boolean z, LaunchOptions launchOptions, boolean z2, CastMediaOptions castMediaOptions, boolean z3, double d, boolean z4, boolean z5, boolean z6) {
        this.a = true == TextUtils.isEmpty(str) ? "" : str;
        int size = list == null ? 0 : list.size();
        ArrayList arrayList = new ArrayList(size);
        this.k = arrayList;
        if (size > 0) {
            arrayList.addAll(list);
        }
        this.b = z;
        this.c = launchOptions == null ? new LaunchOptions() : launchOptions;
        this.d = z2;
        this.e = castMediaOptions;
        this.f = z3;
        this.g = d;
        this.h = z4;
        this.i = z5;
        this.j = z6;
    }

    public final List a() {
        return Collections.unmodifiableList(this.k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.H(parcel, 3, a());
        qip.o(parcel, 4, this.b);
        qip.E(parcel, 5, this.c, i);
        qip.o(parcel, 6, this.d);
        qip.E(parcel, 7, this.e, i);
        qip.o(parcel, 8, this.f);
        qip.p(parcel, 9, this.g);
        qip.o(parcel, 10, this.h);
        qip.o(parcel, 11, this.i);
        qip.o(parcel, 12, this.j);
        qip.n(parcel, m);
    }
}
