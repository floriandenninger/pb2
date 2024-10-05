package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rbg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class EventParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rbg(15);
    public final String a;
    public final EventParams b;
    public final String c;
    public final long d;

    public EventParcel(EventParcel eventParcel, long j) {
        qip.an(eventParcel);
        this.a = eventParcel.a;
        this.b = eventParcel.b;
        this.c = eventParcel.c;
        this.d = j;
    }

    public EventParcel(String str, EventParams eventParams, String str2, long j) {
        this.a = str;
        this.b = eventParams;
        this.c = str2;
        this.d = j;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String valueOf = String.valueOf(this.b);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        rbg.a(this, parcel, i);
    }
}
