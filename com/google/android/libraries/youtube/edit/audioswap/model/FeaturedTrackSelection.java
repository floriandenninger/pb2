package com.google.android.libraries.youtube.edit.audioswap.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.xes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FeaturedTrackSelection extends TrackSelection {
    public static final Parcelable.Creator CREATOR = new xes(11);
    private final List a;

    public FeaturedTrackSelection(Parcel parcel) {
        super(parcel);
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        parcel.readTypedList(arrayList, Track.CREATOR);
    }

    @Override // com.google.android.libraries.youtube.edit.audioswap.model.TrackSelection
    public final List a(Context context) {
        context.getClass();
        return this.a;
    }

    @Override // com.google.android.libraries.youtube.edit.audioswap.model.TrackSelection
    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FeaturedTrackSelection) && super.equals(obj) && this.a.equals(((FeaturedTrackSelection) obj).a);
        }
        return true;
    }

    @Override // com.google.android.libraries.youtube.edit.audioswap.model.TrackSelection
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.a});
    }

    @Override // com.google.android.libraries.youtube.edit.audioswap.model.TrackSelection, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.a);
    }

    public FeaturedTrackSelection(CharSequence charSequence, List list, int i) {
        super(charSequence, i);
        this.a = list;
    }
}
