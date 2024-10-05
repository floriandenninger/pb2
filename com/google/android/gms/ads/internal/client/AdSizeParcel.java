package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pvl;
import defpackage.qip;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdSizeParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pvl(3);
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public final AdSizeParcel[] g;
    public final boolean h;
    public final boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    public AdSizeParcel() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public AdSizeParcel(String str, int i, int i2, boolean z, int i3, int i4, AdSizeParcel[] adSizeParcelArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = adSizeParcelArr;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = z9;
    }

    public static int a(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.s(parcel, 3, this.b);
        qip.s(parcel, 4, this.c);
        qip.o(parcel, 5, this.d);
        qip.s(parcel, 6, this.e);
        qip.s(parcel, 7, this.f);
        qip.I(parcel, 8, this.g, i);
        qip.o(parcel, 9, this.h);
        qip.o(parcel, 10, this.i);
        qip.o(parcel, 11, this.j);
        qip.o(parcel, 12, this.k);
        qip.o(parcel, 13, this.l);
        qip.o(parcel, 14, this.m);
        qip.o(parcel, 15, this.n);
        qip.o(parcel, 16, this.o);
        qip.n(parcel, m);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdSizeParcel(android.content.Context r13, defpackage.puh[] r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.AdSizeParcel.<init>(android.content.Context, puh[]):void");
    }
}
