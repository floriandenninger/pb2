package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gu extends Binder implements gv {
    final /* synthetic */ hi a;

    public gu() {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    @Override // defpackage.gv
    public final PlaybackStateCompat a() {
        hi hiVar = this.a;
        PlaybackStateCompat playbackStateCompat = hiVar.f;
        MediaMetadataCompat mediaMetadataCompat = hiVar.g;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.b == -1) {
            return playbackStateCompat;
        }
        int i = playbackStateCompat.a;
        if (i != 3 && i != 4 && i != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.h <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = (playbackStateCompat.d * ((float) (elapsedRealtime - r3))) + playbackStateCompat.b;
        if (mediaMetadataCompat != null && mediaMetadataCompat.b.containsKey("android.media.metadata.DURATION")) {
            j = mediaMetadataCompat.a("android.media.metadata.DURATION");
        }
        long j3 = (j < 0 || j2 <= j) ? j2 < 0 ? 0L : j2 : j;
        hq hqVar = new hq(playbackStateCompat);
        hqVar.b(playbackStateCompat.a, j3, playbackStateCompat.d, elapsedRealtime);
        return hqVar.a();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // defpackage.gv
    public final void b(gs gsVar) {
        if (this.a.d) {
            return;
        }
        this.a.e.register(gsVar, new arn("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (this.a.c) {
        }
    }

    @Override // defpackage.gv
    public final void c(gs gsVar) {
        this.a.e.unregister(gsVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (this.a.c) {
        }
    }

    public gu(hi hiVar) {
        this.a = hiVar;
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        gs gsVar = null;
        switch (i) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof gs)) {
                        gsVar = new gq(readStrongBinder);
                    } else {
                        gsVar = (gs) queryLocalInterface;
                    }
                }
                b(gsVar);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof gs)) {
                        gsVar = new gq(readStrongBinder2);
                    } else {
                        gsVar = (gs) queryLocalInterface2;
                    }
                }
                c(gsVar);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                throw new AssertionError();
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                throw new AssertionError();
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 14:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 15:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 16:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 17:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readLong();
                throw new AssertionError();
            case 18:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 19:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 20:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 21:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 22:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 23:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 24:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readLong();
                throw new AssertionError();
            case 25:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 26:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 27:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 28:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                PlaybackStateCompat a = a();
                parcel2.writeNoException();
                if (a != null) {
                    parcel2.writeInt(1);
                    a.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 29:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeTypedList(null);
                return true;
            case 30:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 31:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 32:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int i3 = this.a.h;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 33:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                throw new AssertionError();
            case 34:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 35:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 36:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 37:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 38:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                throw new AssertionError();
            case 40:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 42:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                parcel.readInt();
                throw new AssertionError();
            case 43:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            case 44:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                throw new AssertionError();
            case 45:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                throw new AssertionError();
            case 47:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 48:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                throw new AssertionError();
            case 49:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readFloat();
                throw new AssertionError();
            case 50:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 51:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                }
                throw new AssertionError();
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
