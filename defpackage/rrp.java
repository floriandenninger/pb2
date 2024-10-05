package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rrp extends ecq implements IInterface {
    public rrp() {
        super("com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    public void a(Status status) {
    }

    public void b(Status status, GetClientTokenResponse getClientTokenResponse) {
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                parcel.readInt();
                return true;
            case 2:
                parcel.readInt();
                return true;
            case 3:
                parcel.readInt();
                ecr.j(parcel);
                return true;
            case 4:
                parcel.readInt();
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                ecr.j(parcel);
                return true;
            case 7:
                return true;
            case 8:
                Status status = (Status) ecr.a(parcel, Status.CREATOR);
                a(status);
                return true;
            case 9:
                ecr.j(parcel);
                return true;
            case 10:
                Status status2 = (Status) ecr.a(parcel, Status.CREATOR);
                GetClientTokenResponse getClientTokenResponse = (GetClientTokenResponse) ecr.a(parcel, GetClientTokenResponse.CREATOR);
                b(status2, getClientTokenResponse);
                return true;
            case 11:
                return true;
            case 12:
                return true;
            case 13:
                return true;
            case 14:
                return true;
            case 15:
                return true;
            case 16:
                return true;
            case 17:
                return true;
            case 18:
                parcel.readInt();
                return true;
            case 19:
                return true;
        }
    }
}
