package com.google.android.libraries.youtube.player.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import defpackage.aigo;
import defpackage.aryb;
import defpackage.zhq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class HeartbeatClient$HeartbeatClientState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(6);
    public final aryb a;
    public final byte[] b;
    public final String c;
    public final long d;
    public final int e;

    public HeartbeatClient$HeartbeatClientState(Parcel parcel) {
        this.a = (aryb) ((ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader())).a(aryb.a);
        byte[] bArr = new byte[parcel.readInt()];
        this.b = bArr;
        parcel.readByteArray(bArr);
        this.c = zhq.h(parcel.readString());
        this.d = parcel.readLong();
        this.e = parcel.readInt();
    }

    public HeartbeatClient$HeartbeatClientState(aryb arybVar, byte[] bArr, String str, long j, int i) {
        this.a = arybVar;
        this.b = bArr;
        this.c = str;
        this.d = j;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new ParcelableMessageLite(this.a), 0);
        parcel.writeInt(this.b.length);
        parcel.writeByteArray(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
    }
}
