package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rrq extends rrp {
    private final qpc a;

    public rrq(qpc qpcVar) {
        this.a = qpcVar;
    }

    @Override // defpackage.rrp
    public final void b(Status status, GetClientTokenResponse getClientTokenResponse) {
        this.a.d(new rrk(status, getClientTokenResponse));
    }
}
