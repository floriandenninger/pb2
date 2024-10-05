package com.google.vr.vrcore.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.vr.vrcore.base.api.ParcelableProtoLite;
import defpackage.alsz;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class HeadTrackingState extends ParcelableProtoLite {
    public static final Parcelable.Creator CREATOR = new alsz(15);

    public HeadTrackingState() {
    }

    @Override // com.google.vr.vrcore.base.api.ParcelableProtoLite
    protected final boolean d() {
        return true;
    }

    @Override // com.google.vr.vrcore.base.api.ParcelableProtoLite
    protected final boolean e() {
        return true;
    }

    @Override // com.google.vr.vrcore.base.api.ParcelableProtoLite
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HeadTrackingState) {
            return Arrays.equals(((HeadTrackingState) obj).a, this.a);
        }
        return false;
    }

    @Override // com.google.vr.vrcore.base.api.ParcelableProtoLite
    public final String toString() {
        int a = a();
        StringBuilder sb = new StringBuilder(36);
        sb.append("HeadTrackingState[");
        sb.append(a);
        sb.append(" bytes]");
        return sb.toString();
    }

    public HeadTrackingState(Parcel parcel) {
        super(parcel);
    }

    public HeadTrackingState(byte[] bArr) {
        super(bArr);
    }
}
