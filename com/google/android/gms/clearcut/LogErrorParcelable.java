package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qfh;
import defpackage.qip;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LogErrorParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qfh(17);
    public final String a;
    public final int b;
    public final int c;

    public LogErrorParcelable(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "LogErrorParcelable[LogSourceName: " + this.a + ", ClearcutStatusCode: " + this.b + ", ErrorCount: " + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 1, this.a);
        qip.s(parcel, 2, this.b);
        qip.s(parcel, 3, this.c);
        qip.n(parcel, m);
    }
}
