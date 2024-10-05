package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.libraries.notifications.scheduled.impl.workmanager.ChimeScheduledTaskWorker;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class udv implements uds {
    public final Context a;
    private final udt b;

    public udv(Context context, udt udtVar) {
        this.a = context;
        this.b = udtVar;
    }

    private final void f(twu twuVar, int i, udr udrVar, Bundle bundle, long j) {
        byte[] marshall;
        bzd g;
        HashMap hashMap = new HashMap();
        bxw.d("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER", udrVar.f(), hashMap);
        if (bundle.isEmpty()) {
            marshall = null;
        } else {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            marshall = obtain.marshall();
            obtain.recycle();
        }
        if (marshall != null) {
            bxw.c("notifications.scheduled.impl.workmanager.extraskey", marshall, hashMap);
        }
        byn bynVar = new byn();
        udrVar.i();
        bynVar.c = 2;
        byo a = bynVar.a();
        String e = e(twuVar != null ? twuVar.a : null, i);
        if (udrVar.g()) {
            byr a2 = bxw.a(hashMap);
            bze bzeVar = new bze(ChimeScheduledTaskWorker.class, udrVar.d(), TimeUnit.MILLISECONDS);
            bzeVar.f(a2);
            bzeVar.d(a);
            udrVar.h();
            g = caj.h(this.a).f(e, 1, bzeVar.b());
        } else {
            byr a3 = bxw.a(hashMap);
            byz byzVar = new byz(ChimeScheduledTaskWorker.class);
            byzVar.f(a3);
            byzVar.d(a);
            if (j != 0) {
                byzVar.e(j, TimeUnit.MILLISECONDS);
            }
            udrVar.h();
            g = caj.h(this.a).g(e, 1, byzVar.b());
        }
        anaf.Y(((bzp) g).c, new udu(this, twuVar, i), angq.a);
    }

    @Override // defpackage.uds
    public final void a(twu twuVar, int i, udr udrVar, Bundle bundle) {
        f(twuVar, i, udrVar, bundle, 0L);
    }

    @Override // defpackage.uds
    public final void b(twu twuVar, int i, udr udrVar, Bundle bundle, long j) {
        amkq.I(j > 0, "Scheduled job minimumLatencyMs must be > 0, got: %s.", j);
        f(twuVar, i, udrVar, bundle, j);
    }

    @Override // defpackage.uds
    public final boolean d() {
        caj h = caj.h(this.a);
        ceb cebVar = new ceb(h, e(null, 7));
        h.i.a.execute(cebVar);
        try {
            List list = (List) cebVar.c.get();
            return (list == null || list.isEmpty()) ? false : true;
        } catch (InterruptedException | ExecutionException e) {
            tzk.c("ChimeTaskSchedulerApiImpl", e, "Failed to check pending WorkInfos.", new Object[0]);
            return false;
        }
    }

    public final String e(Long l, int i) {
        long j;
        udt udtVar = this.b;
        if (l != null) {
            j = l.longValue();
            amkq.I(j >= 0, "accountId must be >= 0, got: %s.", j);
            amkq.I(j <= 998, "accountId must be <= 998, got: %s.", j);
        } else {
            j = 999;
        }
        amkq.H(true, "jobType must be >= 0, got: %s.", i);
        amkq.H(true, "jobType must be <= 999, got: %s.", i);
        return Integer.toString(udtVar.a.g.intValue() + (i * 1000) + ((int) j));
    }

    @Override // defpackage.uds
    public final void c(twu twuVar) {
        String e = e(twuVar == null ? null : twuVar.a, 5);
        tzk.a("ChimeTaskSchedulerApiImpl", "Cancelling a scheduled work request for package [%s] with ID: %s, type: %s", this.a.getApplicationContext().getPackageName(), e, 5);
        caj.h(this.a).e(e);
    }
}
