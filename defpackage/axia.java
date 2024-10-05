package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class axia extends ecq implements axib {
    public axia() {
        super("com.google.vr.vrcore.library.api.IGvrLayout");
    }

    public static axib asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IGvrLayout");
        if (queryLocalInterface instanceof axib) {
            return (axib) queryLocalInterface;
        }
        return new axhz(iBinder);
    }

    @Override // defpackage.ecq
    protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        axih axihVar = null;
        switch (i) {
            case 2:
                long nativeGvrContext = getNativeGvrContext();
                parcel2.writeNoException();
                parcel2.writeLong(nativeGvrContext);
                return true;
            case 3:
                axih rootView = getRootView();
                parcel2.writeNoException();
                ecr.i(parcel2, rootView);
                return true;
            case 4:
                axie uiLayout = getUiLayout();
                parcel2.writeNoException();
                ecr.i(parcel2, uiLayout);
                return true;
            case 5:
                onPause();
                parcel2.writeNoException();
                return true;
            case 6:
                onResume();
                parcel2.writeNoException();
                return true;
            case 7:
                shutdown();
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface instanceof axih) {
                        axihVar = (axih) queryLocalInterface;
                    } else {
                        axihVar = new axif(readStrongBinder);
                    }
                }
                setPresentationView(axihVar);
                parcel2.writeNoException();
                return true;
            case 9:
                boolean enableAsyncReprojection = enableAsyncReprojection(parcel.readInt());
                parcel2.writeNoException();
                ecr.e(parcel2, enableAsyncReprojection);
                return true;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface2 instanceof axih) {
                        axihVar = (axih) queryLocalInterface2;
                    } else {
                        axihVar = new axif(readStrongBinder2);
                    }
                }
                boolean enableCardboardTriggerEmulation = enableCardboardTriggerEmulation(axihVar);
                parcel2.writeNoException();
                ecr.e(parcel2, enableCardboardTriggerEmulation);
                return true;
            case 11:
                setStereoModeEnabled(ecr.j(parcel));
                parcel2.writeNoException();
                return true;
            case 12:
                onBackPressed();
                parcel2.writeNoException();
                return true;
            case 13:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface3 instanceof axih) {
                        axihVar = (axih) queryLocalInterface3;
                    } else {
                        axihVar = new axif(readStrongBinder3);
                    }
                }
                setReentryIntent(axihVar);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.vr.vrcore.library.api.IObjectWrapper");
                    if (queryLocalInterface4 instanceof axih) {
                        axihVar = (axih) queryLocalInterface4;
                    } else {
                        axihVar = new axif(readStrongBinder4);
                    }
                }
                boolean onDonNotNeededListener = setOnDonNotNeededListener(axihVar);
                parcel2.writeNoException();
                ecr.e(parcel2, onDonNotNeededListener);
                return true;
            default:
                return false;
        }
    }
}
