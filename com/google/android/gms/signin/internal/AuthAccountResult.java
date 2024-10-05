package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.qom;
import defpackage.rot;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AuthAccountResult extends AbstractSafeParcelable implements qom {
    public static final Parcelable.Creator CREATOR = new rot(1);
    final int a;
    public int b;
    public Intent c;

    public AuthAccountResult() {
        this(2, 0, null);
    }

    public AuthAccountResult(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.qom
    public final Status a() {
        return this.b == 0 ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.s(parcel, 2, this.b);
        qip.E(parcel, 3, this.c, i);
        qip.n(parcel, m);
    }
}
