package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amkq;
import defpackage.amru;
import defpackage.qip;
import defpackage.rlt;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ContactsConsentsCoarseStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(16);
    public final boolean a;
    public final boolean b;
    private final List c;
    private final List d;

    public ContactsConsentsCoarseStatus(boolean z, boolean z2, List list, List list2) {
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsCoarseStatus)) {
            return false;
        }
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) obj;
        return this.a == contactsConsentsCoarseStatus.a && this.b == contactsConsentsCoarseStatus.b && amkq.b(this.d, contactsConsentsCoarseStatus.d) && amkq.b(this.c, contactsConsentsCoarseStatus.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.o(parcel, 1, this.a);
        qip.o(parcel, 2, this.b);
        qip.J(parcel, 3, amru.o(this.c));
        qip.J(parcel, 4, amru.o(this.d));
        qip.n(parcel, m);
    }
}
