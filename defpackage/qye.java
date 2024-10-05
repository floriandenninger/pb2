package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class qye extends ecq implements IInterface {
    public qye() {
        super("com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback");
    }

    public void a(Status status, GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((Status) ecr.a(parcel, Status.CREATOR), (GmsDeviceComplianceResponse) ecr.a(parcel, GmsDeviceComplianceResponse.CREATOR));
        return true;
    }
}
