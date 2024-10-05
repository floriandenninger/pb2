package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qrw extends qrn {
    final /* synthetic */ qrx g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrw(qrx qrxVar, int i) {
        super(qrxVar, i, null);
        this.g = qrxVar;
    }

    @Override // defpackage.qrn
    protected final void a(ConnectionResult connectionResult) {
        this.g.v.a(connectionResult);
        this.g.q();
    }

    @Override // defpackage.qrn
    protected final boolean c() {
        this.g.v.a(ConnectionResult.a);
        return true;
    }
}
