package com.google.android.libraries.youtube.proto.lite.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import defpackage.aigo;
import defpackage.aomw;
import defpackage.aoob;
import defpackage.aooy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ParcelableMessageLite implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(18);
    private aooy a;
    private byte[] b;

    public ParcelableMessageLite(Parcel parcel) {
        this.b = parcel.createByteArray();
    }

    public ParcelableMessageLite(aooy aooyVar) {
        this.a = aooyVar;
    }

    public final aooy a(aooy aooyVar) {
        if (this.a == null && this.b != null) {
            try {
                this.a = aooyVar.newBuilderForType().mergeFrom(this.b, aomw.b()).build();
                this.b = null;
            } catch (aoob e) {
                Log.e("MessageLite", "Failed to deserialize", e);
            }
        }
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParcelableMessageLite(");
        aooy aooyVar = this.a;
        if (aooyVar != null) {
            sb.append(aooyVar);
        } else if (this.b != null) {
            sb.append("byte[");
            sb.append(this.b.length);
            sb.append("]");
        } else {
            sb.append("null");
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aooy aooyVar;
        if (this.b == null && (aooyVar = this.a) != null) {
            this.b = aooyVar.toByteArray();
            this.a = null;
        }
        parcel.writeByteArray(this.b);
    }
}
