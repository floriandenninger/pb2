package com.google.android.libraries.youtube.innertube.model.player;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aamk;
import defpackage.aomf;
import defpackage.atyz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlaybackLoggingPayloadModel implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new aamk(17);
    public final aomf a;
    public final int b;

    public PlaybackLoggingPayloadModel(atyz atyzVar) {
        this.a = atyzVar.c;
        this.b = atyzVar.d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = this.b;
        int i2 = ((PlaybackLoggingPayloadModel) obj).b;
        if (i != i2) {
            return i >= i2 ? 1 : -1;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeInt(this.b);
    }
}
