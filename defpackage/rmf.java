package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rmf extends ecq implements IInterface {
    public rmf() {
        super("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status, OpenFileDescriptorResponse openFileDescriptorResponse) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            b((Status) ecr.a(parcel, Status.CREATOR), (OpenFileDescriptorResponse) ecr.a(parcel, OpenFileDescriptorResponse.CREATOR));
        } else if (i == 2) {
            a((Status) ecr.a(parcel, Status.CREATOR));
        } else {
            if (i != 3) {
                return false;
            }
            c((Status) ecr.a(parcel, Status.CREATOR));
        }
        return true;
    }
}
