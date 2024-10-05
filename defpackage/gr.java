package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class gr extends Binder implements gs {
    private final WeakReference a;

    public gr(gy gyVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.a = new WeakReference(gyVar);
    }

    @Override // defpackage.gs
    public final void a(PlaybackStateCompat playbackStateCompat) {
        gy gyVar = (gy) this.a.get();
        if (gyVar != null) {
            gyVar.d(2, playbackStateCompat, null);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public void b(Bundle bundle) {
        gy gyVar = (gy) this.a.get();
        if (gyVar != null) {
            gyVar.d(7, bundle, null);
        }
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
        gy gyVar = (gy) this.a.get();
        if (gyVar != null) {
            gyVar.d(3, mediaMetadataCompat, null);
        }
    }

    public void d(List list) {
        gy gyVar = (gy) this.a.get();
        if (gyVar != null) {
            gyVar.d(5, list, null);
        }
    }

    public void e(CharSequence charSequence) {
        gy gyVar = (gy) this.a.get();
        if (gyVar != null) {
            gyVar.d(6, charSequence, null);
        }
    }

    public void f() {
        gy gyVar = (gy) this.a.get();
        if (gyVar != null) {
            gyVar.d(8, null, null);
        }
    }

    public void g(ParcelableVolumeInfo parcelableVolumeInfo) {
        gy gyVar = (gy) this.a.get();
        if (gyVar != null) {
            gyVar.d(4, parcelableVolumeInfo != null ? new gl(parcelableVolumeInfo.b) : null, null);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                String readString = parcel.readString();
                Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                gy gyVar = (gy) this.a.get();
                if (gyVar != null) {
                    gyVar.d(1, readString, bundle);
                }
                return true;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                f();
                return true;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                a(parcel.readInt() != 0 ? (PlaybackStateCompat) PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                c(parcel.readInt() != 0 ? (MediaMetadataCompat) MediaMetadataCompat.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                d(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                e(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                return true;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                b(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                g(parcel.readInt() != 0 ? (ParcelableVolumeInfo) ParcelableVolumeInfo.CREATOR.createFromParcel(parcel) : null);
                return true;
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                int readInt = parcel.readInt();
                gy gyVar2 = (gy) this.a.get();
                if (gyVar2 != null) {
                    gyVar2.d(9, Integer.valueOf(readInt), null);
                }
                return true;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                parcel.readInt();
                return true;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                boolean z = parcel.readInt() != 0;
                gy gyVar3 = (gy) this.a.get();
                if (gyVar3 != null) {
                    gyVar3.d(11, Boolean.valueOf(z), null);
                }
                return true;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                int readInt2 = parcel.readInt();
                gy gyVar4 = (gy) this.a.get();
                if (gyVar4 != null) {
                    gyVar4.d(12, Integer.valueOf(readInt2), null);
                }
                return true;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                gy gyVar5 = (gy) this.a.get();
                if (gyVar5 != null) {
                    gyVar5.d(13, null, null);
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
