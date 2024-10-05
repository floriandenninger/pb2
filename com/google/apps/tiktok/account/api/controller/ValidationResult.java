package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alsz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ValidationResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new alsz(5);
    private static ValidationResult a;

    public static ValidationResult d() {
        ValidationResult validationResult;
        synchronized (ValidationResult.class) {
            if (a == null) {
                a = new AutoValue_ValidationResult(true, false, null);
            }
            validationResult = a;
        }
        return validationResult;
    }

    public abstract Intent a();

    public abstract boolean b();

    public abstract boolean c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeInt(b() ? 1 : 0);
        parcel.writeParcelable(a(), 0);
    }
}
