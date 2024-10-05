package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gq implements gs {
    private final IBinder a;

    public gq(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.gs
    public final void a(PlaybackStateCompat playbackStateCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            playbackStateCompat.writeToParcel(obtain, 0);
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
