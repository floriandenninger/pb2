package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.pvl;
import defpackage.qar;
import defpackage.qip;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RewardItemParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pvl(13);
    public final String a;
    public final int b;

    public RewardItemParcel(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof RewardItemParcel)) {
            RewardItemParcel rewardItemParcel = (RewardItemParcel) obj;
            if (qar.j(this.a, rewardItemParcel.a) && qar.j(Integer.valueOf(this.b), Integer.valueOf(rewardItemParcel.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.F(parcel, 2, this.a);
        qip.s(parcel, 3, this.b);
        qip.n(parcel, m);
    }
}
