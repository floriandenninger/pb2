package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amkq;
import defpackage.amrw;
import defpackage.amrz;
import defpackage.qip;
import defpackage.rlt;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ContactsConsentsDetailedStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(18);
    public final int a;
    public final Bundle b;

    public ContactsConsentsDetailedStatus(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final amrz a() {
        amrw amrwVar = new amrw();
        for (String str : this.b.keySet()) {
            amrwVar.g(new Account(str, "com.google"), Integer.valueOf(this.b.getInt(str)));
        }
        return amrwVar.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsDetailedStatus)) {
            return false;
        }
        ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus) obj;
        return this.a == contactsConsentsDetailedStatus.a && amkq.b(a(), contactsConsentsDetailedStatus.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.v(parcel, 2, this.b);
        qip.n(parcel, m);
    }
}
