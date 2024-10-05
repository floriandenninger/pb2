package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rbg;
import defpackage.rew;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EventParams extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR = new rbg(14);
    public final Bundle a;

    public EventParams(Bundle bundle) {
        this.a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.a);
    }

    public final Object b(String str) {
        return this.a.get(str);
    }

    public final String c(String str) {
        return this.a.getString(str);
    }

    public final Long d() {
        return Long.valueOf(this.a.getLong("value"));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new rew(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.v(parcel, 2, a());
        qip.n(parcel, m);
    }
}
