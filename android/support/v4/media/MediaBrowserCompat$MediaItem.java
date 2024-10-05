package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bg;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bg(5);
    private final int a;
    private final MediaDescriptionCompat b;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
