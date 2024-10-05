package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdisync.internal.SyncResult;
import com.google.android.gms.potokens.PoToken;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qdm extends ecq implements IInterface {
    final /* synthetic */ rpv a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdm(rpv rpvVar, int i, short[] sArr) {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
        this.b = i;
        this.a = rpvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdm(rpv rpvVar, int i, byte[] bArr) {
        super("com.google.android.gms.auth.account.data.IBundleCallback");
        this.b = i;
        this.a = rpvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdm(rpv rpvVar, int i) {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
        this.b = i;
        this.a = rpvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdm(rpv rpvVar, int i, char[] cArr) {
        super("com.google.android.gms.auth.account.data.IGetAccountsCallback");
        this.b = i;
        this.a = rpvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdm(rpv rpvVar, int i, int[] iArr) {
        super("com.google.android.gms.auth.account.data.IHasCapabilitiesCallback");
        this.b = i;
        this.a = rpvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdm(rpv rpvVar, int i, boolean[] zArr) {
        super("com.google.android.gms.cast.firstparty.internal.ICastSettingsCallback");
        this.b = i;
        this.a = rpvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdm(rpv rpvVar, int i, float[] fArr) {
        super("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
        this.b = i;
        this.a = rpvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdm(rpv rpvVar, int i, byte[][] bArr) {
        super("com.google.android.gms.potokens.internal.ITokenCallbacks");
        this.b = i;
        this.a = rpvVar;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.b) {
            case 0:
                if (i != 2) {
                    return false;
                }
                qdw.a((Status) ecr.a(parcel, Status.CREATOR), (AccountChangeEventsResponse) ecr.a(parcel, AccountChangeEventsResponse.CREATOR), this.a);
                return true;
            case 1:
                if (i != 2) {
                    return false;
                }
                qdw.a((Status) ecr.a(parcel, Status.CREATOR), (Bundle) ecr.a(parcel, Bundle.CREATOR), this.a);
                return true;
            case 2:
                if (i != 2) {
                    return false;
                }
                qdw.a((Status) ecr.a(parcel, Status.CREATOR), parcel.createTypedArrayList(Account.CREATOR), this.a);
                return true;
            case 3:
                if (i != 2) {
                    return false;
                }
                qdw.a((Status) ecr.a(parcel, Status.CREATOR), (Bundle) ecr.a(parcel, Bundle.CREATOR), this.a);
                return true;
            case 4:
                if (i != 2) {
                    return false;
                }
                qdw.a((Status) ecr.a(parcel, Status.CREATOR), Integer.valueOf(parcel.readInt()), this.a);
                return true;
            case 5:
                if (i != 1) {
                    return false;
                }
                qar.o(Status.a, (Bundle) ecr.a(parcel, Bundle.CREATOR), this.a);
                return true;
            case 6:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) ecr.a(parcel, Status.CREATOR);
                qar.p(status, status.c() ? ((SyncResult) ecr.a(parcel, SyncResult.CREATOR)).a : null, this.a);
                return true;
            default:
                if (i != 2) {
                    return false;
                }
                Status status2 = (Status) ecr.a(parcel, Status.CREATOR);
                PoToken poToken = (PoToken) ecr.a(parcel, PoToken.CREATOR);
                qar.o(status2, poToken != null ? poToken.a : null, this.a);
                return true;
        }
    }
}
