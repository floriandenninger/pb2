package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axii extends ecp implements IInterface {
    public axii(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.library.api.IVrCreator");
    }

    public final axij a(axih axihVar, axih axihVar2) {
        axij axijVar;
        Parcel pn = pn();
        ecr.i(pn, axihVar);
        ecr.i(pn, axihVar2);
        Parcel po = po(4, pn);
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            axijVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
            if (queryLocalInterface instanceof axij) {
                axijVar = (axij) queryLocalInterface;
            } else {
                axijVar = new axij(readStrongBinder);
            }
        }
        po.recycle();
        return axijVar;
    }
}
