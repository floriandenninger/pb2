package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pph;
import defpackage.pts;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new pph(1);
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    private final Id3Frame[] g;

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = pts.a;
        this.a = readString;
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        int readInt = parcel.readInt();
        this.g = new Id3Frame[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.g[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
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
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.b == chapterFrame.b && this.c == chapterFrame.c && this.d == chapterFrame.d && this.e == chapterFrame.e && pts.R(this.a, chapterFrame.a) && Arrays.equals(this.g, chapterFrame.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.b + 527) * 31) + this.c) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31;
        String str = this.a;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.g.length);
        for (Id3Frame id3Frame : this.g) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.g = id3FrameArr;
    }
}
