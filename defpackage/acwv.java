package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acwv {
    public static final String a = zga.a("MDX.CastSdkVersionHelper");
    public final Context b;
    public final qmy c;

    public acwv(Context context, qmy qmyVar) {
        this.b = context;
        this.c = qmyVar;
    }

    public final void a(Activity activity) {
        rpt rptVar;
        qmy qmyVar = this.c;
        qip.as("makeGooglePlayServicesAvailable must be called from the main thread");
        int h = qmyVar.h(activity, 202100000);
        if (h == 0) {
            rptVar = rqr.c(null);
        } else {
            qqf m = qqm.m(activity);
            qqm qqmVar = (qqm) m.b("GmsAvailabilityHelper", qqm.class);
            if (qqmVar != null) {
                if (qqmVar.d.a.j()) {
                    qqmVar.d = new rpv();
                }
            } else {
                qqmVar = new qqm(m);
            }
            qqmVar.o(new ConnectionResult(h, null));
            rptVar = qqmVar.d.a;
        }
        rptVar.n(acwu.a);
    }

    public final boolean b() {
        return this.c.h(this.b, 202100000) == 0;
    }
}
