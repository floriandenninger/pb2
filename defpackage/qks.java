package defpackage;

import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qks extends ecq implements qkt {
    public qks() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                i(parcel.readInt());
                return true;
            case 2:
                a((ApplicationMetadata) ecr.a(parcel, ApplicationMetadata.CREATOR), parcel.readString(), parcel.readString(), ecr.j(parcel));
                return true;
            case 3:
                b(parcel.readInt());
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                ecr.j(parcel);
                n();
                return true;
            case 5:
                k(parcel.readString(), parcel.readString());
                return true;
            case 6:
                parcel.readString();
                o(parcel.createByteArray());
                return true;
            case 7:
                d(parcel.readInt());
                return true;
            case 8:
                f(parcel.readInt());
                return true;
            case 9:
                c(parcel.readInt());
                return true;
            case 10:
                parcel.readString();
                m(parcel.readLong(), parcel.readInt());
                return true;
            case 11:
                parcel.readString();
                l(parcel.readLong());
                return true;
            case 12:
                e((ApplicationStatus) ecr.a(parcel, ApplicationStatus.CREATOR));
                return true;
            case 13:
                h((DeviceStatus) ecr.a(parcel, DeviceStatus.CREATOR));
                return true;
            case 14:
                g(parcel.readInt());
                return true;
            case 15:
                j(parcel.readInt());
                return true;
            default:
                return false;
        }
    }
}
