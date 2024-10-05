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
public class NameEntity extends AbstractSafeParcelable implements Name {
    public static final Parcelable.Creator CREATOR = new rnq(6);
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public NameEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String c() {
        return this.e;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String d() {
        return this.g;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Name)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Name name = (Name) obj;
        return qar.j(a(), name.a()) && qar.j(b(), name.b()) && qar.j(g(), name.g()) && qar.j(e(), name.e()) && qar.j(c(), name.c()) && qar.j(f(), name.f()) && qar.j(d(), name.d());
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String f() {
        return this.f;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), g(), e(), c(), f(), d()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 2, this.a, i);
        qip.F(parcel, 3, this.b);
        qip.F(parcel, 4, this.g);
        qip.F(parcel, 5, this.d);
        qip.F(parcel, 6, this.e);
        qip.F(parcel, 7, this.f);
        qip.F(parcel, 17, this.c);
        qip.n(parcel, m);
    }
}
