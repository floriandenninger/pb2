package defpackage;

import android.os.Parcel;
import com.google.android.libraries.youtube.player.stats.PlaybackClientManager$State;
import com.google.android.libraries.youtube.player.video.state.PlaybackListenerStateRestorerState;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajbr {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final String e;
    public final PlaybackClientManager$State f;
    public final PlaybackListenerStateRestorerState g;

    public ajbr(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readInt() == 1;
        this.b = parcel.readInt() == 1;
        this.c = parcel.readInt() == 1;
        this.d = parcel.readLong();
        this.f = (PlaybackClientManager$State) parcel.readParcelable(classLoader);
        this.g = (PlaybackListenerStateRestorerState) parcel.readParcelable(classLoader);
        this.e = parcel.readString();
    }

    public ajbr(boolean z, boolean z2, boolean z3, long j, PlaybackClientManager$State playbackClientManager$State, PlaybackListenerStateRestorerState playbackListenerStateRestorerState, String str) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
        this.f = playbackClientManager$State;
        this.g = playbackListenerStateRestorerState;
        this.e = str;
    }

    public static ajbr a(ajbr ajbrVar) {
        if (ajbrVar == null) {
            return null;
        }
        return new ajbr(false, ajbrVar.b, ajbrVar.c, ajbrVar.d, ajbrVar.f, ajbrVar.g, ajbrVar.e);
    }

    public static ajbr b(Parcel parcel) {
        return new ajbr(parcel);
    }

    public final void c(Parcel parcel) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeLong(this.d);
        parcel.writeParcelable(this.f, 0);
        parcel.writeParcelable(this.g, 0);
        parcel.writeString(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajbr)) {
            return false;
        }
        ajbr ajbrVar = (ajbr) obj;
        return this.a == ajbrVar.a && this.b == ajbrVar.b && this.c == ajbrVar.c && this.d == ajbrVar.d;
    }

    public final int hashCode() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        long j = this.d;
        int i = ((((((((((z ? 1 : 0) + 527) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + ((int) (j >> 32))) * 31) + ((int) j)) * 31;
        String str = this.e;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        long j = this.d;
        String valueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 141 + String.valueOf(valueOf).length());
        sb.append("VideoState{");
        sb.append(hexString);
        sb.append(" playOnResume=");
        sb.append(z);
        sb.append(" wasEnded=");
        sb.append(z2);
        sb.append(" restoreFromBackStack=");
        sb.append(z3);
        sb.append(" videoPositionMillis=");
        sb.append(j);
        sb.append(" playbackClientMangerState=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
