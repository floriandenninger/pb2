package com.google.android.exoplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.k;
import defpackage.opn;
import defpackage.pgz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MediaFormat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new k(11);
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final List f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final int n;
    public final byte[] o;
    public final ColorInfo p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final String v;
    public final long w;
    public android.media.MediaFormat x;
    private int y;

    public MediaFormat(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readFloat();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.v = parcel.readString();
        this.w = parcel.readLong();
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        parcel.readList(arrayList, null);
        this.g = parcel.readInt() == 1;
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.o = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.n = parcel.readInt();
        this.p = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
    }

    public static MediaFormat b(String str, String str2, int i, int i2, long j, int i3, int i4, List list, String str3) {
        return c(str, str2, i, i2, j, i3, i4, list, str3, -1);
    }

    public static MediaFormat c(String str, String str2, int i, int i2, long j, int i3, int i4, List list, String str3, int i5) {
        return new MediaFormat(str, str2, i, i2, j, -1, -1, -1, -1.0f, i3, i4, str3, Long.MAX_VALUE, list, false, -1, -1, i5, -1, -1, null, -1, null);
    }

    public static MediaFormat d() {
        return i(null, "application/id3", -1L);
    }

    public static MediaFormat e(String str, String str2, int i, long j, String str3) {
        return f(str, str2, i, j, str3, Long.MAX_VALUE);
    }

    public static MediaFormat f(String str, String str2, int i, long j, String str3, long j2) {
        return new MediaFormat(str, str2, i, -1, j, -1, -1, -1, -1.0f, -1, -1, str3, j2, null, false, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static MediaFormat g(String str, String str2, int i, int i2, long j, int i3, int i4, List list, int i5, float f, byte[] bArr, int i6, ColorInfo colorInfo) {
        return new MediaFormat(str, str2, i, i2, j, i3, i4, i5, f, -1, -1, null, Long.MAX_VALUE, list, false, -1, -1, -1, -1, -1, bArr, i6, colorInfo);
    }

    public static final void h(android.media.MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static MediaFormat i(String str, String str2, long j) {
        return new MediaFormat(str, str2, -1, -1, j, -1, -1, -1, -1.0f, -1, -1, null, Long.MAX_VALUE, null, false, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static MediaFormat j(String str, String str2, int i, long j, int i2, int i3) {
        return g(str, str2, i, -1, j, i2, i3, null, -1, -1.0f, null, -1, null);
    }

    public static MediaFormat k(String str, long j, int i, int i2, List list, float f) {
        return new MediaFormat(null, str, -1, -1, j, i, i2, -1, f, -1, -1, null, Long.MAX_VALUE, list, false, -1, -1, -1, -1, -1, null, -1, null);
    }

    public final MediaFormat a(int i, int i2) {
        return new MediaFormat(this.a, this.b, this.c, this.d, this.e, this.h, this.i, this.l, this.m, this.q, this.r, this.v, this.w, this.f, this.g, this.j, this.k, this.s, i, i2, this.o, this.n, this.p);
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
            MediaFormat mediaFormat = (MediaFormat) obj;
            if (this.g == mediaFormat.g && this.c == mediaFormat.c && this.d == mediaFormat.d && this.e == mediaFormat.e && this.h == mediaFormat.h && this.i == mediaFormat.i && this.l == mediaFormat.l && this.m == mediaFormat.m && this.j == mediaFormat.j && this.k == mediaFormat.k && this.q == mediaFormat.q && this.r == mediaFormat.r && this.s == mediaFormat.s && this.t == mediaFormat.t && this.u == mediaFormat.u && this.w == mediaFormat.w && pgz.p(this.a, mediaFormat.a) && pgz.p(this.v, mediaFormat.v) && pgz.p(this.b, mediaFormat.b) && this.f.size() == mediaFormat.f.size() && pgz.p(this.p, mediaFormat.p) && Arrays.equals(this.o, mediaFormat.o) && this.n == mediaFormat.n) {
                for (int i = 0; i < this.f.size(); i++) {
                    if (!Arrays.equals((byte[]) this.f.get(i), (byte[]) mediaFormat.f.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        int i2 = this.d;
        int i3 = this.h;
        int i4 = this.i;
        int i5 = this.l;
        float f = this.m;
        int i6 = this.q;
        int i7 = this.r;
        String str3 = this.v;
        long j = this.e;
        boolean z = this.g;
        int i8 = this.j;
        int i9 = this.k;
        int i10 = this.s;
        int i11 = this.t;
        int i12 = this.u;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 219 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("MediaFormat(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append(", ");
        sb.append(f);
        sb.append(", ");
        sb.append(i6);
        sb.append(", ");
        sb.append(i7);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(z);
        sb.append(", ");
        sb.append(i8);
        sb.append(", ");
        sb.append(i9);
        sb.append(", ");
        sb.append(i10);
        sb.append(", ");
        sb.append(i11);
        sb.append(", ");
        sb.append(i12);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.l);
        parcel.writeFloat(this.m);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeString(this.v);
        parcel.writeLong(this.w);
        parcel.writeList(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.o != null ? 1 : 0);
        byte[] bArr = this.o;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.n);
        parcel.writeParcelable(this.p, i);
    }

    public final int hashCode() {
        int i = this.y;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.b;
        int hashCode2 = (((((((((((((((((((((((((((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c) * 31) + this.d) * 31) + this.h) * 31) + this.i) * 31) + this.l) * 31) + Float.floatToRawIntBits(this.m)) * 31) + ((int) this.e)) * 31) + (true != this.g ? 1237 : 1231)) * 31) + this.j) * 31) + this.k) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + this.u) * 31;
        String str3 = this.v;
        int hashCode3 = ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + ((int) this.w);
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            hashCode3 = (hashCode3 * 31) + Arrays.hashCode((byte[]) this.f.get(i2));
        }
        int hashCode4 = (((hashCode3 * 31) + Arrays.hashCode(this.o)) * 31) + this.n;
        this.y = hashCode4;
        return hashCode4;
    }

    public MediaFormat(String str, String str2, int i, int i2, long j, int i3, int i4, int i5, float f, int i6, int i7, String str3, long j2, List list, boolean z, int i8, int i9, int i10, int i11, int i12, byte[] bArr, int i13, ColorInfo colorInfo) {
        this.a = str;
        opn.m(str2);
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.h = i3;
        this.i = i4;
        this.l = i5;
        this.m = f;
        this.q = i6;
        this.r = i7;
        this.v = str3;
        this.w = j2;
        this.f = list == null ? Collections.emptyList() : list;
        this.g = z;
        this.j = i8;
        this.k = i9;
        this.s = i10;
        this.t = i11;
        this.u = i12;
        this.o = bArr;
        this.n = i13;
        this.p = colorInfo;
    }
}
