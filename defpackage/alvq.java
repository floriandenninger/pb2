package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class alvq extends ecq implements alvr {
    public alvq() {
        super("com.google.android.youtube.player.internal.IYouTubeService");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        alvn alvnVar;
        if (i == 1) {
            IBinder d = d();
            parcel2.writeNoException();
            parcel2.writeStrongBinder(d);
        } else if (i == 2) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                alvnVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IThumbnailLoaderClient");
                if (queryLocalInterface instanceof alvn) {
                    alvnVar = (alvn) queryLocalInterface;
                } else {
                    alvnVar = new alvn(readStrongBinder);
                }
            }
            alvp h = h(alvnVar);
            parcel2.writeNoException();
            ecr.i(parcel2, h);
        } else if (i == 3) {
            ecr.j(parcel);
            g();
            parcel2.writeNoException();
        } else {
            if (i != 4) {
                return false;
            }
            IBinder e = e();
            parcel2.writeNoException();
            parcel2.writeStrongBinder(e);
        }
        return true;
    }
}
