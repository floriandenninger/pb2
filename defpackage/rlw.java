package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rlw extends ecq implements IInterface {
    public rlw() {
        super("com.google.android.gms.mobiledataplan.internal.IMobileDataPlanCallbacks");
    }

    public void a(Status status, MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a((Status) ecr.a(parcel, Status.CREATOR), (MdpCarrierPlanIdResponse) ecr.a(parcel, MdpCarrierPlanIdResponse.CREATOR));
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
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
