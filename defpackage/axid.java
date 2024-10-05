package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class axid extends ecq implements axie {
    public axid() {
        super("com.google.vr.vrcore.library.api.IGvrUiLayout");
    }

    public static axie asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IGvrUiLayout");
        if (queryLocalInterface instanceof axie) {
            return (axie) queryLocalInterface;
        }
        return new axic(iBinder);
    }

    @Override // defpackage.ecq
    protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        axih axihVar = null;
        switch (i) {
            case 2:
                axih rootView = getRootView();
                parcel2.writeNoException();
                ecr.i(parcel2, rootView);
                return true;
            case 3:
                setEnabled(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean isEnabled = isEnabled();
                parcel2.writeNoException();
                ecr.e(parcel2, isEnabled);
                return true;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface instanceof axih) {
                        axihVar = (axih) queryLocalInterface;
                    } else {
                        axihVar = new axif(readStrongBinder);
                    }
                }
                setCloseButtonListener(axihVar);
                parcel2.writeNoException();
                return true;
            case 6:
                setTransitionViewEnabled(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface2 instanceof axih) {
                        axihVar = (axih) queryLocalInterface2;
                    } else {
                        axihVar = new axif(readStrongBinder2);
                    }
                }
                setTransitionViewListener(axihVar);
                parcel2.writeNoException();
                return true;
            case 8:
                setSettingsButtonEnabled(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 9:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface3 instanceof axih) {
                        axihVar = (axih) queryLocalInterface3;
                    } else {
                        axihVar = new axif(readStrongBinder3);
                    }
                }
                setSettingsButtonListener(axihVar);
                parcel2.writeNoException();
                return true;
            case 10:
                setViewerName(parcel.readString());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
