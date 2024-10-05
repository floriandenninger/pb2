package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pxm extends ecq implements pxn {
    private final Object a;
    private volatile pxo b;

    public pxm() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public pxm(byte[] bArr) {
        super("com.google.android.gms.ads.internal.client.IVideoController");
        this.a = new Object();
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        pxo pxoVar;
        pxo pxoVar2;
        switch (i) {
            case 1:
                throw new RemoteException();
            case 2:
                throw new RemoteException();
            case 3:
                ecr.j(parcel);
                throw new RemoteException();
            case 4:
                throw new RemoteException();
            case 5:
                throw new RemoteException();
            case 6:
                throw new RemoteException();
            case 7:
                throw new RemoteException();
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    pxoVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    if (queryLocalInterface instanceof pxo) {
                        pxoVar = (pxo) queryLocalInterface;
                    } else {
                        pxoVar = new pxo(readStrongBinder);
                    }
                }
                synchronized (this.a) {
                    this.b = pxoVar;
                }
                parcel2.writeNoException();
                return true;
            case 9:
                throw new RemoteException();
            case 10:
                throw new RemoteException();
            case 11:
                synchronized (this.a) {
                    pxoVar2 = this.b;
                }
                parcel2.writeNoException();
                ecr.i(parcel2, pxoVar2);
                return true;
            case 12:
                throw new RemoteException();
            case 13:
                throw new RemoteException();
            default:
                return false;
        }
    }
}
