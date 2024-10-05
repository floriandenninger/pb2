package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.pph;
import defpackage.ppm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator CREATOR = new pph(15);
    public final List a;

    public SpliceScheduleCommand(Parcel parcel) {
        ppm d;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            d = ppm.d(parcel);
            arrayList.add(d);
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((ppm) this.a.get(i2)).f(parcel);
        }
    }

    public SpliceScheduleCommand(List list) {
        this.a = Collections.unmodifiableList(list);
    }
}
