package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pph;
import defpackage.pts;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new pph(5);
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final int[] e;

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
        this.e = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MlltFrame mlltFrame = (MlltFrame) obj;
            if (this.a == mlltFrame.a && this.b == mlltFrame.b && this.c == mlltFrame.c && Arrays.equals(this.d, mlltFrame.d) && Arrays.equals(this.e, mlltFrame.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.e);
    }

    public MlltFrame(Parcel parcel) {
        super("MLLT");
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = (int[]) pts.C(parcel.createIntArray());
        this.e = (int[]) pts.C(parcel.createIntArray());
    }
}
