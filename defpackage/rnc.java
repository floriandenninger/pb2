package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rnc extends ecq implements IInterface {
    public rnc() {
        super("com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    public void a(int i, Bundle bundle, DataHolder dataHolder) {
    }

    public void b(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
    }

    public void c(int i, Bundle bundle) {
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 12) {
            parcel.readInt();
            return true;
        }
        if (i == 15) {
            parcel.readInt();
            parcel.readString();
            return true;
        }
        if (i == 16) {
            parcel.readInt();
            return true;
        }
        if (i == 18) {
            parcel.readInt();
            return true;
        }
        if (i == 19) {
            return true;
        }
        switch (i) {
            case 1:
                int readInt = parcel.readInt();
                c(readInt, (Bundle) ecr.a(parcel, Bundle.CREATOR));
                return true;
            case 2:
                a(parcel.readInt(), (Bundle) ecr.a(parcel, Bundle.CREATOR), (DataHolder) ecr.a(parcel, DataHolder.CREATOR));
                return true;
            case 3:
                parcel.readInt();
                throw new RuntimeException("Shouldn't be called");
            case 4:
                parcel.readInt();
                return true;
            case 5:
                b(parcel.readInt(), (Bundle) ecr.a(parcel, Bundle.CREATOR), (ParcelFileDescriptor) ecr.a(parcel, ParcelFileDescriptor.CREATOR), (Bundle) ecr.a(parcel, Bundle.CREATOR));
                return true;
            case 6:
                parcel.readInt();
                return true;
            case 7:
                parcel.readInt();
                return true;
            case 8:
                parcel.readInt();
                return true;
            default:
                return false;
        }
    }
}
