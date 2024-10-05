package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qfh;
import defpackage.qip;
import defpackage.qll;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayLoggerContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qfh(19);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final int i;
    public final Integer j;
    public final boolean k;
    public final int l;

    public PlayLoggerContext(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = z2;
        this.i = i3;
        this.j = num;
        this.k = z3;
        this.l = i4;
    }

    @Deprecated
    public PlayLoggerContext(String str, int i, String str2, String str3, int i2, EnumSet enumSet) {
        qip.an(str);
        this.a = str;
        this.b = i;
        this.c = -1;
        this.g = str2;
        this.d = true != enumSet.contains(qll.ACCOUNT_NAME) ? null : str3;
        this.e = null;
        this.f = enumSet.contains(qll.ANDROID_ID);
        this.h = enumSet.equals(qll.f);
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        this.i = i3;
        this.j = null;
        int i4 = 0;
        this.k = false;
        if (!enumSet.equals(qll.e)) {
            Iterator it = enumSet.iterator();
            int i5 = -1;
            while (it.hasNext()) {
                i5 &= ((qll) it.next()).h ^ (-1);
            }
            i4 = i5;
        }
        this.l = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayLoggerContext) {
            PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
            if (qar.j(this.a, playLoggerContext.a) && this.b == playLoggerContext.b && this.c == playLoggerContext.c && qar.j(this.g, playLoggerContext.g) && qar.j(this.d, playLoggerContext.d) && qar.j(this.e, playLoggerContext.e) && this.f == playLoggerContext.f && this.h == playLoggerContext.h && this.i == playLoggerContext.i && qar.j(this.j, playLoggerContext.j) && this.k == playLoggerContext.k && this.l == playLoggerContext.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.g, this.d, this.e, Boolean.valueOf(this.f), Boolean.valueOf(this.h), Integer.valueOf(this.i), this.j, Boolean.valueOf(this.k), Integer.valueOf(this.l)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.g + ",uploadAccount=" + this.d + ",loggingId=" + this.e + ",logAndroidId=" + this.f + ",isAnonymous=" + this.h + ",qosTier=" + this.i + ",appMobilespecId=" + this.j + ",scrubMccMnc=" + this.k + "piiLevelset=" + this.l + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.s(parcel, 3, this.b);
        qip.s(parcel, 4, this.c);
        qip.F(parcel, 5, this.d);
        qip.F(parcel, 6, this.e);
        qip.o(parcel, 7, this.f);
        qip.F(parcel, 8, this.g);
        qip.o(parcel, 9, this.h);
        qip.s(parcel, 10, this.i);
        qip.B(parcel, 11, this.j);
        qip.o(parcel, 12, this.k);
        qip.s(parcel, 13, this.l);
        qip.n(parcel, m);
    }
}
