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
public class SourceStatsEntity extends AbstractSafeParcelable implements SourceStats {
    public static final Parcelable.Creator CREATOR = new rnq(11);
    public final String a;
    public final Integer b;
    public final Integer c;

    public SourceStatsEntity(String str, Integer num, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final Integer a() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final Integer b() {
        return this.c;
    }

    @Override // com.google.android.gms.people.protomodel.SourceStats
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SourceStats)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        SourceStats sourceStats = (SourceStats) obj;
        return qar.j(c(), sourceStats.c()) && qar.j(a(), sourceStats.a()) && qar.j(b(), sourceStats.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{c(), a(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.B(parcel, 3, this.b);
        qip.B(parcel, 4, this.c);
        qip.n(parcel, m);
    }
}
