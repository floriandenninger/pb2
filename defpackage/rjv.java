package defpackage;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rjv {
    final /* synthetic */ rjw a;

    public rjv(rjw rjwVar) {
        this.a = rjwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.a.n();
        rgc M = this.a.M();
        this.a.Q();
        if (M.h(System.currentTimeMillis())) {
            this.a.M().k.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.aF().k.a("Detected application was in foreground");
                this.a.Q();
                c(System.currentTimeMillis(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j, boolean z) {
        this.a.n();
        this.a.o();
        if (this.a.M().h(j)) {
            this.a.M().k.a(true);
        }
        this.a.M().n.b(j);
        if (this.a.M().k.b()) {
            c(j, z);
        }
    }

    final void c(long j, boolean z) {
        this.a.n();
        if (this.a.w.v()) {
            this.a.M().n.b(j);
            this.a.Q();
            this.a.aF().k.b("Session started, time", Long.valueOf(SystemClock.elapsedRealtime()));
            Long valueOf = Long.valueOf(j / 1000);
            this.a.j().U("auto", "_sid", valueOf, j);
            this.a.M().k.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.a.J().o(rfd.af) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.a.j().w("auto", "_s", j, bundle);
            axum.b();
            if (this.a.J().o(rfd.aj)) {
                String a = this.a.M().s.a();
                if (TextUtils.isEmpty(a)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a);
                this.a.j().w("auto", "_ssr", j, bundle2);
            }
        }
    }
}
