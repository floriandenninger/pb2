package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qip;
import defpackage.rnq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BackedUpContactsPerDeviceEntity extends AbstractSafeParcelable implements BackedUpContactsPerDevice {
    public static final Parcelable.Creator CREATOR = new rnq(0);
    public final String a;
    public final Long b;
    public final String c;
    public final Long d;
    public final Long e;
    public final DeviceVersionEntity f;
    private final List g;
    private List h;

    public BackedUpContactsPerDeviceEntity(String str, Long l, List list, String str2, Long l2, Long l3, DeviceVersionEntity deviceVersionEntity) {
        this.a = str;
        this.b = l;
        this.g = list;
        this.c = str2;
        this.d = l2;
        this.e = l3;
        this.f = deviceVersionEntity;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final DeviceVersion a() {
        return this.f;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long c() {
        return this.e;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final Long d() {
        return this.d;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BackedUpContactsPerDevice)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BackedUpContactsPerDevice backedUpContactsPerDevice = (BackedUpContactsPerDevice) obj;
        return qar.j(f(), backedUpContactsPerDevice.f()) && qar.j(b(), backedUpContactsPerDevice.b()) && qar.j(g(), backedUpContactsPerDevice.g()) && qar.j(e(), backedUpContactsPerDevice.e()) && qar.j(d(), backedUpContactsPerDevice.d()) && qar.j(c(), backedUpContactsPerDevice.c()) && qar.j(a(), backedUpContactsPerDevice.a());
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final String f() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.BackedUpContactsPerDevice
    public final List g() {
        List list;
        if (this.h == null && (list = this.g) != null) {
            this.h = new ArrayList(list.size());
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                this.h.add((SourceStats) it.next());
            }
        }
        return this.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{f(), b(), g(), e(), d(), c(), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.J(parcel, 3, g());
        qip.F(parcel, 4, this.c);
        qip.D(parcel, 5, this.d);
        qip.D(parcel, 6, this.e);
        qip.D(parcel, 7, this.b);
        qip.E(parcel, 8, this.f, i);
        qip.n(parcel, m);
    }
}
