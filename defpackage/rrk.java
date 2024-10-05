package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rrk implements qom {
    public final GetClientTokenResponse a;
    private final Status b;

    public rrk(Status status, GetClientTokenResponse getClientTokenResponse) {
        this.b = status;
        this.a = getClientTokenResponse;
    }

    @Override // defpackage.qom
    public final Status a() {
        return this.b;
    }
}
