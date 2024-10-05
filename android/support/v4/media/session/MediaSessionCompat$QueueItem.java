package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import defpackage.bg;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bg(9);
    private final MediaDescriptionCompat a;
    private final long b;

    public MediaSessionCompat$QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j != -1) {
            this.a = mediaDescriptionCompat;
            this.b = j;
            return;
        }
        throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
}
