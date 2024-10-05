package com.google.android.libraries.youtube.player.features.overlay.timebar;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aapi;
import defpackage.amkq;
import defpackage.apxf;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TimelineMarker implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapi(19);
    public final long a;
    public final long b;
    public final int c;
    public final float d;
    public final CharSequence e;
    public final apxf f;

    public TimelineMarker(long j, long j2) {
        this(j, j2, 0, null, null, 0.0f);
    }

    public final boolean a(long j) {
        return this.a <= j && this.b > j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TimelineMarker)) {
            return false;
        }
        TimelineMarker timelineMarker = (TimelineMarker) obj;
        if (this.a != timelineMarker.a || this.b != timelineMarker.b || this.c != timelineMarker.c || this.d != timelineMarker.d) {
            return false;
        }
        CharSequence charSequence = this.e;
        if (charSequence != timelineMarker.e) {
            return charSequence != null && charSequence.toString().contentEquals(timelineMarker.e);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c), this.e, Float.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public TimelineMarker(long j, long j2, int i, CharSequence charSequence, apxf apxfVar) {
        this(j, j2, i, charSequence, apxfVar, 0.0f);
    }

    public TimelineMarker(long j, long j2, int i, CharSequence charSequence, apxf apxfVar, float f) {
        amkq.E(j2 >= j);
        this.a = j;
        this.b = j2;
        this.c = i;
        this.e = charSequence;
        this.f = apxfVar;
        this.d = f;
    }
}
