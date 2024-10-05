package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.AccountControllerImpl$AccountControllerLifecycleObserver;
import com.google.apps.tiktok.account.api.controller.ActivityAccountState;
import defpackage.aac;
import defpackage.alwq;
import defpackage.alwr;
import defpackage.alws;
import defpackage.alxd;
import defpackage.alyh;
import defpackage.alym;
import defpackage.amkq;
import defpackage.amru;
import defpackage.amxh;
import defpackage.anaf;
import defpackage.anhy;
import defpackage.any;
import defpackage.aok;
import defpackage.aomw;
import defpackage.aone;
import defpackage.uqq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AccountControllerImpl$AccountControllerLifecycleObserver implements any, alxd {
    public final /* synthetic */ alwr a;
    private boolean b;
    private boolean c = false;
    private Bundle d;

    public AccountControllerImpl$AccountControllerLifecycleObserver(alwr alwrVar) {
        this.a = alwrVar;
    }

    @Override // defpackage.alxd
    public final anhy g() {
        alwr alwrVar = this.a;
        alwrVar.n = true;
        if (alwrVar.m || alwrVar.b.g() || this.a.b.f()) {
            return anaf.O(null);
        }
        return this.a.e();
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        String sb;
        alwq alwqVar = this.a.b;
        final int i = 1;
        aac aacVar = new aac(this) { // from class: alwp
            public final /* synthetic */ AccountControllerImpl$AccountControllerLifecycleObserver a;

            {
                this.a = this;
            }

            @Override // defpackage.aac
            public final void a(Object obj) {
                Throwable th;
                Class cls;
                if (i == 0) {
                    ActivityResult activityResult = (ActivityResult) obj;
                    alwr alwrVar = this.a.a;
                    int i2 = activityResult.a;
                    Intent intent = activityResult.b;
                    if (i2 == -1) {
                        alwrVar.k(AccountId.b(intent.getIntExtra("new_account_id", -1)));
                    } else {
                        if (intent != null) {
                            if (intent.getBooleanExtra("restart_account_selector", false)) {
                                alwrVar.f();
                                amkq.O(alwrVar.k.b, "Activity not configured for account selection.");
                                amil l = amjw.l("Switch Account Interactive");
                                try {
                                    amru amruVar = alwrVar.k.c;
                                    int i3 = ((amvj) amruVar).c - 1;
                                    while (true) {
                                        if (i3 < 0) {
                                            cls = null;
                                            break;
                                        } else {
                                            if (alxn.class.isAssignableFrom((Class) amruVar.get(i3))) {
                                                cls = (Class) amruVar.get(i3);
                                                break;
                                            }
                                            i3--;
                                        }
                                    }
                                    amkq.O(cls != null, "No interactive selector found.");
                                    amru r = amru.r(cls);
                                    r.getClass();
                                    amkq.N(true ^ r.isEmpty());
                                    int i4 = ((amvj) r).c;
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        Class cls2 = (Class) r.get(i5);
                                        amkq.J(alxn.class.isAssignableFrom(cls2), "selector %s is not an interactive selector", cls2);
                                    }
                                    alwrVar.i(null, alwrVar.e.a(alxo.a(alwrVar.b.a()), r));
                                    l.close();
                                    alwrVar.g();
                                } catch (Throwable th2) {
                                    try {
                                        l.close();
                                    } catch (Throwable unused) {
                                    }
                                    throw th2;
                                }
                            }
                        }
                        th = intent != null ? (Throwable) intent.getSerializableExtra("account_error") : null;
                        ActivityAccountState activityAccountState = alwrVar.c;
                        if (th == null) {
                            th = new alxa();
                        }
                        activityAccountState.m(th);
                        alwrVar.g();
                    }
                    alwrVar.j();
                    return;
                }
                ActivityResult activityResult2 = (ActivityResult) obj;
                alwr alwrVar2 = this.a.a;
                int i6 = activityResult2.a;
                Intent intent2 = activityResult2.b;
                if (i6 == -1) {
                    alwrVar2.k(AccountId.b(intent2.getIntExtra("new_account_id", -1)));
                } else {
                    if (!alwrVar2.c.j()) {
                        th = intent2 != null ? (Throwable) intent2.getSerializableExtra("account_error") : null;
                        ActivityAccountState activityAccountState2 = alwrVar2.c;
                        if (th == null) {
                            th = new alxa();
                        }
                        activityAccountState2.m(th);
                    }
                    alwrVar2.g();
                }
                alwrVar2.j();
            }
        };
        boolean z = false;
        z = false;
        final int i2 = z ? 1 : 0;
        alwqVar.d(aacVar, new aac(this) { // from class: alwp
            public final /* synthetic */ AccountControllerImpl$AccountControllerLifecycleObserver a;

            {
                this.a = this;
            }

            @Override // defpackage.aac
            public final void a(Object obj) {
                Throwable th;
                Class cls;
                if (i2 == 0) {
                    ActivityResult activityResult = (ActivityResult) obj;
                    alwr alwrVar = this.a.a;
                    int i22 = activityResult.a;
                    Intent intent = activityResult.b;
                    if (i22 == -1) {
                        alwrVar.k(AccountId.b(intent.getIntExtra("new_account_id", -1)));
                    } else {
                        if (intent != null) {
                            if (intent.getBooleanExtra("restart_account_selector", false)) {
                                alwrVar.f();
                                amkq.O(alwrVar.k.b, "Activity not configured for account selection.");
                                amil l = amjw.l("Switch Account Interactive");
                                try {
                                    amru amruVar = alwrVar.k.c;
                                    int i3 = ((amvj) amruVar).c - 1;
                                    while (true) {
                                        if (i3 < 0) {
                                            cls = null;
                                            break;
                                        } else {
                                            if (alxn.class.isAssignableFrom((Class) amruVar.get(i3))) {
                                                cls = (Class) amruVar.get(i3);
                                                break;
                                            }
                                            i3--;
                                        }
                                    }
                                    amkq.O(cls != null, "No interactive selector found.");
                                    amru r = amru.r(cls);
                                    r.getClass();
                                    amkq.N(true ^ r.isEmpty());
                                    int i4 = ((amvj) r).c;
                                    for (int i5 = 0; i5 < i4; i5++) {
                                        Class cls2 = (Class) r.get(i5);
                                        amkq.J(alxn.class.isAssignableFrom(cls2), "selector %s is not an interactive selector", cls2);
                                    }
                                    alwrVar.i(null, alwrVar.e.a(alxo.a(alwrVar.b.a()), r));
                                    l.close();
                                    alwrVar.g();
                                } catch (Throwable th2) {
                                    try {
                                        l.close();
                                    } catch (Throwable unused) {
                                    }
                                    throw th2;
                                }
                            }
                        }
                        th = intent != null ? (Throwable) intent.getSerializableExtra("account_error") : null;
                        ActivityAccountState activityAccountState = alwrVar.c;
                        if (th == null) {
                            th = new alxa();
                        }
                        activityAccountState.m(th);
                        alwrVar.g();
                    }
                    alwrVar.j();
                    return;
                }
                ActivityResult activityResult2 = (ActivityResult) obj;
                alwr alwrVar2 = this.a.a;
                int i6 = activityResult2.a;
                Intent intent2 = activityResult2.b;
                if (i6 == -1) {
                    alwrVar2.k(AccountId.b(intent2.getIntExtra("new_account_id", -1)));
                } else {
                    if (!alwrVar2.c.j()) {
                        th = intent2 != null ? (Throwable) intent2.getSerializableExtra("account_error") : null;
                        ActivityAccountState activityAccountState2 = alwrVar2.c;
                        if (th == null) {
                            th = new alxa();
                        }
                        activityAccountState2.m(th);
                    }
                    alwrVar2.g();
                }
                alwrVar2.j();
            }
        });
        alwr alwrVar = this.a;
        if (alwrVar.k == null) {
            alwrVar.k = alyh.a().a();
        }
        if (this.a.b.a().hasExtra("$tiktok$for_requirement_activity")) {
            amru b = this.a.e.b();
            if (b.isEmpty()) {
                sb = "";
            } else {
                String valueOf = String.valueOf(b);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 15);
                sb2.append(" Requirements: ");
                sb2.append(valueOf);
                sb = sb2.toString();
            }
            String valueOf2 = String.valueOf(sb);
            IllegalStateException illegalStateException = new IllegalStateException(valueOf2.length() != 0 ? "Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?".concat(valueOf2) : new String("Requirement activity's AccountController should be set up with an empty list of account requirements. Did you forget to set the AccountController with Config.forRequirementActivity?"));
            if (this.a.h) {
                ((amxh) ((amxh) ((amxh) alwr.a.f()).h(illegalStateException)).i("com/google/apps/tiktok/account/api/controller/AccountControllerImpl$AccountControllerLifecycleObserver", "onCreate", (char) 560, "AccountControllerImpl.java")).q("The requirement activity bit is set while the requirements are not overridden with an empty list. If the activity is not a requirement Activity, then it's likely the app is started by another malicious app which sets the requirement activity bit in the Intent");
            } else {
                throw illegalStateException;
            }
        }
        Bundle a = this.a.p.getSavedStateRegistry().c ? this.a.p.getSavedStateRegistry().a("tiktok_account_controller_saved_instance_state") : null;
        this.d = a;
        if (a == null || (!this.a.g && a.getBoolean("tiktok_accounts_disabled"))) {
            z = true;
        }
        this.b = z;
        if (z) {
            alwr alwrVar2 = this.a;
            aone createBuilder = alws.a.createBuilder();
            createBuilder.copyOnWrite();
            alws alwsVar = (alws) createBuilder.instance;
            alwsVar.b = 1 | alwsVar.b;
            alwsVar.c = -1;
            alwrVar2.l = (alws) createBuilder.build();
            alwr alwrVar3 = this.a;
            alwrVar3.o = alwrVar3.d(alwrVar3.k.c);
        } else {
            this.a.l = (alws) amkq.ck(this.d, "state_latest_operation", alws.a, aomw.a());
            this.a.m = this.d.getBoolean("state_pending_op");
        }
        alwr alwrVar4 = this.a;
        alwrVar4.d.g(alwrVar4.j);
        this.a.f.a(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.a.f.b(this);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void nu(aok aokVar) {
        this.a.j();
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        if (this.c) {
            this.a.j();
            return;
        }
        this.c = true;
        if (this.b) {
            amkq.F(true ^ this.a.c.j(), "Should not have account before initial start.");
            alwr alwrVar = this.a;
            alwrVar.o.getClass();
            Bundle bundle = this.d;
            if (bundle != null && !alwrVar.g && bundle.getBoolean("tiktok_accounts_disabled")) {
                this.a.c.h();
            }
            alwr alwrVar2 = this.a;
            alwrVar2.h(alwrVar2.o);
            this.a.o = null;
        } else {
            ActivityAccountState activityAccountState = this.a.c;
            AccountId b = AccountId.b(activityAccountState.g());
            ActivityAccountState activityAccountState2 = this.a.c;
            uqq.j();
            alym alymVar = activityAccountState2.e;
            activityAccountState.i();
            if (activityAccountState.j()) {
                activityAccountState.a.a(b, alymVar);
            }
            this.a.n = this.d.getBoolean("state_do_not_revalidate");
            this.a.j();
        }
        Bundle bundle2 = this.d;
        if (bundle2 != null && this.a.g && !bundle2.getBoolean("tiktok_accounts_disabled")) {
            this.a.c.l();
        }
        this.d = null;
    }
}
