package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class qlu extends ecq implements IInterface {
    public qlu() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                b((Status) ecr.a(parcel, Status.CREATOR));
                return true;
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                parcel.readLong();
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                parcel.readLong();
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            case 7:
                throw new UnsupportedOperationException();
            case 8:
                a((Status) ecr.a(parcel, Status.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
