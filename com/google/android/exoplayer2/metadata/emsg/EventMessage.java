package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.k;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.pmr;
import defpackage.pms;
import defpackage.pne;
import defpackage.pts;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR;
    private static final pms f;
    private static final pms g;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int h;

    static {
        pmr pmrVar = new pmr();
        pmrVar.k = "application/id3";
        f = pmrVar.a();
        pmr pmrVar2 = new pmr();
        pmrVar2.k = "application/x-scte35";
        g = pmrVar2.a();
        CREATOR = new k(14);
    }

    public EventMessage(Parcel parcel) {
        String readString = parcel.readString();
        int i = pts.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = (byte[]) pts.C(parcel.createByteArray());
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final pms a() {
        char c;
        String str = this.a;
        int hashCode = str.hashCode();
        if (hashCode == -1468477611) {
            if (str.equals("urn:scte:scte35:2014:bin")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != -795945609) {
            if (hashCode == 1303648457 && str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("https://aomedia.org/emsg/ID3")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0 || c == 1) {
            return f;
        }
        if (c != 2) {
            return null;
        }
        return g;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void b(pne pneVar) {
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final byte[] c() {
        if (a() != null) {
            return this.e;
        }
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
            EventMessage eventMessage = (EventMessage) obj;
            if (this.c == eventMessage.c && this.d == eventMessage.d && pts.R(this.a, eventMessage.a) && pts.R(this.b, eventMessage.b) && Arrays.equals(this.e, eventMessage.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.c;
        long j2 = this.d;
        int hashCode3 = ((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.e);
        this.h = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        String str = this.a;
        long j = this.d;
        long j2 = this.c;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j);
        sb.append(", durationMs=");
        sb.append(j2);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.e);
    }
}
