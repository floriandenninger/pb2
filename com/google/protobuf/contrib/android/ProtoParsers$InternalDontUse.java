package com.google.protobuf.contrib.android;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alsz;
import defpackage.amkq;
import defpackage.aomp;
import defpackage.aomw;
import defpackage.aoob;
import defpackage.aooy;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ProtoParsers$InternalDontUse implements ProtoParsers$ParcelableProto {
    public static final Parcelable.Creator CREATOR = new alsz(14);
    private volatile byte[] a;
    private volatile aooy b;

    public ProtoParsers$InternalDontUse(byte[] bArr, aooy aooyVar) {
        boolean z = true;
        if (bArr == null && aooyVar == null) {
            z = false;
        }
        amkq.F(z, "Must have a message or bytes");
        this.a = bArr;
        this.b = aooyVar;
    }

    @Override // com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto
    public final aooy a(aooy aooyVar, aomw aomwVar) {
        try {
            return b(aooyVar, aomwVar);
        } catch (aoob e) {
            throw new IllegalStateException(e);
        }
    }

    public final aooy b(aooy aooyVar, aomw aomwVar) {
        if (this.b == null) {
            this.b = aooyVar.toBuilder().mergeFrom(this.a, aomwVar).build();
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            byte[] bArr = new byte[this.b.getSerializedSize()];
            try {
                this.b.writeTo(aomp.ak(bArr));
                this.a = bArr;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }
}
