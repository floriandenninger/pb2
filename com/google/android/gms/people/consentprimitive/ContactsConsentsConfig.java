package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amkq;
import defpackage.qip;
import defpackage.rlt;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ContactsConsentsConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(17);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Account d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final List h;
    public final boolean i;

    public ContactsConsentsConfig(boolean z, boolean z2, boolean z3, Account account, boolean z4, boolean z5, String str, List list, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = account;
        this.e = z4;
        this.f = z5;
        this.g = str;
        this.h = list;
        this.i = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsConfig)) {
            return false;
        }
        ContactsConsentsConfig contactsConsentsConfig = (ContactsConsentsConfig) obj;
        return this.a == contactsConsentsConfig.a && this.b == contactsConsentsConfig.b && this.c == contactsConsentsConfig.c && this.e == contactsConsentsConfig.e && this.f == contactsConsentsConfig.f && this.i == contactsConsentsConfig.i && amkq.b(this.d, contactsConsentsConfig.d) && amkq.b(this.g, contactsConsentsConfig.g) && amkq.b(this.h, contactsConsentsConfig.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.i), Boolean.valueOf(this.f), this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.o(parcel, 1, this.a);
        qip.o(parcel, 2, this.b);
        qip.o(parcel, 3, this.c);
        qip.E(parcel, 4, this.d, i);
        qip.o(parcel, 5, this.e);
        qip.o(parcel, 6, this.f);
        qip.F(parcel, 7, this.g);
        qip.J(parcel, 8, this.h);
        qip.o(parcel, 9, this.i);
        qip.n(parcel, m);
    }
}
