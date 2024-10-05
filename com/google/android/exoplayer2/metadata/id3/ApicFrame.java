package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.k;
import defpackage.pne;
import defpackage.pts;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new k(19);
    public final String a;
    public final String b;
    public final int c;
    public final byte[] d;

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = pts.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = (byte[]) pts.C(parcel.createByteArray());
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void b(pne pneVar) {
        pneVar.b(this.d, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.c == apicFrame.c && pts.R(this.a, apicFrame.a) && pts.R(this.b, apicFrame.b) && Arrays.equals(this.d, apicFrame.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.c + 527) * 31;
        String str = this.a;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.d);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        String str = this.f;
        String str2 = this.a;
        String str3 = this.b;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeByteArray(this.d);
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = bArr;
    }
}
