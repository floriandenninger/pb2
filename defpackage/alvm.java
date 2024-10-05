package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alvm extends ecq implements IInterface {
    public alvm() {
        super("com.google.android.youtube.player.internal.IServiceBroker");
    }

    public void a(aluz aluzVar, int i, String str, String str2, String str3) {
        throw null;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        aluz aluzVar;
        aluz aluzVar2;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            aluzVar2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IConnectionCallbacks");
            if (queryLocalInterface instanceof aluz) {
                aluzVar2 = (aluz) queryLocalInterface;
            } else {
                aluzVar = new aluz(readStrongBinder);
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                a(aluzVar, readInt, readString, readString2, readString3);
                parcel2.writeNoException();
                return true;
            }
        }
        aluzVar = aluzVar2;
        int readInt2 = parcel.readInt();
        String readString4 = parcel.readString();
        String readString22 = parcel.readString();
        String readString32 = parcel.readString();
        a(aluzVar, readInt2, readString4, readString22, readString32);
        parcel2.writeNoException();
        return true;
    }
}
