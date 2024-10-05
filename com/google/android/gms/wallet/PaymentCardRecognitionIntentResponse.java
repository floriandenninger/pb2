package com.google.android.gms.wallet;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qip;
import defpackage.rqx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PaymentCardRecognitionIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rqx(6);
    PendingIntent a;

    PaymentCardRecognitionIntentResponse() {
    }

    public PaymentCardRecognitionIntentResponse(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.E(parcel, 1, this.a, i);
        qip.n(parcel, m);
    }
}
