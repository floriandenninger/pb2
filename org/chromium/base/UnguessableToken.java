package org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.axhq;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class UnguessableToken implements Parcelable {
    public static final Parcelable.Creator CREATOR = new axhq(8);
    private final long a;
    private final long b;

    public UnguessableToken(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    private static UnguessableToken create(long j, long j2) {
        return new UnguessableToken(j, j2);
    }

    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken unguessableToken = (UnguessableToken) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return unguessableToken;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            UnguessableToken unguessableToken = (UnguessableToken) obj;
            if (unguessableToken.a == this.a && unguessableToken.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public long getHighForSerialization() {
        return this.a;
    }

    public long getLowForSerialization() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
