package com.google.android.gms.mobiledataplan.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qar;
import defpackage.qip;
import defpackage.rlt;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PaymentForm extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rlt(11);
    public int a;

    private PaymentForm() {
    }

    public PaymentForm(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentForm) {
            return qar.j(Integer.valueOf(this.a), Integer.valueOf(((PaymentForm) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        qip.n(parcel, m);
    }
}
