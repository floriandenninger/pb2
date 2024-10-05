package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bg;
import defpackage.bxy;
import defpackage.gv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bg(11);
    public final Object b;
    public gv c;
    public final Object a = new Object();
    public bxy d = null;

    public MediaSessionCompat$Token(Object obj, gv gvVar) {
        this.b = obj;
        this.c = gvVar;
    }

    public final gv a() {
        gv gvVar;
        synchronized (this.a) {
            gvVar = this.c;
        }
        return gvVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Object obj2 = this.b;
        if (obj2 == null) {
            return mediaSessionCompat$Token.b == null;
        }
        Object obj3 = mediaSessionCompat$Token.b;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
