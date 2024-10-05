package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qip;
import defpackage.rnq;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PhoneEntity extends AbstractSafeParcelable implements Phone {
    public static final Parcelable.Creator CREATOR = new rnq(9);
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;

    public PhoneEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final String b() {
        return this.c;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Phone)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Phone phone = (Phone) obj;
        return qar.j(a(), phone.a()) && qar.j(c(), phone.c()) && qar.j(b(), phone.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), c(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 2, this.a, i);
        qip.F(parcel, 3, this.b);
        qip.F(parcel, 4, this.c);
        qip.n(parcel, m);
    }
}
