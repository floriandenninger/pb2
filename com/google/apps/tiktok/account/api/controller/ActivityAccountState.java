package com.google.apps.tiktok.account.api.controller;

import android.os.Bundle;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.ActivityAccountState;
import defpackage.alxs;
import defpackage.alxt;
import defpackage.alye;
import defpackage.alyf;
import defpackage.alym;
import defpackage.amdv;
import defpackage.amdz;
import defpackage.ames;
import defpackage.amil;
import defpackage.amjw;
import defpackage.amkq;
import defpackage.amvs;
import defpackage.amxd;
import defpackage.any;
import defpackage.aok;
import defpackage.aomw;
import defpackage.aoob;
import defpackage.apg;
import defpackage.aph;
import defpackage.axqk;
import defpackage.bub;
import defpackage.ce;
import defpackage.dd;
import defpackage.dn;
import defpackage.uqq;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ActivityAccountState implements any {
    public final alxt a;
    public final boolean b;
    private final aomw h;
    private final amdz i;
    private final ames j;
    private final List g = new ArrayList();
    public Object c = null;
    public int d = -1;
    public alym e = alym.a;
    public int f = 0;

    public ActivityAccountState(ames amesVar, alxt alxtVar, aomw aomwVar, amdz amdzVar) {
        this.j = amesVar;
        this.a = alxtVar;
        this.h = aomwVar;
        Boolean bool = false;
        this.b = bool.booleanValue();
        this.i = amdzVar;
        amesVar.getLifecycle().b(this);
        amesVar.getSavedStateRegistry().b("tiktok_activity_account_state_saved_instance_state", new bub() { // from class: alyd
            @Override // defpackage.bub
            public final Bundle a() {
                ActivityAccountState activityAccountState = ActivityAccountState.this;
                Bundle bundle = new Bundle();
                bundle.putInt("state_account_id", activityAccountState.d);
                amkq.cn(bundle, "state_account_info", activityAccountState.e);
                bundle.putInt("state_account_state", activityAccountState.f);
                bundle.putBoolean("tiktok_accounts_disabled", activityAccountState.b);
                return bundle;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void o(dd ddVar) {
        ddVar.ae(1);
        List<ce> l = ddVar.l();
        if (l == null || l.isEmpty()) {
            return;
        }
        dn k = ddVar.k();
        for (ce ceVar : l) {
            if (!(ceVar instanceof axqk) || !(((axqk) ceVar).lM() instanceof alye)) {
                dd mN = ceVar.mN();
                mN.aa();
                o(mN);
            } else {
                k.m(ceVar);
            }
        }
        if (k.j()) {
            return;
        }
        k.x();
        k.d();
    }

    public final int g() {
        uqq.j();
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        o(this.j.b());
    }

    public final void i() {
        this.j.b().aa();
    }

    public final boolean j() {
        uqq.j();
        return this.d != -1;
    }

    public final boolean k(int i, alym alymVar, int i2) {
        alymVar.getClass();
        uqq.j();
        int i3 = this.d;
        int i4 = this.f;
        if (i != i3 || i2 != i4) {
            i();
        }
        if (i != i3 || (i2 != i4 && this.f != 0)) {
            h();
        }
        if (i != i3) {
            this.d = i;
            amdz amdzVar = this.i;
            AccountId b = AccountId.b(i);
            synchronized (amdzVar.a) {
                Set b2 = amdzVar.b();
                if (!b2.isEmpty()) {
                    AccountId accountId = (AccountId) amkq.bk(b2);
                    synchronized (amdzVar.a) {
                        amkq.N(amdzVar.b.containsKey(accountId));
                        amdzVar.b.remove(accountId);
                        amdv a = amdzVar.c.b.a(accountId);
                        synchronized (a.d) {
                            aph aphVar = a.a;
                            HashSet<String> hashSet = new HashSet(aphVar.b.keySet());
                            hashSet.addAll(aphVar.c.keySet());
                            hashSet.addAll(aphVar.d.keySet());
                            for (String str : hashSet) {
                                aph aphVar2 = a.a;
                                aphVar2.b.remove(str);
                                if (((apg) aphVar2.d.remove(str)) == null) {
                                    a.a.c.remove(str);
                                } else {
                                    throw null;
                                }
                            }
                            a.e = null;
                        }
                    }
                }
                amdzVar.b.put(b, amdzVar.a(b));
            }
        }
        if (this.f == 0) {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((alyf) it.next()).a();
            }
        }
        this.e = alymVar;
        this.f = i2;
        return (i == i3 && i2 == i4) ? false : true;
    }

    public final void l() {
        k(-1, alym.a, 0);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        Bundle a = this.j.getSavedStateRegistry().c ? this.j.getSavedStateRegistry().a("tiktok_activity_account_state_saved_instance_state") : null;
        if (a != null) {
            if (this.b || !a.getBoolean("tiktok_accounts_disabled")) {
                this.d = a.getInt("state_account_id", -1);
                try {
                    this.e = (alym) amkq.cj(a, "state_account_info", alym.a, this.h);
                    int i = a.getInt("state_account_state", 0);
                    this.f = i;
                    if (i != 0) {
                        if (i == 1) {
                            this.a.d();
                        } else if (i == 2) {
                            this.a.b(AccountId.b(this.d), this.e);
                        } else {
                            if (i == 3) {
                                this.a.c();
                                return;
                            }
                            throw new IllegalStateException("Undefined account state. Did you forget to update this switch statement?");
                        }
                    }
                } catch (aoob e) {
                    throw new RuntimeException("Failed to get AccountInfo from Bundle.", e);
                }
            }
        }
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    public final void m(Throwable th) {
        th.getClass();
        k(-1, alym.a, 3);
        this.a.c();
        alxt alxtVar = this.a;
        amil l = amjw.l("onAccountError");
        try {
            amxd listIterator = ((amvs) alxtVar.a).listIterator();
            while (listIterator.hasNext()) {
                ((alxs) listIterator.next()).b(th);
            }
            Iterator it = alxtVar.b.iterator();
            while (it.hasNext()) {
                ((alxs) it.next()).b(th);
            }
            l.close();
        } catch (Throwable th2) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    public final void n() {
        if (k(-1, alym.a, 1)) {
            this.a.d();
            alxt alxtVar = this.a;
            amil l = amjw.l("onAccountLoading");
            try {
                amxd listIterator = ((amvs) alxtVar.a).listIterator();
                while (listIterator.hasNext()) {
                    ((alxs) listIterator.next()).c();
                }
                Iterator it = alxtVar.b.iterator();
                while (it.hasNext()) {
                    ((alxs) it.next()).c();
                }
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

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
