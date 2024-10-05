package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tyh implements tya, udr {
    private final twn a;
    private final udw b;
    private final uds c;
    private final Set d;
    private final tzo e;
    private final udg f;
    private final tzh g;

    public tyh(twn twnVar, udg udgVar, udw udwVar, uds udsVar, Set set, tzh tzhVar, tzo tzoVar) {
        this.a = twnVar;
        this.f = udgVar;
        this.b = udwVar;
        this.c = udsVar;
        this.d = set;
        this.g = tzhVar;
        this.e = tzoVar;
    }

    @Override // defpackage.tya
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    @Override // defpackage.tya
    public final void b(Intent intent, twd twdVar, long j) {
        aokm aokmVar;
        tzk.e("RestartIntentHandler", "Re-surface notifications and sync registrations due to Restart Intent", new Object[0]);
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) && axrx.a.get().c()) {
            this.g.b(aohx.BOOT_COMPLETED).i();
        }
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction()) && axrx.a.get().b()) {
            this.g.b(aohx.APP_UPDATED).i();
        }
        two twoVar = this.a.d;
        if (twoVar != null) {
            int i = twoVar.m;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                this.b.b();
            } else if (i2 == 1) {
                if (axsm.a.get().d()) {
                    try {
                        this.c.a(null, 10, this, new Bundle());
                    } catch (udq unused) {
                        tzk.g("RestartIntentHandler", "Unable to schedule task for refreshing notifications.", new Object[0]);
                    }
                } else {
                    this.b.a(twdVar);
                }
            }
        }
        amxd listIterator = ((amvs) this.d).listIterator();
        while (listIterator.hasNext()) {
            ((ucp) listIterator.next()).a();
        }
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction())) {
            aokmVar = aokm.APP_UPDATED;
        } else {
            aokmVar = aokm.DEVICE_START;
        }
        this.f.a(aokmVar);
        this.e.a();
    }

    @Override // defpackage.tya
    public final boolean c(Intent intent) {
        return "android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction());
    }

    @Override // defpackage.udr
    public final /* synthetic */ long d() {
        return 0L;
    }

    @Override // defpackage.udr
    public final twc e(Bundle bundle) {
        this.b.a(twd.b());
        return twc.a;
    }

    @Override // defpackage.udr
    public final String f() {
        return "restart_job_handler_key";
    }

    @Override // defpackage.udr
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.udr
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.udr
    public final /* synthetic */ void i() {
    }
}
