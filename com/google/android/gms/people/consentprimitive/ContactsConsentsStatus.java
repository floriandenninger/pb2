package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amkq;
import defpackage.qip;
import defpackage.rlt;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ContactsConsentsStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(19);
    public final ContactsConsentsCoarseStatus a;
    public final ContactsConsentsDetailedStatus b;
    public final ContactsConsentsConfig c;

    public ContactsConsentsStatus(ContactsConsentsCoarseStatus contactsConsentsCoarseStatus, ContactsConsentsDetailedStatus contactsConsentsDetailedStatus, ContactsConsentsConfig contactsConsentsConfig) {
        this.a = contactsConsentsCoarseStatus;
        this.b = contactsConsentsDetailedStatus;
        this.c = contactsConsentsConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsStatus)) {
            return false;
        }
        ContactsConsentsStatus contactsConsentsStatus = (ContactsConsentsStatus) obj;
        return amkq.b(this.a, contactsConsentsStatus.a) && amkq.b(this.b, contactsConsentsStatus.b) && amkq.b(this.c, contactsConsentsStatus.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 1, this.a, i);
        qip.E(parcel, 2, this.b, i);
        qip.E(parcel, 3, this.c, i);
        qip.n(parcel, m);
    }
}
