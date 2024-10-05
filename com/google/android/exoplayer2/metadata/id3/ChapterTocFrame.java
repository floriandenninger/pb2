package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pph;
import defpackage.pts;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new pph(0);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String[] d;
    private final Id3Frame[] e;

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = pts.a;
        this.a = readString;
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
        this.d = (String[]) pts.C(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.e = new Id3Frame[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.e[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            if (this.b == chapterTocFrame.b && this.c == chapterTocFrame.c && pts.R(this.a, chapterTocFrame.a) && Arrays.equals(this.d, chapterTocFrame.d) && Arrays.equals(this.e, chapterTocFrame.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.b ? 1 : 0) + 527) * 31) + (this.c ? 1 : 0)) * 31;
        String str = this.a;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.d);
        parcel.writeInt(this.e.length);
        for (Id3Frame id3Frame : this.e) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = strArr;
        this.e = id3FrameArr;
    }
}
