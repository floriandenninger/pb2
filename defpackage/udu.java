package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class udu implements anhh {
    final /* synthetic */ twu a;
    final /* synthetic */ int b;
    final /* synthetic */ udv c;

    public udu(udv udvVar, twu twuVar, int i) {
        this.c = udvVar;
        this.a = twuVar;
        this.b = i;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
        Object[] objArr = new Object[3];
        objArr[0] = this.c.a.getApplicationContext().getPackageName();
        udv udvVar = this.c;
        twu twuVar = this.a;
        objArr[1] = udvVar.e(twuVar == null ? null : twuVar.a, this.b);
        objArr[2] = Integer.valueOf(this.b);
        tzk.a("ChimeTaskSchedulerApiImpl", "Successfully scheduled a job for package [%s], with ID: %s, type: %s", objArr);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        Object[] objArr = new Object[3];
        objArr[0] = this.c.a.getApplicationContext().getPackageName();
        udv udvVar = this.c;
        twu twuVar = this.a;
        objArr[1] = udvVar.e(twuVar == null ? null : twuVar.a, this.b);
        objArr[2] = Integer.valueOf(this.b);
        if (tzk.b.d(5)) {
            Log.w("Notifications", nbm.c("ChimeTaskSchedulerApiImpl", "Failed to schedule a job for package [%s] with ID: %s, type: %s", objArr));
        }
    }
}
