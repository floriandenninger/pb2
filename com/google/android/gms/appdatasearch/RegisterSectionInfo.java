package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pvl;
import defpackage.qar;
import defpackage.qip;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RegisterSectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pvl(20);
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final Feature[] g;
    public final String h;
    public final ScoringConfig i;

    public RegisterSectionInfo(String str, String str2, boolean z, int i, boolean z2, String str3, Feature[] featureArr, String str4, ScoringConfig scoringConfig) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = str3;
        this.g = featureArr;
        this.h = str4;
        this.i = scoringConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterSectionInfo)) {
            return false;
        }
        RegisterSectionInfo registerSectionInfo = (RegisterSectionInfo) obj;
        return this.c == registerSectionInfo.c && this.d == registerSectionInfo.d && this.e == registerSectionInfo.e && qar.j(this.a, registerSectionInfo.a) && qar.j(this.b, registerSectionInfo.b) && qar.j(this.f, registerSectionInfo.f) && qar.j(this.h, registerSectionInfo.h) && qar.j(this.i, registerSectionInfo.i) && Arrays.equals(this.g, registerSectionInfo.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.g)), this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.F(parcel, 2, this.b);
        qip.o(parcel, 3, this.c);
        qip.s(parcel, 4, this.d);
        qip.o(parcel, 5, this.e);
        qip.F(parcel, 6, this.f);
        qip.I(parcel, 7, this.g, i);
        qip.F(parcel, 11, this.h);
        qip.E(parcel, 12, this.i, i);
        qip.n(parcel, m);
    }
}
