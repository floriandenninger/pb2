package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qrn extends qrr {
    public final int a;
    public final Bundle b;
    final /* synthetic */ qrx c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrn(qrx qrxVar, int i, Bundle bundle) {
        super(qrxVar, true);
        this.c = qrxVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(ConnectionResult connectionResult);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrr
    public final void b() {
    }

    protected abstract boolean c();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrr
    public final /* bridge */ /* synthetic */ void d() {
        if (this.a != 0) {
            this.c.k(1, null);
            Bundle bundle = this.b;
            a(new ConnectionResult(this.a, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (c()) {
                return;
            }
            this.c.k(1, null);
            a(new ConnectionResult(8, null));
        }
    }
}
