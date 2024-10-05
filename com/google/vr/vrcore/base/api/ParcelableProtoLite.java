package com.google.vr.vrcore.base.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aooy;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ParcelableProtoLite implements Parcelable {
    public byte[] a;

    public ParcelableProtoLite() {
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ParcelableProtoLite(Parcel parcel) {
        this.a = null;
        b(parcel);
    }

    public ParcelableProtoLite(byte[] bArr) {
        this.a = bArr;
    }

    public final int a() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final void b(Parcel parcel) {
        if (d()) {
            parcel.readInt();
        }
        this.a = parcel.createByteArray();
    }

    public final void c(aooy aooyVar) {
        if (aooyVar == null || aooyVar.getSerializedSize() == 0) {
            this.a = null;
        } else {
            this.a = aooyVar.toByteArray();
        }
    }

    protected boolean d() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    protected boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof ParcelableProtoLite) && Arrays.equals(((ParcelableProtoLite) obj).a, this.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        int a = a();
        StringBuilder sb = new StringBuilder(38);
        sb.append("ParcelableProtoLite[");
        sb.append(a);
        sb.append(" bytes]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (d()) {
            byte[] bArr = this.a;
            parcel.writeInt(bArr == null ? 0 : bArr.length);
        }
        if (this.a != null || !e()) {
            parcel.writeByteArray(this.a);
        } else {
            parcel.writeByteArray(new byte[0]);
        }
    }
}
