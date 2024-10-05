package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pph;
import defpackage.pth;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = new pph(16);
    public final long a;
    public final long b;

    public TimeSignalCommand(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long d(pth pthVar, long j) {
        long i = pthVar.i();
        if ((128 & i) != 0) {
            return 8589934591L & ((((i & 1) << 32) | pthVar.p()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
