package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rrs extends rrb {
    final /* synthetic */ GetClientTokenRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrs(qof qofVar, GetClientTokenRequest getClientTokenRequest) {
        super(qofVar);
        this.a = getClientTokenRequest;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ qom a(Status status) {
        return new rrk(status, new GetClientTokenResponse(new byte[0]));
    }

    @Override // defpackage.rrb, defpackage.qpb
    protected final /* bridge */ /* synthetic */ void c(qnq qnqVar) {
        rrr rrrVar = (rrr) qnqVar;
        GetClientTokenRequest getClientTokenRequest = this.a;
        rrq rrqVar = new rrq(this);
        Bundle k = rrr.k(rrrVar.b, rrrVar.a.getPackageName(), rrrVar.c, rrrVar.d, rrrVar.e);
        try {
            rro rroVar = (rro) rrrVar.D();
            Parcel pn = rroVar.pn();
            ecr.g(pn, getClientTokenRequest);
            ecr.g(pn, k);
            ecr.i(pn, rrqVar);
            rroVar.pq(15, pn);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting client token", e);
            rrqVar.b(Status.c, new GetClientTokenResponse(new byte[0]));
        }
    }
}
