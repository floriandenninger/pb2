package com.google.android.apps.youtube.embeddedplayer.service.csi.shared;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.SetOperationType;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.Tick;
import defpackage.ecq;
import defpackage.ecr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class c extends ecq implements d {
    public c() {
        super("com.google.android.apps.youtube.embeddedplayer.service.csi.shared.ICsiControllerService");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        d bVar;
        switch (i) {
            case 1:
                j((SetOperationType) ecr.a(parcel, SetOperationType.CREATOR), parcel.readLong());
                break;
            case 2:
                k((SetOperationType) ecr.a(parcel, SetOperationType.CREATOR), parcel.readLong());
                break;
            case 3:
                g((Tick) ecr.a(parcel, Tick.CREATOR), parcel.readLong());
                break;
            case 4:
                c();
                break;
            case 5:
                h(parcel.readLong());
                break;
            case 6:
                e((Tick) ecr.a(parcel, Tick.CREATOR), parcel.readLong());
                break;
            case 7:
                a();
                break;
            case 8:
                i(parcel.readLong());
                break;
            case 9:
                f((Tick) ecr.a(parcel, Tick.CREATOR), parcel.readLong());
                break;
            case 10:
                b();
                break;
            case 11:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.csi.shared.ICsiControllerService");
                    if (queryLocalInterface instanceof d) {
                        bVar = (d) queryLocalInterface;
                    } else {
                        bVar = new b(readStrongBinder);
                    }
                }
                d(bVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
