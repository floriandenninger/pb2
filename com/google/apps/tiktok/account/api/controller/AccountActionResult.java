package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.apps.tiktok.account.AccountId;
import defpackage.alsz;
import defpackage.alym;
import defpackage.amkq;
import defpackage.aomw;
import defpackage.aoob;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AccountActionResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new alsz(4);
    public final AccountId a;
    public final alym b;
    public final ValidationResult c;
    public final Intent d;

    public AccountActionResult(Parcel parcel) {
        this.a = (AccountId) parcel.readParcelable(AccountId.class.getClassLoader());
        try {
            this.b = (alym) amkq.ch(parcel, alym.a, aomw.b());
            this.c = (ValidationResult) parcel.readParcelable(ValidationResult.class.getClassLoader());
            this.d = (Intent) parcel.readParcelable(ValidationResult.class.getClassLoader());
        } catch (aoob e) {
            throw new IllegalStateException("Failed to convert AccountInfo to Parcelable!", e);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        amkq.cm(parcel, this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
    }

    public AccountActionResult(AccountId accountId, alym alymVar, ValidationResult validationResult, Intent intent) {
        this.a = accountId;
        alymVar.getClass();
        this.b = alymVar;
        this.c = validationResult;
        this.d = intent;
    }
}
