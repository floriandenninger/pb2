package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qfh;
import defpackage.qip;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BatchedLogErrorParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qfh(16);
    public final List a;

    public BatchedLogErrorParcelable(List list) {
        this.a = Collections.unmodifiableList(list);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "BatchedLogErrorParcelable[LogErrors: " + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.J(parcel, 1, this.a);
        qip.n(parcel, m);
    }
}
