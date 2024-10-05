package com.google.vr.ndk.base;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LatchRecord implements Parcelable {
    public byte[] serializedLatchRecord;
    public static LatchRecord instance = new LatchRecord();
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.google.vr.ndk.base.LatchRecord.1
        @Override // android.os.Parcelable.Creator
        public LatchRecord createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            if (LatchRecord.instance.serializedLatchRecord == null || LatchRecord.instance.serializedLatchRecord.length != readInt) {
                LatchRecord.instance.serializedLatchRecord = new byte[readInt];
            }
            parcel.readByteArray(LatchRecord.instance.serializedLatchRecord);
            return LatchRecord.instance;
        }

        @Override // android.os.Parcelable.Creator
        public LatchRecord[] newArray(int i) {
            return new LatchRecord[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.serializedLatchRecord.length);
        parcel.writeByteArray(this.serializedLatchRecord);
    }
}
