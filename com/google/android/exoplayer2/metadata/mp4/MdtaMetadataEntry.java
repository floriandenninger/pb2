package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.pms;
import defpackage.pne;
import defpackage.pph;
import defpackage.pts;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new pph(9);
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public MdtaMetadataEntry(Parcel parcel) {
        String readString = parcel.readString();
        int i = pts.a;
        this.a = readString;
        this.b = (byte[]) pts.C(parcel.createByteArray());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ pms a() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void b(pne pneVar) {
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (this.a.equals(mdtaMetadataEntry.a) && Arrays.equals(this.b, mdtaMetadataEntry.b) && this.c == mdtaMetadataEntry.c && this.d == mdtaMetadataEntry.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
