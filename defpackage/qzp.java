package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class qzp extends ecq implements IInterface {
    public qzp() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    public void a() {
        throw new UnsupportedOperationException();
    }

    public void b() {
        throw new UnsupportedOperationException();
    }

    public void c(GoogleHelp googleHelp) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                c((GoogleHelp) ecr.a(parcel, GoogleHelp.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            case 7:
                a();
                return true;
            case 8:
                b();
                return true;
            case 9:
                parcel.readInt();
                throw new UnsupportedOperationException();
            case 10:
                throw new UnsupportedOperationException();
            case 11:
                throw new UnsupportedOperationException();
            case 12:
                throw new UnsupportedOperationException();
            case 13:
                parcel.createByteArray();
                throw new UnsupportedOperationException();
            case 14:
                throw new UnsupportedOperationException();
            case 15:
                parcel.createByteArray();
                throw new UnsupportedOperationException();
            case 16:
                throw new UnsupportedOperationException();
            case 17:
                throw new UnsupportedOperationException();
            case 18:
                parcel.createByteArray();
                throw new UnsupportedOperationException();
            case 19:
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
