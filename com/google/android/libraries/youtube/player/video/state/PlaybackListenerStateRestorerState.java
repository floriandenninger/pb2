package com.google.android.libraries.youtube.player.video.state;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aigo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PlaybackListenerStateRestorerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aigo(17);
    public final Map a;

    public PlaybackListenerStateRestorerState(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        int readInt = parcel.readInt();
        this.a = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readString = parcel.readString();
            if (readString != null) {
                this.a.put(readString, parcel.readParcelable(classLoader));
            }
        }
    }

    public PlaybackListenerStateRestorerState(Map map) {
        this.a = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), 0);
        }
    }
}
