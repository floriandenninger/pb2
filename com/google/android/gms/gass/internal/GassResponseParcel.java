package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dvo;
import defpackage.qip;
import defpackage.qui;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GassResponseParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qui(7);
    public final int a;
    public dvo b = null;
    public byte[] c;

    public GassResponseParcel(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = qip.m(parcel);
        qip.s(parcel, 1, this.a);
        byte[] bArr = this.c;
        if (bArr == null) {
            bArr = this.b.toByteArray();
        }
        qip.w(parcel, 2, bArr);
        qip.n(parcel, m);
    }

    public final void a() {
        dvo dvoVar = this.b;
        if (dvoVar != null || this.c == null) {
            if (dvoVar == null || this.c != null) {
                if (dvoVar == null || this.c == null) {
                    if (dvoVar != null || this.c != null) {
                        throw new IllegalStateException("Impossible");
                    }
                    throw new IllegalStateException("Invalid internal representation - empty");
                }
                throw new IllegalStateException("Invalid internal representation - full");
            }
        }
    }
}
