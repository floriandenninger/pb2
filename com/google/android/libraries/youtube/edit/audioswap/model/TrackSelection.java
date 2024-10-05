package com.google.android.libraries.youtube.edit.audioswap.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class TrackSelection implements Parcelable {
    public final CharSequence b;
    public final int c;

    /* JADX INFO: Access modifiers changed from: protected */
    public TrackSelection(Parcel parcel) {
        this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c = parcel.readInt();
    }

    public TrackSelection(CharSequence charSequence, int i) {
        this.c = i;
        this.b = charSequence;
    }

    public abstract List a(Context context);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TrackSelection) {
            TrackSelection trackSelection = (TrackSelection) obj;
            return TextUtils.equals(this.b, trackSelection.b) && this.c == trackSelection.c;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.b});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.b, parcel, 0);
        parcel.writeInt(this.c);
    }
}
