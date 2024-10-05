package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.AutoValue_AccountId;
import com.google.apps.tiktok.account.api.controller.AccountActionResult;
import com.google.apps.tiktok.account.api.controller.AccountControllerImpl$AccountControllerLifecycleObserver;
import com.google.apps.tiktok.account.api.controller.ActivityAccountState;
import com.google.apps.tiktok.tracing.contrib.androidx.TracedDefaultLifecycleObserver;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alwr extends alwk {
    public static final amxj a = amxj.l("com/google/apps/tiktok/account/api/controller/AccountControllerImpl");
    public final alwq b;
    public final ActivityAccountState c;
    public final amcf d;
    public final alyc e;
    public final alxe f;
    public final boolean g;
    public final boolean h;
    public final aomw i;
    public final amcg j = new alwm(this);
    public alyh k;
    public alws l;
    public boolean m;
    public boolean n;
    public anhy o;
    public final ames p;
    private final alxt q;

    public alwr(ames amesVar, final alwq alwqVar, ActivityAccountState activityAccountState, amcf amcfVar, alxt alxtVar, alyc alycVar, alxe alxeVar, aomw aomwVar, ammv ammvVar) {
        this.p = amesVar;
        this.b = alwqVar;
        this.c = activityAccountState;
        this.d = amcfVar;
        this.q = alxtVar;
        this.e = alycVar;
        this.f = alxeVar;
        this.i = aomwVar;
        Boolean bool = false;
        this.g = bool.booleanValue();
        this.h = ((Boolean) ammvVar.e(bool)).booleanValue();
        Object obj = activityAccountState.c;
        amkq.N(obj == null || obj == this);
        activityAccountState.c = this;
        amesVar.getLifecycle().b(new TracedDefaultLifecycleObserver(new AccountControllerImpl$AccountControllerLifecycleObserver(this)));
        amesVar.getSavedStateRegistry().b("tiktok_account_controller_saved_instance_state", new bub() { // from class: alwl
            @Override // defpackage.bub
            public final Bundle a() {
                alwr alwrVar = alwr.this;
                alwq alwqVar2 = alwqVar;
                Bundle bundle = new Bundle();
                bundle.putBoolean("state_pending_op", alwrVar.m);
                amkq.cn(bundle, "state_latest_operation", alwrVar.l);
                boolean z = true;
                if (!alwrVar.n && alwqVar2.e()) {
                    z = false;
                }
                bundle.putBoolean("state_do_not_revalidate", z);
                bundle.putBoolean("tiktok_accounts_disabled", alwrVar.g);
                return bundle;
            }
        });
    }

    private final alws l(AccountId accountId) {
        int i = this.l.c;
        int i2 = i == Integer.MAX_VALUE ? 0 : i + 1;
        aone createBuilder = alws.a.createBuilder();
        createBuilder.copyOnWrite();
        alws alwsVar = (alws) createBuilder.instance;
        alwsVar.b |= 1;
        alwsVar.c = i2;
        if (accountId != null) {
            int i3 = ((AutoValue_AccountId) accountId).a;
            createBuilder.copyOnWrite();
            alws alwsVar2 = (alws) createBuilder.instance;
            alwsVar2.b |= 2;
            alwsVar2.d = i3;
        }
        alws alwsVar3 = (alws) createBuilder.build();
        this.l = alwsVar3;
        return alwsVar3;
    }

    @Override // defpackage.alwk
    public final alwk a(alyh alyhVar) {
        f();
        amkq.O(this.k == null, "Config can be set once, in the constructor only.");
        this.k = alyhVar;
        return this;
    }

    @Override // defpackage.alwk
    public final void b(amru amruVar) {
        amruVar.getClass();
        amkq.N(!amruVar.isEmpty());
        amil l = amjw.l("Switch Account With Custom Selectors");
        try {
            h(d(amruVar));
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.alwk
    public final void c(alxs alxsVar) {
        f();
        alxt alxtVar = this.q;
        alxtVar.b.add(alxsVar);
        Collections.shuffle(alxtVar.b, alxtVar.c);
    }

    public final anhy d(amru amruVar) {
        alxo a2 = alxo.a(this.b.a());
        this.n = false;
        final alyc alycVar = this.e;
        final anhy a3 = alycVar.a(a2, amruVar);
        final Intent a4 = this.b.a();
        return anfq.i(a3, amjk.c(new anfz() { // from class: alxv
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                AccountId accountId;
                AccountActionResult accountActionResult = (AccountActionResult) obj;
                return (accountActionResult.c != null || (accountId = accountActionResult.a) == null) ? a3 : alyc.this.c(accountId, a4);
            }
        }), angq.a);
    }

    public final anhy e() {
        if (!this.n) {
            return anaf.O(null);
        }
        this.n = false;
        amil l = amjw.l("Revalidate Account");
        try {
            int g = this.c.g();
            if (g != -1) {
                AccountId b = AccountId.b(g);
                anhy c = this.e.c(b, this.b.a());
                l.a(c);
                i(b, c);
                l.close();
                return c;
            }
            anhy O = anaf.O(null);
            l.close();
            return O;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void f() {
        amkq.O(!this.g, "Attempted to use the account controller when accounts are disabled");
    }

    public final void g() {
        this.m = false;
        if (this.c.j()) {
            return;
        }
        this.n = false;
    }

    public final void h(anhy anhyVar) {
        if (!anhyVar.isDone()) {
            this.c.n();
            i(null, anhyVar);
            return;
        }
        this.c.l();
        try {
            this.j.b(amkq.cl(l(null)), (AccountActionResult) anaf.W(anhyVar));
        } catch (ExecutionException e) {
            this.j.a(amkq.cl(l(null)), e.getCause());
        }
    }

    public final void i(AccountId accountId, anhy anhyVar) {
        alws l = l(accountId);
        this.m = true;
        try {
            this.d.h(new amce(anhyVar), new qqe(amkq.cl(l)), this.j);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Cannot switch account before Activity resumes.", e);
        }
    }

    public final void j() {
        if (this.m) {
            return;
        }
        e();
    }

    public final void k(AccountId accountId) {
        amil l = amjw.l("Switch Account");
        try {
            this.n = false;
            anhy c = this.e.c(accountId, this.b.a());
            if (!c.isDone() && ((AutoValue_AccountId) accountId).a != this.c.g()) {
                this.c.n();
            }
            l.a(c);
            i(accountId, c);
            l.close();
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
