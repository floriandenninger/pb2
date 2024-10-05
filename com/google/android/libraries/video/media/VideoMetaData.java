package com.google.android.libraries.video.media;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.rrw;
import defpackage.uqq;
import defpackage.vcp;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class VideoMetaData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new rrw(17);
    public final Uri a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final long g;
    public final boolean h;
    public final long[] i;
    public final int[] j;
    private final float k;
    private final boolean l;
    private final int m;
    private final byte[] n;

    public VideoMetaData(Uri uri, boolean z, int i, int i2, int i3, int i4, float f, long j, long[] jArr, int[] iArr, boolean z2, boolean z3) {
        uri.getClass();
        this.a = uri;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.k = f;
        this.h = z3;
        if (i4 == 0 || i4 == 90 || i4 == 180 || i4 == 270) {
            this.f = i4;
            this.g = j;
            this.l = z2;
            this.m = 0;
            this.n = null;
            if (jArr != null) {
                for (int i5 = 1; i5 < jArr.length; i5++) {
                    if (jArr[i5] <= jArr[i5 - 1]) {
                        throw new IOException("Frame times are not strictly ascending");
                    }
                }
                this.i = jArr;
                if (iArr != null) {
                    if (iArr.length <= 0 || iArr[0] < 0) {
                        throw new IOException("Could not parse sync samples from video");
                    }
                    for (int i6 = 1; i6 < iArr.length; i6++) {
                        int i7 = iArr[i6];
                        if (i7 > iArr[i6 - 1]) {
                            if (i7 >= jArr.length) {
                                throw new IOException("Sync sample is not a valid frame");
                            }
                        } else {
                            throw new IOException("Sync samples are not strictly ascending");
                        }
                    }
                }
                this.j = iArr;
                return;
            }
            throw new IOException("Could not parse any frame times from video");
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video rotation unsupported: ");
        sb.append(i4);
        throw new IOException(sb.toString());
    }

    private final int n(long j) {
        int i = i(j);
        if (i == -1) {
            return -1;
        }
        return f(i);
    }

    private final int o() {
        int[] iArr = this.j;
        return iArr != null ? iArr.length : this.i.length;
    }

    private final int p(int i) {
        if (i < 0) {
            i += o();
        }
        int[] iArr = this.j;
        return iArr != null ? iArr[i] : i;
    }

    public final float a() {
        return (this.k * k()) / j();
    }

    public final int b(long j) {
        if (j < this.i[p(0)]) {
            return p(0);
        }
        if (j > this.i[p(-1)]) {
            return p(-1);
        }
        int n = n(j);
        vcp.d(n != -1);
        int p = p(n);
        if (n == o() - 1) {
            return p;
        }
        int p2 = p(n + 1);
        long[] jArr = this.i;
        return jArr[p2] - j > j - jArr[p] ? p : p2;
    }

    public final int c(long j) {
        if (j < this.i[p(0)]) {
            return p(0);
        }
        int n = n(j);
        if (n == -1) {
            return -1;
        }
        if (this.i[p(n)] == j) {
            return p(n);
        }
        if (n == o() - 1) {
            return -1;
        }
        return p(n + 1);
    }

    public final int d(int i) {
        if (i < 0) {
            return -1;
        }
        if (i >= h()) {
            return p(-1);
        }
        return p(f(i));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(long j) {
        if (j > this.i[p(-1)]) {
            return p(-1);
        }
        int n = n(j);
        if (n == -1) {
            return -1;
        }
        return p(n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoMetaData) {
            return uqq.p(this.a, ((VideoMetaData) obj).a);
        }
        return false;
    }

    public final int f(int i) {
        int[] iArr = this.j;
        if (iArr == null) {
            return i;
        }
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        int i2 = (-binarySearch) - 2;
        vcp.d(i2 >= 0);
        vcp.d(i2 < this.j.length);
        return i2;
    }

    public final int g(long j) {
        if (j < 0) {
            return 0;
        }
        if (j >= this.i[r0.length - 1]) {
            return h() - 1;
        }
        return i(j);
    }

    public final int h() {
        return this.i.length;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final int i(long j) {
        if (j >= 0) {
            if (j <= Math.max(this.g - 1, this.i[r3.length - 1])) {
                int binarySearch = Arrays.binarySearch(this.i, j);
                return binarySearch >= 0 ? binarySearch : (-binarySearch) - 2;
            }
        }
        return -1;
    }

    public final int j() {
        int i = this.f;
        return (i == 0 || i == 180) ? this.e : this.d;
    }

    public final int k() {
        int i = this.f;
        return (i == 0 || i == 180) ? this.d : this.e;
    }

    public final long l(int i) {
        vcp.g(i, this.i.length);
        return this.i[i];
    }

    public final boolean m(int i) {
        vcp.g(i, this.i.length);
        int[] iArr = this.j;
        return iArr == null || Arrays.binarySearch(iArr, i) >= 0;
    }

    public final String toString() {
        String name = getClass().getName();
        Object[] objArr = new Object[13];
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("source=");
        sb.append(valueOf);
        objArr[0] = sb.toString();
        int i = this.c;
        StringBuilder sb2 = new StringBuilder(27);
        sb2.append("videoTrackIndex=");
        sb2.append(i);
        objArr[1] = sb2.toString();
        int i2 = this.d;
        StringBuilder sb3 = new StringBuilder(17);
        sb3.append("width=");
        sb3.append(i2);
        objArr[2] = sb3.toString();
        int i3 = this.e;
        StringBuilder sb4 = new StringBuilder(18);
        sb4.append("height=");
        sb4.append(i3);
        objArr[3] = sb4.toString();
        float f = this.k;
        StringBuilder sb5 = new StringBuilder(27);
        sb5.append("pixelAspect=");
        sb5.append(f);
        objArr[4] = sb5.toString();
        int i4 = this.f;
        StringBuilder sb6 = new StringBuilder(27);
        sb6.append("rotationDegrees=");
        sb6.append(i4);
        objArr[5] = sb6.toString();
        long j = this.g;
        StringBuilder sb7 = new StringBuilder(31);
        sb7.append("durationUs=");
        sb7.append(j);
        objArr[6] = sb7.toString();
        int length = this.i.length;
        StringBuilder sb8 = new StringBuilder(30);
        sb8.append("frameTimesUs count=");
        sb8.append(length);
        objArr[7] = sb8.toString();
        int[] iArr = this.j;
        String valueOf2 = String.valueOf(iArr != null ? Integer.valueOf(iArr.length) : "null");
        StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf2).length() + 25);
        sb9.append("syncSamplesIndices count=");
        sb9.append(valueOf2);
        objArr[8] = sb9.toString();
        boolean z = this.l;
        StringBuilder sb10 = new StringBuilder(16);
        sb10.append("hasBFrames=");
        sb10.append(z);
        objArr[9] = sb10.toString();
        int i5 = this.m;
        StringBuilder sb11 = new StringBuilder(22);
        sb11.append("stereoMode=");
        sb11.append(i5);
        objArr[10] = sb11.toString();
        byte[] bArr = this.n;
        String valueOf3 = String.valueOf(bArr != null ? Integer.valueOf(bArr.length) : "null");
        StringBuilder sb12 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
        sb12.append("projectionData count=");
        sb12.append(valueOf3);
        objArr[11] = sb12.toString();
        boolean z2 = this.h;
        StringBuilder sb13 = new StringBuilder(22);
        sb13.append("hasMetadataTrack=");
        sb13.append(z2);
        objArr[12] = sb13.toString();
        return uqq.o(name, objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeFloat(this.k);
        parcel.writeLong(this.g);
        parcel.writeLongArray(this.i);
        parcel.writeIntArray(this.j);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n != null ? 1 : 0);
        byte[] bArr = this.n;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.h ? 1 : 0);
    }

    public VideoMetaData(Parcel parcel) {
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.b = parcel.readInt() != 0;
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.k = parcel.readFloat();
        this.g = parcel.readLong();
        this.i = parcel.createLongArray();
        this.j = parcel.createIntArray();
        this.l = parcel.readInt() == 1;
        this.m = parcel.readInt();
        this.n = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.h = parcel.readInt() == 1;
    }
}
