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
public class BirthdayEntity extends AbstractSafeParcelable implements Birthday {
    public static final Parcelable.Creator CREATOR = new rnq(2);
    public final PersonFieldMetadataEntity a;
    public final Long b;

    public BirthdayEntity(PersonFieldMetadataEntity personFieldMetadataEntity, Long l) {
        this.a = personFieldMetadataEntity;
        this.b = l;
    }

    @Override // com.google.android.gms.people.protomodel.Birthday
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Birthday
    public final Long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Birthday)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Birthday birthday = (Birthday) obj;
        return qar.j(a(), birthday.a()) && qar.j(b(), birthday.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 2, this.a, i);
        qip.D(parcel, 3, this.b);
        qip.n(parcel, m);
    }
}
