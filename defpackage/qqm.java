package defpackage;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qqm extends qpf {
    public rpv d;

    public qqm(qqf qqfVar) {
        super(qqfVar, qmy.a);
        this.d = new rpv();
        this.e.c("GmsAvailabilityHelper", this);
    }

    @Override // defpackage.qpf
    protected final void f(ConnectionResult connectionResult, int i) {
        String str = connectionResult.e;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        this.d.a(new qnx(new Status(connectionResult, str, connectionResult.c)));
    }

    @Override // defpackage.qpf
    protected final void g() {
        Activity a = this.e.a();
        if (a == null) {
            this.d.c(new qnx(new Status(8)));
            return;
        }
        int g = this.c.g(a);
        if (g == 0) {
            this.d.d(null);
        } else {
            if (this.d.a.j()) {
                return;
            }
            o(new ConnectionResult(g, null));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void n() {
        this.d.c(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public final void o(ConnectionResult connectionResult) {
        a(connectionResult, 0);
    }
}
