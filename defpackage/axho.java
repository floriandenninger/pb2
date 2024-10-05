package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axho extends ecp implements axhp {
    public axho(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.common.api.IVrCoreSdkService");
    }

    @Override // defpackage.axhp
    public final axhl a() {
        axhl axhkVar;
        Parcel po = po(2, pn());
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            axhkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IDaydreamManager");
            if (queryLocalInterface instanceof axhl) {
                axhkVar = (axhl) queryLocalInterface;
            } else {
                axhkVar = new axhk(readStrongBinder);
            }
        }
        po.recycle();
        return axhkVar;
    }

    @Override // defpackage.axhp
    public final axim f() {
        axim axilVar;
        Parcel po = po(4, pn());
        IBinder readStrongBinder = po.readStrongBinder();
        if (readStrongBinder == null) {
            axilVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.logging.api.IVrCoreLoggingService");
            if (queryLocalInterface instanceof axim) {
                axilVar = (axim) queryLocalInterface;
            } else {
                axilVar = new axil(readStrongBinder);
            }
        }
        po.recycle();
        return axilVar;
    }

    @Override // defpackage.axhp
    public final boolean g() {
        Parcel pn = pn();
        pn.writeInt(25);
        Parcel po = po(1, pn);
        boolean j = ecr.j(po);
        po.recycle();
        return j;
    }
}
